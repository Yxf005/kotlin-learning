package ch03.ch032

/**
 * 扩展函数 可对现有的对象进行函数扩展
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */
// 扩展了 String 类的函数
fun String.lastChar(): Char = this[this.length - 1]
fun String.abbr():String = this.slice(0..2) + "."

fun main(args:Array<String>) {

    val str = "kotlin"
    println(str.lastChar())
    println(str.abbr())

}