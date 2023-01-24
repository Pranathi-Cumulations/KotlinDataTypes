package com.example.kotlindatatypes

fun main(){
    var str : String? = null
    var nonNullString : String? = "Pranathi"

    //printing length of non null strings
    println(str?.length)  //prints null
    println(nonNullString?.length) //prints the length of non null string

    //using elvis operator
    println(str?.length ?: -1) // prints -1
    println(nonNullString?.length ?:-1) // prints length of non null string

}