/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsitories;

import DomainModels.ChucVuModel;
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

    public ChucVuViewModel getcvbyma(String ma) {
        ChucVuViewModel cv = null;
        String sql = "select Id, MACV, Ten from ChucVu where MACV = ? ";
        try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql);) {
            ppstm.setObject(1, ma);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String macv = rs.getString(2);
                String tencv = rs.getString(3);
                cv = new ChucVuViewModel(id, macv, tencv);

            }
            return cv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public boolean add(ChucVuModel cv) {
        String sql = "insert into ChucVu(MACV, Ten) values (?,?)";
        try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql);) {
            ppstm.setObject(1, cv.getMacv());
            ppstm.setObject(2, cv.getTenchucvu());
            ppstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(String id, ChucVuModel cv) {
        String sql = "update ChucVu set MACV = ?, Ten = ? where Id = ?";
        try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql);) {
            ppstm.setObject(1, cv.getMacv());
            ppstm.setObject(2, cv.getTenchucvu());
            ppstm.setObject(3, id);
            ppstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String id) {
        String sql = "delete from ChucVu where Id = ?";
        try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql);) {
            ppstm.setObject(1, id);
            ppstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

//    public static void main(String[] args) {
//        List<ChucVuViewModel> cv = getallcv();
//        for (ChucVuViewModel x : cv) {
//            System.out.println(x.toString());
//        }
//
//    }

