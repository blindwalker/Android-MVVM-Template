package at.kropf.homeapp.di.module;

import android.arch.persistence.room.Room;
import android.content.Context;

import javax.inject.Singleton;

import at.kropf.homeapp.App;
import at.kropf.homeapp.data.database.AppDatabase;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private App applocation;

    public AppModule(App applocation) {
        this.applocation = applocation;
    }

    @Provides
    Context applicationContext() {
        return applocation;
    }

    @Provides
    @Singleton
    AppDatabase provideAppDatabase(Context context) {
        return Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "app_db")
                .fallbackToDestructiveMigration()
                .build();
    }
}
