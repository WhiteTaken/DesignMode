import java.util.ArrayList;
import java.util.List;

public class Book implements Cloneable{//ԭ��ģʽ��Ҫʵ��cloneable�ӿ�
	private String name;
	private int number;
	private String company;
	private List<String> author;//ָ�����һ�����õĿռ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public List<String> getAuthor() {
		return author;
	}
	public void setAuthor(List<String> author) {
		this.author = author;
	}
	
	//ǳ���¡��clone�Ժ����ûᱣ��һ�£������ö������ı䣬������¡����ͻᷢ���ı�
	public Book ShallowClone(){
		try {
			return (Book) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	//��ȿ�¡����Ҫ�������õĵط����в���
	public Book DepthClone(){
		try {
			Book book=(Book)super.clone();
			List<String> authors=new ArrayList<String>();
			for(String author:this.getAuthor()){
				authors.add(author);
			}
			book.setAuthor(authors);
			return book;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
}
