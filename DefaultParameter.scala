package ScalaExample.Functions

/*scala provides the ability to give parameters default values that can be used to allow a caller
to omit those parameters*/

object DefaultParameter {
    def main(args: Array[String]): Unit = {
    def log(message: String, level: String = "INFO") = println(s"$level: $message")
      log("system starting")
      log("users not found","warning")

      def college(student: String, nameofthecollege: String = "collegeName") = println(s"$nameofthecollege: $student")
    college("Balayesu")
      college("admission completed","paid")

    }
}
