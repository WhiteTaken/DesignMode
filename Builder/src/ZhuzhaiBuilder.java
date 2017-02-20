/*
 * 住宅的建造者需要修建门、地板、墙
 */
public class ZhuzhaiBuilder implements HouseBuilder {
	
	House house= new House();
	
	public void makeDoor() {
		house.setDoor("WhiteTaken--住宅--门");
	}

	public void makeFloor() {
		house.setFloor("WhiteTaken--住宅--地板");
	}

	public void makeWall() {
		house.setWall("WhiteTaken--住宅--墙");
	}
	
	public House returnHouse(){
		return house;
	}
}
