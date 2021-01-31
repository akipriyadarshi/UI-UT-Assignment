import com.knoldus.validator.EmailValidator

class TestEmailValidator extends org.scalatest.AsyncFlatSpec {
  "An email id" should "be valid ie it must be alphanumeric and contains only one @ symbol" in{
    val email1=new EmailValidator
    val res1= email1.emailIdIsValid("Akash123321@gmail.com")
    val email2=new EmailValidator
    val res2= email1.emailIdIsValid("Akash@gmail.com")
    assert(res1)
    assert(!res2)

  }


}
