package dev.thiagopereirati.marvelkmm

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}