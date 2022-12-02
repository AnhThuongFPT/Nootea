/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsitories;

import DomainModels.SanPham;
import Utilities.Dbcontext;
import Utilities.JDBC_Helper;
import java.util.ArrayList;
import java.util.List;

import java.sql.*;
import javax.swing.JOptionPane;
import viewModels.SanPhamViewModel;

/**
 *
 * @author tuyen
 */
public class SanPhamRepository {

    public List<SanPhamViewModel> getallsp() {
        List<SanPhamViewModel> sp = new ArrayList<>();
        String sql = "select ID, MaSP, TenSP, Gia, HinhAnh, TrangThai from SanPham";
        try {
            ResultSet rs = JDBC_Helper.selectTongQuat(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String tensp = rs.getString(3);
                double gia = rs.getDouble(4);
                String hinhanh = rs.getString(5);
                int trangthai = rs.getInt(6);
                SanPhamViewModel sp2 = new SanPhamViewModel(id, ma, tensp, gia, hinhanh, trangthai);
                sp.add(sp2);
            }
            return sp;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public SanPhamViewModel getspbyma(String ma) {
        SanPhamViewModel sp = null;
        String sql = "select ID, MaSP, TenSP, Gia, HinhAnh, TrangThai from SanPham where MaSP = ?";
        try {
            ResultSet rs = JDBC_Helper.selectTongQuat(sql, ma);
            while (rs.next()) {
                String id = rs.getString(1);
                String mA = rs.getString(2);
                String tensp = rs.getString(3);
                double gia = rs.getDouble(4);
                String hinhanh = rs.getString(5);
                int trangthai = rs.getInt(6);
                sp = new SanPhamViewModel(id, mA, tensp, gia, hinhanh, trangthai);

            }
            return sp;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public SanPham getspbyma1(String ma) {
        SanPham sp = null;
        String sql = "select ID, MaSP, TenSP, Gia, HinhAnh, TrangThai from SanPham where MaSP = ?";
        try {
            ResultSet rs = JDBC_Helper.selectTongQuat(sql, ma);
            while (rs.next()) {
                String id = rs.getString(1);
                String mA = rs.getString(2);
                String tensp = rs.getString(3);
                double gia = rs.getDouble(4);
                String hinhanh = rs.getString(5);
                int trangthai = rs.getInt(6);
                sp = new SanPham(id, mA, tensp, gia, hinhanh, trangthai);

            }
            return sp;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean add(SanPham sp) {
        String sql = "insert into SanPham ( MaSP, TenSP, Gia, HinhAnh, TrangThai)\n"
                + "values (?,?,?,?,?)";
        if (checktrungma(sp.getMaSP())) {
            JOptionPane.showMessageDialog(null, "Đã có sản phẩm đó");
            return false;
        } else {
            JDBC_Helper.updateTongQuat(sql, sp.getMaSP(), sp.getTen(), sp.getGia(), sp.getHinhanh(), sp.getTrangthai());
            return true;
        }
    }

    public boolean checktrungma(String ma) {
        if (getspbyma(ma) == null) {
            return false;
        } else {
            return true;
        }
    }

    public int update(String id, SanPham sp) {
        String sql = "update SanPham set MaSP = ?, TenSP = ?, Gia = ?, HinhAnh = ?, TrangThai = ? where ID = ?";
        return JDBC_Helper.updateTongQuat(sql, sp.getMaSP(), sp.getTen(), sp.getGia(), sp.getHinhanh(), sp.getTrangthai(), id);
    }

    public int delete(String id) {
        String sql = "delete from SanPham where Id = ?";
        return JDBC_Helper.updateTongQuat(sql, id);
    }
}
