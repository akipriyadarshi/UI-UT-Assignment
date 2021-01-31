package com.knoldus.db

import com.knoldus.models.{Company, User}

import scala.collection.immutable.HashMap

class UserReadDto {
  val user1: User = User("Akash", 22, "Knoldus","aki407@gmail.com")
  val user2: User = User("Vikash",23,"Google","vk12345@gmail.com")
  val users: HashMap[String, User] = HashMap("Akash" -> user1, "Vikash" -> user2)

  def getUserByName(name: String): Option[User] = users.get(name)

}
