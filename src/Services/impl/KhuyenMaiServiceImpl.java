/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

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
    
}
