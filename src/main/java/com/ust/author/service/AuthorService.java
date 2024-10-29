package com.ust.author.service;

import com.ust.author.Model.Author;
import com.ust.author.client.Book;
import com.ust.author.client.FullResponse;
import com.ust.author.feign.BookClient;
import com.ust.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookClient bookClient;

    public Author getauthorByname(String authorName) {
        return authorRepository.findByAuthorName(authorName);
    }

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public FullResponse getauthorByid(Long id) {
        Author b=authorRepository.findById1(id).orElse(null);
        List<Book> list=bookClient.getBookById(id);
        FullResponse f=new FullResponse();
        assert b != null;
        f.setAuthorId(b.getAuthorId());
        f.setAuthorName(b.getAuthorName());
        f.setAuthorEmail(b.getAuthorEmail());
        f.setAuthorAddress(b.getAuthorAddress());
        f.setAuthorPhone(b.getAuthorPhone());
        f.setId1(b.getId1());
        f.setBooks(list);
        return f;
    }
}
