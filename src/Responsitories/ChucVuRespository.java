/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsitories;

import Utilities.Dbcontext;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import viewModels.ChucVuViewModel;

/**
 *
 * @author tuyen
 */
public class ChucVuRespository {

    public List<ChucVuViewModel> getallcv() {
        List<ChucVuViewModel> cv = new ArrayList<>();
        String sql = "select Id, MACV, Ten from ChucVu";
        try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql);) {
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String macv = rs.getString(2);
                String tencv = rs.getString(3);
                ChucVuViewModel cv2 = new ChucVuViewModel(id, macv, tencv);
                cv.add(cv2);
            }
            return cv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

//    public static void main(String[] args) {
//        List<ChucVuViewModel> cv = getallcv();
//        for (ChucVuViewModel x : cv) {
//            System.out.println(x.toString());
//        }
//
//    }
}
