package ch03.ch031

/**
 * 函数参数里可以用 = 赋予默认值 这样可大大减少重载
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */

fun <T> joinToString(
        collection: Collection<T>,
        separator: String=",",
        prefix: String="",
        postfix: String=""
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator) // 1 在第一个元素之前不添加分隔符
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}