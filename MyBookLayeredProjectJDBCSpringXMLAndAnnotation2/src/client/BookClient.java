package client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import presentation.BookPresentation;


public class BookClient {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		

		ApplicationContext springContainer = new ClassPathXmlApplicationContext("Book.xml");

		BookPresentation bookPresentation=(BookPresentation)springContainer.getBean("bookPresentation");
		while(true) {
			bookPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			bookPresentation.performMenu(choice);
		}

	}

}
