
import com.knoldus.models.{Company, User}
import com.knoldus.request.{CompanyImpl, UserImpl}
import com.knoldus.validator.{CompanyValidator, EmailValidator, UserValidator}


class UserIntegration extends org.scalatest.AsyncFlatSpec {
  val users= User("Abhishek",22,"Philips","abhi407@gmail.com")

  "A user company's name" should " exist in database" in {
    val UValidator = new UserValidator

    val userimpl = new UserImpl(UValidator)

    val res = userimpl.createUser(users)
    assert(res.isEmpty)
  }
  "A user" should "have a valid email id" in{
    val emailvalid=new EmailValidator
    assert(emailvalid.emailIdIsValid(users.emailId))
  }
}

