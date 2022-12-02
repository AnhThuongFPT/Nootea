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
public class HoaDonViewModel {
    private String idhoadon;
    private String mahoadon;
    private String tennv;
    private String tenkh;
    private String ngaytao;
    private double tongtien;
    private double tienthuatrakhach;
    private int trangthai;

    public HoaDonViewModel() {
    }

    public HoaDonViewModel(String idhoadon, String mahoadon, String tennv, String tenkh, String ngaytao, double tongtien, double tienthuatrakhach, int trangthai) {
        this.idhoadon = idhoadon;
        this.mahoadon = mahoadon;
        this.tennv = tennv;
        this.tenkh = tenkh;
        this.ngaytao = ngaytao;
        this.tongtien = tongtien;
        this.tienthuatrakhach = tienthuatrakhach;
        this.trangthai = trangthai;
    }

    public String getIdhoadon() {
        return idhoadon;
    }

    public void setIdhoadon(String idhoadon) {
        this.idhoadon = idhoadon;
    }
    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    public double getTienthuatrakhach() {
        return tienthuatrakhach;
    }

    public void setTienthuatrakhach(double tienthuatrakhach) {
        this.tienthuatrakhach = tienthuatrakhach;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
}
