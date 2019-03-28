import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object HigherOrderFunctions{

  def main(args: Array[String]): Unit = {

    val log10Func = log10 _
    println(log10Func(1000))

  } //END OF MAIN

} // END OF OBJ CLASSES
