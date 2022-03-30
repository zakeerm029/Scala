package ScalaExample.Functions

object callByValue {
  def main(args:Array[String]): Unit = {

    //defining function call by value
    def something() =
    {
    println("something")
      1 // return value
    }
    //defining function
    def callByValue(x: Int): Unit =
    {
      println("x1 is: "+x)
      println("x2 is: "+x)

    }
    callByValue(something)
  }
}
