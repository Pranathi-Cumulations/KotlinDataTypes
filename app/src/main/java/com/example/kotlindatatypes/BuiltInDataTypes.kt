package com.example.kotlindatatypes

import java.security.KeyStore.TrustedCertificateEntry


/* there are four main built in data types
* Numbers
* Strings
* Boolean
* Arrays
* */
fun numbers(){
    val numb: Int= 1 // Int
    val numb2 : Byte = 1 // Byte
    val longNumb = 14567890237 // long
    val longNumbExplicit = 1L //Long

    val numb3 = 3.41 // double
    val numb4 = 3.41f // float

    val numberConstant = 100_00_000 //underscores can be added to make the values more readable
    println(numberConstant)

}

fun strings(){
    val str = "hello 123"
    println(str)

    println(str + " hello")
    println(str.uppercase())
}

fun Boolean(){
    var isFixed = true
    isFixed = !isFixed
    println(isFixed)
}

fun Arrays(){

    var arrayInt = arrayOf(1,2,3,4)

    var arrayNull = arrayOfNulls<Int>(5)

    var arrayGeneration = Array(5){it*it}
    arrayGeneration.forEach{ println(it) }

    //primitive array types

    var intArray = intArrayOf(1,2,3,4) //ensures type safety
    println(intArray.reduce { acc, i -> acc+i })
    var incrementedArray = intArray.map { it+1 }
    incrementedArray.forEach{ println(it) }

}
fun main(){
    numbers()
    strings()
    Boolean()
    Arrays()
}