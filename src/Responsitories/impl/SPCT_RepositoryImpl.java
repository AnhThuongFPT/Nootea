package Responsitories.impl;

import DomainModels.SanPhamChiTiet;
import Responsitories.SPCT_Repository;
import Utilities.JDBC_Helper;
import ViewModels.SPCT_Response;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class SPCT_RepositoryImpl implements SPCT_Repository{

    @Override
    public List<SPCT_Response> getALL() {
        List<SPCT_Response> listSPCT = new ArrayList<>();
        String sql = "SELECT SanPhamChiTiet.Id, SanPham.Ten 'tenSP', hinhAnh, kichThuoc, LoaiSanPham.Ten 'tenLoai', donGia\n" +
                     "FROM [dbo].[SanPhamChiTiet] join SanPham on SanPhamChiTiet.IDSP = SanPham.Id\n" +
                                                 "join LoaiSanPham on SanPhamChiTiet.IDLSP = LoaiSanPham.Id";
        ResultSet rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {           
                SPCT_Response spct = new SPCT_Response();
                spct.setID(rs.getString("Id"));
                spct.setTenSP(rs.getString("tenSP"));
                spct.setSize(rs.getString("kichThuoc"));
                spct.setLoai(rs.getString("tenLoai"));
                spct.setDonGia(rs.getDouble("donGia"));
                spct.setHinhAnh(rs.getString("hinhAnh"));
                listSPCT.add(spct);
            }
            return listSPCT;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public SanPhamChiTiet getSPCT(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int them(SanPhamChiTiet spct) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(String ma, SanPhamChiTiet spct) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
