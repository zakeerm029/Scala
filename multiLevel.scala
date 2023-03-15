package ScalaExample.Inheritance

class AA {
  val customer = "zakeer"
  def cusDetails: Unit ={
    println("customer details available in Bank")
  }
}
class BB extends AA{
  val salary = 53000
}
class CC extends BB{
  val accountType = "saving"
  def show()= {
    println(customer,salary,accountType)
  }
}
object multiLevel {
  def main(args: Array[String]): Unit = {
    val c = new CC()
    c.show()  // we can access all properties from child class
    c.cusDetails
    val a = new AA()  // a is super class for all the classes, so we can't access the child class properties from the parent class object
    //a.cusDetails
  }
}
