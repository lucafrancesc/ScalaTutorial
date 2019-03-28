import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Exceptions{

  def main(args: Array[String]): Unit = {

    def divedeNums(num1 : Int, num2 : Int) = try {
      (num1 / num2)
    } catch {
      case ex : java.lang.ArithmeticException => "Can't divede by zero"
    } finally {
      // clean up after exception
    }

    println("3 / 0 = " + divedeNums(3, 0))
    println("4 / 3 = " + divedeNums(4, 3))

  } //END OF MAIN

} // END OF OBJ CLASSES
