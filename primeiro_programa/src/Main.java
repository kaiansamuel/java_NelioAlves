import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price = 2100.0;
		double price2 = 650.50;
		double measure = 51.2345;
		
		System.out.println("Products:");
		System.out.printf("%s%n which price is $%.2f%n", product1, price);
		System.out.printf("%s%n Office Desk price is $%.2f%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
	}
}
