package com.knoldus.validator

import com.knoldus.db.{CompanyReadDto, EmployeeReadDto, UserReadDto}
import com.knoldus.models.{Company, Employee, User}

class UserValidator {
  def userIsValid(user: User): Boolean = {
    val obj = new CompanyReadDto
    val x:Option[Company] =obj.getCompanyByName(user.companyName)
    if(x.isEmpty)
      true
    else
      false
  }

}
