public class Laptop {
    private String merek;
    private int ram;
    private int internal;

    public void Merek(String x){
        merek = x;
    }

    public void ram(int x){
        ram = x;
    }

    public void tambahInternal(int tambah){
        internal = internal + tambah;
    }

    public void cetakStatus(){
        System.out.println("Merek : " + merek);
        System.out.println("Internal : " + internal);
        System.out.println("RAM : " + ram);
    }
}
