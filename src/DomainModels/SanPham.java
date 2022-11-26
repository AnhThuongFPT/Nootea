package DomainModels;

import java.awt.Checkbox;

public class SanPham {
    private String ID;
    private String maSP;
    private String ten;
    private Checkbox select;
    
    public SanPham() {
    }

    public SanPham(String ID, String maSP, String ten, Checkbox select) {
        this.ID = ID;
        this.maSP = maSP;
        this.ten = ten;
        this.select = select;
    }

    public SanPham(String ID, String maSP, String ten) {
        this.ID = ID;
        this.maSP = maSP;
        this.ten = ten;
    }

    public Checkbox getSelect() {
        return select;
    }

    public void setSelect(Checkbox select) {
        this.select = select;
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
