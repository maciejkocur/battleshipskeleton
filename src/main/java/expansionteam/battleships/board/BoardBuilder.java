package expansionteam.battleships.board;

import expansionteam.battleships.board.impl.Ship;

public interface BoardBuilder {
	public void addShip(Ship ship);

	public Board build();
}
