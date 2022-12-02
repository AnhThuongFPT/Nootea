/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModels.HoaDonChiTietModel;
import ViewModels.HoaDonChiTietViewModel;
import java.util.List;

/**
 *
 * @author tuyen
 */
public interface HoaDonChiTietService {
    public List<HoaDonChiTietViewModel> getall();
    public int add(HoaDonChiTietModel hd);
}
