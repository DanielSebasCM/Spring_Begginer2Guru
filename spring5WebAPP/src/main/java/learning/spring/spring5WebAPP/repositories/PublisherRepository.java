package learning.spring.spring5WebAPP.repositories;

import org.springframework.data.repository.CrudRepository;

import learning.spring.spring5WebAPP.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
