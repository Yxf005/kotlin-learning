package ch02.ch023

import java.util.*

/**
 * kotlin 中可以使用 1..n 表示一个区间 此区间可用 for 进行遍历操作
 * ..语法始终产生一个包含终点的范围（..右边的值）
 * until 则是不包含右边的值
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz " // 1 如果i能被15整除，返回FizzBuzz。就像在Java中，%是求模运算符
    i % 3 == 0 -> "Fizz "      // 2 如果i能被3整除，返回Fizz
    i % 5 == 0 -> "Buzz "      // 3 如果i能被5整除，返回Buzz
    else -> "$i "              // 4 否则返回这个数字的原始值
}

var binaryReps = TreeMap<Char, String>()  // 1 使用了TreeMap，因此键值是有序的

 // in 表示在某个范围内
fun isLetter(c:Char) = c in 'a'..'z' || c in 'A'..'Z'

// !in 表示不在某个范围内
fun isNotNumber(i:Char) = i !in '0'..'9'

fun main(args: Array<String>) {

    for (i in 1..100) {
        println(fizzBuzz(i))
    }

    // 表示从 100 往后计数 步进值 是 2
    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(1))
    }

    for (i in 1 until 50) {
        println(fizzBuzz(i))
    }

    for (c in 'A'..'Z') {  // 2 使用字符范围，从A到F遍历字符
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {              // 5 遍历一个映射集，吧映射的键跟值分配给两个变量
        println("$letter = $binary")
    }
}