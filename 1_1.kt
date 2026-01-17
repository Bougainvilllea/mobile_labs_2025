fun main() {
    print("Введите целое положительное число: ")
    val number = readln().toIntOrNull()

    if (number != null && number > 0) {
        val lastDigit = number % 10
        var temp = number
        while (temp >= 10) {
            temp /= 10
        }
        val firstDigit = temp

        val sum = firstDigit + lastDigit

        println("Первая цифра: $firstDigit")
        println("Последняя цифра: $lastDigit")
        println("Сумма: $sum")
    } else {
        println("ЦЕЛОЕ ПОЛОЖИТЕЛЬНОЕ ЧИСЛО!")
    }
}

