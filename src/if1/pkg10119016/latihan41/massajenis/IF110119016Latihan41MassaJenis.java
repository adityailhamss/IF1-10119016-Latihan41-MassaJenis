package if1.pkg10119016.latihan41.massajenis;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program 
 * menghitung massa jenis menggunakan getter setter
 */
public class IF110119016Latihan41MassaJenis {

   
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
	kubus.setMassa(250);
	int volume = kubus.hitungVolume(kubus.getSisi());
	int massaJenis = kubus.hitungMassaJenis(volume, kubus.getMassa());
                
	    System.out.println("======Massa Jenis Kubus======");
	    System.out.println("Sisi\t: " + kubus.getSisi());
	    System.out.println("Massa\t: " + kubus.getMassa());
            
            System.out.println("======Hasil Perhitungan======");
            System.out.println("Volume\t\t: " + volume);
            System.out.println("Massa Jenis\t: " + massaJenis);
    }
}
  