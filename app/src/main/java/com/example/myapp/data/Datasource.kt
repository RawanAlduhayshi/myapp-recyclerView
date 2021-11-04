package com.example.myapp.data

import com.example.myapp.R
import com.example.myapp.model.Affirmation

class Datasource {
    fun loadAffirmations():List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.January),Affirmation(R.string.February),
            Affirmation(R.string.March),Affirmation(R.string.April),
            Affirmation(R.string.May),Affirmation(R.string.May),
            Affirmation(R.string.May),Affirmation(R.string.June),
            Affirmation(R.string.May),Affirmation(R.string.July),
            Affirmation(R.string.May),Affirmation(R.string.August),
            Affirmation(R.string.May),Affirmation(R.string.September),
            Affirmation(R.string.May),Affirmation(R.string.October),
            Affirmation(R.string.May),Affirmation(R.string.November),
            Affirmation(R.string.May),Affirmation(R.string.December))
    }
}