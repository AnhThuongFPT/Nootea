/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsitories;

import DomainModels.HoaDonChiTietModel;
import Utilities.JDBC_Helper;
import ViewModels.HoaDonChiTietViewModel;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author tuyen
 */
public class HoaDonChiTietRepository {

    public List<HoaDonChiTietViewModel> getall() {
        List<HoaDonChiTietViewModel> hd = new ArrayList<>();
        ResultSet rs = null;
        String sql = "select hd.MaHD,sp.TenSP, hdct.DonGia, hdct.SoLuong from HoaDonChiTiet hdct join HoaDon hd on hdct.IDHD = hd.ID join SanPham sp on hdct.IDSP = sp.ID";
        try {
            rs = JDBC_Helper.selectTongQuat(sql);
            while (rs.next()) {                
                String mahd = rs.getString(1);
                String tensp = rs.getString(2);
                double dongia = rs.getDouble(3);
                int sl = rs.getInt(4);
                HoaDonChiTietViewModel hd2 = new HoaDonChiTietViewModel(mahd, tensp, dongia, sl);
                hd.add(hd2);
            }
            return hd;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int add(HoaDonChiTietModel hd) {
        String sql = "insert into HoaDonChiTiet(IDHD, IDSP, DonGia, SoLuong)\n"
                + "values(?,?,?,?)";
        return JDBC_Helper.updateTongQuat(sql, hd.getIdhd(),hd.getIdsp(),hd.getGiasp(),hd.getSl());
    }
}
