package pl.javastart.main;

import pl.javastart.dao.BookDao;
import pl.javastart.dao.BookDaoImpl;
import pl.javastart.model.Book;

public class Main{
    public static void main(String[] args) {
        Book book = new Book("12345678912345678","TITLE","JANEK");
        BookDao bookDao = new BookDaoImpl();
        bookDao.save(book);
        System.out.println("Saved books");
        System.out.println("asdasdasd");
        bookDao.cleanUp();
    }
}
