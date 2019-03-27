object Classes{

  def main(args: Array[String]): Unit = {

    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName, rover.getSound)

  } // END OF MAIN

//  CREATING MY FIRST CLASS
// defining the default constructor
  class Animal(var name: String, var sound : String){

    this.setName(name)

    val id = Animal.newIdNumber

    def getName() : String = name
    def getSound() : String = sound

    def setName(name : String){
      if(!(name.matches(".*\\d+.*")))
        this.name = name
      else
        this.name = "No name"
    }

    def setSound(sound : String){
      this.sound = sound
    }

    def this(name : String){
      this("No name", "No sound")
      this.setName(name)
    }

    def this(){
      this("No name", "No sound")
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
