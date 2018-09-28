/** Exercise 01: Basic User Input and Interaction
 * Copyright (c) 2018 RedFantom
 * Available under GNU GPLv3, see LICENSE.md
 */
import java.util.Scanner


fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("What is your name? ")
    val name: String = readLine()!!
    print("How old are you? ")
    val age: Int = reader.nextInt()
    println("${name} will turn 100 in  ${100 - age} years.")
}
