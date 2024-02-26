package Rekening;

public class RekeningKeluarga extends Rekening{
    RekeningKeluarga(Nasabah nasabah, int saldoAwal){
        super(nasabah,saldoAwal);
    }

    RekeningKeluarga(Nasabah nasabah){
        super(nasabah,0);
    }

    private int bunga(int jumlah){
        return (int) (0.005 * jumlah);
    }

    public void penyetoran(int jumlah){
        if(jumlah > 0){
            int total = jumlah + bunga(jumlah);
            super.penyetoran(total);
        }
    }

    public void penarikan(int jumlah){
        if(jumlah>0){
            int total = jumlah + 5000;
            super.penarikan(total);
        }
    }
}
