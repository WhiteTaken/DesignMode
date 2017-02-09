
public class Person3 {
	private String name;
	private static Person3 perSon;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//构造函数私有化
	private Person3(){
		
	}
	//获取对象的方法,使用同步方法
	public static synchronized Person3 getPerson(){
		if(perSon==null){
			return perSon=new Person3();
		}
		return perSon;
	}
}
