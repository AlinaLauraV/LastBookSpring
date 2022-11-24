package client;


import java.sql.Connection;

import java.sql.DriverManager;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

    import persistence.BookDao;
	import persistence.BookDaoImpl;
	import presentation.BookPresentationImpl;
	import service.BookServiceImpl;

	@Configuration
	@ComponentScan(basePackages = {"persistence", "presentation", "service"})
	public class SpringJDBCConfiguration {
//    @Bean
//	public DataSource dataSource() {
//	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
//	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//	    dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/Books");//change url
//	    dataSource.setUsername("root");//change userid
//	    dataSource.setPassword("Elfulet18!");//change pwd
//	    return dataSource;
//		  }
//	    @Bean
//	    public JdbcTemplate jdbcTemplate() {
//	      JdbcTemplate jdbcTemplate = new JdbcTemplate();
//	      jdbcTemplate.setDataSource(dataSource());
//	      return jdbcTemplate;
//	    }
//
//	    @Bean
//	    public BookDao bookDao(){
//	      BookDaoImpl bookDao = new BookDaoImpl();
//	      bookDao.setJdbcTemplate(jdbcTemplate());
//	      return bookDao;
//	    }

	  }


		
	


