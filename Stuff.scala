import fang2.core._ 
import fang2.sprites._

class Stuff extends Game {
 //Data (attributes)
  val penguin: ImageSprite = new ImageSprite("penguin.jpg")
  val toaster: ImageSprite = new ImageSprite("toaster.jpg")
 
  //Setup method
override def setup {
 penguin.setScale(0.15)
 penguin.setLocation((0.5,0.5)
 addSprite(penguin)
 
 setBackground(Game.getColor("white"))
}
  //Advance method 
  override def advance
   //override def advance {
     if (leftPressed) {
       penguin.setRotation(penguin.getRotation - 0.01)
    if (rightPressed) {
       penguin.setRotation(penguin.getRotation + 0.05)
}
  // set rotation based on the arrow pressed 
  }
"Stuff.scala" 24L, 483C written


for while def import override "hello" if man new class extends /*method*/ var 