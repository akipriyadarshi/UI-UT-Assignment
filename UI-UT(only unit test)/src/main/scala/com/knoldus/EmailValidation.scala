package com.knoldus

/*class UserAction(loginService: LoginService) {

  def displayActionsPerformed(userId: Int): String = {
    val result = loginService.getListOfActionsPerformed(userId + 2)
    if(result.nonEmpty){
      "SUCCESS"
    }
    else {
      "FAILURE"
    }
  }
}*/
object EmailValidation {
  def isvalidrecipient(x: String): Boolean = {
   var z=0
    var digit=0
    var upper=0
    var lower=0
    for(z<-x)
      {
        if(z.toInt>=48&&z.toInt<=57)
          digit=digit+1
        else if(z.toInt>=97&&z.toInt<=122)
          upper=upper+1
        else if(z.toInt>=65&&z.toInt<=90)
          lower=lower+1
      }
      if(digit>0&&lower>0&&upper>0)
        return true
      else
        return false
    }
  def isvalidattherate(x :String):Boolean={
     var cnt=0
   cnt= x.count(_=='@')
    if(cnt==1)
      return true
      else
      return false
    }
  def isvaliddomain(x : String): Boolean={
    var z=0
    var digit=0
    var upper=0
    var lower=0
    for(z<-x)
    {
      if(z.toInt>=48&&z.toInt<=57)
        digit=digit+1
      else if(z.toInt>=97&&z.toInt<=122)
        upper=upper+1
      else if(z.toInt>=65&&z.toInt<=90)
        lower=lower+1
    }
    if(digit>0&&lower>0&&upper>0)
      return true
    else
      return false

  }
  def isvalidtopdomain(x:String):Boolean={
    if(x==".com"||x==".org"||x==".net")
      return true
    else
      return false
  }



  }





