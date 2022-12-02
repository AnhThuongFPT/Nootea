/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModels.HoaDonChiTietModel;
import Responsitories.HoaDonChiTietRepository;
import Services.HoaDonChiTietService;
import ViewModels.HoaDonChiTietViewModel;
import java.util.List;

/**
 *
 * @author tuyen
 */
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService{
    HoaDonChiTietRepository hdct= new HoaDonChiTietRepository();
    @Override
    public List<HoaDonChiTietViewModel> getall() {
        return hdct.getall();
    }

    @Override
    public int add(HoaDonChiTietModel hd) {
        return hdct.add(hd);
    }
    
}
