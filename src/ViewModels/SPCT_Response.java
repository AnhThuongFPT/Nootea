package ViewModels;

public class SPCT_Response {
    private String tenSP;
    private String loai;
    private String size;
    private double donGia;

    public SPCT_Response() {
    }

    public SPCT_Response(String tenSP, String loai, String size, double donGia) {
        this.tenSP = tenSP;
        this.loai = loai;
        this.size = size;
        this.donGia = donGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
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

    
}
