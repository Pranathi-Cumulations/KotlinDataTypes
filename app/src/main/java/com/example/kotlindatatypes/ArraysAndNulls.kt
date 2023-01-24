package com.example.kotlindatatypes

fun main(){
    var listsWithNull = listOf<Int?>(1,2,null,3)
    for (i in listsWithNull){
        println(i)
    }

    //to copy elements to another list with no nulls
    var listWithoutNulls = mutableListOf<Int>()
    for (i in listsWithNull){
        i?.let { n -> listWithoutNulls.add(n)} // the function in lrt only performs
    }

    println(listWithoutNulls)

    //listofNonNulls
    var listOfNonNullsEx = listOfNotNull<Int>(1,2,null ,3)
    println(listOfNonNullsEx)

}