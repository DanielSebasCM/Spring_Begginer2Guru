package learning.spring.spring5WebAPP.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import learning.spring.spring5WebAPP.domain.Author;
import learning.spring.spring5WebAPP.domain.Book;
import learning.spring.spring5WebAPP.domain.Publisher;
import learning.spring.spring5WebAPP.repositories.AuthorRepository;
import learning.spring.spring5WebAPP.repositories.BookRepository;
import learning.spring.spring5WebAPP.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository,
            BookRepository bookRepository,
            PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World! from the BootStrapData class");

        Publisher publisher = new Publisher("SFG Pub", null, "St Petersburg",
                "FL", null);

        publisherRepository.save(publisher);

        Author erick = new Author("Erick", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");

        erick.getBooks().add(ddd);
        ddd.getAuthors().add(erick);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(erick);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Authors: " + authorRepository.count());
        System.out.println(
                "Number of books by publisher: " + publisher.getBooks().size());

    }

}
