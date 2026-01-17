class ArrayCalculator(private val numbers: IntArray) {

    fun sumPositive(): Int {
        var sum = 0
        for (number in numbers) {
            if (number > 0) {
                sum += number
            }
        }
        return sum
    }

    fun product(): Long {
        var result = 1L
        for (number in numbers) {
            result *= number
        }
        return result
    }

    fun average(): Double {
        if (numbers.isEmpty()) return 0.0
        var sum = 0
        for (number in numbers) {
            sum += number
        }
        return sum.toDouble() / numbers.size
    }
}

fun main() {
    val array = intArrayOf(2, -5, 8, -3, 10, 4, -1)
    val calculator = ArrayCalculator(array)

    println("Массив: ${array.joinToString()}")
    println("Сумма положительных: ${calculator.sumPositive()}")
    println("Произведение всех: ${calculator.product()}")
    println("Среднее арифметическое: ${calculator.average()}")
}