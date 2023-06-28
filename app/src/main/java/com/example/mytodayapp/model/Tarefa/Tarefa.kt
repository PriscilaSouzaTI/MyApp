package com.example.mytodayapp.model.Tarefa

import android.telecom.Call.Details
import java.util.Date

class Tarefa(val nome: String, val details: String?, val createDate: Date, val pzoFinal:Date, status:Double) {

    var status = 0.0
    get() {return field}
    set(value) {
        field =value
    }
}
