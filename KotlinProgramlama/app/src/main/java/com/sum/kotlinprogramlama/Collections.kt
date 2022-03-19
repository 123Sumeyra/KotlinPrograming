package com.sum.kotlinprogramlama

fun main(){
/**
    //1 How many elements are printed as a result of the code below?
    val liste : ArrayList<Int> = arrayListOf(6,89,77,64,3,10)

    liste.forEach {

        println(it) // 6,89,77 64,3,10
        if (it > 10)
        {
            return@forEach
        }
    }
**/


    //2 What is the result?

    val liste  = arrayListOf<Int>(4,2,5,2,4,12)
    liste.sort() // [2, 2, 4, 4, 5, 12]
    liste.removeAt(0) // [2, 4, 4, 5, 12]
    liste.reverse()
    println(liste) // [12, 5, 4, 4, 2]


    //


}