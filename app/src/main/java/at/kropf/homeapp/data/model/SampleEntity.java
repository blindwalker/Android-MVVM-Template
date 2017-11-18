package at.kropf.homeapp.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import at.kropf.homeapp.data.Config;

@Entity(tableName = Config.SAMPLE_TABLE_NAME)
public class SampleEntity {

    @PrimaryKey
    private int id;
    private String sampleString;

    public SampleEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSampleString() {
        return sampleString;
    }

    public void setSampleString(String sampleString) {
        this.sampleString = sampleString;
    }

    @Override
    public String toString() {
        return "SampleEntity{" +
                "id=" + id +
                ", sampleString='" + sampleString + '\'' +
                '}';
    }
}
