
public class MainClass {
	public static void main(String[] args) {
		FruitFactory factory=new NorthFruitFactory();//��ȡ����ˮ��������ʵ��
		Fruit apple=factory.getApple();				//����ƻ��
		Fruit banana=factory.getBanana();			//�����㽶
		apple.Get();
		banana.Get();
		
		FruitFactory factory2=new SouthFruitFactory();//��ȡ�Ϸ�ˮ��������ʵ��
		Fruit apple2=factory2.getApple();			//�Ϸ�ƻ��
		Fruit banana2=factory2.getBanana();			//�Ϸ��㽶
		apple2.Get();
		banana2.Get();	
	}
}
