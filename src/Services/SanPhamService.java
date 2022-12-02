/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModels.SanPham;
import java.util.List;
import viewModels.SanPhamViewModel;

/**
 *
 * @author tuyen
 */
public interface SanPhamService {
    public List<SanPhamViewModel> getallsp();
    public SanPhamViewModel getspbyma(String ma);
    public SanPham getspbyma1(String ma);
    public int add(SanPham sp);
    public int update(String id, SanPham sp);
    public int delete(String id);
}
