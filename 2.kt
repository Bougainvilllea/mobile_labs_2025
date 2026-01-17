fun main() {
    var count = 0
    var sum = 0
    var number: Int

    println("Вводите числа (0 - стоп):")

    while (true) {
        print("Введите число: ")
        val input = readln()

        number = input.toIntOrNull() ?: continue // пропустит всякую всячину кроме цифр

        if (number == 0) {
            break
        }

        count++
        sum += number
    }

    if (count > 0) {
        val average = sum.toDouble() / count
        println("\nРезультаты:")
        println("Количество чисел: $count")
        println("Сумма чисел: $sum")
        println("Среднее арифметическое: ${"%.2f".format(average)}")
    } else {
        println("Не было введено ни одного числа (кроме 0)")
    }
}