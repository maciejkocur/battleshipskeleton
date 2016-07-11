package expansionteam.battleships.board.impl;

import java.util.Iterator;
import java.util.Set;

import expansionteam.battleships.board.Board;
import expansionteam.battleships.board.Field;

public class SetBoard implements Board {
	Set<Ship> ships;
	Set<Position> shotPositions;

	@Override
	public boolean shoot(Position position) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean wasShot(Position position) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean wasHit(Position position) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean allShipAreSunken() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Field> fields() {
		// TODO Auto-generated method stub
		return null;
	}
}
