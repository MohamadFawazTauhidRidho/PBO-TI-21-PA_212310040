package com.latihan;
import java.util.Scanner;

public class Latihan5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Masukkan kalimat : ");
		word = input.nextLine();
				
		System.out.println("Kalimat Sebelum Uppercase : " + word);
		System.out.println("Kalimat Sesudah Uppercase : " + word.toUpperCase());
		
		input.close();

	}

}
