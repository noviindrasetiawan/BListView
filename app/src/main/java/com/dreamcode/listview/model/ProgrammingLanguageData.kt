package com.dreamcode.listview.model

import com.dreamcode.listview.R

object ProgrammingLanguageData {
    private val programminglanguageName = arrayOf(
        "Ruby",
        "Ralls",
        "Python",
        "Java Script",
        "PHP"
    )

    private val detail = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language",
        "Ruby on Ralls is a server side web application development framework written in Ruby language",
        "Python is interpreted scripting and object-oriented programming langauge",
        "JavaScript is an object-based scripting language",
        "PHP is an interpreted language, i.e., there is no need for compilation"
    )

    private val programminglanguagePoster = intArrayOf(
        R.drawable.ruby,
        R.drawable.ralls,
        R.drawable.python,
        R.drawable.javascript,
        R.drawable.php
    )

    val listProgrammingLanguage: ArrayList<ProgrammingLanguage>
        get() {
            val list = arrayListOf<ProgrammingLanguage>()
            for (position in programminglanguageName.indices) {
                val programminglanguage = ProgrammingLanguage()
                programminglanguage.name = programminglanguageName[position]
                programminglanguage.detail = detail[position]
                programminglanguage.poster = programminglanguagePoster[position]
                list.add(programminglanguage)
            }
            return list
        }
}