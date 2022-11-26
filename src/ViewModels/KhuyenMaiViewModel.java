/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.Date;

/**
 *
 * @author TGDD
 */
public class KhuyenMaiViewModel {

    private String maKM;
    private String tenKM;
    private String hinhThuc;
    private float giamGia;
    private String sanPham;
    private Date thoiGianBatDau;
    private Date thoiGianKetThuc;
    private int trangThai;
    private String moTa;

    public KhuyenMaiViewModel() {
    }

    public KhuyenMaiViewModel(String maKM, String tenKM, String hinhThuc, float giamGia, String sanPham, Date thoiGianBatDau, Date thoiGianKetThuc, int trangThai, String moTa) {
        this.maKM = maKM;
        this.tenKM = tenKM;
        this.hinhThuc = hinhThuc;
        this.giamGia = giamGia;
        this.sanPham = sanPham;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.trangThai = trangThai;
        this.moTa = moTa;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getTenKM() {
        return tenKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public Date getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(Date thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public Date getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Date thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String trangThai(){
        if(this.trangThai==0){
            return "Đang áp dụng";
        }
        else if(this.trangThai==1){
            return "Chưa áp dụng";
        }
        else{
            return "Hết hạn";
        }
    }
    
}
