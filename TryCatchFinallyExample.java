package exceptions.trycatchfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {14,15,1,2,3,6,4,5,6};
		try {
		System.out.println("Enter The divisor");
		int div = sc.nextInt();
		System.out.println("Enter The index:");
		int index=sc.nextInt();
		System.out.println(arr[index] / div);
		}catch(InputMismatchException inputMissmatch) {
			System.out.println("InputMismatchException---Enter Numbers Only");
		}catch(ArrayIndexOutOfBoundsException arrayIndexException) {
			arrayIndexException.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
