package learning.spring.spring5WebAPP.repositories;

import learning.spring.spring5WebAPP.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
