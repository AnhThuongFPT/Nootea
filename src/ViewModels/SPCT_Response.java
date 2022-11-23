package ViewModels;

public class SPCT_Response {
    private String ID;
    private String tenSP;
    private String hinhAnh;
    private String loai;
    private String size;
    private double donGia;

    public SPCT_Response() {
    }

    public SPCT_Response(String ID, String tenSP, String hinhAnh, String loai, String size, double donGia) {
        this.ID = ID;
        this.tenSP = tenSP;
        this.hinhAnh = hinhAnh;
        this.loai = loai;
        this.size = size;
        this.donGia = donGia;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

   
    public Object[] getData() {
        return new Object[]{ID, tenSP, hinhAnh,loai, size, donGia};
    }
}
