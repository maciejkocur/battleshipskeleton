package expansionteam.battleships.board;

import expansionteam.battleships.board.impl.Position;

public class Field {
	private final Position position;
	private final boolean occupied;
	private final boolean shot;

	public Field(Position position, boolean occupied, boolean shot) {
		this.position = position;
		this.occupied = occupied;
		this.shot = shot;
	}

	public Position getPosition() {
		return position;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public boolean isShot() {
		return shot;
	}
}
