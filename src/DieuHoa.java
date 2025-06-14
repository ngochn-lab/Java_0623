public class DieuHoa extends ThietBiDien{
    private String mode;

    public DieuHoa(String ten, double congSuat, String mode) {
        super(ten, congSuat);
        this.mode = mode;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chế độ: " + mode);
    }
}
