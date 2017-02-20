/*
 * 设计师负责建造房子，建造不同的房子，需要不同的工程队
 */
public class HouseDirector {
	public static void SetBuilder(HouseBuilder houseBuilder)
	{
		houseBuilder.makeDoor();
		houseBuilder.makeFloor();
		houseBuilder.makeWall();
	}
}
