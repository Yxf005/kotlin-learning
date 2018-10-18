package ch02.ch024

import java.io.BufferedReader

/**
 * 演示了 try catch finally 用法
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */
object TryCatch {
    fun readNaumber(reader: BufferedReader): Int? {
        return try {
            val line = reader.readLine()
            Integer.parseInt(line)
        } catch (e: NumberFormatException) {
            null
        } finally {
            reader.close()
        }
    }
}