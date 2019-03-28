import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object HigherOrderFunctions{

  def main(args: Array[String]): Unit = {

    val log10Func = log10 _

    def time3(num : Int) = num * 3
    def time4(num : Int) = num * 4

    def multIt(func : (Int) => Double, num : Int) = {
      func(num)
    }

    printf("3 * 100 = %.1f\n", multIt(time3, 100))
    printf("4 * 100 = %.1f\n", multIt(time4, 100))

    val divisorVal = 5

    val divisor = (num : Double) => num / divisorVal

    println("5 / 5 = " + divisor(5.0))

    // println(log10Func(1000))
    //
    // List(100.00, 1000.00, 10000.00).map(log10Func).foreach(println)
    // println
    //
    // List(1, 2, 3, 4, 5).map(_ * 50).foreach(println)
    // println
    //
    // List(1, 2, 3, 4, 5).filter((x : Int ) => x % 2 == 0).foreach(println)
    // println
    //
    // List(1, 2, 3, 4, 5).filter(_ % 2 != 0).foreach(println)

  } //END OF MAIN

} // END OF OBJ CLASSES
