package expansionteam.battleships.board;

import java.util.Iterator;

import expansionteam.battleships.board.impl.Position;

public interface Board {
	boolean shoot(Position position);

	boolean wasShot(Position position);

	boolean wasHit(Position position);

	boolean allShipAreSunken();

	Iterator<Field> fields();

}
