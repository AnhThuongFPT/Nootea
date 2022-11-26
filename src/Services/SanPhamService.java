/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModels.SanPham;
import java.util.List;
import ViewModels.SanPhamViewModel;
import java.util.ArrayList;

/**
 *
 * @author tuyen
 */
public interface SanPhamService {
    public List<SanPhamViewModel> getallsp();
    public SanPhamViewModel getspbyma(String ma);
    public int add(SanPham sp);
    public String update(String id, SanPham sp);
    public String delete(String id);
    public ArrayList<SanPhamViewModel> getSPKM();
}
