import java.util.ArrayList;
import java.util.List;

//原型模式也叫克隆模式
public class MainClass {
	public static void main(String[] args) {
		Book book1=new Book();			//实例化一个book1
		book1.setName("shujujiegou");
		book1.setNumber(100);
		book1.setCompany("TomCompany");
		List<String>author=new ArrayList<>();
		author.add("Tom");
		author.add("WhiteTaken");
		book1.setAuthor(author);
		
		Book book2=book1.ShallowClone();//实例化一个book2,调用book1的浅层克隆方法
		book1.setName("数据结构");//浅层克隆，引用指向同一个，但是String等类型的值直接克隆
		author.add("Langer");//修改book1的值，浅层克隆book1和book2指向的是同一个引用，打印的值相同
	
		System.out.println(book1.getName());
		System.out.println(book1.getNumber());
		System.out.println(book1.getCompany());	
		System.out.println(book1.getAuthor());
		
		System.out.println(book2.getName());
		System.out.println(book2.getNumber());
		System.out.println(book2.getCompany());
		System.out.println(book2.getAuthor());
		
		System.out.println("==================");
		
		Book book3=book1.DepthClone();//实例化一个book3,调用book1的深层克隆方法
		author.add("KZMASTER");//修改book1的引用值，book3没有变化
		System.out.println(book1.getAuthor());
		System.out.println(book3.getAuthor());
	}
}
