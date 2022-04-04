package ScalaExample.Functions

object HigherOrderFun {
    def main(args: Array[String]): Unit = {

      println("first way")
      def doubler(x:Int) :Int = x*2
      // Here, doubler is the reference
     //  (x:Int):Int type of function (based on input and output it will decides the type of function)

      println("second way")
      val doubler1 = (x:Int)=> x*2

      /*val funObj:Int => Int = doubler1
      println(funObj(10))*/
      doubler(10)

      def add(x:Int, y:Int, f:Int => Int) = {
        println("x value is: "+x)
        println("y value is: "+y)
        println("f value is: "+f(x))
        println("f value is: "+f(y))
      }
      add(10,20,doubler)

      val array = List(1,2,3,4,5,6,7,8)
      val arr= array.filter(x => x%2 == 0)
      arr.foreach(println)
    }
}
