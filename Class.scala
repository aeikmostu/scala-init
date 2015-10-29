package org.amos

class firstClass {
  var myField = 0

  def this(param: Int) {
    this()
    this.myField = param
  }

  def addToMyField(value: Int) {
    this.myField += value
  }

}
