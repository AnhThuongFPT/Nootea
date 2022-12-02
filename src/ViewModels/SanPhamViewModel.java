/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
package viewModels;
=======
package ViewModels;

import java.awt.Checkbox;
>>>>>>> 228052f06dd401541c08ecbe466f429217f14f1d

/**
 *
 * @author tuyen
 */
public class SanPhamViewModel {
<<<<<<< HEAD

    private String ID;
    private String maSP;
    private String ten;
    private double gia;
    private String hinhanh;
    private int trangthai;

    public SanPhamViewModel() {
    }

    public SanPhamViewModel(String ID, String maSP, String ten, double gia, String hinhanh, int trangthai) {
        this.ID = ID;
        this.maSP = maSP;
        this.ten = ten;
        this.gia = gia;
        this.hinhanh = hinhanh;
        this.trangthai = trangthai;
    }

    public String getID() {
        return ID;
=======
    private String id;
    private String masp;
    private String tensp;
    private Checkbox select;
    
    public SanPhamViewModel() {
    }

    public SanPhamViewModel(String id, String masp, String tensp, Checkbox select) {
        this.id = id;
        this.masp = masp;
        this.tensp = tensp;
        this.select = select;
    }

    public SanPhamViewModel(String id, String masp, String tensp) {
        this.id = id;
        this.masp = masp;
        this.tensp = tensp;
    }

    public Checkbox getSelect() {
        return select;
    }

    public void setSelect(Checkbox select) {
        this.select = select;
    }

    public String getId() {
        return id;
>>>>>>> 228052f06dd401541c08ecbe466f429217f14f1d
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

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

}
