class Vector(val x: Double, val y: Double, val z: Double) {

    fun length(): Double {
        return Math.sqrt(x * x + y * y + z * z)
    }

    fun dot(other: Vector): Double {
        return x * other.x + y * other.y + z * other.z
    }

    infix fun dotInfix(other: Vector): Double {
        return x * other.x + y * other.y + z * other.z
    }

    operator fun times(other: Vector): Double {
        return x * other.x + y * other.y + z * other.z
    }
}

fun dotProduct(v1: Vector, v2: Vector): Double {
    return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z
}

fun main() {
    val v1 = Vector(1.0, 2.0, 3.0)
    val v2 = Vector(3.0, 2.0, 1.0)

    println("Вектор 1: (${v1.x}, ${v1.y}, ${v1.z})")
    println("Вектор 2: (${v2.x}, ${v2.y}, ${v2.z})")
    println()

    println("Длина v1: ${"%.2f".format(v1.length())}")
    println("Длина v2: ${"%.2f".format(v2.length())}")
    println()

    println("Скалярное произведение:")
    println("Обычный метод: ${v1.dot(v2)}")
    println("Инфиксная запись: ${v1 dotInfix v2}")
    println("Оператор *: ${v1 * v2}")
    println("Внешняя функция: ${dotProduct(v1, v2)}")
}