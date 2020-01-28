package dev.milzipmoza.springbootnuxt.librarybook.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 뭐가 문제인거지... ㅎ
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Table(name = "LIBRARY_BOOK")
@Entity
@EqualsAndHashCode(of = "id")
public class LibraryBook {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "image")
    private String image;

    @Column(name = "title",
            nullable = false)
    private String title;

    @Column(name = "author",
            nullable = false)
    private String author;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "isbn",
            nullable = false)
    private String isbn;

    @Column(name = "description",
            length = 500,
            columnDefinition = "varchar(500) default '내용 없음'")
    private String description;

    @CreationTimestamp
    @Column(name = "createdAt",
            updatable = false,
            nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updatedAt",
            nullable = false)
    private LocalDateTime updatedAt;

    @Builder
    public LibraryBook(final String image,
                       final String title,
                       final String author,
                       final String publisher,
                       final String isbn,
                       final String description) {
        this.image = image;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.description = description;
    }
}
