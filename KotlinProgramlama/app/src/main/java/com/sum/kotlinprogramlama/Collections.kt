package com.sum.kotlinprogramlama

fun main(){

    //1 How many elements are printed as a result of the code below?
    val liste : ArrayList<Int> = arrayListOf(6,89,77,64,3,10)

    liste.forEach {

        println(it) // 6,89,77 64,3,10
        if (it > 10)
        {
            return@forEach
        }
    }



}