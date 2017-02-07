
public class MainClass {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//		Fruit apple=FruitFactory.GetApple();
//		Fruit banana=FruitFactory.GetBanana();
//		apple.Get();
//		banana.Get();
		
		Fruit apple=FruitFactory.GetFruit("Apple");
		Fruit banana=FruitFactory.GetFruit("Banana");
		apple.Get();
		banana.Get();
	}
}
