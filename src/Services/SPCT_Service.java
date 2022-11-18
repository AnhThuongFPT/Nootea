package Services;

import DomainModels.SanPhamChiTiet;
import ViewModels.SPCT_Response;
import java.util.List;

public interface SPCT_Service {
    List<SPCT_Response> getALL();
    
    SanPhamChiTiet getSPCT(String ma);
    
    String them(SanPhamChiTiet spct);
    
    String update (String ma, SanPhamChiTiet spct);
    
    String delete (String ma);
}
