var id = ""

fun main(){
    while(true){
        print("Enter you ID or e to exit :  ")
        id = readln()

        if(id == "e"){
            println("Exited")
            break

        }
        if(id == "s007"){
        moosa()
    }
    else if(id == "s008"){
        ali()
    }
    else if(id == "s009"){
        sam()
    }
    else
        print("Invald ID")
}
}

fun moosa(){
    println("Name : Moosa Shahid Raja")
    println("Status : Pass")
}
fun ali(){
    println("Name : Ali")
    println("Status : Pass")
}
fun sam(){
    println("Name : Zain")
    println("Status : Failed")
}