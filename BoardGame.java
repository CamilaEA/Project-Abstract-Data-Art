/**
  * BoardGame class
  */
public class BoardGame {

/**
  * instance variables to represents names, min and max 
  * players as well as the average play time
  */
  private String names;
  private int minPlayers;
  private int maxPlayers;
  private int avgTime;

/**
  * BoardGame constructor
  */
  public BoardGame(String names, int minPlayers, int maxPlayers, int avgTime) {
    this.names = names;
    this.minPlayers = minPlayers;
    this.maxPlayers = maxPlayers;
    this.avgTime = avgTime;
  }

/**
  * Accessor Methods for each of the txt files
  */
  public String getName() {
    return names;
  }

  public int getMinPlayers() {
    return minPlayers;
  }

  public int getMaxPlayers() {
    return maxPlayers;
  }

  public int getAvgTime() {
    return avgTime;
  }

/**
  * toString Methods to display information
  */
  public String toStringName() {
    return "BoardGame: " + names;
  }

  public String toStringMinPlayers() {
    return "Minimum Players: " + minPlayers;
  }

  public String toStringMaxPlayers() {
    return "Maximum Players: " + maxPlayers;
  }

  public String toStringAvgTime() {
    return "Average Time: " + avgTime + " minutes";
  }
}
