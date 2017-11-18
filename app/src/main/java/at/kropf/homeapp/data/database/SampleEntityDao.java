package at.kropf.homeapp.data.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import at.kropf.homeapp.data.Config;
import at.kropf.homeapp.data.model.SampleEntity;

@Dao
public interface SampleEntityDao {
    @Query("SELECT * FROM " + Config.SAMPLE_TABLE_NAME + " WHERE id == :id")
    SampleEntity getEntityById(int id);
}
