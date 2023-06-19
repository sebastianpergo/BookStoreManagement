package bookstoremanagement.controller;

import bookstoremanagement.entity.BookModel;
import bookstoremanagement.entity.myBookModel;
import bookstoremanagement.service.BookService;
import bookstoremanagement.service.myBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private myBookService myBookService;

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
       List<BookModel> list = bookService.getBooks();
       return new ModelAndView("listarLibros", "BookModel", list);
    }

    @PostMapping("/save")
    public String addBook(BookModel bookModel) {
        bookService.save(bookModel);
        return "redirect:/listar";
    }

    @RequestMapping("/delete/{id}")
    public String deleteBook(@PathVariable ("id") Long idBook) {
        bookService.delete(idBook);
        return "redirect:/listar";
    }

    @RequestMapping("/edit/{id}")
    public String editBook(@PathVariable ("id") Long idBook, BookModel bookModel) {
        bookService.update(idBook);
        return "editarLibro";
    }

    //  -------------------  //

    // Get all the books
    @RequestMapping("/myBooks/{id}")
    public String getMyList(@PathVariable ("id") Long idMyBook) {
        BookModel book = bookService.getBookById(idMyBook);
        myBookModel mb = new myBookModel(book.getIdBook(), book.getIdBook(), book.getTitle(), book.getAuthor(),book.getPrice());
        String message;
        myBookService.save(mb);
        return "myBooks";
    }

    @GetMapping("/myBooks")
    public ModelAndView listMyBooks() {
        List<myBookModel> list = myBookService.getMyBooks();
        return new ModelAndView("myBooks", "myBookModel", list);
    }

}
