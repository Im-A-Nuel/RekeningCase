package Rekening;

public class Rekening{
    @SuppressWarnings("unused")
    private Nasabah nasabah;
    private int saldo;

    Rekening(Nasabah nasabah, int saldoAwal){
        this.nasabah = nasabah;
        this.saldo = saldoAwal;
    }

    Rekening(Nasabah nasabah){
        this(nasabah, 0);
    }
    
    public void penarikan(int jumlah){
        int saldoBaru = saldo - jumlah;
        if(saldoBaru >= 0 && jumlah > 0){
            this.saldo = saldoBaru;
        }
    }

    public void penyetoran(int jumlah){
        if(jumlah>0){
            this.saldo += jumlah;
        }
    }

    public int getSaldo(){
        return saldo;
    }
    
}