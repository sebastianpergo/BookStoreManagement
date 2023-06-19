package bookstoremanagement.repository;

import bookstoremanagement.entity.myBookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface myBookRepository extends JpaRepository<myBookModel, Long>{

}
