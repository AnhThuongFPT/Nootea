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
import viewModel.SanPhamViewModel;

/**
 *
 * @author tuyen
 */
public class SanPhamServiceImpl implements SanPhamService{
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
        if(check){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String update(String id, SanPham sp) {
        boolean check = this.sp.update(id, sp);
        if(check){
            return "Update thành công";
        }else{
            return "Update thất bại";
        }
    }

    @Override
    public String delete(String id) {
        boolean check = this.sp.delete(id);
        if(check){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }
    }
    
}
