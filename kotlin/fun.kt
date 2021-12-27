import java.lang.Math.random
import java.util.*
import kotlin.random.Random.Default.nextInt


val rnds = (0..10).random()

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day: String) : String {  //recebe o valor de dia(aleatorio) e retorna um valor para a comida
    var food = ""
    when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" ->  "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> food = "nothing"
    }
    return food
}

fun feedTheFish() {
    val day = randomDay()   //faz a call da funcao randomDay retoranndo um dia aleatorio
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food t")
    println("Change water: ${shouldChangeWater(day)}")
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}
    // define condicoes para as funcoes retornando true caso verdadeira
fun isTooHot(temperature: Int) = temperature > 30      //se temperatura for > 30 retorna true

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"             // se o dia for igual "sunday" retorna true

fun shouldChangeWater(day: String, temperature: Int = 21, dirty: Int = 21): Boolean {
    return when {     //se alguma das condicoes for verdadeira retorna o valor true
        isTooHot(temperature) -> true    //isTooHot 'e verdadeiro? caso sim  -> retorna true na funcao shouldChangeWatter
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun main(args: Array<String>) {
    feedTheFish()
}




