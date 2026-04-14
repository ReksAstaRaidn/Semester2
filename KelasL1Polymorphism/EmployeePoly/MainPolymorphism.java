public class MainPolymorphism {
    public static void main(String[] args) {
        // Deklarasi variabel bertipe Employee, namun diisi objek Lawyer (masa kerja 5 tahun)
        Employee pegawai1 = new Lawyer(5); 
        
        // Deklarasi variabel bertipe Employee, diisi objek LegalSecretary (masa kerja 7 tahun)
        Employee pegawai2 = new LegalSecretary(7); 

        // Meskipun variabelnya bertipe Employee, outputnya akan sesuai dengan class aslinya
        System.out.println("Gaji Pegawai 1 (Lawyer): $" + pegawai1.getSalary());
        System.out.println("Gaji Pegawai 2 (LegalSec): $" + pegawai2.getSalary());
        
    }
}
