package com.sum.kotlinprogramlama

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
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



    //2 What is the result?

    val liste  = arrayListOf<Int>(4,2,5,2,4,12)
    liste.sort() // [2, 2, 4, 4, 5, 12]
    liste.removeAt(0) // [2, 4, 4, 5, 12]
    liste.reverse()
    println(liste) // [12, 5, 4, 4, 2]



    //3) addAll() => Verilen elemanları, index verilmişse indexten itibaren verilmemişse listenin sonuna ekler


    val liste  = arrayListOf<Int>(4,2,5,2,4,12)
    val liste2 = arrayListOf<Int>(1,2,3)
    liste.addAll(liste2)
    println(liste) // [4, 2, 5, 2, 4, 12, 1, 2, 3]
    println(liste2) // [1, 2, 3]
    liste.addAll(2,liste2)
    println(liste) // [4, 2, 1, 2, 3, 5, 2, 4, 12, 1, 2, 3]



    //4)  Result?
    val hashMap  = hashMapOf("key1" to 1, "key2" to 2)
    hashMap.put("key1", 10)
    hashMap.put("key3", 11)
    hashMap.remove("key 1")  // Eğer buraya ("key1") yazılsaydı o zaman çalışırdı

    println(hashMap.values) // [10, 2, 11]



    // 5) Result?

    var st = setOf<Int>(3,5,6,7,6,6,6)
    st.add(1) // Derleme zamanı hatası set te ekleme yapamazsın
    st.forEach {
        println(it)
    }



    // 6) Result?
    var liste : ArrayList<Int> = arrayListOf(6,89,77,64,3,10)

    liste.forEach {

        println(it)  //6, 89
        if (it > 10)
        {
            return
        }
    }



    // 7 Result?

    val liste : ArrayList<Int> = arrayListOf(1,2,3,4,5,3,7,6,89,77,64,3,10)
    liste.removeIf { it < 5 || it >= 10 }
    println(liste) //[5,7,6]





    // 8) Result?

//var hashMap = hashMapOf<String, Int>()  --> True
//var hashMap : HashMap<String, Int> = ("key1" to 1, "key2" to 2)  --> False
// var hashMap : HashMap<String, Int> = hashMapOf<String, Int>("key1" to 1, "key2" to 2)  --> True
// var hashMap  = hashMapOf<String, Int>("key1" to 1, "key2" to 2)  ---> True
//var hashMap  = hashMapOf("key1" to 1, "key2" to2)  --> False


    // 9 Result?
    val dizi = arrayOf(1,2,3,4,5,6,7,8,9,10)

    println(dizi.get(0)) //1






    // 10) Result =?
   var dizi = arrayOf(1,2,3,4)
    dizi[2] = null //Kod derlenmez (Null can not be a value of a non-null type Int)
    println(dizi[2])



**/












}