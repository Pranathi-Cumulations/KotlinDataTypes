package com.example.kotlindatatypes

data class Node(var value : Int , var Next : Int)
typealias predicate = List<Node>
typealias toBool<T> = (T) -> Boolean
var lambdaFunc: toBool<Int> = {it > 0}

fun main(){
     var nodeList: predicate = listOf(Node(1,1), Node(2,2))
    println(nodeList)

    println(lambdaFunc(-1))
    println(lambdaFunc(1))

}