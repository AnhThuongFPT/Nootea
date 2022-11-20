/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewModel;

/**
 *
 * @author tuyen
 */
public class ChucVuViewModel {

    private String id;
    private String manv;
    private String tenchucvu;

    public ChucVuViewModel() {
    }

    public ChucVuViewModel(String id, String manv, String tenchucvu) {
        this.id = id;
        this.manv = manv;
        this.tenchucvu = tenchucvu;
    }

    public String getId() {
        return id;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

    @Override
    public String toString() {
        return "ChucVuViewModel{" + "id=" + id + ", manv=" + manv + ", tenchucvu=" + tenchucvu + '}';
    }

    

}
