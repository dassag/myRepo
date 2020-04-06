package self.SpringFramework.SpringWebApp.Domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;



@Data
@EqualsAndHashCode
@ToString
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String title;
	private String sbn;
	
	@ManyToMany
	@JoinTable(name="author_book", joinColumns=@JoinColumn(name="books_id"),
	inverseJoinColumns=@JoinColumn(name="author_id"))
	private Set<Author> authors;
	
	public Book(){}

	public Book(String title, String sbn, Set<Author> authors) {
		super();
		this.title = title;
		this.sbn = sbn;
		this.authors=authors;
	}
	
	

}
