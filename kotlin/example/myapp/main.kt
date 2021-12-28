package example.myapp

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // apenas width custom resto default
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // apenas com width default
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // todas as variaveis custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
}

fun main () {
    buildAquarium()
}
