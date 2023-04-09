package com.example.oopdemo

import android.util.Log


open class car {
    var maxSpeed = 30
    open fun start(){
        Log.i("MyTag","Car is starting...")
        Log.i("MyTag","maximum speed is $maxSpeed")

    }
}