package com.example.playground

fun main(args : Array<String>) {

    // Count the number of unique elements of a list using set ?

    var Elements = listOf<Int>(1,2,3,4,5,6,8,10,12,2)
    var UniqueElement = mutableSetOf<Int>()

    for (i in Elements){
            (UniqueElement.contains(i))
            UniqueElement = UniqueElement
            UniqueElement += i

    }

    println("UniqueElemnets are ${UniqueElement.size}")
}

