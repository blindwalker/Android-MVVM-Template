package at.kropf.homeapp.di.component;

import android.arch.lifecycle.Lifecycle;

import javax.inject.Singleton;

import at.kropf.homeapp.di.module.AppModule;
import at.kropf.homeapp.di.module.RepositoryModule;
import at.kropf.homeapp.view.SampleViewModel;
import dagger.Component;
@Singleton
@Component(modules = {AppModule.class, RepositoryModule.class})
public interface SampleComponent {

    void inject(SampleViewModel sampleViewModel);

    interface Injectable {
        void inject(SampleComponent sampleComponent, Lifecycle lifecycle);
    }
}
