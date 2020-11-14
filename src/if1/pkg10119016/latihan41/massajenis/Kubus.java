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
public class Kubus {
 private int sisi;
    private int massa;

    public int getSisi(){
        return sisi;
    }

    public void setSisi(int sisi){
        this.sisi = sisi;
    }

    public int getMassa(){
        return massa;
    }

    public void setMassa(int massa){
        this.massa = massa;
    }

    public int hitungVolume(int parSisi){
        return (int) Math.pow(parSisi, 3);
    }

    public int hitungMassaJenis(int parMassa, int volume){
        return parMassa / volume;
    }
}