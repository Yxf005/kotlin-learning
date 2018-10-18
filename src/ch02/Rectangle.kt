package ch02

/**
 * .
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */
class Rectangle(private val height: Int, private val width: Int) {

    val isSquare: Boolean
        get() {  //    属性的获取函数声明
            return width == height
        }

    fun getArea() = width * height
}