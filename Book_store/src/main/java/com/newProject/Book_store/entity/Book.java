package com.newProject.Book_store.entity;


import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String Name;


    @Column(name = "description")
    private String Desc;
    private Integer YearOfPublication;
    private String BookType;
    public Book(){

    }
    public Book(Integer id, String name, String desc, Integer yearOfPublication, String bookType) {
        this.id=id;
       this.Name = name;
        this.Desc = desc;
       this.YearOfPublication = yearOfPublication;
        this.BookType = bookType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public Integer getYearOfPublication() {
        return YearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        YearOfPublication = yearOfPublication;
    }

    public String getBookType() {
        return BookType;
    }

    public void setBookType(String bookType) {
        BookType = bookType;
    }





}
