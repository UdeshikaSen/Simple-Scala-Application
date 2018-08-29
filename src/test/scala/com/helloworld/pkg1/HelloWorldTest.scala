package com.helloworld.pkg1

import org.scalatest.FunSuite

class HelloWorldTest extends FunSuite {

  test("Test whether isAMultipleOfTwo works correctly") {
    var result = HelloWorld.isAMultipleOfTwo(8)
    assert(result)

    result = HelloWorld.isAMultipleOfTwo(155)
    assert(result == false)
  }

}
