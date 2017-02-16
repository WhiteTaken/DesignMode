import java.util.ArrayList;
import java.util.List;

public class Book implements Cloneable{//原型模式需要实现cloneable接口
	private String name;
	private int number;
	private String company;
	private List<String> author;//指向的是一个引用的空间
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
	
	//浅层克隆，clone以后引用会保持一致，当引用对象发生改变，两个克隆对象就会发生改变
	public Book ShallowClone(){
		try {
			return (Book) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	//深度克隆，需要对有引用的地方进行操作
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
