/*
 * Name: Steven Eck
 * Date: February 5, 2013
 * Class CIT 160-01
 * Problem Statement:This program will produce an unique user name by manipulating several strings
 * using first name, last name and phone number. It will also display a full name in all capitals, all lowercase
 * and input and adapt the display day of the week. 
 * 
 * Sample Input/Output:  
 * Enter First Name: Steve
 * Enter Last Name: Eck
 * Enter Phone Number: 5707773147 displayed as (570) 777-3147
 * Enter Day of Week: 0= Sunday, 1 = Monday, etc, displayed as SUN, MON, etc.
 * 
 * 
 */
import java.util.Scanner;


public class EckStringManipulatorScanner {


	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String fullName, firstName, lastName, upper, phone, userid1, userid2, userid3;
		int numChars, numChars1, numChars2;
		String names = "SunMonTueWedThuFriSat";
		
		
		System.out.print("Enter your 10 digit phone number: ");
		phone = keyboard.nextLine();
		System.out.print("Enter the corresponding number for the day of the week: " +
				"\nSunday=0, Monday=1, Tuesday=2, Wednesday=3,\nThursday=4, Friday=5, Saturday=6 ");
		String in = keyboard.nextLine();
		System.out.print("Enter your First Name: ");
		firstName = keyboard.nextLine();
		System.out.print("Enter your Last Name: ");
		lastName = keyboard.nextLine();
		fullName = firstName + " " + lastName;
		
		upper = fullName.toUpperCase();
		numChars = firstName.length();
		numChars1 = lastName.length();
		numChars2 = fullName.length();
		phone = phone.replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
		int choice = Integer.parseInt(in);
		String day = names.substring(choice*3, choice*3+3);
		
		userid1 = firstName.substring(0,3);
		userid2 = lastName.substring(0,3);
		userid3 = phone.substring(12,14);
		
		
		
		System.out.print( "Your phone number is: " + phone+
				"\nToday is: " + day +
				"\nFirst Name: " + firstName + ".....Length= " +numChars +
				"\nLast Name: " + lastName + ".....Length= " + numChars1 +
				"\nFull Name: " + fullName + ".....Length= " + numChars2 + 
				"\nALL CAPITALS: " + upper +
				"\nall lowercase: " + fullName.toLowerCase() + 
				"\nYour Unique UserID: " + userid1 + userid2 + userid3);
		
		
		

	}

}