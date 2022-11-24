package client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import presentation.BookPresentation;


public class BookClient {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		

AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(SpringJDBCConfiguration.class);
		
		BookPresentation bookPresentation=(BookPresentation)springContainer.getBean("bookPresentation");
		while(true) {
			bookPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			bookPresentation.performMenu(choice);
		}

	}

}
