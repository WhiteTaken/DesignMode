import java.lang.invoke.CallSite;

public class FruitFactory {
//	public static Fruit GetApple(){
//		return new Apple();
//	}
//	
//	public static Fruit GetBanana(){
//		return new Banana();
//	}
	
//	public static Fruit GetFruit(String type)
//	{
//		if(type.equals("Apple"))
//		{
//			return new Apple();
//		}else if(type.equals("Banana"))
//		{
//			return new Banana();
//		}
//		return null;		
//	}
	
//	public static Fruit GetFruit(String type) throws InstantiationException, IllegalAccessException
//	{
//		if(type.equalsIgnoreCase("apple"))
//		{
//			return (Fruit)Apple.class.newInstance();
//		}else if(type.equalsIgnoreCase("banana"))
//		{
//			return (Fruit)Banana.class.newInstance();
//		}else{
//			System.out.println("找不到对应的水果");
//			return null;
//		}	
//	}
	
	public static Fruit GetFruit(String type) throws InstantiationException, IllegalAccessException
	{
		try {
			Class fruit=Class.forName(type);
			return (Fruit)fruit.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
