package dev.milzipmoza.springbootnuxt.librarybook.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class LibraryBookController {

    @GetMapping
    public String createBook() {
        return "books/index";
    }

    @GetMapping("/{id}")
    public String descBook(@PathVariable Long id) {
        return "books/index";
    }

    @GetMapping("/lists")
    public String listOfBooks() {
        return "books/lists/index";
    }
}
