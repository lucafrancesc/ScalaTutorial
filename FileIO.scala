import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object FileIO{

  def main(args: Array[String]): Unit = {

    val writer = new PrintWriter("test.txt")
    writer.write("just some random txt.\nSome more txt")
    writer.close()

    val textFromFile = Source.fromFile("/Users/apple/Projects/Scala/test.txt", "UTF-8")
    val lineIterator = textFromFile.getLines

    for(line <- lineIterator)
      println(line)

    textFromFile.close()

  } //END OF MAIN

} // END OF OBJ CLASSES
