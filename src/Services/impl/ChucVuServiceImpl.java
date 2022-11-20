/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import domainModel.ChucVuModel;
import java.util.List;
import respository.ChucVuRespository;
import service.ChucVuService;
import viewModel.ChucVuViewModel;

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
