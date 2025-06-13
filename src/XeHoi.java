public class XeHoi {
    private String hang;
    private String mau;
    private int namSX;

    public XeHoi(String hang, String mau, int namSX) {
        this.hang = hang;
        this.mau = mau;
        this.namSX = namSX;
    }

    public void hienThiThongTin() {
        System.out.println("Hãng: " + hang);
        System.out.println("Màu: " + mau);
        System.out.println("Năm sản xuất: " + namSX);
    }
}
