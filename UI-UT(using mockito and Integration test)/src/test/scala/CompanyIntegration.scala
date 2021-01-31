

  import com.knoldus.models.Company
  import com.knoldus.request.CompanyImpl
  import com.knoldus.validator.{CompanyValidator, EmailValidator}
  import org.mockito.MockitoSugar.{mock, when}

  class CompanyIntegration extends org.scalatest.AsyncFlatSpec {
    val comp= Company("HP","Google123@gmail.com","Delhi")

    "A company " should " not already exist in database" in {
      val CValidator = new CompanyValidator


      val compimpl = new CompanyImpl(CValidator)

      val res = compimpl.createCompany(comp)
      assert((res.isEmpty))
    }
    it should "have a valid email id ie Alphanumeric and only one @" in{
      val emailvalid=new EmailValidator
      assert(emailvalid.emailIdIsValid(comp.emailId))
    }



}
