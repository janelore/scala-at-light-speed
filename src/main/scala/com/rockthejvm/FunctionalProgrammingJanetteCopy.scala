package com.rockthejvm

object FunctionalProgrammingJanetteCopy extends App{
  // Scala is OO
  class Person(name: String) {
    def apply(age: Int) = println(s"I have aged $age years")
  }
  //this is an instance of the Person class defined above.
  val bob = new Person("Bob")
  bob.apply(43)//the presence of an apply method allows an instance of a class to be invoked like a function
  bob(43) // INVOKING bob as a function === bob.apply(43)

  /*
    Scala runs on the JVM (Java Virtual Machine)
    Functional programming:
    - compose functions
    - pass functions as args
    - return functions as results

    Conclusion: FunctionX = Function1, Function2, ... Function22
   */
}
