package com.example.kotlindatatypes

// casting can be done using is ,when and as


fun usingWhenForCast(T : Any){
    when(T){
        is Int -> println("$T is an integer")
        is String -> println("$T is a String ")
        is Boolean -> println("$T ia a boolean")
    }

}

fun castUsingAs(){
    var y = 123
    var z = null
    var x : String = y as String  //throws an exception if casting not possible or y is null

    //safe way to cast using as is
    var a : String? = z as String?
}


fun main(){
    var str : Any = "hello 123"

    var variable2 : Any = 1

    if(str is String){
        println(str.length)
    }

    if(variable2 !is String){
        println("$variable2 is not a string")
    }

    usingWhenForCast(str)
    castUsingAs()
}