
public class Person2 {
	private String name;
	private static Person2 perSon;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//���캯��˽�л�
	private Person2(){
		
	}
	//��ȡ����ķ���
	public static Person2 getPerson(){
		if(perSon==null){
			return perSon=new Person2();
		}
		return perSon;
	}
}
