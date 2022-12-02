/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

/**
 *
 * @author tuyen
 */
public class HoaDonChiTietViewModel {

//    private String id;
    private String mahoadon;
    private String tensp;
    private double giasp;
    private int sl;
//    private int trangthai;

    public HoaDonChiTietViewModel() {
    }

    public HoaDonChiTietViewModel(String mahoadon, String tensp, double giasp, int sl) {
        this.mahoadon = mahoadon;
        this.tensp = tensp;
        this.giasp = giasp;
        this.sl = sl;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getGiasp() {
        return giasp;
    }

    public void setGiasp(double giasp) {
        this.giasp = giasp;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

}
