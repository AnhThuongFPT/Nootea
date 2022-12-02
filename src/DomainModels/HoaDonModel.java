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
public class HoaDonModel {
    private String id;
    private String mahd;
    private String idnv;
    private String idkh;
    private String ngaytao;
    private String idtt;
    private double tongtien;
    private double tienthuatrakhach;
    private int trangthai;

    public HoaDonModel() {
    }

    public HoaDonModel(String id, String mahd, String idnv, String idkh, String ngaytao, String idtt, double tongtien, double tienthuatrakhach, int trangthai) {
        this.id = id;
        this.mahd = mahd;
        this.idnv = idnv;
        this.idkh = idkh;
        this.ngaytao = ngaytao;
        this.idtt = idtt;
        this.tongtien = tongtien;
        this.tienthuatrakhach = tienthuatrakhach;
        this.trangthai = trangthai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getIdnv() {
        return idnv;
    }

    public void setIdnv(String idnv) {
        this.idnv = idnv;
    }

    public String getIdkh() {
        return idkh;
    }

    public void setIdkh(String idkh) {
        this.idkh = idkh;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getIdtt() {
        return idtt;
    }

    public void setIdtt(String idtt) {
        this.idtt = idtt;
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
