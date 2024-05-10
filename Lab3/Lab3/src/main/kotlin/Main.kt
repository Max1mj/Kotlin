class Category(val name: String?) {
    fun isValid(): Boolean {
        return name != null
    }
}

fun main() {

    val FilmCategory = Category("Films")
    val NullCategory = Category(null)
    val BookCategory = Category("Books")

    println("Valid: ${FilmCategory.isValid()}")
    println("Valid: ${NullCategory.isValid()}")
    println("Valid: ${BookCategory.isValid()}")
}