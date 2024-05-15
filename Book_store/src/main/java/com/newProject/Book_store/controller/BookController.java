package com.newProject.Book_store.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newProject.Book_store.entity.Book;
import com.newProject.Book_store.service.BookService;

@RestController
public class BookController {
    @Autowired
    private BookService service;

   @RequestMapping("/books")
    public List<Book> getBooks(){

        return service.getBooks();
    }
   @RequestMapping(value="/books", method= RequestMethod.POST)
   public Book createBook(@RequestBody Book book) {
	  return service.createBook(book);
   }
   
   @RequestMapping(value="/books/{id}")
   public Optional<Book> getBookId(@PathVariable("id") Integer bookId) {
	 return  service.getBookById(bookId);
	   
   }
@RequestMapping(value="/books" ,method= RequestMethod.PUT)
   public Book updateBook(@RequestBody Book incomingbook) {
	  return service.updateBook(incomingbook);
   }
@RequestMapping(value="/books/{bookId}" ,method=RequestMethod.DELETE)
public String deleteBookById(@PathVariable Integer bookId) {
	return service.deleteById(bookId);
}
}

