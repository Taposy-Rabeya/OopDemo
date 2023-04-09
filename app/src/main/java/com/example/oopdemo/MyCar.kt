package com.example.oopdemo

import android.util.Log

class MyCar : car(),SpeedController{
    override fun start() {
      Log.i("MyTag","This is mycar starting...Brand id is ${getBrandId()}")
    }

    override fun accelerate() {

    }
    override fun decelerate() {

    }
}