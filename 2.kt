fun main() {
    val name = listOf("Moosa", "Haroon", "Abubakr")
    for (i in name) {
        println("Name: $i")
    }

    for (i in 1 until 5) {
        println(i)
    }

    for(j in 5 downTo 0){
        println(j)
    }

    for(k in 1 until 5 step 2){
        println(k)
    }
}