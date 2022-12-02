/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModels.SanPham;
import java.util.List;
<<<<<<< HEAD
import viewModels.SanPhamViewModel;
=======
import ViewModels.SanPhamViewModel;
import java.util.ArrayList;
>>>>>>> 228052f06dd401541c08ecbe466f429217f14f1d

/**
 *
 * @author tuyen
 */
public interface SanPhamService {
    public List<SanPhamViewModel> getallsp();
    public SanPhamViewModel getspbyma(String ma);
    public SanPham getspbyma1(String ma);
    public int add(SanPham sp);
<<<<<<< HEAD
    public int update(String id, SanPham sp);
    public int delete(String id);
=======
    public String update(String id, SanPham sp);
    public String delete(String id);
    public ArrayList<SanPhamViewModel> getSPKM();
>>>>>>> 228052f06dd401541c08ecbe466f429217f14f1d
}
