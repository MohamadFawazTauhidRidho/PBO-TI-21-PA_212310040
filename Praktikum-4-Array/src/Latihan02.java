import java.util.Scanner;

public class Latihan02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		int userInput;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Masukkan nilai pada array indeks ke - " + i + " = ");
			userInput = input.nextInt();
			arr[i] = userInput;
		}
		
		System.out.println();
		
		for(int j = 0; j < arr.length; j++) {
			System.out.println("Array[" + j + "] = " + arr[j]);
		}
		
		input.close();
	} 
	
}