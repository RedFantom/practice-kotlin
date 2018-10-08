/** Exercise 07: Rock, Paper, Scissors
 * Copyright (c) 2018 RedFantom
 * Available under GNU GPLv3, see LICENSE.md
 */
import java.util.Scanner;


val RockPaperScissors = mapOf(
        "r" to "Rock",
        "p" to "Paper",
        "s" to "Scissors"
)

val Values: Map<String, Int> = mapOf("r" to 1, "p" to 2, "s" to 3)


fun main(args: Array<String>) {
    println("Welcome to Rock, Paper, Scissors!")
    val reader = Scanner(System.`in`)
    var another = "y"
    var user: String = "d"
    var comp: String
    var uval: Int?
    var cval: Int?

    while (another.toLowerCase() == "y") {
        while (!(user in RockPaperScissors.keys)) {
            print("Please enter a choice (r/p/s): ")
            user = reader.nextLine().toLowerCase()
        }
        comp = RockPaperScissors.keys.shuffled().take(1)[0]
        uval = Values[user]
        cval = Values[comp]
        println("You chose ${RockPaperScissors[user]}, " +
                "the computer rolled ${RockPaperScissors[comp]}.")
        if (cval == null || uval == null) {
            println("You entered an invalid value.")
            continue
        } else if ((cval % 3 + 1) == uval)
            println("You won!")
        else if ((uval % 3 + 1) == cval)
            println("You lost...")
        else
            println("Aw, a draw.")
        print("Would you like to play again? (y/n) [n]: ")
        another = reader.nextLine()
        user = "d"
    }
}
