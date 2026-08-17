 public class Main {
    public static void main(String[] args) {

        String ogrenciAdi = "Betül";
        int yas = 22;
        double ortalama = 3.45;
        boolean aktifMi = true;


        System.out.println("Öğrenci Adı: " + ogrenciAdi);
        System.out.println("Yaşı: " + yas);


        if (ortalama >= 3.0) {
            System.out.println("Başarı Durumu: Onur Öğrencisi");
        } else {
            System.out.println("Başarı Durumu: Standart");
        }
    }
}

