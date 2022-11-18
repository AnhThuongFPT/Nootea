package DomainModels;

public class SanPham {
    private String ID;
    private String maSP;
    private String ten;

    public SanPham() {
    }

    public SanPham(String ID, String maSP, String ten) {
        this.ID = ID;
        this.maSP = maSP;
        this.ten = ten;
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
    
    
}
