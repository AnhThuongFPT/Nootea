/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import Utilities.DBConnection;
import ViewModels.KhuyenMaiViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public class KhuyenMaiRepository {
      public ArrayList<KhuyenMaiViewModel> getAllKM(){
        ArrayList<KhuyenMaiViewModel> list=new ArrayList<>();
        String sql="select KhuyenMai.MAKM,tenCT,hinhThuc,TGBatDau,TGKetThuc,giamGia, "
                + "KhuyenMai.trangThai,KhuyenMai.moTa, SanPham.TenSP from KhuyenMai "
                + "join SanPham_KhuyenMai on KhuyenMai.ID = SanPham_KhuyenMai.IDKM "
                + "join SanPham on SanPham_KhuyenMai.IDSP = SanPham.ID";

        try(Connection con=DBConnection.getConnection();PreparedStatement ps=con.prepareStatement(sql)) {
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                KhuyenMaiViewModel kmvm=new KhuyenMaiViewModel();
                
                kmvm.setMaKM(rs.getString("MAKM"));
                kmvm.setTenKM(rs.getString("TenCT"));
                kmvm.setHinhThuc(rs.getString("HinhThuc"));
                kmvm.setGiamGia(rs.getFloat("giamGia"));
                kmvm.setThoiGianBatDau(rs.getDate("TGBatDau"));
                kmvm.setThoiGianKetThuc(rs.getDate("TGKetThuc"));
                kmvm.setTrangThai(rs.getInt("TrangThai"));
                kmvm.setMoTa(rs.getString("MoTa"));
                kmvm.setSanPham(rs.getString("TenSP"));
                
                list.add(kmvm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
//     public ArrayList<KhuyenMaiViewModel> getTimKiem(String maKM){
//        ArrayList<KhuyenMaiViewModel> list=new ArrayList<>();
//        String sql="select KhuyenMai.MAKM,tenCT,hinhThuc,TGBatDau,TGKetThuc,giamGia,KhuyenMai.trangThai,KhuyenMai.moTa "
//                + "from KhuyenMai where MaKM=?";
////                + "from KhuyenMai join SanPhamCT_KhuyenMai on KhuyenMai.Id=SanPhamCT_KhuyenMai.IDKM "
////                + "join SanPhamChiTiet on SanPhamChiTiet.id=SanPhamCT_KhuyenMai.IDSPCT "
////                + "join SanPham on SanPham.Id=SanPhamChiTiet.IDSP" ;
//        try(Connection con=DBConnection.getConnection();PreparedStatement ps=con.prepareStatement(sql)) {
//            ps.setObject(1, maKM);
//            ResultSet rs=ps.executeQuery();
//            
//            while(rs.next()){
//                KhuyenMaiViewModel kmvm=new KhuyenMaiViewModel();
//                
//                kmvm.setMaKM(rs.getString("MAKM"));
//                kmvm.setTenKM(rs.getString("tenCT"));
//                kmvm.setHinhThuc(rs.getString("hinhThuc"));
//                kmvm.setGiamGia(rs.getFloat("giamGia"));
//                kmvm.setThoiGianBatDau(rs.getDate("TGBatDau"));
//                kmvm.setThoiGianKetThuc(rs.getDate("TGKetThuc"));
//                kmvm.setTrangThai(rs.getInt("trangThai"));
//                kmvm.setMoTa(rs.getString("moTa"));
////                kmvm.setTenSP(rs.getString("Ten"));
//                
//                list.add(kmvm);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
    
//    public boolean add(KhuyenMaiViewModel kmvm){
//         String sql="insert into KhuyenMai(MAKM,tenCT,hinhThuc,TGBatDau,TGKetThuc, "
//                 + "giamGia,trangThai,moTa) values(?,?,?,?,?,?,?,?)";
//         try(Connection con=DBConnection.getConnection(); PreparedStatement ps=con.prepareStatement(sql)) {
//            
//             ps.setObject(1, kmvm.getMaKM());
//             ps.setObject(2, kmvm.getTenKM());
//             ps.setObject(3, kmvm.getHinhThuc());
//             ps.setObject(4, kmvm.getThoiGianBatDau());
//             ps.setObject(5, kmvm.getThoiGianKetThuc());
//             ps.setObject(6, kmvm.getGiamGia());
//             ps.setObject(7, kmvm.getTrangThai());
//             ps.setObject(8, kmvm.getMoTa());
//             
//             ps.executeUpdate();
//             return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//         return false;
//    }
//    public boolean update(KhuyenMaiViewModel kmvm, String maKM){
//         String sql="update KhuyenMai set tenCT=?,hinhThuc=?,TGBatDau=?,TGKetThuc=?,giamGia=?,trangThai=?,moTa=? where MaKM=? ";
//         try(Connection con=DBConnection.getConnection(); PreparedStatement ps=con.prepareStatement(sql)) {
//            
//             ps.setObject(1, kmvm.getTenKM());
//             ps.setObject(2, kmvm.getHinhThuc());
//             ps.setObject(3, kmvm.getThoiGianBatDau());
//             ps.setObject(4, kmvm.getThoiGianKetThuc());
//             ps.setObject(5, kmvm.getGiamGia());
//             ps.setObject(6, kmvm.getTrangThai());
//             ps.setObject(7, kmvm.getMoTa());
//             ps.setObject(8, maKM);
//             
//             ps.executeUpdate();
//             return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//         return false;
//    }
//    public boolean delete(String maKM){
//         String sql="delete from KhuyenMai where MaKM=? ";
//         try(Connection con=DBConnection.getConnection(); PreparedStatement ps=con.prepareStatement(sql)) {
//             
//             ps.setObject(1, maKM);
//             
//             ps.executeUpdate();
//             return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//         return false;
//    }
}
