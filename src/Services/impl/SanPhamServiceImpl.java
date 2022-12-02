/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.impl;

import DomainModels.SanPham;
import java.util.List;
import Responsitories.SanPhamRepository;
import Services.SanPhamService;

import viewModels.SanPhamViewModel;

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
    public SanPham getspbyma1(String ma) {
        return this.sp.getspbyma1(ma);
    }

}
