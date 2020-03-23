
package Tugas2;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        int cariangka ;
        boolean ditemukan = false;
        
        int[] angka = new int[5];
        int tambah = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("## Masukan angka pertama = ");
        angka[0] = input.nextInt();
        tambah++;
        
        System.out.print("## Masukan angka kedua = ");
        angka[1] = input.nextInt();
        tambah++;
        
        System.out.print("## Masukan angka ketiga = ");
        angka[2] = input.nextInt();
        tambah++;
        
        System.out.print("## Masukan angka keempat = ");
        angka[3] = input.nextInt();
        tambah++;
        
        System.out.print("## Masukan angka ke lima = ");
        angka[4] = input.nextInt();
        tambah++;
        
     
        System.out.print("## Cari angka yang di inginkan = ");
        cariangka = input.nextInt();
        
        for(int j=0; j<tambah; j++){
            if(angka[j] == cariangka){
                ditemukan = true;
                break;
            }
        }
        
        if(ditemukan){
            System.out.println("Angka di temukan");
        }
        
    }
    
}

