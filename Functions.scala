import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Functions{
  def main(args: Array[String]){

    // def getSum(int1 : Int, int2 : Int) : Int = {
    //   int1 + int2
    // }
    //
    // println(getSum(4,5))

    // def sayHi() : Unit = {
    //   println("Hi, how are you?")
    // }
    //
    // sayHi

    // def getSum(args : Int*) : Int = {
    //   var sum : Int = 0
    //   for(num <- args){
    //     sum += num
    //   }
    //   sum
    // }
    //
    // println(getSum(1,2,3,4))

//    def factorial(num : BigInt) : BigInt = {
//      if(num <= 1)
//        1
//      else
//        num * factorial(num-1)
//    }
//
//    println(factorial(12))

    var numbers = new Array[Int](20)

    for(num <- 1 until numbers.length){
      numbers(num) = num
      println(numbers(num))
    }

    var numbersTimes2 = for(i <- numbers) yield i * 2
//    for(num2 <- 0 until numbersTimes2.length){
//      println(numbersTimes2(num2))
//    }
    numbersTimes2.foreach(println)

  }
}
