package BOOK.yoon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void create(BookDTO dto) {
        Book book = new Book(dto.getTitle(),
                dto.getAuthor(), dto.getIsbn(), dto.getPrice(),
                dto.getPublishedYear());
        this.repository.save(book);
    }
}
