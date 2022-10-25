package br.fmu.edmotors;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {Funcionario.class}, version = 1)

abstract public class AppDataBase extends RoomDatabase {
    private static AppDataBase sInstance;
    public static final String DATABASE_NAME="teste.db";
    public abstract FuncionarioDao funcionarioDao();
    private final MutableLiveData<Boolean> mIsDatabaseCreated = new MutableLiveData<>();
    public static AppDataBase getsInstance(final Context context){
        if (sInstance == null){
            synchronized (AppDataBase.class){ //syncronized é utilizado limitar que apenas uma tela
                                              // use o código por vez
                if (sInstance==null){
                    sInstance = buildDatabase(context.getApplicationContext());
                    sInstance.updateDatabaseCreated(context.getApplicationContext());
                }
            }
        }
        return sInstance;
    }
    private void setDatabaseCreated(){
        mIsDatabaseCreated.postValue(true);
    }
    private static AppDataBase buildDatabase(final Context context){
        return Room.databaseBuilder(context,AppDataBase.class,
                DATABASE_NAME).allowMainThreadQueries().build();
    }
    private void updateDatabaseCreated(final Context context){
        if(context.getDatabasePath(DATABASE_NAME).exists()){
            setDatabaseCreated();
        }
    }
}
