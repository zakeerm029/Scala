package ScalaExample.Functions

object Currying {
  def main(args: Array[String]): Unit = {

    println("Normal Function")

    def add (a:Int, b:Int): Int = a+ b

      val a = 10

      val b = 20

      println(add(a,b))
    }

    println("Currying Functions we can declare two ways")

   def add1(a: Int) = (b: Int) => a + b
   //def add2(a: Int)(b: Int) = a * b

    println(add1(5)(2))

    val a = add1(15)

    val b = a(2)

    println(b)

  val b1 = a(11)
  println("here is the value: "+ b + " :" +b1)

  println(add1(10)(11))

}