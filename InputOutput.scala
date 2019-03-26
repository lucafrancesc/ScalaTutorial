import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object InputOutput{
  def main(args: Array[String]){

    // var numberGuess = 0
    //
    // do {
    //   println("Guess a number: ")
    //   numberGuess = readLine.toInt
    // } while(numberGuess != 15)
    //
    // printf("You guessed the secret number %d\n", 15)

    var name = "Luca"
    var age = 29
    var weight = 76.5

    println(s"Hello, my name is ${name}")
    println(f"I am ${age} and weight ${weight}%.2f")

  }
}
