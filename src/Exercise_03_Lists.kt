/** Exercise 03: Lists
 * Copyright (c) 2018 RedFantom
 * Available under GNU GPLv3, see LICENSE.md
 */


fun main(args: Array<String>) {
    println("Please enter a list of integers in the format `[a, b, c, ...]`.")
    val input: String = readLine()!!
    val interim: List<String> = input.removeSurrounding("[", "]").split(",")
    val result: List<Int> = interim.map{it.strip().toInt()}
    println("You entered ${result.count()} elements.")
    print("Elements: ")
    for (i: Int in result) {
        print("${i}, ")
    }
}
