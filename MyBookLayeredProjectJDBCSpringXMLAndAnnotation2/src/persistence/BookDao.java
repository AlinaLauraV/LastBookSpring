package persistence;

import java.util.Collection;
import java.util.List;

import entity.Book;


public interface BookDao {

	Collection<Book> getAllRecords();
	Book searchRecord(int id);
	int insertRecord(Book book);
	int deleteRecord(int id);
}

