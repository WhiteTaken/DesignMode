/*
 * 房屋建造者（工程队） 修建不同的房子 ，建造者不同， 公寓、平房、商业住宅
 */
public interface HouseBuilder {
	public void makeDoor();
	public void makeFloor();
	public void makeWall();
	public House returnHouse();
}
