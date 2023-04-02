public class Main {
    public static void main(String[] args) {
        Perpustakaan input = new Perpustakaan();
        input.inputBuku("001","Aku Baik", 6 );
        input.inputBuku("002","Antariksa",10 );
        input.inputBuku("003","Angkasa",5 );
        input.inputBuku("004","Agaskara",8 );

        input.cekBuku("004");
        input.cekBukuAdaAtauTidak("005");
        input.cariBukuAdaAtauTidak("agaskara");
//        Tugas
//        input.cariBuku("Nar");
//        input.cariBuku("OOP");
    }
}