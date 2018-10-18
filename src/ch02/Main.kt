package ch02

/**
 * .
 * @author <a href="mailto:alexgis@yeah.net">alex</a>
 * @version v1.0, 2018/10/18
 */

fun main(args: Array<String>) {
    var person = Person("Alex", 30, false)
    println("person is: ${person.name}, ${person.age}, ${person.isAdult}")
    person.isAdult = true
    println("person is: ${person.name}, ${person.age}, ${person.isAdult}")

    var rect = Rectangle(24, 25)
    printRect(rect)
    printRect(ShapeFactory.createRandomRectangle())
}

fun printRect(rect: Rectangle) {
    println("the rect is square? ${rect.isSquare}")
    println("area if the rect is ${rect.getArea()}")
}