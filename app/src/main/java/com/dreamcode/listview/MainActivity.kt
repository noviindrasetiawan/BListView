package com.dreamcode.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dreamcode.listview.adapter.ListProgrammingLanguageAdapter
import com.dreamcode.listview.model.ProgrammingLanguage
import com.dreamcode.listview.model.ProgrammingLanguageData

class MainActivity : AppCompatActivity() {
    private lateinit var rvProgrammingLanguage: RecyclerView
    private var list: ArrayList<ProgrammingLanguage> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvProgrammingLanguage = findViewById(R.id.rv_programminglanguage)
        rvProgrammingLanguage.setHasFixedSize(true)
        list.addAll(ProgrammingLanguageData.listProgrammingLanguage)
        showProgrammingLanguageList()
    }

    private fun showProgrammingLanguageList() {
        rvProgrammingLanguage.layoutManager = LinearLayoutManager(this)
        val listProgrammingLanguageAdapter = ListProgrammingLanguageAdapter(list)
        rvProgrammingLanguage.adapter = listProgrammingLanguageAdapter
    }
}
