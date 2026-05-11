import java.util.LinkedList;

public class StrukturData {
    public static void main(String[] args) {

        // Soal 1 Buatlah sebuah deklarasi variabel dengan tipe data float yang bernama ‘StrukturBaris’
        float StrukturBaris = 4f;
        System.out.println("Soal Pertama");
        System.out.println("Struktur Baris :" + StrukturBaris);

        // Soal 2 Buatlah sebuah deklarasi variabel dengan tipe data string yang bernama ‘SusunanKataBaru’ yang berisi kata ‘Pemrograman Struktur Data Java’
        String SusunanKataBaru = "Pemrograman Struktur Data Java";
        System.out.println("Soal Kedua");
        System.out.println("Susunan Kata Baru :" + SusunanKataBaru);

        // Soal 3 Buatlah pendeklarasian array satu dimensi dengan nama ‘DelapanAngka, tipe data integer, yang berisi angka (10, 12, 18, 23, 33, 58, 67, 82)
        int[] DelapanAngka = {10, 12, 18, 23, 33, 58, 67, 82};
        System.out.println("Soal Ketiga");
        for (int angka : DelapanAngka) {
            System.out.print(angka + " ");
        }
        System.out.println();

        // Soal 4 Buatlah pendeklarasian array dua dimensi dengan nama ‘DuaAngka’, tipe data String, yang terdiri dari tiga baris dan tiga kolom, isi baris dan kolom berisi angka berikut (2, 4, 6, 8, 10, 12, 14, 16, 18)
        String[][] DuaAngka = {
            {"2", "4", "6"},
            {"8", "10", "12"},
            {"14", "16", "18"}
        };
        System.out.println("Soal Keempat");
        for (String[] baris : DuaAngka) {
            for (String kolom : baris) {
                System.out.print(kolom + "\t");
            }
            System.out.println();
        }

        // Soal 5 Buatlah deklarasi linked list dengan nama 'UrutanListAngka' yang memiliki list (15, 28, 33, 47, 59)
        LinkedList<Integer> UrutanListAngka = new LinkedList<>();
        UrutanListAngka.add(15);
        UrutanListAngka.add(28);
        UrutanListAngka.add(33);
        UrutanListAngka.add(47);
        UrutanListAngka.add(59);
        System.out.println("Soal Kelima");
        System.out.println("Urutan List Angka :" + UrutanListAngka);
    }
}