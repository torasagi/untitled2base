package com.example

const val LUCKY_NUMBER = 777
const val UNLUCKY_NUMBER = 666
const val LOOP_TIMES = 5

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    fun isLuckyNumber(number: Int): Boolean {
        return number == LUCKY_NUMBER
    }

    val name = "Kotlin"
    // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, $name!")

    isLuckyNumber(UNLUCKY_NUMBER)

    for (i in 1..LOOP_TIMES) {
        // TIP Press <shortcut actionId="Debug"/> to start debugging your code.
        // We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}
