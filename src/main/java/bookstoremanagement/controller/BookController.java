package bookstoremanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
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
}
