package com.cristianvillamil.platziwallet.ui.transfer.data


import android.app.Application
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.cristianvillamil.platziwallet.ui.home.data.TransferDAO

abstract class ApplicationDatabase : RoomDatabase() {
    abstract fun getDAO() : TransferDAO
    companion object {
        private  var INSTANCE: ApplicationDatabase? = null

        fun getAppDatabase(context: Context): ApplicationDatabase {
            if (INSTANCE == null){
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    ApplicationDatabase::class.java,
                "platziWalletDatabase"
                ).allowMainThreadQueries()
                    .build()
            }
            return INSTANCE as ApplicationDatabase
        }


        fun destryInstance(){
            INSTANCE = null
        }
    }
}