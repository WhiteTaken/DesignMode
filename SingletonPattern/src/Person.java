
public class Person {
	private String name;
	public static final Person perSon= new Person();//ע��˴���final
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//���캯��˽�л�
	private Person(){
		
	}
	//��ȡ����ķ���
	public static Person getPerson(){
		return perSon;
	}
}
