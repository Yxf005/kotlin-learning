package ch02.ch024

import java.io.BufferedReader
import java.io.StringReader

/**
 * kotlin 中异常处理
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */

fun main(array: Array<String>) {
//    val percentage = 101
//    if (percentage !in 0..100) {
//        throw IllegalArgumentException(
//                "A percentage value must be between 0 and 100: $percentage")
//    }

    var reader = BufferedReader(StringReader("1314"))
    println(TryCatch.readNaumber(reader))
}