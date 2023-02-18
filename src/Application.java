import java.io.IOException;
import java.util.Scanner;

public class Application {

	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BookLinkedList list1=new BookLinkedList();
		BookReader read = new BookReader(list1);
		BookWriter wr = new BookWriter();
	//	read.bookReader();
	//	wr.write();
	
		int option=0;
		do {
			printMenu();
			option=scan.nextInt();
			switch(option) {
			case 1:searchForBook(list1);break;
			case 2:
				System.out.print("Enter new book title");
				String newBookTitle=scan.next();
				list1.addNewBook(newBookTitle);;break;
			case 3:wr.write(list1);break;
		//	case 4:;break;				
			case 5: break;
			}
			
		}while(option !=5);
		

	}

	private static void searchForBook(BookLinkedList list1) {
		
		Scanner scan = new Scanner(System.in);
		String searchKeyword=null;
		Book searchResult=null;
		char answer='n';
		do {
			System.out.println("Search for a book entry");
			System.out.println("Enter a portion of title or author that you are looking for:");
			//your java code that will read input from user and store in searchKeyword			
			searchKeyword=scan.next();
			
			searchResult=list1.search(searchKeyword);
			System.out.println("Would you like to run again (y/n)?");
			//your code that will read answer 
			 answer=scan.next().charAt(0);
			
		}while(answer!='n');}
	
	
	private static void printMenu() {
		System.out.println("Book Search Application Menu");
		System.out.println("1.	Search book with a keyword");
		System.out.println("2.	add new book to list");
		System.out.println("3.	print all avialable books");
		System.out.println("4.	save current linked list");
		System.out.println("5.	exit.");
	}

}
