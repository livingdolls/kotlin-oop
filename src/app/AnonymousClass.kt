package app

import data.Action

fun fireAction(action: Action) {
    action.action()
}

class SampleAction : Action {
    override fun action() {
        println("SampleAction")
    }
}

fun main() {
    fireAction(SampleAction())

    fireAction(object : Action {
        override fun action() {
            println("SampleAction 1")
        }
    })

    fireAction(object : Action {
        override fun action() = println("SampleAction 2")
    })
}