package ScalaExample.Functionst

object callByName {
  def main(args:Array[String]):Unit = {

    //defining function call by name
    def something() =
    {
      println("calling something")
       1 // return value
    }
    //defining function
    def callByName(x: => Int) =   // => is a transformation
    {
      println("x1: "+x)
      println("x2: "+x)
    }
    //calling function
    callByName(something)
  }
}
