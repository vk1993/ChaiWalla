package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chaipoint.ChaiWalla.modal.Book;
@Repository
public interface BookRepositories extends CrudRepository<Book, Long> {

}
