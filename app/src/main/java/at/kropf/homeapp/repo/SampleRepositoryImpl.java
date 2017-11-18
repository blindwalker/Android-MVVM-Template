package at.kropf.homeapp.repo;

import at.kropf.homeapp.data.database.AppDatabase;

public class SampleRepositoryImpl implements SampleRepository{

    private AppDatabase database;

    public SampleRepositoryImpl(AppDatabase database) {
        this.database = database;
    }

    @Override
    public void doSomeTask() {
        database.sampleEntityDao().getEntityById(1);
    }
}
