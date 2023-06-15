package bookstoremanagement.controller;

import bookstoremanagement.entity.BookModel;
import bookstoremanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    public String listarLibros() {
        return "listarLibros";
    }

    @PostMapping("/save")
    public String addBook(BookModel bookModel) {
        service.save(bookModel);
        return "redirect:/listar";
    }

}
