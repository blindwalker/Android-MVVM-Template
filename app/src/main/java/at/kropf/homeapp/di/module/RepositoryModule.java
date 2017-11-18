package at.kropf.homeapp.di.module;

import android.content.Context;

import javax.inject.Singleton;

import at.kropf.homeapp.data.database.AppDatabase;
import at.kropf.homeapp.repo.SampleRepository;
import at.kropf.homeapp.repo.SampleRepositoryImpl;
import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Provides
    @Singleton
    SampleRepository provideSampleRepository(AppDatabase database) {
        return new SampleRepositoryImpl(database);
    }
}
