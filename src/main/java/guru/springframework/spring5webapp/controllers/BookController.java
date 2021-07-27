package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
When spring gets a request to the url '/books', it's gonna execute the getBooks() method and it's going to
provide that method a model object, and our code is saying 'for that model we are going to add the attribute called
"books" and we're going to execute bookRepository and get a list of books. This Model is going to get returned back to
View layer and have attribute called "books" and we'll be able to use that value.
 */

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
}
