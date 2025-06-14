public class ThietBiDien {
    private String ten;
    private double congSuat; // Watt

    public ThietBiDien(String ten, double congSuat) {
        this.ten = ten;
        this.congSuat = congSuat;
    }

    public void hienThiThongTin(){
        System.out.println("Thiết bị: " + ten + "\nCông suất: " + congSuat +"W");
    }
}
