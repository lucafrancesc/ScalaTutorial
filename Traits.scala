object Traits{

  def main(args: Array[String]): Unit = {

    val superman = new Superhero("Clark Kent")
    println(superman.fly)
    println(superman.hitByBullet)
    println(superman.ricochet(100))

  } //END OF MAIN

  trait Flyable {
    def fly : String
  }

  trait BulletProof{
    def hitByBullet : String

    def ricochet(startSpeed : Double) : String = {
      "The bullet ricochets at %.1f ft/sec".format(startSpeed * .75)
    }
  }

  class Superhero(val name: String) extends Flyable with BulletProof{
    def fly = "%s flys through the air".format(this.name)
    def hitByBullet = "The bullet bounces off %s".format(this.name)
  }
} // END OF OBJ CLASSES
