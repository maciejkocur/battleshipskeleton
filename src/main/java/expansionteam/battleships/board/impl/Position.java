package expansionteam.battleships.board.impl;

public class Position {
	private final int value;

	public static Position of(int value) {
		return new Position(value);
	}

	public Position(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
