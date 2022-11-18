package Services.impl;

import DomainModels.SanPhamChiTiet;
import Responsitories.SPCT_Repository;
import Responsitories.impl.SPCT_RepositoryImpl;
import Services.SPCT_Service;
import ViewModels.SPCT_Response;
import java.util.List;

public class SPCT_ServiceImpl implements SPCT_Service{
    private SPCT_Repository SPCTRepository = new SPCT_RepositoryImpl();
    @Override
    public List<SPCT_Response> getALL() {
        return SPCTRepository.getALL();
    }

    @Override
    public SanPhamChiTiet getSPCT(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String them(SanPhamChiTiet spct) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(String ma, SanPhamChiTiet spct) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
