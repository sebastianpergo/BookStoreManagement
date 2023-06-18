package bookstoremanagement.service;

import bookstoremanagement.entity.BookModel;
import bookstoremanagement.repository.BookRepository;
import bookstoremanagement.repository.myBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repo;

    // Get book by id method
    public BookModel  getBookById(Long id) {
        return repo.findById(id).get();
    }
    // Get all method
    public List<BookModel> getBooks() {
        return repo.findAll();
    }

    // Save method
    public void save(BookModel book) {
        repo.save(book);
    }

    // Update method
    public void update(Long id) {
        repo.save(repo.findById(id).get());
    }

    // Delete method
    public void delete(Long id) {
        repo.deleteById(id);
    }

}
