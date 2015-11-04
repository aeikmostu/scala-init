package org.amos.org.amos.katas

/**
 * Created by amos on 04/11/15.
 */
object FizzBuzz {

  def getResult(param : Int): String = true match {
    case param%3 == 0 => "fizz"
    case param%5 == 0 => "buzz"
    case param%15 == 0 => "fizzbuzz"
  }

}
