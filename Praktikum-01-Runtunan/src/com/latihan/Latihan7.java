package com.latihan;
import java.util.*;

public class Latihan7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Nama;
			
		System.out.print("Masukkan Nama : ");
		Nama = input.nextLine();
			
		System.out.println("Kalimat awal  : " + Nama);
		System.out.println("Kalimat edit  : " + Nama.replaceAll("[aiueoAIUEO]", "X"));
			
			input.close();

	}

}
