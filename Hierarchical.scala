package ScalaExample.Inheritance

class A1 {
  val customer = "zakeer"
  def details = {
    println("A1 details")
  }
}

class B1 extends A1 {
  val salary = 70000
  def show() ={
    println("B1 class: "+customer,salary)
  }
}

class C1 extends A1 {
  val salary = 53000
  def show1() ={
    println("C1 class: "+customer,salary)
  }
}
object Hierarchical {
  def main(args: Array[String]): Unit = {
      val b = new B1
    b.show()
  val c= new C1
    c.show1()
  }
}
