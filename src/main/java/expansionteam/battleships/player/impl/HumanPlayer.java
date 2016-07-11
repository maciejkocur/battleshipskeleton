package expansionteam.battleships.player.impl;

import expansionteam.battleships.board.impl.Position;
import expansionteam.battleships.player.Player;
import expansionteam.battleships.ui.Input;

public class HumanPlayer implements Player {

	private final Input input;

	public HumanPlayer(Input input) {
		this.input = input;
	}

	@Override
	public Position choosePosition() {
		return new Position(input.read());
	}

}
