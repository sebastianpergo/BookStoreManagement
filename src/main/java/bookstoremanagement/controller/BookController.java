package bookstoremanagement.controller;

import bookstoremanagement.entity.BookModel;
import bookstoremanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/registro")
    public String registroLibro() {
        return "registroLibro";
    }

    @GetMapping("/listar")
    public ModelAndView listBooks() {
       List<BookModel> list = service.getBooks();
       return new ModelAndView("listarLibros", "BookModel", list);
    }

    @PostMapping("/save")
    public String addBook(BookModel bookModel) {
        service.save(bookModel);
        return "redirect:/listar";
    }

    /*
    @GetMapping("/listBooks")
    public List<BookModel> findAll() {
        return service.getBooks();
    }
*/
    @RequestMapping("/delete/{id}")
    public String deleteBook(@PathVariable ("id") Long idBook) {
        service.delete(idBook);
        return "redirect:/listar";
    }

    @RequestMapping("/edit/{id}")
    public String editBook(@PathVariable ("id") Long idBook, BookModel bookModel) {
        service.update(idBook);
        return "editarLibro";
    }

}
