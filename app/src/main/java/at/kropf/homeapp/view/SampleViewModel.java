package at.kropf.homeapp.view;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.ViewModel;

import javax.inject.Inject;

import at.kropf.homeapp.di.component.SampleComponent;
import at.kropf.homeapp.repo.SampleRepository;

public class SampleViewModel extends ViewModel implements SampleComponent.Injectable{

    @Inject
    SampleRepository sampleRepository;

    @Override
    public void inject(SampleComponent sampleComponent, Lifecycle lifecycle) {
        sampleComponent.inject(this);
    }

    public void sampleMethod() {
        sampleRepository.doSomeTask();
    }
}
