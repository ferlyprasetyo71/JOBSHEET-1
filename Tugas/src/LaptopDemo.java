public class LaptopDemo {
    public static void main(String args[]){
        Laptop ltp1 = new Laptop();
        Laptop ltp2 = new Laptop();
        Komputer kmptr = new Komputer();

        ltp1.Merek("ASUS");
        ltp1.tambahInternal(128);
        ltp1.ram(8);
        ltp1.cetakStatus();

        ltp2.Merek("LENOVO");
        ltp2.tambahInternal(256);
        ltp2.ram(12);
        ltp2.tambahInternal(256);
        ltp2.cetakStatus();

        kmptr.Merek("Acer");
        kmptr.tambahInternal(1000);
        kmptr.ram(12);
        kmptr.Monitor("Acer");
        kmptr.cetakStatus();

    }
}
