/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsitories;

import DomainModels.HoaDonModel;
import Utilities.JDBC_Helper;
import ViewModels.HoaDonViewModel;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author tuyen
 */
public class HoaDonRepository {

    public List<HoaDonViewModel> getall() {
        List<HoaDonViewModel> hd = new ArrayList<>();
        String sql = "select hd.ID, hd.MaHD, nv.HoTen, kh.hoTen, hd.NgayTao, hd.TongTien,hd.tienThuaTraKhach, hd.TrangThai   from HoaDon hd join NhanVien nv on hd.IDNV = nv.ID join KhachHang kh on hd.IDKH = kh.ID";
        ResultSet rs = null;
        try {
            rs = JDBC_Helper.selectTongQuat(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String mahd = rs.getString(2);
                String hotennv = rs.getString(3);
                String hotenkh = rs.getString(4);
                String ngaytao = rs.getString(5);
                double tongtien = rs.getDouble(6);
                double tienthua = rs.getDouble(7);
                int trangthai = rs.getInt(7);
                HoaDonViewModel hd2 = new HoaDonViewModel(id, mahd, hotennv, hotenkh, ngaytao, tongtien, tienthua, trangthai);
                hd.add(hd2);
            }
            return hd;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int add(HoaDonModel hd) {
        String sql = "insert into HoaDon (MaHD, IDNV,IDKH, NgayTao, TongTien, tienThuaTraKhach, IDHTTT, TrangThai)\n"
                + "values (?,?,?,?,?,?,?,?)";
        return JDBC_Helper.updateTongQuat(sql, hd.getMahd(), hd.getIdnv(), hd.getIdkh(), hd.getNgaytao(), hd.getTongtien(), hd.getTienthuatrakhach(),hd.getIdtt(), hd.getTrangthai());
    }
}
