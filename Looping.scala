object Looping {

  def main(args: Array[String]) {
    // var declaration
    var i = 0;

    // do ... while loop
    do {
        println(i)
        i += 1
    } while(i <= 10)

    // while loop
    while(i <= 10){
      println(i*5)
      i += 1
    }

    // for loop
    val aList = List(1,2,3,4,5)
    for(i <- aList){
      println("List item " + i)
    }

    // creating an evenlist
    var evenList = for { i <- 1 to 20
                      if (i % 2) == 0
                    } yield i
    for(i <- evenList){
      println(i)
    }

   }
}
