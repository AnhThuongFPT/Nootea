/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModels.ChucVuModel;
import Responsitories.ChucVuRespository;
import Services.ChucVuService;


import java.util.List;
import viewModels.ChucVuViewModel;

/**
 *
 * @author tuyen
 */
public class ChucVuServiceImpl implements ChucVuService {

    ChucVuRespository cv = new ChucVuRespository();

    @Override
    public List<ChucVuViewModel> getallcv() {
        return cv.getallcv();
    }

    @Override
    public ChucVuViewModel getcvbyma(String ma) {
        return cv.getcvbyma(ma);
    }

    @Override
    public int add(ChucVuModel cv) {
        boolean check = this.cv.add(cv);
        if (check) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String update(String id, ChucVuModel cv) {
        boolean check = this.cv.update(id, cv);
        if (check) {
            return "Update thành công";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public String delete(String id) {
        boolean check = this.cv.delete(id);
        if (check) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

}
