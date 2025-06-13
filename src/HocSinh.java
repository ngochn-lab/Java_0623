public class HocSinh {
    private String ten;
    private int tuoi;
    private double[] diem;

    public HocSinh(String ten, int tuoi, double[] diem) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public void inThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.print("Điểm: ");
        for (double d : diem) System.out.print(d + " ");
        System.out.println("\nĐiểm trung bình: " + tinhDiemTB());
    }

    public double tinhDiemTB() {
        double sum = 0;
        for (double d : diem) sum += d;
        return diem.length > 0 ? sum / diem.length : 0;
    }
}
