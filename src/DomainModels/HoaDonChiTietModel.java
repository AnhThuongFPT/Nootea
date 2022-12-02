/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModels;

/**
 *
 * @author tuyen
 */
public class HoaDonChiTietModel {
    private String id;
    private String idhd;
    private String idsp;
    private double giasp;
    private int sl;
    private int trangthai;

    public HoaDonChiTietModel() {
    }

    public HoaDonChiTietModel(String id, String idhd, String idsp, double giasp, int sl, int trangthai) {
        this.id = id;
        this.idhd = idhd;
        this.idsp = idsp;
        this.giasp = giasp;
        this.sl = sl;
        this.trangthai = trangthai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdhd() {
        return idhd;
    }

    public void setIdhd(String idhd) {
        this.idhd = idhd;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
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

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
}
