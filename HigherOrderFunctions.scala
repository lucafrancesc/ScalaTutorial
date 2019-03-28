import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object HigherOrderFunctions{

  def main(args: Array[String]): Unit = {

    val log10Func = log10 _

    // println(log10Func(1000))

    List(100.00, 1000.00, 10000.00).map(log10Func).foreach(println)

    List(1, 2, 3, 4, 5).map((x : Int ) => x * 50).foreach(println)
  } //END OF MAIN

} // END OF OBJ CLASSES
