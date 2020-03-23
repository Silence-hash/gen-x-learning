package innerclass;
import java.util.Scanner;

class Warna{
    String obo, agus, nando;
    Scanner input  = new Scanner(System.in);
    
    public void warna() {
        String ganti, ganti1, ganti2, tukar;
        
         
        System.out.print("warna baju agus \t= ");
        agus = input.nextLine();
        System.out.print("warna baju obo \t\t= ");
        obo = input.nextLine();
        System.out.print("warna baju nando \t= ");
        nando = input.nextLine();
    
        System.out.println("\n\tSETELAH DI TUKAR");
    
        ganti = this.nando;
        System.out.println("\nwarna baju agus \t= "+ganti);
        ganti1 = this.agus;
        System.out.println("warna baju obo \t\t= "+ganti1);
        ganti2 = this.obo;
        System.out.println("warna baju nando \t= "+ganti2);
    
        System.out.println("apakah ingin tukar warna ? (ya/tidak)");
        tukar = input.nextLine();
    
        if (tukar.equals("ya")){
            ganti = this.obo;
            System.out.println("\nwarna baju agus \t= "+ganti);
            ganti1 = this.nando;
            System.out.println("warna baju obo \t\t= "+ganti1);
            ganti2 = this.agus;
            System.out.println("warna baju nando \t= "+ganti2);
            System.out.println("\n\tTERIMAKASIH ATAS PARTISIPASINYA");
        }else{
            System.out.println("\n\tTERIMAKASIH ATAS PARTISIPASINYA");
        }
        }
    }
    