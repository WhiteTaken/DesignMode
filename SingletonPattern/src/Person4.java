
public class Person4 {
	private String name;
	private static Person4 perSon;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//构造函数私有化
	private Person4(){
		
	}
	//获取对象的方法,双重检查
	public static  Person4 getPerson(){
		if(perSon==null){
			synchronized (Person4.class) {
				if(perSon==null){
					return perSon=new Person4();
				}				
			}
		}
		return perSon;
	}
}
