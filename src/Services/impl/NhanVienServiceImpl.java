/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModels.NhanVienModel;
import java.util.List;
import Responsitories.NhanVienReposirory;
import Services.NhanVienService;
import viewModels.NhanVienViewModel;


/**
 *
 * @author tuyen
 */
public class NhanVienServiceImpl implements NhanVienService {

    NhanVienReposirory nvimpl = new NhanVienReposirory();

    @Override
    public List<NhanVienViewModel> getallnv() {
        return nvimpl.getallnv();
    }

    @Override
    public NhanVienViewModel getnvbyma(String ma) {
        return nvimpl.getnvbyma(ma);
    }

    @Override
    public int add(NhanVienModel nv) {
        boolean check = nvimpl.add(nv);
        if(check){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String update(String id, NhanVienModel nv) {
        boolean check = nvimpl.update(id, nv);
        if (check) {
            return "Update thành công";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public String delete(String id) {
        boolean check = nvimpl.delete(id);
        if (check) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public NhanVienModel getnvbytk(String tk) {
        return nvimpl.getnvbytk(tk);
    }

}
