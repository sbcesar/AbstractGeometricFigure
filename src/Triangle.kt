import kotlin.math.sqrt

class Triangle(color: String, private val side1: Double, private val side2: Double, private val side3: Double) : Figure(color) {
    override fun calculateArea(): Double {
        val semiPerimeter = calculatePerimeter() / 2
        return sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3))
    }

    override fun calculatePerimeter(): Double = side1 + side2 + side3

    override fun toString(): String {
        return "Triangle - ${super.toString()}, Sides: $side1 $side2 $side3, Perimeter: ${String.format("%.2f", calculatePerimeter())}, Area: ${String.format("%.2f", calculateArea())}"
    }
}