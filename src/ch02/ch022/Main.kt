package ch02.ch022

/**
 * .
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */
// when 类似 Java 中的 switch
// when 必须是穷尽的 就是必须考虑到每一种情形 （可以用else 表示默认分支）
fun getMnmonic(color: Colors) =
        when (color) {
            Colors.RED -> "Richard"
            Colors.ORANGE -> "Of"
            Colors.YELLOW -> "York"
            Colors.GREEN -> "Grave"
            Colors.BLUE -> "Battle"
            Colors.INDIGO -> "In"
            Colors.VIOLET -> "Vain"
        }

fun getWarmth(color: Colors) = when(color) {
    Colors.RED, Colors.ORANGE, Colors.YELLOW -> "warm"
    Colors.GREEN -> "neutral"
    Colors.BLUE, Colors.INDIGO, Colors.VIOLET -> "cold"
}

fun mix(a:Colors, b:Colors) =when(setOf(a, b)) {
    setOf(Colors.RED, Colors.YELLOW) -> Colors.ORANGE      // 2  枚举颜色键值对可以是混合的
    setOf(Colors.YELLOW, Colors.BLUE) -> Colors.GREEN
    setOf(Colors.BLUE, Colors.VIOLET) -> Colors.INDIGO

    else -> throw Exception("Dirty color")  // 3 如果没有一个分支被匹配，将执行该语句
}

fun main(args:Array<String>) {

    println("blue is : ${Colors.BLUE.rgb()}")

    println("${getMnmonic(Colors.BLUE)}")

    println("blue is : ${getWarmth(Colors.BLUE)}")

    println("blue mixin yellow is : ${mix(Colors.BLUE, Colors.YELLOW)}")

}