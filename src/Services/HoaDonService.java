/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModels.HoaDonModel;
import ViewModels.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author tuyen
 */
public interface HoaDonService {
    public List<HoaDonViewModel> getall();
    public int add(HoaDonModel hd);
    
}
