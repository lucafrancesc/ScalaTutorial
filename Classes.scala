object Classes{

  def main(args: Array[String]): Unit = {

    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName, rover.getSound)
    rover.setMovement("wiggles his tail")
    printf("%s %s\n", rover.getName, rover.getMovement)

    val whiskers = new Animal("Whiskers", "Meow", "Run")
    println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}")
    println(whiskers.toString)

  } // END OF MAIN

//  CREATING MY FIRST CLASS
// defining the default constructor
  class Animal(var name: String, var sound : String, var movement : String){

    this.setName(name)

    val id = Animal.newIdNumber

    def getName() : String = name
    def getSound() : String = sound
    def getMovement() : String = movement

    def setName(name : String){
      if(!(name.matches(".*\\d+.*")))
        this.name = name
      else
        this.name = "No name"
    }

    def setSound(sound : String){
      this.sound = sound
    }

    def setMovement(movement : String){
      this.movement = movement
    }

    def this(name : String){
      this("No name", "No sound", "No movement")
      this.setName(name)
    }

    def this(){
      this("No name", "No sound", "No movement")
    }

    override def toString() : String = {
      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }

  } // END OF CLASS ANIMAL

  object Animal{
    private var idNumber = 0
    private def newIdNumber = { idNumber += 1; idNumber }
  }

} // END OF OBJ CLASSES
