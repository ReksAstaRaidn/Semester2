public class Penghuni {
    private String nama;
    private int nomorKamar;
    private int nomorTelepon;
    private String kategori;

    public Penghuni(String nama, int nomorKamar, int nomorTelepon, String kategori) {
        this.nama = nama;
        this.nomorKamar = nomorKamar;
        this.nomorTelepon = nomorTelepon;
        this.kategori = kategori;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getNomorKamar() {
        return nomorKamar;
    }

    public int getNomorTelepon() {
        return nomorTelepon;
    }

    public String getKategori() {
        return kategori;
    }

    public String toString() {
        return "Nama: " + nama + " | Nomor Kamar: " + nomorKamar + " | Nomor Telepon: " + nomorTelepon + " | Kategori: " + kategori;
    }
}
