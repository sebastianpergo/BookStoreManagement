package bookstoremanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface myBook extends JpaRepository<myBook, Long>{

}
