/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModels.HoaDonModel;
import Responsitories.HoaDonRepository;
import Services.HoaDonService;
import ViewModels.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author tuyen
 */
public class HoaDonServiceImpl implements HoaDonService {

    HoaDonRepository hd = new HoaDonRepository();

    @Override
    public List<HoaDonViewModel> getall() {
        return hd.getall();
    }

    @Override
    public int add(HoaDonModel hd) {
        return this.hd.add(hd);
    }

}
