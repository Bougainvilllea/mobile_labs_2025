fun main() {
    val array = intArrayOf(1, 3, 2, 5, 4, 6, 3, 8, 2)
    println("Исходный массив: ${array.joinToString()}")

    for (i in 1 until array.size - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
            println("array[$i] = ${array[i]}")
        }
    }
}