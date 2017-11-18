package at.kropf.homeapp.data.database;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import at.kropf.homeapp.data.model.SampleEntity;

@Database(entities = {SampleEntity.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract SampleEntityDao sampleEntityDao();

}
