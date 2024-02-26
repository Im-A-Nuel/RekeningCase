package Rekening;

class Nasabah {
    private String nama;
    private String identitas;
    private String alamat;

    Nasabah(String nama, String identitas, String alamat){
        this.nama = nama;
        this.identitas = identitas;
        this.alamat = alamat;
    }
    Nasabah(String nama){
        this(nama,"","");
    }

    public String getNama() {
        return nama;
    }

    public String getIdentitas() {
        return identitas;
    }

    public String getAlamat() {
        return alamat;
    }


}
