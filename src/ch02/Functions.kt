package ch02

/**
 *  kotlin 中的 函数
 *  如果一个函数拥有大括号，我们说这个函数有一个块主体。如果它直接返回一个表达式，我们说它有一个表达式主体
 *
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */

fun max(a: Int, b: Int): Int = if (a >= b) a else b

// 表达式函数可以省略返回值类型
fun min(a: Int, b:Int) = if (a<b) a else b

fun main(args: Array<String>) {
    println(max(12, 13))
    println(min(1,2))
}