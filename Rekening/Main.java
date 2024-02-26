package Rekening;

public class Main {
    public static void main(String[] args) {
        Nasabah n1 = new Nasabah("Anton");
        Rekening r1 = new Rekening(n1, 10000);
        r1.penarikan(5000);
        System.out.println("Jumlah uang " + n1.getNama() + " di rekening biasa: " + r1.getSaldo());
        
        RekeningKeluarga rk1 = new RekeningKeluarga(n1, 10000);
        rk1.penarikan(5000);
        System.out.println("Jumlah uang " + n1.getNama() + " di rekening keluarga: " + rk1.getSaldo());
    }
}
