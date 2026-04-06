public class Latihan3 {
    public static void main(String[] args) {

        double makan = 35000;
        double transport = 20000;
        double belanja = 45000;

        double total, diskon, totalBayar;

        total = makan + transport + belanja;
        diskon = total * 10 / 100;
        totalBayar = total - diskon;

        System.out.println("=== DATA PENGELUARAN ===");
        System.out.println("Makan: " + makan);
        System.out.println("Transport: " + transport);
        System.out.println("Belanja: " + belanja);

        System.out.println("\nTotal sebelum diskon: " + total);
        System.out.println("Diskon (10%): " + diskon);
        System.out.println("Total setelah diskon: " + totalBayar);
    }
}