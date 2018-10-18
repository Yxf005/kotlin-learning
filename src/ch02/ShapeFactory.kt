package ch02

import java.util.*

/**
 * .object 常常用来表示一个单例类
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */
object ShapeFactory {
    fun createRandomRectangle(): Rectangle {
        val random = Random()
        return Rectangle(random.nextInt(), random.nextInt())
    }
}