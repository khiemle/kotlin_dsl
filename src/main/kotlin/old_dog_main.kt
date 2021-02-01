fun main() {
    val dogs = mutableListOf<Dog>()

    dogs.add(Dog(name = "John", length= 1.2, height = 0.3))
    dogs.add(Dog(name = "Terry", length= 1.2, height = 0.3))
    dogs.add(Dog(name = "Ronaldo", length= 1.2, height = 0.3))
    dogs.add(Dog(name = "Terry", length= 1.2, height = 0.3))
    dogs.add(Dog(name = "Kahn", length= 1.2, height = 0.3))
    dogs.add(Dog(name = "Beckham", length= 1.2, height = 0.3))
    dogs.add(Dog(name = "Mane", length= 1.2, height = 0.3))

    dogs.forEach {dog ->
        println(dog.toString())
    }
}