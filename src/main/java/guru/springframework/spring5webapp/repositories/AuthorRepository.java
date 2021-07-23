package guru.springframework.spring5webapp.repositories;

<<<<<<< HEAD
import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

=======
import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 12/23/19.
 */
>>>>>>> add-publisher
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
