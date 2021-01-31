package com.knoldus

trait Operations {

    def divide(x:Int,y:Int):Int
    def factorial(x:Int):Int
  }

class DivAndFact extends Operations {


   def divide(x: Int,y:Int): Int ={
    var result = x/y
     result

  }
  def factorial(x:Int):Int={
    var fact = 1
    for(i <- 1 to x)
    {
      fact = fact * i
    }

     fact
  }
}

