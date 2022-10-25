package com.junga.memo

import MemoDAO
import MemoEntity
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(MemoEntity::class), version = 1)
abstract class MemoDatabase : RoomDatabase() {
    abstract  fun memoDAO() : MemoDAO

    //싱글톤 패턴
    companion object {
        var INSTANCE : MemoDatabase? = null

        fun getInstance(context : Context) : MemoDatabase?{
            if(INSTANCE == null) {
                synchronized(MemoDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                    MemoDatabase::class.java, "memo.db")
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }

    }
}