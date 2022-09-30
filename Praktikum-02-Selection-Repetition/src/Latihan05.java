import java.util.Scanner;

public class Latihan05 {
	
	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		int baris;
		
		System.out.print("Masukkan banyaknya baris: ");
		baris = inputData.nextInt();
		
		for(int i = 0; i < baris; i++) {
			for(int j = baris; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		inputData.close();
	}

}