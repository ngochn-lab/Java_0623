public class MaySay extends ThietBiDien{
    private double dungTich;

    public MaySay(String ten, double congSuat, double dungTich) {
        super(ten, congSuat);
        this.dungTich = dungTich;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Dung tích: " + dungTich);
    }
}
