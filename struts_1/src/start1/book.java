package start1;

public class book {
	private String author;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public book() {

	}
	public book(String name,String author){
		this.name=name;
		this.author=author;
		
	}
	
}
