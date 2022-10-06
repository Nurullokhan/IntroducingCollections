fun main(args: Array<String>) {

    val listOf = listOf<String>("Java", "Kotlin", "Android")
    //listOf not "set" method -> listOf[0] = "C++"
    for (i in listOf) {
        println(i)
    }

    println("*******************")

    val mutableListOf = mutableListOf<String>("Java", "Kotlin", "Android")
    mutableListOf[0] = "C++" //there is "set" methods mutableListOf
    for (i in mutableListOf) {
        println(i)
    }

}