package com.example.rover_problem

class Rover(private var direction: Direction, private var position: Position) {

    fun turnLeft() {
        direction = when (direction) {
            Direction.NORTH -> Direction.WEST
            Direction.SOUTH -> Direction.EAST
            Direction.EAST -> Direction.NORTH
            Direction.WEST -> Direction.SOUTH
        }
    }

    fun turnRight() {
        direction = when (direction) {
            Direction.NORTH -> Direction.EAST
            Direction.SOUTH -> Direction.WEST
            Direction.EAST -> Direction.SOUTH
            Direction.WEST -> Direction.NORTH
        }
    }

    fun move() {
        when (direction) {
            Direction.NORTH -> position.y++
            Direction.SOUTH -> position.y--
            Direction.EAST -> position.x++
            Direction.WEST -> position.x--
        }
    }

    fun getPosition(): String {
        return "Rover is at (${position.x}, ${position.y}) and is facing $direction"
    }
}
