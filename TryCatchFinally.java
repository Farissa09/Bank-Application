package exceptions.trycatchfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	try {
		int a = sc.nextInt();
	}catch(InputMismatchException inputMismatchException) {
		inputMismatchException.printStackTrace();
	}finally {
		sc.close();
	}
	
	try {
		int a = sc.nextInt();
		System.out.println(a); 
	}catch(IllegalStateException e) {
		e.printStackTrace();
	}
	
	}

}
