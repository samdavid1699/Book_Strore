package com.newProject.Book_store.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.newProject.Book_store.Repository.BookRepository;
import com.newProject.Book_store.entity.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {
//    private final BookRepository repo;
//    
//    public BookService(BookRepository repo) {
//        this.repo = repo;
//    }
@Autowired
public BookRepository repo;

    public List<Book> getBooks(){
        List<Book> bookList = new ArrayList<>();
        repo.findAll().forEach(book->bookList.add(book));
        return bookList;
    }
    
    //create
public Book createBook(Book book) {
	return repo.save(book);
	
}

//get single book
public Optional<Book> getBookById(Integer bookId) {
   return repo.findById(bookId);
}
 public Book updateBook(Book incomingbook) {
	 return repo.save(incomingbook);
 }
 //delete
 public String deleteById(Integer bookId) {
	    if (bookId == null) {
	        return "Book ID cannot be null";
	    }
	    repo.deleteById(bookId);
	    return "Deleted Successfully";
	}

}
