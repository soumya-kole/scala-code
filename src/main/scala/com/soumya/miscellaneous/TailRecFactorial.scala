package com.soumya.miscellaneous

import scala.annotation.tailrec

object TailRecFactorial extends App{

  def factorial(n: Int)={
    @tailrec
    def innerFact(n: BigInt, acc: BigInt):BigInt ={
      if (n == 0 || n == 1) acc
      else innerFact(n-1, acc * n )
    }
    innerFact(n, 1)
  }
  println(factorial(100))

}
