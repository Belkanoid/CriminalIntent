package com.example.criminalintent

import java.text.Format
import java.util.*
import android.text.format.DateFormat
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat

//var formatter = SimpleDateFormat("EEE, MMM d, yyyy HH:mm:ss", Locale.ENGLISH)

@Entity
data class Crime(
    @PrimaryKey val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false,
    var suspect: String = "", ) {
    val photoFileName
        get() = "IMG_$id.jpg"
}