package ScalaExample.Inheritance

class A {
  val name = "zakeer"


}
  class B extends A {
    val age = 29

    /*def is a keyword, used to create a function or method
  * object oriented language, we can call it as method(show)
  * then show is not inside the class then we can call as a function*/
    def show() {
      println(name, age)
    }
  }

  object Single {
    def main(args: Array[String]): Unit = {

      val b = new B()
      b.show()

    }


}
