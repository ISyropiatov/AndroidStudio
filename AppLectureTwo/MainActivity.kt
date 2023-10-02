open class Animal(private val name: String) {
    private var isAlive: Boolean = true

    open fun makeSound() {
        println("$name випускає звук")
    }

    fun die() {
        isAlive = false
        println("$name помер(ла)")
    }

    fun getName(): String {
        return name
    }
}

class Dog(name: String) : Animal(name), Voiceable {
    override fun makeSound() {
        println("${getName()} гавкає")
    }

    override fun loudVoice() {
        println("${getName()} гучний голос")
    }

    override fun quietVoice() {
        println("${getName()} тихий голос")
    }
}

class Bird(name: String) : Animal(name), Voiceable {
    override fun makeSound() {
        println("${getName()} співає")
    }

    override fun loudVoice() {
        println("${getName()} гучний голос")
    }

    override fun quietVoice() {
        println("${getName()} тихий голос")
    }
}

interface Voiceable {
    fun loudVoice()
    fun quietVoice()
}

fun main() {
    val dog = Dog("Рекс")
    val bird = Bird("Чіча")

    val animals = listOf<Animal>(dog, bird)

    for (animal in animals) {
        animal.makeSound()

        if (animal is Voiceable) {
            animal.loudVoice()
            animal.quietVoice()
        }

        animal.die()
        println()
    }
}