package persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import entity.Book;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		int bookId = resultSet.getInt("bookID");
		String bookName = resultSet.getString("bookName");
		String authorName = resultSet.getString("authorName");
		int noCopies = resultSet.getInt("noOfCopies");

		Book book = new Book(bookId,bookName, authorName, noCopies);
		return book;
	}

}
