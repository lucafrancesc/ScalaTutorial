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
    for(i <-1 to 10){
      println(i)
    }

   }
}
