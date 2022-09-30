import java.util.Scanner;  
    
public class Latihan10 
{  
      
    public static void main(String args[] )  
    {  
        //deklarasi dan inisialisasi  
        int saldo = 100000, tariktunai, setorsaldo;  
        int pin = 160603;
        int inpin;
          
        //membuat scanner untuk inputan  
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan PIN :");
        inpin = sc.nextInt();
          
        while(inpin == pin)
        {  
        	//pilih menu
            System.out.println("Automated Teller Machine");  
            System.out.println("1 Tarik Tunai");  
            System.out.println("2 Setor Tunai");  

            System.out.println("3 Lihat Saldo");  
            System.out.println("4 keluar");  
            System.out.print("Pilih Menu :");  
              
            //ambil pilihan dari user  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Masukan uang anda yang ingin di tarik:");  
                      
        //tarik uang  
        tariktunai = sc.nextInt();  
                      
        //cek saldo kalo udah ketarik  
        if(saldo >= tariktunai)  
        {  
            //saldo dikurang yang di tarik  
            saldo = saldo - tariktunai;  
            System.out.println("Silahkan ambil uang anda");  
        }  
        else  
        {  
            //tampilan ketika error 
            System.out.println("saldo anda tidak cukup");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("masukan uang yang ingin di setor:");  
                      
        //dapatkan jumlah setore dari pengguna te  
        setorsaldo = sc.nextInt();  
                      
        //menambahkan jumlah setor ke total saldo  
        saldo = saldo + setorsaldo;  
        System.out.println("uang berhasil di setor");  
        System.out.println("");  
        break;  
   
                case 3:  
        //menampilkan jumlah saldo sekarang  
        System.out.println("saldo : "+saldo);  
        System.out.println("");  
        break;  
   
                case 4:  
        //keluar
        System.exit(0);  
        
        
            }  
        }  
        sc.close();
    }  
}