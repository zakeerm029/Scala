package ScalaExample.methods

object Example1 {
  def main(args: Array[String]): Unit = {
    println("Reading arguments from commandline ie.. edit config")
    println(args(0))
    println(args(1))

    println("OR")
    val a = args(0).toInt
    val b = args(1).toInt
    val c = args(2).toInt
    def add(a: Int, b: Int): Int = return a + b

    println(add(a, b))

    println("multiple ways to def and call function")
    def printHelloMsg()=println("hello")
    printHelloMsg()
    def printHelloMsg1 = println("hello-one")
    printHelloMsg1
    def printHelloMsg2 {println("hello-two")}
    printHelloMsg2

    println("Finding maximum value")

    def maxOfTwo(a:Int,b:Int):Int = {
      if(a>b) a else b
    }
    println("Maximum value in two: "+maxOfTwo(a,b))

    def maxOfThree(a:Int,b:Int,c:Int) = {
      if(a>b & a>c) a else if(b>a & b>c) b else c
    }
    println("Maximum value in three: "+maxOfThree(a,b,c))

    println("Nested Methods")

    def maxOfThree1(a:Int,b:Int,c:Int) = {
    def maxOfTwo1(a:Int,b:Int) = {
        if(a>b) a else b
      }
      println("Nested result: "+maxOfTwo1(a, maxOfTwo1(b,c)))
    }
    maxOfThree1(a,b,c)
  }
}
