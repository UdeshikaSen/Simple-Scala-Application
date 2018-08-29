package com.helloworld.pkg1

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello Wolrd")

    var value: Int = 4
    isAMultipleOfTwo(value)
    value = 5
    isAMultipleOfTwo(value)
  }

  def isAMultipleOfTwo(value: Int): Boolean = {
    var remainder: Int = value % 2
    if (remainder == 0) {
      println(value + " is a multiple of two")
      return true;
    }
    else {
      println(value + " is not a multiple of two")
      return false;
    }

  }
}
