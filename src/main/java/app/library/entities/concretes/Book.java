package app.library.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(updatable = false)
    private Long id;
    private String name;
    private String author;
    private Long userId;
    private String publisher;
    private int publishDate;
    private String publishPlace;
    private int pageCount;
    private boolean available;
    private Long categoryId;
    private String isbn10;
    private String isbn13;
    private String assetNumber;
    private String imageUrl;
}
