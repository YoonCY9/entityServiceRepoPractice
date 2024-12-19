package BOOK.yoon;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class BookDTO {

    @Size(min = 2, max = 50, message = "2 ~ 50 자")
    private String title;
    @Size(min = 2, max = 30, message = "2 ~ 30 자")
    private String author;
    @Size(min = 13, max = 13, message = "13자")
    private String isbn;
    @PositiveOrZero
    private Integer price;
    @Min(1900) @Max(2024)
    private Integer publishedYear;

    public BookDTO() {
    }

    public BookDTO(String title, String author, String isbn, Integer price, Integer publishedYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }
}
