fun main() {
    val dogs: List<Dog> = dogsModel {
        dogs {
            dog {
                name = "John"
                length = 1.2
                height = 0.3
            }
            dog {
                name = "Terry"
                length = 1.2
                height = 0.3
            }
            dog {
                name = "Ronaldo"
                length = 1.2
                height = 0.3
            }
            dog {
                name = "Terry"
                length = 1.2
                height = 0.3
            }
            dog {
                name = "Kahn"
                length = 1.2
                height = 0.3
            }
            dog {
                name = "Beckham"
                length = 1.2
                height = 0.3
            }
            dog {
                name = "Mane"
                length = 1.2
                height = 0.3
            }
        }
    }
    dogs.forEach {dog ->
        println(dog.toString())
    }
}


class DogBuilder {
    var name: String = ""
    var length: Double = 0.0
    var height: Double = 0.0
    fun build() = Dog(name = name, length = length, height = height)
}

class Dogs: ArrayList<Dog>() {
    fun dog(init: DogBuilder.() -> Unit) {
        add(DogBuilder().apply(init).build())
    }
}
class DogsListBuilder {
    private val dogs = mutableListOf<Dog>()
    fun build(): ArrayList<Dog> = ArrayList(dogs)
    fun dogs(init: Dogs.() -> Unit) {
        dogs.addAll(Dogs().apply(init))
    }
}

fun dogsModel(init: DogsListBuilder.() -> Unit): List<Dog> {
    return DogsListBuilder().apply(init).build()
}