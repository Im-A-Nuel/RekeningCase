package Rekening;

public class RekeningBisnis extends Rekening{
    
    RekeningBisnis(Nasabah nasabah, int saldoAwal){
        super(nasabah, saldoAwal);
    }

    RekeningBisnis(Nasabah nasabah){
        super(nasabah, 0);
    }

    private int bunga(int jumlah){
        return (int) (0.001 * jumlah);
    }

    public void penyetoran(int jumlah){
        if(jumlah > 0){
            int total = jumlah + bunga(jumlah);
            super.penyetoran(total);
        }
    }
}
