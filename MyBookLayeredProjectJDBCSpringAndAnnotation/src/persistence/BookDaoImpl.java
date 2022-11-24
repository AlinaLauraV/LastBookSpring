package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import entity.Book;

@Component("dao")
public class BookDaoImpl implements BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
	    this.jdbcTemplate = jdbcTemplate;
	  }
	
	@Override
	public Collection<Book> getAllRecords() {
//		Connection connection = null;
//		PreparedStatement preparedStatement;
//
//		Collection<Book> booksList = new ArrayList<Book>();
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Books", "root", "Elfulet18!");
//
//			preparedStatement = connection.prepareStatement("SELECT * FROM BOOKS");
//
//			ResultSet resultSet = preparedStatement.executeQuery();
//
//			while (resultSet.next()) {
//				int id = resultSet.getInt("bookId");
//				String name = resultSet.getString("bookName");
//				String authorName = resultSet.getString("authorName");
//				int noOfCopies = resultSet.getInt("noOfCopies");
//
//				booksList.add(new Book(id, name, authorName, noOfCopies));
//			}
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
////				4.Close
//				connection.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return booksList;
		return null;
	}

	@Override
	public Book searchRecord(int id) {
//		Connection connection = null;
//		PreparedStatement preparedStatement;
//
//		Book book = null;
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Books", "root", "Elfulet18!");
//
//			preparedStatement = connection.prepareStatement("SELECT * FROM BOOKS WHERE bookID=?");
//			preparedStatement.setInt(1, id);
//			ResultSet resultSet = preparedStatement.executeQuery();
//
//			if (resultSet.next()) {
//				int bookId = resultSet.getInt("bookId");
//				String name = resultSet.getString("bookName");
//				String authorName = resultSet.getString("authorName");
//				int noOfCopies = resultSet.getInt("noOfCopies");
//
//				book = new Book(bookId, name, authorName, noOfCopies);
//			}
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
////				4.Close
//				connection.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return book;
		return null;
		
	}

	@Override
	public int insertRecord(Book book) {
//		Connection connection = null;
//		PreparedStatement preparedStatement;
//		int rows=0;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Books", "root", "Elfulet18!");
//
//			preparedStatement = connection.prepareStatement("INSERT INTO books VALUES(?,?,?,?)");
//
//			preparedStatement.setInt(1, book.getBookId());
//			preparedStatement.setString(2, book.getBookName());
//			preparedStatement.setString(3, book.getAuthorName());
//			preparedStatement.setInt(4, book.getNoOfCopies());
//
//			rows = preparedStatement.executeUpdate();
//
//			return rows;
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
////				4.Close
//				connection.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return rows;
		String query = "INSERT INTO Books VALUES(?,?,?,?)";
		int rows = jdbcTemplate.update(query,book.getBookId(),book.getBookName(), book.getAuthorName(), book.getNoOfCopies());

		return rows;
	}
	@Override
	public int deleteRecord(int id) {

//		Connection connection = null;
//		PreparedStatement preparedStatement;
//		int rows=0;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Books", "root", "Elfulet18!");
//
//			preparedStatement = connection.prepareStatement("DELETE FROM BOOKS WHERE bookID=?");
//
//			preparedStatement.setInt(1, id);
//
//			rows = preparedStatement.executeUpdate();
//
//			return rows;
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
////				4.Close
//				connection.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return rows;
		
		String query = "DELETE FROM Books WHERE BookId=?";
		int rows = jdbcTemplate.update(query, id);

		return rows;
	}
	

}