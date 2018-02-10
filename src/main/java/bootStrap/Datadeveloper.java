package bootStrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.chaipoint.ChaiWalla.modal.Author;
import com.chaipoint.ChaiWalla.modal.Book;

import repositories.AuthorRepositories;
import repositories.BookRepositories;

@Component
public class Datadeveloper implements ApplicationListener<ContextRefreshedEvent> {
    
	
	private AuthorRepositories authorRepositories;
	
	private BookRepositories bookRepositories;

	public Datadeveloper(AuthorRepositories authorRepositories, BookRepositories bookRepositories) {
		this.authorRepositories = authorRepositories;
		this.bookRepositories = bookRepositories;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}

	private void initData() {
		System.out.println("Entered");
		Author visal = new Author("Visal", "Kumar");
		Book writtenByVisal = new Book("Dream small Make it Big", "123", "Konark & Dhrama Production");
		visal.getBooks().add(writtenByVisal);
		writtenByVisal.getAuthors().add(visal);

		authorRepositories.save(visal);
		bookRepositories.save(writtenByVisal);

		Author shalini = new Author("Shalini", "Padhy");
		Book writtenByShalini = new Book("Dont flow with Your title", "1453", "Dhrama Production");
		shalini.getBooks().add(writtenByShalini);
		writtenByShalini.getAuthors().add(shalini);

		authorRepositories.save(shalini);
		bookRepositories.save(writtenByShalini);
		System.out.println("Exit");

	}

}
