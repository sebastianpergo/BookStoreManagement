package bookstoremanagement.service;

import bookstoremanagement.entity.myBookModel;
import bookstoremanagement.repository.myBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class myBookService {
    @Autowired
    private myBookRepository myBookRep;

    // Listar
    public List<myBookModel> getMyBooks() {
        return myBookRep.findAll();
    }

    // Get by id
    public myBookModel getBookById(Long id){
        return myBookRep.findById(id).get();
    }

    // Save to favs
    public void save(myBookModel myBookMod) {
        myBookRep.save(myBookMod);
    }

    public void update(Long id) {
        myBookRep.save(myBookRep.findById(id).get());
    }

}
