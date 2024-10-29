package com.ust.author.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FullResponse {
    private int authorId;
    private String authorName;
    private String authorEmail;
    private String authorAddress;
    private String authorPhone;
    private Long id1;
    private List<Book> books;

}
