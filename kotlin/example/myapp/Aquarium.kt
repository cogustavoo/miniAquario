package example.myapp
// criando uma class com constructor  voce pode definir argunmentos e pegar argumentos default
// ou criar aquarios com sizes diferentes
class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    //init faz com que esses blocos se iniciem no execute
    init {
        println(" aquarium initializing")
    }
    var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 l
        // adicionando um set para recalcular o height baseado no montante de agua VALUE e o valor convencional do set
        set(value) {
            height = (value * 1000) / (width * length)
        }


    constructor(numberOfFish: Int) : this() {
        // 2000 cn3 per fish + espaco extra para a agua n transbordar
        val tank = numberOfFish * 2000 * 1.1
        // calcula o tamanho necessario
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("width: $width cm " +
                "Length: $length cm" +
                "Height: $height cm")
        // 1 l = 1000 cm^3
        println("Volume: $volume l")
    }


}