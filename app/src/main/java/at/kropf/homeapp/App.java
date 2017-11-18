package at.kropf.homeapp;

import android.app.Activity;
import android.app.Application;

import com.facebook.stetho.Stetho;

import javax.inject.Inject;

import at.kropf.homeapp.di.AppInjector;
import at.kropf.homeapp.di.component.DaggerSampleComponent;
import at.kropf.homeapp.di.component.SampleComponent;
import at.kropf.homeapp.di.module.AppModule;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class App extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    private static SampleComponent sampleComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        sampleComponent = initDagger();

        AppInjector.init(this);

        Stetho.initializeWithDefaults(this);
    }

    protected SampleComponent initDagger() {
        return DaggerSampleComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static SampleComponent getSampleComponent() {
        return sampleComponent;
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
