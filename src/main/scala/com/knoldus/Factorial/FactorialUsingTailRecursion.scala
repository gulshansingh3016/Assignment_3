package com.knoldus.Factorial

class FactorialUsingTailRecursion {

  def factorialTailRecursion(number: Int): Int={
    def factorialHelper(num: Int, accumulator: Int): Int = {
      if(num <= 0){
        accumulator
      }
      else{
        factorialHelper(num -1 , num * accumulator)
      }
    }
    //factorialTailRecursion(number)
    factorialHelper(number, 1)
    /*
    factorialTailRecursion(10) = factorialHelper(10, 1)
   = factorialHelper(9, 10*1)
   = factorialHelper(8, 9*10*1)
   = factorialHelper(7, 8*9*10*1)
   = factorialHelper(6, 7*8*9*10*1)
   = factorialHelper(5, 6*7*8*9*10*1)
   = factorialHelper(4, 5*6*7*8*9*10*1)
   = factorialHelper(3, 4*5*6*7*8*9*10*1)
   = factorialHelper(2, 3*4*5*6*7*8*9*10*1)
   = factorialHelper(1, 2*3*4*5*6*7*8*9*10*1)
   = factorialHelper(0, 1*2*3*4*5*6*7*8*9*10*1)

    number == 0
    return accumulator  => 1*2*3*4*5*6*7*8*9*10*1 = 3628800
     */
  }
}

object TestTailRecursion extends App {
  val num = new FactorialUsingTailRecursion
  println(num.factorialTailRecursion(10))
}