package nl.bocko.games.businessobjects;

/**
 * 
 * @author dylan dees
 *
 * A first iteration game model for 
 * a web application that keeps and
 * presents game statistics.
 * 
 * Game properties;
 * - player1 - player object TODO for now a String
 * - player2 - player object
 * - player1Score - byte (because scores will not exceed 128)
 * - player2Score - byte
 * 
 */
public class Game {
	private int gameId;
	private String player1;
	private String player2;
	private byte player1Score;
	private byte player2Score;

	/**
	 * Default constructor;
	 */
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Game (int gameId, String player1, String player2, byte player1Score, byte player2Score) {
		this.gameId = gameId;
		this.player1 = player1;
		this.player2 = player2;
		this.player1Score = player1Score;
		this.player2Score = player2Score;		
	}

	/**
	 * @return Returns gameId
	 */
	public int getGameId() {
		return gameId;
	}
	
	/**
	 * @param gameId The gameId to set
	 */
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}		
				
	/**
	 * @return Returns player1.
	 */
	public String getPlayer1() {
		return player1;
	}
	
	/**
	 * @param player1 The player1 to set.
	 */
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}
	
	/**
	 * @return Returns player2
	 */
	public String getPlayer2() {
		return player2;
	}

	/**
	 * @param player2 The player2 to set
	 */
	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
	
	/**
	 * @return Returns player1Score
	 */
	public byte getPlayer1Score() {
		return player1Score;
	}
	
	/**
	 * @param player1Score the score of player 1 to set
	 */
	public void setPlayer1Score(byte player1Score) {
		this.player1Score = player1Score;
	}
	
	/**
	 * @return Returns player2Score
	 */
	public byte getPlayer2Score() {
		return player2Score;
	}
	
	/**
	 * @param player2Score the score of player 2 to set
	 */
	public void setPlayer2Score(byte player2Score) {
		this.player2Score = player2Score;
	}
	
}
