package com.knoldus.DefaultArgument

class LogClass {
  def log(mess1: String, mess2: String = "info"): String ={
    //("[level:] " + mess2)
    "[" + mess2 + "]: " + mess1
  }

}

object TestLog extends App {
  val str = new LogClass
  println(str.log(mess1 = "Hello Scala"))
}