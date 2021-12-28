package example.myapp
// criando uma class com constructor  voce pode definir argunmentos e pegar argumentos default
// ou criar aquarios com sizes diferentes
class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    fun printSize() {
        println("width: $width cm " +
                "Length: $length cm" +
                "Height: $height cm")
    }
}