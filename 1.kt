fun main(){
    val Pin = "12345"
    var count = 0
    while(count < 3){
        print("Enter your Pin: ")
        val enterPin = readln()
        if(Pin == enterPin){
            println("Login Successfull")
            break
        }
        else
            count++
            println("Login Failed")

            if(count < 3){
                println("Enter PIN again")
            }


    }
    if(count == 3){
        println("Max limit reached")
    }
}