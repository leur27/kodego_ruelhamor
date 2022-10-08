package com.oop3

class Dog:Animal,Pet, Mammal() {
    override fun walk() {
        println("Dog walks")
    }

    override fun makeSound() {
        println("Aw aw")
    }

    override fun groom() {
        println("Dog can be groomed")
    }

    override fun feed() {
        println("Dog feeds")
    }
}