/*
 * סլ�Ľ�������Ҫ�޽��š��ذ塢ǽ
 */
public class ZhuzhaiBuilder implements HouseBuilder {
	
	House house= new House();
	
	public void makeDoor() {
		house.setDoor("WhiteTaken--סլ--��");
	}

	public void makeFloor() {
		house.setFloor("WhiteTaken--סլ--�ذ�");
	}

	public void makeWall() {
		house.setWall("WhiteTaken--סլ--ǽ");
	}
	
	public House returnHouse(){
		return house;
	}
}
