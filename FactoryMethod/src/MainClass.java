
public class MainClass {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		FruitFactory appleFactory=new AppleFactory();
		FruitFactory bananaFactory=new BananaFactory();
		Fruit apple=appleFactory.getFruit();
		Fruit banana=bananaFactory.getFruit();
		apple.Get();
		banana.Get();
	}
}
