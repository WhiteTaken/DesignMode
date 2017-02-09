
public class MainClass {
	public static void main(String[] args) {
		Person person1=Person.getPerson();
		Person person2=Person.getPerson();
		person1.setName("Tom");
		person2.setName("WhiteTaken");
		System.out.println(person1.getName());
		System.out.println(person2.getName());
	}
}
