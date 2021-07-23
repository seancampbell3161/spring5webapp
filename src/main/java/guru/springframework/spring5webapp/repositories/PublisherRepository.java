package guru.springframework.spring5webapp.repositories;

<<<<<<< HEAD
import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

=======
import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 12/23/19.
 */
>>>>>>> add-publisher
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
