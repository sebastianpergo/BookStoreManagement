package bookstoremanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_my_book")
public class myBookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMyBook;

    @Column(nullable = false, unique = true)
    private Integer idBook;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 50)
    private String author;

    @Column(nullable = false)
    private Double price;

    public myBookModel(Integer idMyBook, Integer idBook, String title, String author, Double price) {
        super();
        this.idMyBook = idMyBook;
        this.idBook = idBook;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public myBookModel() {
        super();
    }

    public Integer getIdMyBook() {
        return idMyBook;
    }

    public void setIdMyBook(Integer idMyBook) {
        this.idMyBook = idMyBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }
}
