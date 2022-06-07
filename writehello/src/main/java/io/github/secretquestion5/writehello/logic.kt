package io.github.secretquestion5.writehello

class logic {
    fun WriteHello(){
        println("hello world from library!")
        WriteHelloAgainButDoNotShowImplementation()
    }

    private fun WriteHelloAgainButDoNotShowImplementation(){
        println("hello world hith hidden implementation")
    }
}