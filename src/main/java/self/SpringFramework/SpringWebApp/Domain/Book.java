package self.SpringFramework.SpringWebApp.Domain;

import lombok.Data;



@Data
public class Book {
	
	private String title;
	private String sbn;
	
	public Book(){}

	public Book(String title, String sbn) {
		super();
		this.title = title;
		this.sbn = sbn;
	}
	
	

}
