/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModels.NhanVienModel;
import java.util.List;
import viewModels.NhanVienViewModel;


/**
 *
 * @author tuyen
 */
public interface NhanVienService {
    public List<NhanVienViewModel> getallnv();
    public NhanVienViewModel getnvbyma(String ma);
    public int add(NhanVienModel nv);
    public String update(String id, NhanVienModel nv);
    public String delete(String id);
    
}
