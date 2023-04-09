package com.example.oopdemo

import android.util.Log

class Driver( var name: String, credit : Int) {
   private var totalCredit = 50
    private val car = car()

    init {
        totalCredit = totalCredit + credit
        car.maxSpeed = 150
        car.start()
    }
      fun showDetails(){
          Log.i("MyTag","Name of the driver is $name with $totalCredit credits")
      }
}