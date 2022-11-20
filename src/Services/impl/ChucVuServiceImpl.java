/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

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

}
