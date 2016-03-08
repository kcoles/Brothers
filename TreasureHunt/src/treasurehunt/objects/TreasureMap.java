package treasurehunt.objects;

public class TreasureMap {

	// the real trick will be realizing that a 
	// grid/map is not actually necessary to play this game
	
	private int mapSize;
	
	public TreasureMap(int size)
	{
		this.mapSize = size; 
	}

	public int getMapSize() {
		return mapSize;
	}
	
}
