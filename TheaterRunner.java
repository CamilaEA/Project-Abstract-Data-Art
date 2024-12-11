import org.code.theater.*;
/**
  * TheaterRunner, new scene is created that holds the 
  * sound and picture used
  */
  
public class TheaterRunner {
  public static void main(String[] args) {
    
/**
  * Sound of shuffling cards
  */
String soundOne = "SoundOne.wav";
    
/**
  * picture of dice and game pieces
  */
String picture = "dice-7846350_1280.png";

/**
  * Creates a new DataScene object with a sound and picture
  */
DataScene scene = new DataScene(soundOne, picture);

/**
  * draws the scene
  */
    scene.drawScene();

/**
  * plays the scene
  */
    Theater.playScenes(scene);
    
    
  }
}
