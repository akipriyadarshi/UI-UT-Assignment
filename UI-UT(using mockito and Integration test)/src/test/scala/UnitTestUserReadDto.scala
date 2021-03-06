import com.knoldus.db.UserReadDto
import com.knoldus.models.User


class UnitTestUserReadDto extends org.scalatest.AsyncFlatSpec {
  val user1= User("Akash",22,"Knoldus","aki407@gmail.com")
  val obj1=new UserReadDto
  val res1=obj1.getUserByName(user1.firstName)
  "User Database" should "return available name" in {
    assert(!(res1.isEmpty))
  }
  val user2= User("Abhishek",23,"Google","abhi123@gmail.com")
  val obj2=new UserReadDto
  val res2=obj2.getUserByName(user2.firstName)
  it should "return none if name is not present" in {
    assert(res2.isEmpty)
  }

}

