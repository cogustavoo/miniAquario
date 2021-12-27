fun main() {
    //LAMBDAS SAO EXPRESSOES QUE FAZEM UMA FUNCAO, AO INVEZ DE DECLARAR UMA FUNCAO NOMEADA, VOCE DECLARA SEM NOME
    // EXEMPLO DE LAMBDA {it[0] == 'p'}

   // var dirtyLevel = 20
   // val waterFilter = { dirty : Int -> dirty / 2}
   // println(waterFilter(dirtyLevel))

    //val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    // explicacao faca uma variavel waterfilter , waterfilter pode ser qualquer funcao que pega um Int e retorna um Int
    //ele retorna o valor de dirty / 2    PEGA um Int de dirty e retorna outro Int

    //criando funcoes de alta ordem
    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }

    val waterFilter: (Int) -> Int = { dirty -> dirty / 2}
    println(updateDirty(30, waterFilter))

    fun increaseDirty( start: Int ) = start +1
    fun decreaseDirty( end: Int ) = end -1
    println(updateDirty(15, ::increaseDirty))
    println(updateDirty(15, ::decreaseDirty))
    // :: usado para passar uma funcao como referencia nao como argumento, sem dar call a ela

    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) {dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)

}