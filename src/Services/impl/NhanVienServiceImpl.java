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
    public NhanVienModel getnvbytk(String tk) {
        return nvimpl.getnvbytk(tk);
    }

    @Override
    public int add(NhanVienModel nv) {
        boolean check = this.nvimpl.add(nv);
        if (check) {
            return 1;
        } else {
            return 0;
        }

    }

    @Override
    public int update(String id, NhanVienModel nv) {
        return nvimpl.update(id, nv);
    }

    @Override
    public int delete(String id) {
        return nvimpl.delete(id);
    }

}
