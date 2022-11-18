package Responsitories;

import DomainModels.SanPhamChiTiet;
import ViewModels.SPCT_Response;
import java.util.List;

/**
 *
 * @author thuon
 */
public interface SPCT_Repository {
    
    List<SPCT_Response> getALL();
    
    SanPhamChiTiet getSPCT(String ma);
    
    int them(SanPhamChiTiet spct);
    
    int update (String ma, SanPhamChiTiet spct);
    
    int delete (String ma);
}
