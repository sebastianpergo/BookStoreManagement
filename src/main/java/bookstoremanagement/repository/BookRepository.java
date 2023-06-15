package bookstoremanagement.repository;

import bookstoremanagement.entity.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface BookRepository extends JpaRepository<BookModel, Long> {

}
