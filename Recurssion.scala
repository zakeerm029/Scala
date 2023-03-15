package ScalaExample.Functions

object Recurssion {
    def main(args: Array[String]): Unit = {

      println(factorialIt(3))
      println(fact(3))
      println(fact(4))

      println("working with for loop ")
      def factorialIt(n: Int): Int = {
        var factorial = 1  // staring with 1
        for(i <- 1 to n)  // i is a mutability, if you dont want to use mutablility then we go with recursive
          factorial *=i
        return factorial
      }

      println("recursive there is no mutability")

      def fact(n: Int): Int = {
        if (n ==1 ) 1
        else            // calling method should be anywhere
          n * fact(n-1)  // inside the method, calling the same method ie.. fact
      }                  // it will execute till n-1
    }                   // recursion will terminated once all the values are completed.

    println("tail recursion")
    def fact1(n: Int): Int = {
      if (n == 1)1
      else
        n*fact1(n-1)  // calling method should be last
    }
}
