/*
 * �޽���Ԣ�Ľ����ߣ���Ҫʵ���޽��š��ذ塢ǽ�ķ���
 */
public class GoogyuBuilder implements HouseBuilder {

	House house =new House();
	public void makeDoor() {
		house.setDoor("WhiteTaken--��Ԣ--��");	
	}

	public void makeFloor() {
		house.setFloor("WhiteTaken--��Ԣ--�ذ�");
	}

	public void makeWall() {
		house.setWall("WhiteTaken--��Ԣ--ǽ");
	}
	
	public House returnHouse(){
		return house;
	}
}
