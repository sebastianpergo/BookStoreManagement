package bookstoremanagement.service;

import bookstoremanagement.entity.BookModel;
import bookstoremanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {
    @Autowired
    private BookRepository repo;

    // Save method
    public void save(BookModel book) {
        repo.save(book);
    }

}
