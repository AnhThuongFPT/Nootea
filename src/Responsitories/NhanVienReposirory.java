/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respository;

import domainModel.NhanVienModel;
import java.util.ArrayList;
import java.util.List;
import viewModel.NhanVienViewModel;
import java.sql.*;
import javax.swing.JOptionPane;
import ulity.Dbcontext;

/**
 *
 * @author tuyen
 */
public class NhanVienReposirory {

    public List<NhanVienViewModel> getallnv() {
        List<NhanVienViewModel> nv = new ArrayList<>();
        String sql = "select nv.Id, nv.Manv, nv.taiKhoan, nv.matKhau, nv.hoTen, nv.gioiTinh, nv.ngaySinh, nv.SDT, nv.diaChi,cv.Ten, nv.trangThai  from NhanVien nv join ChucVu cv on nv.IDCV = cv.Id ";
        try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql)) {
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String manv = rs.getString(2);
                String tk = rs.getString(3);
                String mk = rs.getString(4);
                String hoten = rs.getString(5);
                String gioitinh = rs.getString(6);
                String ngaysinh = rs.getString(7);
                String sdt = rs.getString(8);
                String diaChi = rs.getString(9);
                String tenchucvu = rs.getString(10);
                int trangthai = rs.getInt(11);
                NhanVienViewModel nv2 = new NhanVienViewModel(id, manv, tk, mk, hoten, gioitinh, ngaysinh, sdt, diaChi, tenchucvu, trangthai);
                nv.add(nv2);
            }
            return nv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public NhanVienViewModel getnvbyma(String ma) {
        NhanVienViewModel nv = null;
        String sql = "select nv.Id, nv.Manv, nv.taiKhoan, nv.matKhau, nv.hoTen, nv.gioiTinh, nv.ngaySinh, nv.SDT, nv.diaChi,cv.Ten, nv.trangThai  from NhanVien nv join ChucVu cv on nv.IDCV = cv.Id where nv.Manv = ?";
        try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql)) {
            ppstm.setObject(1, ma);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String iD = rs.getString(1);
                String manv = rs.getString(2);
                String tk = rs.getString(3);
                String mk = rs.getString(4);
                String hoten = rs.getString(5);
                String gioitinh = rs.getString(6);
                String ngaysinh = rs.getString(7);
                String sdt = rs.getString(8);
                String diaChi = rs.getString(9);
                String tenchucvu = rs.getString(10);
                int trangthai = rs.getInt(11);
                nv = new NhanVienViewModel(iD, manv, tk, mk, hoten, gioitinh, ngaysinh, sdt, diaChi, tenchucvu, trangthai);

            }
            return nv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public NhanVienModel getnvbyma2(String ma) {
        NhanVienModel nv = null;
        String sql = "select Id, manv, taiKhoan, matKhau, hoTen, gioiTinh, ngaySinh, SDT, diaChi, IDCV, trangThai from NhanVien where manv = ?";
        try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql)) {
            ppstm.setObject(1, ma);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String iD = rs.getString(1);
                String manv = rs.getString(2);
                String tk = rs.getString(3);
                String mk = rs.getString(4);
                String hoten = rs.getString(5);
                String gioitinh = rs.getString(6);
                String ngaysinh = rs.getString(7);
                String sdt = rs.getString(8);
                String diaChi = rs.getString(9);
                String idchucvu = rs.getString(10);
                int trangthai = rs.getInt(11);
                nv = new NhanVienModel(iD, manv, tk, mk, hoten, gioitinh, ngaysinh, sdt, diaChi, idchucvu, trangthai);

            }
            return nv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public NhanVienModel getnvbytk(String tk) {
        NhanVienModel nv = null;
        String sql = "select Id, manv, taiKhoan, matKhau, hoTen, gioiTinh, ngaySinh, SDT, diaChi, IDCV, trangThai from NhanVien where taikhoan = ?";
        try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql)) {
            ppstm.setObject(1, tk);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                String iD = rs.getString(1);
                String manv = rs.getString(2);
                String tK = rs.getString(3);
                String mk = rs.getString(4);
                String hoten = rs.getString(5);
                String gioitinh = rs.getString(6);
                String ngaysinh = rs.getString(7);
                String sdt = rs.getString(8);
                String diaChi = rs.getString(9);
                String idchucvu = rs.getString(10);
                int trangthai = rs.getInt(11);
                nv = new NhanVienModel(iD, manv, tK, mk, hoten, gioitinh, ngaysinh, sdt, diaChi, idchucvu, trangthai);

            }
            return nv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean checktrungma(String ma) {
        NhanVienModel nv2 = getnvbyma2(ma);
        if (nv2 == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checktrungtk(String tk) {
        NhanVienModel nv3 = getnvbytk(tk);
        if (nv3 == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean add(NhanVienModel nv) {

        if (checktrungma(nv.getManv())) {
            JOptionPane.showMessageDialog(null, "Đã tồn tại mã nhân viên");
            return false;
        } else if (checktrungtk(nv.getTentk())) {
            JOptionPane.showMessageDialog(null, "Đã tồn tại tài khoản");
            return false;
        } else {
            String sql = "insert into NhanVien(Manv, taiKhoan, matKhau, hoTen, gioiTinh, ngaySinh, SDT, diaChi, IDCV, trangThai) values (?,?,?,?,?,?,?,?,?,?)";
            try (
                    Connection con = Dbcontext.getconnect();
                    PreparedStatement ppstm = con.prepareStatement(sql);) {
                ppstm.setObject(1, nv.getManv());
                ppstm.setObject(2, nv.getTentk());
                ppstm.setObject(3, nv.getMk());
                ppstm.setObject(4, nv.getHoten());
                ppstm.setObject(5, nv.getGioitinh());
                ppstm.setObject(6, nv.getNgaysinh());
                ppstm.setObject(7, nv.getSdt());
                ppstm.setObject(8, nv.getDiachi());
                ppstm.setObject(9, nv.getIdcv());
                ppstm.setObject(10, nv.getTrangthai());

                ppstm.executeUpdate();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public boolean update(String id, NhanVienModel nv) {
        String sql = "update NhanVien set Manv = ?, taiKhoan = ?, matKhau = ?, hoTen = ?, gioiTinh = ?, ngaySinh =?, SDT = ?, diaChi = ?, IDCV = ?, trangThai = ? where Id = ? ";
        try (
                Connection con = Dbcontext.getconnect();
                PreparedStatement ppstm = con.prepareStatement(sql);) {
            ppstm.setObject(1, nv.getManv());
            ppstm.setObject(2, nv.getTentk());
            ppstm.setObject(3, nv.getMk());
            ppstm.setObject(4, nv.getHoten());
            ppstm.setObject(5, nv.getGioitinh());
            ppstm.setObject(6, nv.getNgaysinh());
            ppstm.setObject(7, nv.getSdt());
            ppstm.setObject(8, nv.getDiachi());
            ppstm.setObject(9, nv.getIdcv());
            ppstm.setObject(10, nv.getTrangthai());
            ppstm.setObject(11, id);
            ppstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String id) {
        String sql = "delete from NhanVien where Id = ?";
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
