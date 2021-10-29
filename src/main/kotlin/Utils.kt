infix fun String.example(block: () -> Unit) {
    println("\n\n---Example of $this---\n")
    println("OUTPUT:")
    block()
}