package com.example.ultimate_password

import kotlin.random.Random

class SercrtNumber( maxnumber : Int , player : Int) {
    var sercrt = Random.nextInt( maxnumber+1)
    var count = 0
    fun validate( number : Int) : Int{
        count++
        return number-sercrt
    }
}


fun main(){
    val sercrtNumber = SercrtNumber( 1000, 4)
    print("${sercrtNumber.validate(50)}")
}