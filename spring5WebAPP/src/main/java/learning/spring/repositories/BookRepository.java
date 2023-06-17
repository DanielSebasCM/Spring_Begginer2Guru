package learning.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import learning.spring.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
