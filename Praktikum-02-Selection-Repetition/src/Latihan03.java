import java.util.Scanner;

public class Latihan03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		byte  pilihan;
		
		System.out.println("====PROGRAM PILIH MENU SARAPAN====\n");
		System.out.println("Menu Sarapan:");
		System.out.println("1. Nasi Goreng \n2. Bubur Ayam \n3. Soto Ayam ");
		System.out.print("Pilihan : ");
		pilihan = input.nextByte();
		
		switch(pilihan) {
			case 1:
				System.out.println("Anda memesan Nasi Goreng dengan harga Rp 22.000,-");
			break;
			case 2:
				System.out.println("Anda memesan Bubur Ayam dengan harga Rp 15.000,-");
			break;
			case 3:
				System.out.println("Anda memesan Soto Ayam dengan harga Rp 25.000,-");
			break;
			default:
				System.out.println("Maaf menu yang Anda masukkan salah");
		}
		
		input.close();

	}

}
