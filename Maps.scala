import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Maps{
  def main(args: Array[String]){

//    immutable
    val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "Sue Brown")

    if (employees.contains("Manager"))
      printf("Manager: %s\n", employees("Manager"))

//    mutable

    val customers = collection.mutable.Map(100 -> "Paul Paul", 101 -> "Mark Mark")
    println(customers)
    customers(100) = "Jack Jack"
    customers(103) = "Shark Shark"
    println ( customers )
    customers(102) = "Big Tuna"
    println ( customers )
    for((customerId, customerName) <- customers){
      printf("%d -> %s\n", customerId, customerName)
    }


  }
}
