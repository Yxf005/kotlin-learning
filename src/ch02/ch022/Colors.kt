package ch02.ch022

/**
 * .
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */
enum class Colors(
        private val r:Int,
        private val g:Int,
        private val b:Int
) {
    RED(255, 0, 0), ORANGE(255, 265, 0),       // 2 当每个常量被创建时指定属性值
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),

    INDIGO(75, 0, 130), VIOLET(238, 130, 238); // 3 分号（;）在这里是必须的

    fun rgb() = (r * 256 + g) * 256 + b        // 4 在枚举类中定义了一个方法
}