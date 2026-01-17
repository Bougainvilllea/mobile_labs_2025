fun main() {
    val secretNumber = (0..10).random()
    var attempts = 0

    println("Число от 0 до 10")

    while (true) {
        print("Введите число: ")
        val input = readln()

        val userGuess = input.toIntOrNull()


        attempts++

        if (userGuess != null) {
            when {
                userGuess > secretNumber -> println("Много")
                userGuess < secretNumber -> println("Мало")
                else -> {
                    println("Угадал! Загаданное число: $secretNumber")
                    println("Количество попыток: $attempts")
                    break
                }
            }
        }
    }
}