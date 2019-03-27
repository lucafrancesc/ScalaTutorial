

object Touples {
  def main(args: Array[String]): Unit = {

    var tupleMarge = (103, "Marge Simpson", 10.25)

    printf("%s ows us $%.2f\n", tupleMarge._2, tupleMarge._3)

    tupleMarge.productIterator.foreach( i => println(i))

    println(tupleMarge.toString())
  }
}