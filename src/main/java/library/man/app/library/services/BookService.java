package library.man.app.library.services;

import library.man.app.library.models.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {

    public List<Book> getAllBooks();

    public Optional<Book> getBookById(int bookId);

    public Book createBook(Book newBook);

}
