import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Maps{
  def main(args: Array[String]){
    val employees = Map(
                        "Manager" -> "Bob Smith",
                        "Secretary" -> "Sue Brown"
                        )

    if (employees.contains("Manager"))
      printf("Manager: %s\n", employees("Manager"))

  }
}
