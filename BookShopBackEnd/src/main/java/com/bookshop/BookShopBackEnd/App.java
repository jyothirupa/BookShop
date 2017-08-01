package com.bookshop.BookShopBackEnd;

/*import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bookshop.model.*;
import com.bookshop.dao.*;

public class App 
{
    public static void main( String[] args )
    {
    	
    	System.out.println("Before");
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
       
        context.scan("com.bookshop");
        context.refresh();
        
        //testing insertion of book
        
        Book book=new Book();
        book.setId(2);
        book.setAuthor("JG");
        book.setName("WG,WG");
        book.setPrice(500);
        book.setSummary("YA");
        
        BookDAO bookDAO=context.getBean(BookDAOImpl.class);
        
        bookDAO.insertBook(book);
        
        List<Book> books=bookDAO.getAllBooks();
        System.out.println(books);
       
        System.out.println("After");
    }
}*/