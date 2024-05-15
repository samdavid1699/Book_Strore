package com.newProject.Book_store.Repository;

import com.newProject.Book_store.entity.Book;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	void deleteById(Integer id);





}
