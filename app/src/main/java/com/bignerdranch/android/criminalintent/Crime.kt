package com.bignerdranch.android.criminalintent

import java.util.*
import java.util.Date

data class Crime(
    val id: UUID,
    var title: String,
    val date: Date,
    var isSolved: Boolean
)
