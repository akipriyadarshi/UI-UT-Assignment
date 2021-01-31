package com.knoldus
import org.mockito.MockitoSugar.{mock, when}

class TestInterface extends org.scalatest.AsyncFlatSpec {
  val obj = new DivAndFact
  "A division" should " have valid division" in {

    assert(obj.divide(18,2) == 9)

  }
  "A factorial" should "have proper result" in{
    assert(obj.factorial(5)==120)
  }
}
