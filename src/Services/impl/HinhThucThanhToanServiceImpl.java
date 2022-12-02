/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import Responsitories.HinhThucThanhToanRepository;
import Services.HinhThucThanhToanService;
import ViewModels.HinhThucThanhToanViewModel;
import java.util.List;

/**
 *
 * @author tuyen
 */
public class HinhThucThanhToanServiceImpl implements HinhThucThanhToanService{
    HinhThucThanhToanRepository httt = new HinhThucThanhToanRepository();
    @Override
    public List<HinhThucThanhToanViewModel> getall() {
        return httt.getall();
    }
    
}
