package com.knoldus


  class EmailValidationTest extends org.scalatest.AsyncFlatSpec {


    "A valid email id" should " have valid user name" in {

      assert(EmailValidation.isvalidrecipient("Akash123"))
      assert(!(EmailValidation.isvalidrecipient("Akash")))


    }
    it should "have only one @ symbol" in {
      assert(EmailValidation.isvalidattherate("aki@123"))
    }
    it should "have alphanumeric domain name(both upper and lower case) " in{

      assert(EmailValidation.isvaliddomain("Knoldus123"))
    }
    it should "have top level domain as .com/.org/.net" in {
      assert(EmailValidation.isvalidtopdomain(".com"))
    }




  }


