/** Exercise 02: Basic User Input and Interaction
 * Copyright (c) 2018 RedFantom
 * Available under GNU GPLv3, see LICENSE.md
 */
import java.util.Scanner


fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Please enter a number: ")
    val number = reader.nextInt()
    if (number % 2 == 0) {
        if (number % 4 == 0)
            println("Your number was multiple of four.")
        else
            println("Your number was even.")
    } else
        println("Your number was odd.")
}
