import java.util.Scanner;

public class Percobaan6_12 {

    static int hitungLuas (int p, int l){
        int Luas = p*l;
        return Luas;
    }
    // fungsi hitung Volume
    static int hitungVolume (int t, int p, int l){
        int Volume = p*l*t;
        return Volume;
    }
    // fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,l,t,Luas,Volume;

        System.out.println("Masukkan Panjang : ");
        p= sc.nextInt();
        System.out.println("Masukkan lebar : ");
        l=sc.nextInt();
        System.out.println("Masukkan tinggi : ");
        t=sc.nextInt();

        Luas = hitungLuas(p, l);
        System.out.println("Luas balok adalah "+Luas);
        Volume = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah "+Volume);
    }
}
