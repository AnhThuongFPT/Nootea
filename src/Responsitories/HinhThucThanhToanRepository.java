/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsitories;

import Utilities.JDBC_Helper;
import ViewModels.HinhThucThanhToanViewModel;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author tuyen
 */
public class HinhThucThanhToanRepository {

    public List<HinhThucThanhToanViewModel> getall() {
        List<HinhThucThanhToanViewModel> httt = new ArrayList<>();
        ResultSet rs = null;
        String sql = "select Id,  MAHTTT, Ten from HinhThucThanhToan";
        try {
            rs = JDBC_Helper.selectTongQuat(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String ten = rs.getString(3);
                HinhThucThanhToanViewModel httt2 = new HinhThucThanhToanViewModel(id, ma, ten);
                httt.add(httt2);
            }
            return httt;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
