package com.junga.memo

import MemoEntity
import android.annotation.SuppressLint
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Objects

@SuppressLint("StaticFieldLeak")
class MainActivity : AppCompatActivity(), onDeleteListener {

    lateinit var db: MemoDatabase
    var memoList: List<MemoEntity> = listOf<MemoEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = MemoDatabase.getInstance(this)!!

        button_add.setOnClickListener {
            val memo = MemoEntity(null, edittext_memo.text.toString())
            edittext_memo.setText("")
            insertMemo(memo)
        }

        recyclerView.layoutManager = LinearLayoutManager(this)

        getAllMemos()
    }

    //1. Insert Data
    //2. Get Data
    //3. Delete Data

    //4. Set RecyclerView



    fun insertMemo(memo: MemoEntity) {
        //1. MainThread(모든 ui관련 된 일) vs WorkerThread(Background Thread,모든 데이터 관련 통신)

        @SuppressLint("StaticFieldLeak")
        val insertTask = object : AsyncTask<Unit, Unit, Unit>() {
            override fun doInBackground(vararg params: Unit?) {
                memoList = db.memoDAO().getAll()
            }

            override fun onPostExecute(result: Unit?) {
                super.onPostExecute(result)
                getAllMemos()
            }
        }
        insertTask.execute()
    }


    fun getAllMemos() {
        val getTask = (object : AsyncTask<Unit, Unit, Unit>() {
            override fun doInBackground(vararg params: Unit?) {
                memoList = db.memoDAO().getAll()
            }

            override fun onPostExecute(result: Unit?) {
                super.onPostExecute(result)
                setRecyclerView(memoList)
            }
        }).execute()
    }


    fun deleteMemo(memo : MemoEntity) {
        val deleteTask = object : AsyncTask<Unit, Unit, Unit>() {
            override fun doInBackground(vararg params: Unit?) {
               db.memoDAO().delete(memo)
            }

            override fun onPostExecute(result: Unit?) {
                super.onPostExecute(result)
                getAllMemos()
            }
        }
        deleteTask.execute()
    }


    fun setRecyclerView(memoList: List<MemoEntity>) {
        recyclerView.adapter = MyAdapter(this, memoList, this)
    }

    override fun onDeleteListener(memo: MemoEntity) {
        deleteMemo(memo)
    }

}