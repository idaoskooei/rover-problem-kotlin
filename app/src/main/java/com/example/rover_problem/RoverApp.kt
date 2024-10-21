package com.example.rover_problem

fun main() {
    val rover = Rover(Direction.NORTH, Position(0, 0))

    println("Rover control - enter commands (L, R, M, ?, Q)")
    println("Commands:")
    println("L: turn left")
    println("R: turn right")
    println("M: move forward")
    println("? - show this message again")
    println("Q - quit the program")

    while (true) {
        print("> ")
        val command = readlnOrNull()?.trim()?.uppercase()

        when (command) {
            "L" -> {
                rover.turnLeft()
                println("Turned left. ${rover.getPosition()}")
            }
            "R" -> {
                rover.turnRight()
                println("Turned right. ${rover.getPosition()}")
            }
            "M" -> {
                rover.move()
                println("Moved forward. ${rover.getPosition()}")
            }
            "?" -> {
                println("Commands:")
                println("L - Turn left")
                println("R - Turn right")
                println("M - Move forward")
                println("? - Show help")
                println("Q - Quit")
            }
            "Q" -> {
                println("Exiting program...")
                break
            }
            else -> {
                println("Invalid command. Type '?' for help.")
            }
        }
    }
}
