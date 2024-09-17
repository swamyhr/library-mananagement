package library.man.app.library.servicesImpl;

import library.man.app.library.models.Book;
import library.man.app.library.repositories.BookRepository;
import library.man.app.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    public BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(int bookId) {
        return bookRepository.findById(bookId);
    }

    @Override
    public Book createBook(Book newBook) {
        return bookRepository.save(newBook);
    }
}
