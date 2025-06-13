public class TroChoi {
    private String ten;
    private int soLuotChoi;

    public TroChoi(String ten) {
        this.ten = ten;
        this.soLuotChoi = 0;
    }

    public void batDau() {
        soLuotChoi++;
        System.out.println("Bắt đầu trò chơi: " + ten);
    }

    public void ketThuc() {
        System.out.println("Kết thúc trò chơi: " + ten);
    }

    public void thongTin() {
        System.out.println("Tên: " + ten + " | Số lượt chơi: " + soLuotChoi);
    }
}
