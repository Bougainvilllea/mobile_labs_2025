fun main() {
    print("Введите количество для простых чисел: ")
    val n = readln().toIntOrNull()

    var count = 0
    var number = 2

    println("Первые $n простых чисел:")

    while (count < n!!) {
        if (isPrime(number)) {
            count++
            println("${count} число: $number")
        }
        number++
    }
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    if (num == 2) return true
    if (num % 2 == 0) return false

    var i = 3
    while (i * i <= num) {
        if (num % i == 0) return false
        i += 2
    }
    return true
}