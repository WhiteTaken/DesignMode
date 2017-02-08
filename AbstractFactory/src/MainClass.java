
public class MainClass {
	public static void main(String[] args) {
		FruitFactory factory=new NorthFruitFactory();//获取北方水果工厂的实例
		Fruit apple=factory.getApple();				//北方苹果
		Fruit banana=factory.getBanana();			//北方香蕉
		apple.Get();
		banana.Get();
		
		FruitFactory factory2=new SouthFruitFactory();//获取南方水果工厂的实例
		Fruit apple2=factory2.getApple();			//南方苹果
		Fruit banana2=factory2.getBanana();			//南方香蕉
		apple2.Get();
		banana2.Get();	
	}
}
