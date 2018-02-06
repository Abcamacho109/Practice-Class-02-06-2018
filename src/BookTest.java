import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Book Author");
		String BookAuthor2 = scanner.nextLine();
		System.out.println("Enter The Year The Book Was Published");
		String BookYearPublish2 = scanner.nextLine();
		System.out.println("Enter The Books ISBN Number");
		Long BookISBNNumber2 = scanner.nextLong();
		System.out.println("Enter The Price of The Book");
		int BookPrice2 = scanner.nextInt();
		
		Books bo = new Books(BookAuthor2,BookYearPublish2,BookISBNNumber2,BookPrice2);
		System.out.println(bo.BookAuthor + bo.YearPublish + bo.BookISBNNumber + bo.BookPrice);
		
	}

}
