import java.util.Scanner;

public class CountyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner (System.in);
System.out.println("Enter The County's Name");
String CountyName2 = scanner.nextLine();
System.out.println("Enter County's Population");
		String CountyPopulation2 = scanner.nextLine();
		System.out.println("Enter The Year The County Was Established");
		String CountyYearEstablished2 = scanner.nextLine();
		System.out.println("Enter The County Land Volume");
		String CountyLandVolume2 = scanner.nextLine();
		
		County to = new  County(CountyName2, CountyPopulation2, CountyYearEstablished2, CountyLandVolume2);
		System.out.println(to.Countyname + to.CountyPopulation + to.CountyYearEstablished + to.CountyLandVolume);
	}

}
