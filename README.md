# **Rover Control Command Line App**

## This is a Kotlin-based command-line application that simulates a rover moving on a 2D grid. The rover can turn left, turn right, or move forward, and you can control it using simple commands.

### **Problem Overview**
The rover is initially positioned at a specific location on a 2D plane and faces one of four directions: NORTH, SOUTH, EAST, or WEST.
The user can control the rover with commands to:

- Turn the rover left or right.
- Move the rover one step forward in the direction it's facing.
- Display help messages.
- Quit the program.

#### Supported Commands:
- L: Turn the rover left (90° counterclockwise).
- R: Turn the rover right (90° clockwise).
- M: Move the rover forward in the direction it is currently facing.
- ?: Display the help message showing the list of commands.
- Q: Quit the program.

#### Direction Overview:
- NORTH: Moving forward increases the rover's y-coordinate by 1.
- SOUTH: Moving forward decreases the rover's y-coordinate by 1.
- EAST: Moving forward increases the rover's x-coordinate by 1.
- WEST: Moving forward decreases the rover's x-coordinate by 1.
