package ScalaExample.Functions

import java.util.Date
object partiallyAppliedFunction {

  /*why we are using log function here ?
  log function is used to give a message or text in some suitation

  example: if you code show error then we want to log something
    and you want to know at which time log is created  or you want to show some information to user
  or warnings  or critical conditions in our code then we use log function*/

  def log(date: Date, message: String) = {
    println(date + "   " + message)
  }
    def main(args: Array[String]): Unit = {

      def add(a: Int, b: Int, c: Int) = a + b + c

      val a = add(10, 20, _: Int) // Here, _ is a place holder

      println(a(30))

      // creating partially function out of this log
      val date = new Date
  val newLog = log(date,  _ : String)
     newLog("The message 1")
      newLog("The message 1")
    }

}