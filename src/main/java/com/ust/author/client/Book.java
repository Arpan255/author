package com.ust.author.client;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="book")
public class Book {
    private int bookId;
    private String bookTitle;
    private String bookPrice;
    private LocalDate bookPublished;
    private String bookImageUrl;
    private String bookAuthurId;
    private Long id1;
}
