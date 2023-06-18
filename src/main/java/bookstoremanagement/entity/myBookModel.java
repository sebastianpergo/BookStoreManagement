package bookstoremanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_my_book")
public class myBookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMyBook;
    @Column(nullable = false)
    private Integer idBook;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 50)
    private String author;

    @Column(nullable = false)
    private Double price;
}
