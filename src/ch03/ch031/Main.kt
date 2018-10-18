package ch03.ch031

/**
 * kotlin 中的集合类
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */

fun main(args: Array<String>) {

    val list = listOf(1, 3, 5, 7)
    val set = setOf("one", "two", "three")
    val map = mapOf(1 to "one", 3 to "three", 5 to "five")

//    println(list.javaClass)
    println(set.javaClass)
    println(map.javaClass) // javaClass = clazz.getClass() (java中)

    println(joinToString(list, "-","#", ""))

    // 这种方式可以创造更具有可读性的代码
//    println(joinToString(list, separator = "-",prefix = "#", postfix = ""))

    println(joinToString(list))
}