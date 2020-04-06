package self.SpringFramework.SpringWebApp.Domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;


@Data
@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String Fname;
	private String Lname;
	
	@ManyToMany(mappedBy = "authors")
	private Set<Book> books;

	public Author(String fname, String lname, Set<Book> books) {
		super();
		Fname = fname;
		Lname = lname;
		this.books = books;
	}
	
	public Author() {}

}
