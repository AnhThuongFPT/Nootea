/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModels.SanPham;
import java.util.List;
import Responsitories.SanPhamRepository;
import Services.SanPhamService;
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
public class SanPhamServiceImpl implements SanPhamService {

    SanPhamRepository sp = new SanPhamRepository();

    @Override
    public List<SanPhamViewModel> getallsp() {
        return sp.getallsp();
    }

    @Override
    public SanPhamViewModel getspbyma(String ma) {
        return sp.getspbyma(ma);
    }

    @Override
    public int add(SanPham sp) {
        boolean check = this.sp.add(sp);
        if (check) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int update(String id, SanPham sp) {
        return this.sp.update(id, sp);
    }

    @Override
    public int delete(String id) {
        return this.sp.delete(id);
    }

    @Override
<<<<<<< HEAD
    public SanPham getspbyma1(String ma) {
        return this.sp.getspbyma1(ma);
    }

=======
    public ArrayList<SanPhamViewModel> getSPKM() {
        return sp.getSPKM();
    }

   
    
>>>>>>> 228052f06dd401541c08ecbe466f429217f14f1d
}
