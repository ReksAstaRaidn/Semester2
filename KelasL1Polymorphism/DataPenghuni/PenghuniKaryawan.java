public class PenghuniKaryawan extends Penghuni {

    private String tempatKerja;
    

    public PenghuniKaryawan(String nama, int nomorKamar, int nomorTelepon, String kategori, String tempatKerja) {
        super(nama, nomorKamar, nomorTelepon, kategori);
        this.tempatKerja = tempatKerja;
       
    }
    public String getTempatKerja() {
        return tempatKerja;
    }
    

    public String toString() {
        return super.toString() + " | Tempat Kerja: " + tempatKerja;
    }
}
