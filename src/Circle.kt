class Circle(color: String, private val radius: Double): Figure(color) {
    override fun calculateArea(): Double = 2 * Math.PI * radius
    override fun calculatePerimeter(): Double = Math.PI * radius * radius

    override fun toString(): String {
        return "Circle - ${super.toString()}, Radius: $radius, Perimeter: ${String.format("%.2f", calculatePerimeter())}, Area: ${String.format("%.2f", calculateArea())}"
    }
}