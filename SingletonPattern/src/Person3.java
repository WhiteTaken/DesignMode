
public class Person3 {
	private String name;
	private static Person3 perSon;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//���캯��˽�л�
	private Person3(){
		
	}
	//��ȡ����ķ���,ʹ��ͬ������
	public static synchronized Person3 getPerson(){
		if(perSon==null){
			return perSon=new Person3();
		}
		return perSon;
	}
}
