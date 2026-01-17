fun main() {
    println("Квадратное уравнение")

    print("a = ")
    val a = readln().toDouble()
    print("b = ")
    val b = readln().toDouble()
    print("c = ")
    val c = readln().toDouble()

    quadraticRoot(a, b, c)
}

fun sqr(n: Double): Double {
    return n * n
}

fun discriminant(a: Double, b: Double, c: Double): Double {
    return sqr(b) - 4 * a * c
}

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val d = discriminant(a, b, c)

    return when {
        d > 0 -> 2
        d == 0.0 -> 1
        else -> 0
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val d = discriminant(a, b, c)
    val count = rootsNumber(a, b, c)

    println("Дискриминант: $d")
    println("Корней кол-во: $count")

    when (count) {
        2 -> {
            val x1 = (-b + Math.sqrt(d)) / (2 * a)
            val x2 = (-b - Math.sqrt(d)) / (2 * a)
            println("x1 = $x1")
            println("x2 = $x2")
        }
        1 -> {
            val x = -b / (2 * a)
            println("x = $x")
        }
        0 -> println("Корней нет")
    }
}