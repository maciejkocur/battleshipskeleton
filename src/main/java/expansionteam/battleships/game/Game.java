package expansionteam.battleships.game;

import expansionteam.battleships.board.Board;
import expansionteam.battleships.board.impl.Position;
import expansionteam.battleships.player.Player;

public class Game {

	private Player player1;
	private Player player2;
	private Board player1Board;
	private Board player2Board;

	public Game(Player player1, Player player2, Board player1Board, Board player2Board) {
		this.player1 = player1;
		this.player2 = player2;
		this.player1Board = player1Board;
		this.player2Board = player2Board;
	}

	public void start() {
		Position position = player1.choosePosition();
		player2Board.shoot(position);

	}
}
