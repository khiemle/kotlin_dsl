data class Dog(
    val name: String,
    val length: Double,
    val height: Double
) {
    override fun toString(): String {
        return "name = $name length = $length height = $height"
    }
}