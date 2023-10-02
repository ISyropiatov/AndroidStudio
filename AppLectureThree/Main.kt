data class Figure(var width: Int, var height: Int) {
    var area: Int = width * height
        private set
}

sealed class Shape {
    data class Rectangle(var width: Int, var height: Int) : Shape()
    data class Oval(var radius: Int) : Shape()
    object Line : Shape()
}

fun main() {
    val figures = listOf(
        Figure(5, 10),
        Figure(3, 8),
        Figure(7, 15)
    )

    val shapes = listOf(
        Shape.Rectangle(4, 6),
        Shape.Oval(5),
        Shape.Line,
        Shape.Rectangle(2, 9),
        Shape.Oval(3),
        Shape.Line
    )

    // Рахуємо загальну суму полів area в списку figures
    val totalArea = figures.sumOf { it.area }
    println("Total area: $totalArea")

    // Лічимо кількість різних типів фігур у списку shapes за допомогою фільтрації
    val rectangleCount = shapes.filterIsInstance<Shape.Rectangle>().size
    val ovalCount = shapes.filterIsInstance<Shape.Oval>().size
    val lineCount = shapes.filterIsInstance<Shape.Line>().size

    println("Rectangle count: $rectangleCount")
    println("Oval count: $ovalCount")
    println("Line count: $lineCount")
}