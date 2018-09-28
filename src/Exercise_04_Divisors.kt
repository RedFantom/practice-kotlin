/** Exercise 04: Divisors of numbers
 * Copyright (c) 2018 RedFantom
 * Available under GNU GPLv3, see LICENSE.md
 */
import java.util.Scanner


fun main(args: Array<String>) {
    print("Please enter a number: ")
    val reader = Scanner(System.`in`)
    val number = reader.nextInt()
    val list: MutableList<Int> = mutableListOf<Int>()
    for (i in 1..number) {
        if (number % i == 0) {
            println("${i} is a divisor of ${number}.")
            list.add(i)
        }
    }
    if (list.count() == 2)
        println("Yay! Your number is a prime!")
}
