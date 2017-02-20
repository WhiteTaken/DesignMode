/*
 * 修建公寓的建造者，需要实现修建门、地板、墙的方法
 */
public class GoogyuBuilder implements HouseBuilder {

	House house =new House();
	public void makeDoor() {
		house.setDoor("WhiteTaken--公寓--门");	
	}

	public void makeFloor() {
		house.setFloor("WhiteTaken--公寓--地板");
	}

	public void makeWall() {
		house.setWall("WhiteTaken--公寓--墙");
	}
	
	public House returnHouse(){
		return house;
	}
}
