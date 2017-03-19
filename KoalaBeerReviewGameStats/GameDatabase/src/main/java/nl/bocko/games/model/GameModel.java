package nl.bocko.games.model;
import java.util.ArrayList;
import java.util.List;
import nl.bocko.games.businessobjects.Game;

public class GameModel {
	
    /**
     * List of all the game id's in the model
     */
	private static String[] playerNames = { "speler a", "speler b", "speler c", "speler d" };
	
	/**
	 * The list of all the games in the model
	 * int gameId, String player1, String player2, byte player1Score, byte player2Score
	 */
	private static Game[] games = {
		new Game(1, "speler a", "speler b", (byte) 10, (byte) 3),
		new Game(2, "speler a", "speler b", (byte) 10, (byte) 1),
		new Game(3, "speler a", "speler b", (byte) 10, (byte) 9),
		new Game(4, "speler a", "speler b", (byte) 10, (byte) 0),
		new Game(5, "speler b", "speler a", (byte) 2, (byte) 10),
		new Game(6, "speler a", "speler c", (byte) 10, (byte) 8),
		new Game(7, "speler a", "speler c", (byte) 10, (byte) 7),
		new Game(8, "speler a", "speler c", (byte) 8, (byte) 10),
		new Game(9, "speler c", "speler a", (byte) 10, (byte) 3),
		new Game(10, "speler b", "speler c", (byte) 0, (byte) 10),
		new Game(11, "speler b", "speler c", (byte) 2, (byte) 10),
		new Game(12, "speler b", "speler c", (byte) 1, (byte) 10),
		new Game(13, "speler a", "speler d", (byte) 1, (byte) 10),
		new Game(14, "speler a", "speler d", (byte) 1, (byte) 10),
		new Game(15, "speler d", "speler a", (byte) 10, (byte) 3)
	};

	   /**
	    * Returns the games for a given player
	    * @param player name
	    * @return a list of Game objects
	    */
	   public List<Game> findGamesByPlayer(String player){
	      List<Game> gamesFound = new ArrayList<Game>();
	      
	      for(Game game : games) {
	         if (game.getPlayer1().equalsIgnoreCase(player) || game.getPlayer2().equalsIgnoreCase(player)) {
	            gamesFound.add(game);
	         }
	      }      
	      return gamesFound;
	   }   
	   
	   /**
	    * Returns the list of players in the database which have played games 
	    * @return a list of player names
	    */
	   public String[] findAvailablePlayers() {
	      return playerNames;
	   }

}
