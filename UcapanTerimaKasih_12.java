import java.util.Scanner;

public class UcapanTerimaKasih_12 {

    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank You "+nama+" for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like i could ask you anything.");

        UcapanTambahan(nama);
    }

    public static void UcapanTambahan(String nama){
        System.out.println("I also want to thank you for being so patient and understanding with me.\n" +
        "You are always there for me when I need you, and I appreciate that more than you know.");
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
