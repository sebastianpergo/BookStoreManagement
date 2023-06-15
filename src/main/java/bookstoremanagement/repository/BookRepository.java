package bookstoremanagement.repository;

import bookstoremanagement.entity.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel, Long> {

}
