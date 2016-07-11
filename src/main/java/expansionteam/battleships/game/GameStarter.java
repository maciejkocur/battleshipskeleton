package expansionteam.battleships.game;

import expansionteam.battleships.board.Board;
import expansionteam.battleships.board.BoardBuilder;
import expansionteam.battleships.board.impl.BoardSize;
import expansionteam.battleships.board.impl.SetBoard;
import expansionteam.battleships.board.impl.SetBoardBuilder;
import expansionteam.battleships.player.Player;
import expansionteam.battleships.player.impl.HumanPlayer;
import expansionteam.battleships.ui.Input;
import expansionteam.battleships.ui.impl.ConsoleInput;

public class GameStarter {
	public Game prepareGame() {
		BoardSize boardSize = new BoardSize(10);

		Input input = new ConsoleInput();

		Player player1 = new HumanPlayer(input);
		Player player2 = new HumanPlayer(input);

		BoardBuilder boardBuilder = new SetBoardBuilder(boardSize);

		Board player1Board = boardBuilder.build();
		Board player2Board = boardBuilder.build();

		return new Game(player1, player2, player1Board, player2Board);
	}
}
