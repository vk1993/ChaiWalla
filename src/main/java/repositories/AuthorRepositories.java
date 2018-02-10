package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chaipoint.ChaiWalla.modal.Author;
@Repository
public interface AuthorRepositories extends CrudRepository<Author, Long> {

}
