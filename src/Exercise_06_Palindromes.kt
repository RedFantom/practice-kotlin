/** Exercise 06: Strings
 * Copyright (c) 2018 RedFantom
 * Available under GNU GPLv3, see LICENSE.md
 */


fun main(args: Array<String>) {
    print("Please enter a string: ")
    val s = readLine()!!
    var i2: Int
    for (i1 in 0..(s.count() - 1)) {
        i2 = s.count() - 1 - i1
        if (s[i1] != s[i2]) {
            println("The string you entered is not a palindrome...")
            return
        }
    }
    println("Congratulations! The string you entered is a palindrome!")
}

