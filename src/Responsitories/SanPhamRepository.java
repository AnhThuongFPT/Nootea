/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsitories;

import DomainModels.SanPham;
import Utilities.DBConnection;
import Utilities.Dbcontext;
import java.util.ArrayList;
import java.util.List;
import ViewModels.SanPhamViewModel;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author tuyen
 */
public class SanPhamRepository {

    public List<SanPhamViewModel> getallsp() {
        List<SanPhamViewModel> sp = new ArrayList<>();
        String sql = "select Id, MASP, Ten from SanPham";
        try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql);) {
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String tensp = rs.getString(3);
                SanPhamViewModel sp2 = new SanPhamViewModel(id, ma, tensp);
                sp.add(sp2);
            }
            return sp;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<SanPhamViewModel> getSPKM() {
        ArrayList<SanPhamViewModel> list = new ArrayList<>();
        String sql = "select MASP, TenSP from SanPham";
        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ppstm = con.prepareStatement(sql);) {
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                SanPhamViewModel spvm=new SanPhamViewModel();
                spvm.setMasp(rs.getString("MaSP"));
                spvm.setTensp(rs.getString("TenSP"));
                list.add(spvm);
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public SanPhamViewModel getspbyma(String ma) {
        SanPhamViewModel sp = null;
        String sql = "select id, MASP, Ten from SanPham where MASP = ?";
        try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql);) {
            ppstm.setObject(1, ma);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String mA = rs.getString(2);
                String ten = rs.getString(3);
                sp = new SanPhamViewModel(id, mA, ten);
            }
            return sp;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean add(SanPham sp) {
        String sql = "insert into SanPham (MASP, Ten) values (?,?)";
        if(checktrungma(sp.getMaSP())){
            JOptionPane.showMessageDialog(null, "Đã có sản phẩm đó");
            return false;
        }else{
            try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql);) {
            ppstm.setObject(1, sp.getMaSP());
            ppstm.setObject(2, sp.getTen());
            ppstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        }
    }
    public boolean checktrungma(String ma){
        if(getspbyma(ma)==null){
            return false;
        }else{
            return true;
        }
    }
    public boolean update(String id, SanPham sp) {
        String sql = "update SanPham set MASP = ?, Ten = ? where Id = ?";
        try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql);) {
            ppstm.setObject(1, sp.getMaSP());
            ppstm.setObject(2, sp.getMaSP());
            ppstm.setObject(3, id);
            ppstm.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String id) {
        String sql = "delete from SanPham where Id = ?";
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
