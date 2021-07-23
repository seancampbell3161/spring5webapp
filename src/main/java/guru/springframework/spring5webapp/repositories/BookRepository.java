package guru.springframework.spring5webapp.repositories;

<<<<<<< HEAD
import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

=======
import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 12/23/19.
 */
>>>>>>> add-publisher
public interface BookRepository extends CrudRepository<Book, Long> {
}
