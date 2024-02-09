package com.example.rockpaperscissors
fun main(){
    println("Enter a choice : Rock , Paper or Scissors")
    var userInput = readln()
    val condition=(1..3).random()
    val computerInput : String
    if(condition==1){
        computerInput="Rock"
    }
    else if (condition==2){
        computerInput="Paper"
    }
    else{
        computerInput="Scissors"
    }
    println("Computers choice is : " + computerInput)
    val winner = when{
        userInput == computerInput -> "Tie"
        userInput == "Paper" && computerInput == "Rock" -> "Player"
        userInput == "Scissors" && computerInput == "Paper" -> "Player"
        userInput == "Rock" && computerInput == "Scissors" -> "Player"
        else -> "Computer"
    }
    if(winner=="Tie"){
        println("Its a tie")
    }
    else if(winner=="Player"){
        println("Congratulations you won!!!!")
    }
    else if(winner=="Computer"){
        println("Better luck next time")
    }


}

