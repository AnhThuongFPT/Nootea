/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.SanPhamKhuyenMai;
import Responsitories.KhuyenMaiRepository;
import Services.KhuyenMaiService;
import ViewModels.KhuyenMaiViewModel;
import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public class KhuyenMaiServiceImpl implements KhuyenMaiService{
    private KhuyenMaiRepository kmr=new KhuyenMaiRepository();

    @Override
    public ArrayList<KhuyenMaiViewModel> getAllKM() {
        return kmr.getAllKM();
    }

    @Override
    public boolean add(KhuyenMaiViewModel kmvm) {
        return kmr.add(kmvm);
    }

    @Override
    public boolean update(KhuyenMaiViewModel kmvm, String maKM) {
        return kmr.update(kmvm, maKM);
    }

    @Override
    public boolean delete(String maKM) {
        return kmr.delete(maKM);
    }

    @Override
    public boolean addTableChung(SanPhamKhuyenMai spkm) {
        return kmr.addTableChung(spkm);
    }
    
}
