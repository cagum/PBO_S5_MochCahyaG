public class App {
    public static void main(String[] args) throws Exception {
        RightTriangle ABC = new RightTriangle("ABC", 3.0, 4.0);
        ABC.specificMetode();
        ABC.getInfo(); // Memanggil getInfo() dari RightTriangle

        Triangle BCD = new RightTriangle("BCD", 3.0, 4.0); // Menggunakan Triangle sebagai tipe data
        ((RightTriangle) BCD).hallo(); // Memanggil hallo() dari RightTriangle
        BCD.getInfo(); // Memanggil getInfo() dari Triangle

        Triangle CDE = new Triangle("CDE", 3.0, 4.0, 5.0);
        CDE.hallo(); // Memanggil hallo() dari Triangle
        CDE.getInfo(); // Memanggil getInfo() dari Triangle
    }
}
