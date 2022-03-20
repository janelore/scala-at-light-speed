package com.rockthejvm

import com.rockthejvm.ObjectOrientation.{Animal, aDeclaredAnimal}

object ObjectOrientationJanetteCopy extends App {
  //class and instance
  class Animal

  val anAnimal = new Animal
  //inside off a class you can define fields - they will be inherited by dog
  //define field
  val age: Int = 0
  //define method
  def eat(): Unit = println("I'm eating")
}
  //constructor definition
  // inheritance
  class Dog(val name: String) extends Animal // constructor definition
  val aDog = new Dog("Lassie")

// constructor arguments are NOT fields: need to put a val before the constructor argument
  aDog.name

  //subtype polymorphism
  val aDeclaredAnimal : Animal = new Dog("Hachi")
    a DeclaredAnimal.eat() // the most derived method will be called at runtime

  //abstract class - not all fields or methods require implementation
  abstract class WalkingAnimal {
    val hasLegs = true //this defines a value
    def walk(): Unit //this defines a method,default is public, when protected no access to class outside
  }
  // "interface" = ultimate abstract type
  trait Carnivore {
    def eat(animal: Animal): Unit
  }
  // ^^^ you can leave everything unimplemented
}
