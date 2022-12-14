package DomainModels;

public class SanPham {

    private String ID;
    private String maSP;
    private String ten;
    private double gia;
    private String hinhanh;
    private int trangthai;

    public SanPham() {
    }

    public SanPham(String ID, String maSP, String ten, double gia, String hinhanh, int trangthai) {
        this.ID = ID;
        this.maSP = maSP;
        this.ten = ten;
        this.gia = gia;
        this.hinhanh = hinhanh;
        this.trangthai = trangthai;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
}
