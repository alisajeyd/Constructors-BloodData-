package hehe;
import java.util.*;

public class RunBloodData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter blood type of a patient: ");
		String input1 = sc.nextLine();
		
		System.out.print("Enter the Rhesus factor (+ or -): ");
		String input2 = sc.nextLine();
		
		if(input1.isEmpty()) {		
			if(input2.isEmpty()) {
				BloodData bd = new BloodData();
				bd.Display();
			}
			else {
				System.out.println("Invalid input!");
			}
		}
		else if(input1.equals("A") || input1.equals("B") || input1.equals("O")|| input1.equals("AB")) {
			if(input2.equals("+") || input2.equals("-") ) {
				BloodData bd = new BloodData(input1, input2);
				bd.Display();
			}
			else {
				System.out.println("Invalid Output!");
			}
		}
		else if(input1.equals("A") || input1.equals("B") || input1.equals("O")|| input1.equals("AB") || input2.equals("-")) {
			if(input2.equals("+") || input2.equals("-") ) {
				BloodData bd = new BloodData();
				bd.Display();
		}
		else {
			System.out.println("Invalid input!");
		}
	}
	}
}