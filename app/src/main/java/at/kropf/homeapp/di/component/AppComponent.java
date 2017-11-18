package at.kropf.homeapp.di.component;


import android.app.Application;

import javax.inject.Singleton;

import at.kropf.homeapp.App;
import at.kropf.homeapp.di.module.MainActivityModule;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, MainActivityModule.class})
public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(App application);
}
