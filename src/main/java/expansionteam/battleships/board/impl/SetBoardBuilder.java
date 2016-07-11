package expansionteam.battleships.board.impl;

import expansionteam.battleships.board.Board;
import expansionteam.battleships.board.BoardBuilder;

public class SetBoardBuilder implements BoardBuilder {
	private BoardSize boardSize;

	public SetBoardBuilder(BoardSize boardSize) {
		this.boardSize = boardSize;
	}

	@Override
	public void addShip(Ship ship) {
		// TODO Auto-generated method stub
	}

	@Override
	public Board build() {
		return null;
	}

}
