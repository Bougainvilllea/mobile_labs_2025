fun main() {
    print("Введите целое положительное число: ")
    val input = readln()

    if (input.isNotEmpty() && input.all { it.isDigit() }) {
        val firstDigit = input.first().toString().toInt()
        val lastDigit = input.last().toString().toInt()
        val sum = firstDigit + lastDigit

        println("Первая цифра: $firstDigit")
        println("Последняя цифра: $lastDigit")
        println("Сумма: $sum")
    } else {
        println("ЦЕЛОЕ ПОЛОЖИТЕЛЬНОЕ ЧИСЛО!")
    }
}