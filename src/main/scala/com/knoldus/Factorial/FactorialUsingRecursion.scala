package com.knoldus.Factorial

class FactorialUsingRecursion {

  def factorial(number: Int): Int ={
    if(number <= 1) {
      number
    }
    else{
      number * factorial(number-1)

      /*
          5 * factorial(5-1)
          4 * factorial(4-1)
          3 * factorial(3-1)
          2 * factorial(2-1)

       */
    }
  }
}

object TestFactorial extends App{
  val num = new FactorialUsingRecursion
  println(num.factorial(5))
}