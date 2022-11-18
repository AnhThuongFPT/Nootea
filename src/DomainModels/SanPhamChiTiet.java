package DomainModels;

public class SanPhamChiTiet {
    private String ID;
    LoaiSanPham lsp;
    SanPham sp;
    NguyenLieu nl;
    private String hinhAnh;
    private String kichThuoc;
    private double donGia;
    private String moTa;
    private String trangThai;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(String ID, LoaiSanPham lsp, SanPham sp, NguyenLieu nl, String hinhAnh, String kichThuoc, double donGia, String moTa, String trangThai) {
        this.ID = ID;
        this.lsp = lsp;
        this.sp = sp;
        this.nl = nl;
        this.hinhAnh = hinhAnh;
        this.kichThuoc = kichThuoc;
        this.donGia = donGia;
        this.moTa = moTa;
        this.trangThai = trangThai;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public LoaiSanPham getLsp() {
        return lsp;
    }

    public void setLsp(LoaiSanPham lsp) {
        this.lsp = lsp;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public NguyenLieu getNl() {
        return nl;
    }

    public void setNl(NguyenLieu nl) {
        this.nl = nl;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
