/**
  * imports theater and media to use other methods.
  */
import org.code.theater.*;
import org.code.media.*;

/**
  * Class represents a scene with the board game data
  */
public class DataScene extends Scene {
  
/**
  * instance variables that hold board game data
  * and the sound and picture
  */
  private BoardGame[] theBoardGame;
  private String soundOne;
  private String picture;

/**
  * DataScene constructor
  */
  public DataScene(String soundOne, String picture) {
    theBoardGame = createTheBoardGame();
    this.soundOne = soundOne;
    this.picture = picture;
  }

/**
  * Creates and array of the BoardGame objects from the txt files
  * reads to files
  */
  public BoardGame[] createTheBoardGame() {
    String[] namesArray = FileReader.toStringArray("Name.txt");
    int[] minPlayersArray = FileReader.toIntArray("MinPlayers.txt");
    int[] maxPlayersArray = FileReader.toIntArray("MaxPlayers.txt");
    int[] avgTimeArray = FileReader.toIntArray("AvgTime.txt");

    BoardGame[] theBoardGameArray = new BoardGame[namesArray.length];
    for (int i = 0; i < theBoardGameArray.length; i++) {
      theBoardGameArray[i] = new BoardGame(namesArray[i], minPlayersArray[i], maxPlayersArray[i], avgTimeArray[i]);
    }
    return theBoardGameArray;
  }

/**
  * Draws the scene with a sound and board game information
  */
  public void drawScene() {
    clear("pink");
    playSound(soundOne);
    pause(5.0);
    clear("white");
    playSound(soundOne);
    drawImage("dice-7846350_1280.png", 90, 50, 200);

/**
  * chooses a random board game to display information about
  */
    int randomIndex = (int) (Math.random() * theBoardGame.length);
    BoardGame b = theBoardGame[randomIndex];
  
    drawText(b.toStringName(), 5, 250);
    pause(1.0);
    drawText(b.toStringMinPlayers(), 5, 300);
    pause(1.0);
    drawText(b.toStringMaxPlayers(), 5, 350);
    pause(1.0);
    drawText(b.toStringAvgTime(), 5, 390);
    playSound(soundOne);
  }

  
}