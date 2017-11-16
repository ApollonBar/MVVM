package com.ittianyu.mvvm.application.i_dagger2.common.repository.local.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.ittianyu.mvvm.application.i_dagger2.common.bean.User;
import com.ittianyu.mvvm.application.i_dagger2.common.repository.local.dao.UserDao;

/**
 * Created by 86839 on 2017/10/7.
 */
@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class DB extends RoomDatabase {
    public abstract UserDao getUserDao();

}
