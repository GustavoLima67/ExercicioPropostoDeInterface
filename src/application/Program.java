package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException{

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Contract date:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date: (dd/MM/yyyy)");
	    Date date = sdf.parse(sc.next());
	    System.out.print("Contract value: ");
	    double contractValue = sc.nextDouble();
	    System.out.print("Enter number of installiments: ");
	    int installiments = sc.nextInt();
	    
	    for(int i = 1; i<=installiments; i++) {
	    	
	    }
		
	}

}
