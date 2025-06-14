public class BaiTapBuoi9Application {
    public static void main(String[] args) {
        printDivider(1);

        // Bài 1: Tạo thông tin học sinh
        double[] listDiem = {6.2, 9.5, 7.7};
        int tuoiHS = 24;
        String tenHS = "Hoàng Như Ngọc";

        HocSinh hocSinh = new HocSinh(tenHS, tuoiHS, listDiem);
        hocSinh.inThongTin();

        printDivider(2);

        // Bài 2: Tạo thông tin Xe Hơi
        String hang = "BMW";
        String mau = "Đen";
        int namSX = 2025;
        XeHoi xeHoi = new XeHoi(hang, mau, namSX);
        xeHoi.hienThiThongTin();

        printDivider(3);

        // Bài 3: Tạo phương thức bắt đầu và kết thúc cho TroChoi
        TroChoi troChoi = new TroChoi("Trò Bắn Cá");
        troChoi.batDau();
        troChoi.ketThuc();
        troChoi.thongTin();

        printDivider(4);

        // Bài 4: XeHoi, XeMay trong PhuongTienGiaoThong
        XeHoi xeHoi1 = new XeHoi("Mercedez", "Trắng", 2020);
        XeMay xeMay1= new XeMay("Vision", "Xanh Đen", 2023);
        xeHoi1.hienThiThongTin();
        xeMay1.hienThiThongTin();

        printDivider(5);

        // Bài 5: DieuHoa, MaySay trong ThietBiDien
        DieuHoa dh = new DieuHoa("Điều Hòa Panasonic", 1800.0, "Làm lạnh");
        MaySay ms = new MaySay("Máy sấy LG", 1500.0, 7);

        dh.hienThiThongTin();
        ms.hienThiThongTin();
    }

    public static void printDivider(int soBai){
        System.out.println("------------------- BÀI TẬP " + soBai + " ------------------------");
    }
}
