abstract class Figure(val color: String) {

    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double

    override fun toString(): String {
        return "Color: $color"
    }
}