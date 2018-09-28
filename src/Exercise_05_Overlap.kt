/** Exercise 05: Functions and Lists
 * Copyright (c) 2018 RedFantom
 * Available under GNU GPLv3, see LICENSE.md
 */


fun toListOfInt(s: String): List<Int> {
    /** Convert string of `[a, b, ...]` to a list of integers */
    val interim = s.strip().removeSurrounding("[", "]")
    val elems: List<Int> = interim.split(",").map{it.strip().toInt()}
    return elems
}


fun main(args: Array<String>) {
    println("Please enter two lists of numbers:")
    val s1 = readLine()!!
    val s2 = readLine()!!
    val l1 = toListOfInt(s1)
    val l2 = toListOfInt(s2)
    println("Overlap between the two lists: [${l1.intersect(l2)}]")
}
