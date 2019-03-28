object Classes{

  def main(args: Array[String]): Unit = {

    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    // printf("%s says %s\n", rover.getName, rover.getSound)
    // printf("%s %s\n", rover.getName, rover.getMovement)
    println(rover.toString)

    val whiskers = new Animal("Whiskers", "Meow")
    // val whiskers = new Animal("Whiskers", "Meow", "Run")
    // println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}")
    println(whiskers.toString)

    val spike = new Dog("Spike", "Woof", "Grrr")
    spike.setName("Spike")
    println(spike.toString)

    val fang = new Wolf("Fang")
    fang.moveSpeed = 36.0
    println(fang.move)

  } // END OF MAIN

  //  CREATING MY FIRST ABSTRACT CLASS
  abstract class Mammal(val name: String){
    var moveSpeed : Double

    def move : String
  }

  class Wolf(name: String) extends Mammal(name){
    var moveSpeed = 35.0

    def move = "The wolf %s moves at %.2f mhp".format(this.name, this.moveSpeed)
    }




//  CREATING MY FIRST CLASS
// defining the default constructor
  // class Animal(var name: String, var sound : String, var movement : String){
  class Animal(var name: String, var sound : String){
    this.setName(name)

    val id = Animal.newIdNumber

    def getName() : String = name
    def getSound() : String = sound
    // def getMovement() : String = movement

    def setName(name : String){
      if(!(name.matches(".*\\d+.*")))
        this.name = name
      else
        this.name = "No name"
    }

    def setSound(sound : String){
      this.sound = sound
    }

    // def setMovement(movement : String){
    //   this.movement = movement
    // }

    def this(name : String){
      this("No name", "No sound")
      // this("No name", "No sound", "No movement")
      this.setName(name)
    }

    def this(){
      this("No name", "No sound")
      // this("No name", "No sound", "No movement")
    }

    override def toString() : String = {
      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }

  } // END OF CLASS ANIMAL

  object Animal{
    private var idNumber = 0
    private def newIdNumber = { idNumber += 1; idNumber }
  }

// INHERITANCE
  class Dog(name : String, sound : String, growl : String) extends Animal(name, sound){

    def this(name : String, sound : String){
      this("No name", sound, "No growl")
      this.setName(name)
    }

    def this(name : String){
      this("No name", "No sound", "No growl")
      this.setName(name)
    }

    def this(){
      this("No name", "No sound", "No growl")
      this.setName(name)
    }

    override def toString() : String = {
      return "%s with the id %d says %s or %s".format(this.name, this.id, this.sound, this.growl)
    }
  } //END OF INHERITANCE CLASS



} // END OF OBJ CLASSES
