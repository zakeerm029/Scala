package ScalaExample.Functions

object Closures {
  def main(args: Array[String]): Unit = {

    val p = 10   // Free variable.

    def example(a: Double) = {
      a + p / 100
    }
    println(example(12))
  }
}
