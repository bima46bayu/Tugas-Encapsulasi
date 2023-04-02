import java.util.ArrayList;

public class Buku {
    String idBuku;
    String judul;
    double rate;
    int jumlah;
    int denda;
    int totalRate;
    int jmlReviewer;

    Buku(String idBuku,String judul,int jumlah){
        this.idBuku = idBuku;
        this.judul = judul;
        this.jumlah = jumlah;
        this.rate = 0;
        this.totalRate = 0;
        this.jmlReviewer = 0;
    }

    public Buku() {

    }

    boolean bisaDiPinjam(){
        if (jumlah > 0){
            return true;
        }
        return false;
    }

//    boolean bukuAdaAtauTidak(){
//        if (Judul == )
//    }

    int DendaPerHari(){
        if (rate >= 4.0 ){
            return 3000;
        } else if (rate >= 3.0) {
            return 2000;
        }
        return 1000;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }

    public int getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(int totalRate) {
        this.totalRate = totalRate;
    }

    public int getJmlReviewer() {
        return jmlReviewer;
    }

    public void setJmlReviewer(int jmlReviewer) {
        this.jmlReviewer = jmlReviewer;
    }
}
