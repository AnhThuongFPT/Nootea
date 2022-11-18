package ViewModels;

public class SPCT_Response {
    private String maSP;
    private String tenSP;
    private String size;
    
    private String loai;
    private double donGia;
    private String trangThai;

    public SPCT_Response() {
    }

    public SPCT_Response(String maSP, String tenSP, String size, String loai, double donGia, String trangThai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.size = size;
        this.loai = loai;
        this.donGia = donGia;
        this.trangThai = trangThai;
    }

    public String getmaSP() {
        return maSP;
    }

    public void setmaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    public Object[] getData() {
        return new Object[]{maSP, tenSP, size, loai, donGia, trangThai};
    }
}
