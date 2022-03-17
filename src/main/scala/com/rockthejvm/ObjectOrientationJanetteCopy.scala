package com.rockthejvm

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
  class Dog (val name:String) extends Animal {
  val aDog = new Dog("Lassie")
  //constructor arguments are not fields
  aDog.name

}
