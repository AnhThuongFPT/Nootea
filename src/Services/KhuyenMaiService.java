/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.SanPhamKhuyenMai;
import ViewModels.KhuyenMaiViewModel;
import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public interface KhuyenMaiService {

    public ArrayList<KhuyenMaiViewModel> getAllKM();

    public boolean add(KhuyenMaiViewModel kmvm);

    public boolean update(KhuyenMaiViewModel kmvm, String maKM);

    public boolean delete(String maKM);

    public boolean addTableChung(SanPhamKhuyenMai spkm);
}
