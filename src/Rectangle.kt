class Rectangle(color: String, private val length: Double, private val width: Double) : Figure(color) {
    override fun calculateArea(): Double = length * width

    override fun calculatePerimeter(): Double = 2 * (length + width)

    override fun toString(): String {
        return "Rectangle - ${super.toString()}, Length: $length, Width: $width, Perimeter: ${String.format("%.2f", calculatePerimeter())}, Area: ${String.format("%.2f", calculateArea())}"
    }
}