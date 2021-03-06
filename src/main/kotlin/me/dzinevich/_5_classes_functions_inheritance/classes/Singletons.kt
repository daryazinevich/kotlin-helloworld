package me.dzinevich._5_classes_functions_inheritance.classes

import java.time.Year

// ! ! !
// ! we can CREATE A CLASS AND DECLARE AN INSTANCE AT THE SAME TIME !
// ! ! !

// keyword OBJECT says that you want ONE INSTANCE of the class

//object SomeInfo() { - Error
//cant have a constructor, because the workd object creates a single instance, no more instances allowed

object SomeInfo {
    val currYear = Year.now().value
    fun someInfo() = "The Information"
    internal fun getCopyRight() = "The Copyright \u00A9 $currYear"
    // INTERNAL will NOT be visible when imported to another MODULE
}


fun main() {
    println(SomeInfo.someInfo())
    println(SomeInfo.getCopyRight())
}