public class MainClass {
	public static void main(String[] args) {
		HouseBuilder builder=new GoogyuBuilder();//��Ԣ������
		//HouseBuilder builder=new ZhuzhaiBuilder();//סլ������
		HouseDirector.SetBuilder(builder);//���ʦ�ý����߽��첻ͬ�ķ���
		House house=builder.returnHouse();//���շ���
		System.out.println(house.getDoor());
		System.out.println(house.getFloor());
		System.out.println(house.getWall());
	}
}
