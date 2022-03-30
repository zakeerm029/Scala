package ScalaExample.Functions

object functionWithNamedArg {
    def main(args: Array[String]): Unit = {

      function(b = 7, a = 3)
      function(5,3)
    }
  def function(a: Int, b:Int) = {
    println("a value is: "+a)
    println("b value is: "+b)
  }
}
