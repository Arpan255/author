package com.ust.author.feign;
import com.ust.author.client.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="book-service", url = "http://localhost:9092/api")
public interface BookClient {

    @GetMapping("/showBooks/{id1}")
    List<Book> getBookById(@PathVariable("id1") Long id1);
}
