
public class Person2 {
	private String name;
	private static Person2 perSon;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//构造函数私有化
	private Person2(){
		
	}
	//获取对象的方法
	public static Person2 getPerson(){
		if(perSon==null){
			return perSon=new Person2();
		}
		return perSon;
	}
}
