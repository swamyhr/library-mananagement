package library.man.app.library.controllers;

import library.man.app.library.models.Book;
import library.man.app.library.servicesImpl.BookServiceImpl;
import library.man.app.library.utils.ResponseObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/books")
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {

    @Autowired
    public BookServiceImpl bookService;

    @GetMapping("")
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("")
    public ResponseObj saveNewBook(@RequestBody Book book) {
        bookService.createBook(book);
        return new ResponseObj(201, "New Book Saved successfully");
    }
}
