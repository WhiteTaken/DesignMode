public class MainClass {
	public static void main(String[] args) {
		HouseBuilder builder=new GoogyuBuilder();//公寓建造者
		//HouseBuilder builder=new ZhuzhaiBuilder();//住宅建造者
		HouseDirector.SetBuilder(builder);//设计师让建造者建造不同的房屋
		House house=builder.returnHouse();//验收房屋
		System.out.println(house.getDoor());
		System.out.println(house.getFloor());
		System.out.println(house.getWall());
	}
}
