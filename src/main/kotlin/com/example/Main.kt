package com.example

fun main() {
    val name = "Kotlin"
    // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, $name!")

    val unLuckyNumber = 666

    fun tryCheckLuck(value: Int) {
        if (value == Constants.LUCKY_NUMBER) {
            println("You are lucky!")
        } else {
            println("You are not lucky!")
        }
    }

    tryCheckLuck(unLuckyNumber)

    val loopTimes = 5

    for (i in 1..loopTimes) {
        // TIP Press <shortcut actionId="Debug"/> to start debugging your code.
        // We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}
