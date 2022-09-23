package com.latihan;
import java.util.Scanner;

public class Latihan8 {

	public static void main(String[] args) {
		int NPM, semester;
		String namalengkap, namakelas;
		double ipk;

		Scanner InputData = new Scanner (System.in);
		
		System.out.print("Masukkan NPM :");
		NPM = InputData.nextInt();
		
		System.out.print("Masukkan Semester :");
		semester = InputData.nextInt();
		
		InputData.nextLine();
		
		System.out.print("Masukkan Nama Lengkap :");
		namalengkap = InputData.nextLine();
		
		System.out.print("Masukkan Nama Kelas :");
		namakelas = InputData.nextLine();
		
		System.out.print("Masukkan IPK :");
		ipk= InputData.nextDouble();
		
		System.out.println("NPM : " + NPM);
		System.out.println("Semester : " + semester);
		System.out.println("Nama Lengkap :" + namalengkap);
		System.out.println("Nama Kelas : " + namakelas );
		System.out.println("IPK : " + ipk);
		
		InputData.close();
		
	}

}
