package ch01

/**
 * .
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */

data class Person(
        val name:String,
        val age:Int?=null
)

fun main(args:Array<String>) {

    val persons = listOf(Person("Alex", 30), Person("Kobe", 40))
    val oldest = persons.maxBy { it.age ?:0 }

    println("the oldest one is : $oldest")
}