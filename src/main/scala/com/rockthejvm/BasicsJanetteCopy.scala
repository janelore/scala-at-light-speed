package com.rockthejvm

object BasicsJanetteCopy extends App {
  // this is how you define a value
  val meaningOfLife: Int = 42
  val aBoolean = false
  // strings and string operations
  val aString = "I love Scala"
  val aComposedString = "I" + " " + "love" + " " + "Scala!"
  val InterpolatedString = s"The meaning of life is $meaningOfLife"
  //expressions: structures that can be reduced to a value
  val anExpression  = 2 + 3
  //if statement is an expression
  val ifExpression = if(meaningOfLife > 43)56 else 99
  val chainedIfExpression = {
    if(meaningOfLife > 43)56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife > 999) 78
    else 0
  }

}

