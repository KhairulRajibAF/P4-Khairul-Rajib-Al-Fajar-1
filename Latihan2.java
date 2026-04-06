
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double makan, transport, belanja, total;
        double p_makan, p_transport, p_belanja;

        System.out.print("Masukkan pengeluaran makan: ");
        makan = input.nextDouble();

        System.out.print("Masukkan pengeluaran transport: ");
        transport = input.nextDouble();

        System.out.print("Masukkan pengeluaran belanja: ");
        belanja = input.nextDouble();

        total = makan + transport + belanja;

        p_makan = (makan / total) * 100;
        p_transport = (transport / total) * 100;
        p_belanja = (belanja / total) * 100;

        System.out.println("\n=== Persentase Pengeluaran ===");
        System.out.println("Makan: " + p_makan + "%");
        System.out.println("Transport: " + p_transport + "%");
        System.out.println("Belanja: " + p_belanja + "%");
    }
}