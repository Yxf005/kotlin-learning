package ch02

/**
 * .
 *  val name: String,        // 1 只读属性生成和琐碎获取器
var isMarried: Boolean   // 2 可写属性：一个字段，一个获取函数和一个设置函数
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */
class Person(
        val name: String,
        val age: Int,
        var isAdult: Boolean)