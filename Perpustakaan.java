import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perpustakaan {
    List<Buku>  listBuku;
    Perpustakaan(){
        listBuku = new ArrayList<>();
    }
    void inputBuku(String idBuku, String judul, int jumlah){
        Buku buku1 = new Buku(idBuku, judul, jumlah);
        listBuku.add(buku1);
    }
    void cekBuku(String idBuku) {
        for (int i = 0; i < listBuku.size(); i++) {
            Buku currentBuku = listBuku.get(i);
            if (currentBuku.idBuku.equals(idBuku)) {
                if (currentBuku.bisaDiPinjam()) {
                    System.out.println("Buku " + currentBuku.judul + " ready");
                } else {
                    System.out.println("Buku " + currentBuku.judul + " kosong");
                }
            }
        }
    }
    void cekBukuAdaAtauTidak(String idBuku){
        for (int i = 0; i < listBuku.size(); i++) {
            Buku currentBuku = listBuku.get(i);
            if (currentBuku.idBuku.equals(idBuku)){
                if (currentBuku.idBuku.compareTo(idBuku) == 0){
                    System.out.println("id Buku " + currentBuku.idBuku + " Ada");
                } else {
                    System.out.println("id Buku " + currentBuku.idBuku + " Tidak Ada");
                }
            }
        }
    }

    void cariBukuAdaAtauTidak(String judul){
        for (int i = 0; i < listBuku.size(); i++) {
            Buku currentBuku = listBuku.get(i);
            if (currentBuku.judul.equalsIgnoreCase(judul)){
                if (currentBuku.judul.compareTo(judul) == 0){
                    System.out.println("Buku " + currentBuku.judul + " Ada");
                } else {
                    System.out.println("Buku " + currentBuku.judul + " Tidak Ada");
                }
            }
        }
    }




}
