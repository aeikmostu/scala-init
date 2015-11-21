package org.amos.katas

/**
 * Created by amos on 04/11/15.
 */
object FizzBuzz {

  def getResult(param: Int): String = (param % 3, param % 5, param%15) match {
    case (_, _, 0) => "fizzbuzz"
    case (_, 0 ,_) => "buzz"
    case (0, _, _) => "fizz"
    case _ => param.toString
  }

  def main(args: Array[String]) {
    print(getResult(15))
  }
}
