package com.example.playground

fun main(args : Array<String>) {

    // Check if all the elements of a list are unique using set

    var Elements = listOf<Int>(1,2,3,4,5,6,7,8,9)
    var UniqueElement: Set<Int> = setOf()
    var Check = true

    for (i in Elements){
        UniqueElement.contains(i)
        UniqueElement += i
        Check = UniqueElement.size == Elements.size
    }
      if (Check) println("All Elements are Unique")
      else println("All Elements are not Unique")
}