package com.example.kotlindatatypes

/* there are two types of string literals
* backSlash (escape Strings)
* Raw Strings
* */

fun stringTemplate(){
    var value : Int = 100
    println("cost of one apple $value")

    var randomStr : String = "Pranathi"
    println("My name has ${randomStr.length} letters")
}

fun main(){

    var escapeString : String = "This is heading \n this is in the new line"
    println(escapeString)

    //RawString Example this uses triple double quotes

    var rawStr : String = """this is a raw string where we can 
        |easily enter to new line without backslash
        |and can have "strings in double quotes as well"
    """.trimMargin()

    println()
    println(rawStr)

    stringTemplate()


}