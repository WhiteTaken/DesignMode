
public class Person {
	private String name;
	public static final Person perSon= new Person();//注意此处的final
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//构造函数私有化
	private Person(){
		
	}
	//获取对象的方法
	public static Person getPerson(){
		return perSon;
	}
}
