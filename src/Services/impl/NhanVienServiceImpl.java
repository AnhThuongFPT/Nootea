/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import domainModel.NhanVienModel;
import java.util.List;
import respository.NhanVienReposirory;
import service.NhanVienService;
import viewModel.NhanVienViewModel;

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

}
