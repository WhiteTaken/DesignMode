import java.util.ArrayList;
import java.util.List;

//ԭ��ģʽҲ�п�¡ģʽ
public class MainClass {
	public static void main(String[] args) {
		Book book1=new Book();			//ʵ����һ��book1
		book1.setName("shujujiegou");
		book1.setNumber(100);
		book1.setCompany("TomCompany");
		List<String>author=new ArrayList<>();
		author.add("Tom");
		author.add("WhiteTaken");
		book1.setAuthor(author);
		
		Book book2=book1.ShallowClone();//ʵ����һ��book2,����book1��ǳ���¡����
		book1.setName("���ݽṹ");//ǳ���¡������ָ��ͬһ��������String�����͵�ֱֵ�ӿ�¡
		author.add("Langer");//�޸�book1��ֵ��ǳ���¡book1��book2ָ�����ͬһ�����ã���ӡ��ֵ��ͬ
	
		System.out.println(book1.getName());
		System.out.println(book1.getNumber());
		System.out.println(book1.getCompany());	
		System.out.println(book1.getAuthor());
		
		System.out.println(book2.getName());
		System.out.println(book2.getNumber());
		System.out.println(book2.getCompany());
		System.out.println(book2.getAuthor());
		
		System.out.println("==================");
		
		Book book3=book1.DepthClone();//ʵ����һ��book3,����book1������¡����
		author.add("KZMASTER");//�޸�book1������ֵ��book3û�б仯
		System.out.println(book1.getAuthor());
		System.out.println(book3.getAuthor());
	}
}
