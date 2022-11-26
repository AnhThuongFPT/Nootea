/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import java.awt.Checkbox;

/**
 *
 * @author tuyen
 */
public class SanPhamViewModel {
    private String id;
    private String masp;
    private String tensp;
    private Checkbox select;
    
    public SanPhamViewModel() {
    }

    public SanPhamViewModel(String id, String masp, String tensp, Checkbox select) {
        this.id = id;
        this.masp = masp;
        this.tensp = tensp;
        this.select = select;
    }

    public SanPhamViewModel(String id, String masp, String tensp) {
        this.id = id;
        this.masp = masp;
        this.tensp = tensp;
    }

    public Checkbox getSelect() {
        return select;
    }

    public void setSelect(Checkbox select) {
        this.select = select;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }
    
}
