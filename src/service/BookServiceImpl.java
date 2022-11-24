package service;

import java.util.Collection;

import org.springframework.stereotype.Component;

import entity.Book;
import persistence.BookDao;
import persistence.BookDaoImpl;

@Component("service")
public class BookServiceImpl implements BookService {

	
	private BookDao bookDao;
	
	
	public BookServiceImpl(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}

	@Override
	public Collection<Book> getAllBooks() {
		return bookDao.getAllRecords();
	}

	@Override
	public Book searchBookById(int id) {
		return bookDao.searchRecord(id);
	}

	@Override
	public boolean addBook(Book book) {
		if(bookDao.insertRecord(book)>0)
		      return true;
	    return false;
	}
	
	@Override
	public boolean deleteBook(int id) {
		if(bookDao.deleteRecord(id)>0)
			return true;
		return false;
	}
}

