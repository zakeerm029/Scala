package ScalaExample.Cases

case class Example (name: String, age: Int)  // By default, it is val name

object Example {

  def main(args: Array[String]): Unit = {

    val e = Example("zakeer",29)
    println("e is: "+e)
    val e1 = e.copy()
    println("e1 is: "+e1)

    println(e1.name)
    println(e1.age)

    val e2 = Example("hello",40)
    println(e2.name)
    println(e2.age)
  }
}
