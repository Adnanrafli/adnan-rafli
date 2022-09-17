package Pbo2_Adnan2;


public class Main {

    public static void main(String[]args) {
        hewan h = new hewan();
        manusia a = new manusia();
        telpon t = new telpon();
        
        System.out.println("tidur: " +h.tidur(true));

        System.out.println("memasak: "+a.memasak("Soto Mie"));

        System.out.println("terima_telpon: " +t.terima_panggilan(true));
    }        
    
    
}