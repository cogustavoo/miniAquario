
fun main (){
    //ESTUDOS EAGER AND LAZY LISTS

    val decorations = listOf ("rock", "pagoda", "pastic plant", "alligator", "flowerpot")
    println( decorations.filter {it [0] == 'p'})    // it [0] == 'p'  mostra o conteudo que inicia no index [0] contendo P

    //eager, cria uma nova lista adicionando os values correspondentes a condicao
    val eager = decorations.filter { it [1] == 'l'}
    println("eager: $eager")

    //filtro resultando de um asSequence apenas cria uma memoria dos elementos e do filtro a ser aplicado
    //e esse filtro e a memoria so sao aplicados quando voce acessa essa variavel assim retornando o resultado
    //basicamente fica esperando ate ser chamada para o uso, por isso do termo lazy "preguicoso"
    val filtered = decorations.asSequence().filter { it [0] == 'p'}
    println("filtered: $filtered")

    //aqui eu forco a lista a "trabalhar" colocando os elementos que ela gera e transformando em uma lista
    val newList = filtered.toList()
    println("new List: $newList")

    val lazyMap = decorations.asSequence().map {
        println("acess: $it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("acess: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")

}




// https://developer.android.com/codelabs/kotlin-bootcamp-functions#5