package at.kropf.homeapp.di;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import at.kropf.homeapp.App;
import at.kropf.homeapp.di.component.SampleComponent;

public class ViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private App application;

    private Lifecycle lifecycle;

    public ViewModelFactory(App application, Lifecycle lifecycle) {
        this.application = application;
        this.lifecycle = lifecycle;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        T t = super.create(modelClass);
        if (t instanceof SampleComponent.Injectable) {
            ((SampleComponent.Injectable) t).inject(application.getSampleComponent(), lifecycle);
        }
        return t;
    }
}
