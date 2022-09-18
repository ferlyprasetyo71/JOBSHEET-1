public class Komputer extends Laptop {
    private String Monitor;

    public void Monitor(String x){
        Monitor = x;
    }

    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe suspensi : " + Monitor);
    }
}
