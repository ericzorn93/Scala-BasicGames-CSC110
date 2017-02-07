// Import FANG libraries
import fang2.core._
import fang2.sprites._

// Game to move a player (circle) around the screen collecting "aliens"
class Aliens extends Game {

  // Set the number of aliens
  val numAliens: Int = 5

  // Create the alien array
  val aliens: Array[PolygonSprite] = new Array[PolygonSprite](numAliens)
  // Create the player sprite
  val playerSprite = new OvalSprite(1,1)

  // Method to set the initial game state
  override def setup = {

    // Get the gap between aliens
    val gap: Double = 1.0 / numAliens

    // Loop through the alien array creating and placing the aliens
    var i: Int = 0
    while (i < numAliens) {
      // Make an alien
      aliens(i) = new PolygonSprite(5)
      // Set the location, scale, and color
      aliens(i).setLocation(gap/2 + (gap * i),0.5)
      aliens(i).setScale(0.05)
      aliens(i).setColor(Game.getColor("red"))
      // Add the alien to the game
      addSprite(aliens(i))
      i = i + 1
    }

    // Create the player sprite, set the scale, and add to the game
    playerSprite.setLocation(0.1,0.1)
    playerSprite.setScale(0.05)
    addSprite(playerSprite)
  }

  // Method to change the game state
  override def advance = {
    // Process player movement
    // Left
    if (leftPressed)
      playerSprite.setX(playerSprite.getX - 0.01)
    // Right
    else if (rightPressed)
      playerSprite.setX(playerSprite.getX + 0.01)
    // Up
    else if (upPressed)
      playerSprite.setY(playerSprite.getY - 0.01)
    // Downeft
    else if (downPressed)
      playerSprite.setY(playerSprite.getY + 0.01)

    // See if an alien is intersected
    for (alien <- aliens)
      if (alien.isVisible && playerSprite.intersects(alien))
        alien.hide
  }
}
