open class Vehicle {
    open var speed = 0
    open var name = "Транспортное средсво N"

    open fun start() {
        println("$name сейчас едет со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановилось")
    }
}

class Boat : Vehicle() {
    override var speed = 5
    override var name = "Лодка"

    override fun start() {
        println("$name плывет со скоростью $speed км/ч")
    }
}

class Airplane : Vehicle() {
    override var speed = 900000
    override var name = "Самолет"

    override fun start() {
        println("$name летит со скоростью $speed км/ч")
    }
}

class Tank : Vehicle() {
    override var speed = 20
    override var name = "Танк"

    override fun start() {
        println("$name едет со скоростью $speed км/ч")
    }
}

fun main() {
    val transport = listOf(Boat(), Airplane(), Tank())

    for (vehicle in transport) {
        vehicle.start()
        vehicle.stop()
        println()
    }
}