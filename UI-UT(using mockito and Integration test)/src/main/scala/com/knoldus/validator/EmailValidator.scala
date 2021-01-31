package com.knoldus.validator

class EmailValidator {


  def emailIdIsValid(x :String):Boolean={
    var cnt=0
    var z=0
    var digit=0
    var upper=0
    var lower=0
    cnt= x.count(_=='@')

    for(z<-x)
    {
      if(z.toInt>=48&&z.toInt<=57)
        digit=digit+1
      else if(z.toInt>=97&&z.toInt<=122)
        upper=upper+1
      else if(z.toInt>=65&&z.toInt<=90)
        lower=lower+1
    }
    if(digit>0&&lower>0&&upper>0&&cnt==1)
      return true
    else
      return false
  }

}
