package bookstoremanagement.service;

import bookstoremanagement.entity.BookModel;
import bookstoremanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repo;

    // Save method
    public void save(BookModel book) {
        repo.save(book);
    }

    public List<BookModel> getBooks() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }



}
