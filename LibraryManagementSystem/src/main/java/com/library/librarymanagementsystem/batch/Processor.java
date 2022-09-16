package com.library.librarymanagementsystem.batch;

import com.library.librarymanagementsystem.entity.Author;
import com.library.librarymanagementsystem.entity.Book;
import com.library.librarymanagementsystem.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.util.Date;


public class Processor implements ItemProcessor<Book,Book>{
    private static final Logger log = LoggerFactory.getLogger(Processor.class);
    private User user;
    private Author author;
    @SuppressWarnings("static-access")
    @Override
    public Book process(Book books) throws Exception {
        log.info("Book Process Starts..");
        books.setCreatedBy(User.builder().userid(1L).build());
        books.setCreatedOn(new Date());
        books.setAuthor(Author.builder().author_id(1).build());
        log.info("--------------------"+books);
        log.info("Book Process stop");
        return books;

    }
}
