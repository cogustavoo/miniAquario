package example.myapp

import kotlin.math.PI

// criando uma class com constructor  voce pode definir argunmentos e pegar argumentos default
// ou criar aquarios com sizes diferentes
open class Aquarium(var length: Int = 100, var width: Int = 20, open var height: Int = 40) {
    //init faz com que esses blocos se iniciem no execute
    init {
        println(" aquarium initializing")
    }
    open var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 l
        // adicionando um set para recalcular o height baseado no montante de agua VALUE e o valor convencional do set
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9

    constructor(numberOfFish: Int) : this() {
        // 2000 cn3 per fish + espaco extra para a agua n transbordar
        val tank = numberOfFish * 2000 * 1.1
        // calcula o tamanho necessario
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println(shape)  //printa o modelo do aquario

        println("width: $width cm " +
                "Length: $length cm" +
                "Height: $height cm")
        // 1 l = 1000 cm^3
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)") //faz um print do volume quantidade de agua e a % de cheio
    }
}

// creacao class towertank que pega os parametros da class  Aquarium e da override
class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter){
    override var volume: Int
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height   = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }
    override var water = volume * 0.8
    override val shape = "cylinder"
}