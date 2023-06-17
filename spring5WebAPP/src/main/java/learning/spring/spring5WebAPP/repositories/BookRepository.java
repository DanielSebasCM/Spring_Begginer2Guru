package learning.spring.spring5WebAPP.repositories;

import org.springframework.data.repository.CrudRepository;

import learning.spring.spring5WebAPP.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
