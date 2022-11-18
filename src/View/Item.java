package View;

import ViewModels.SPCT_Response;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Item extends javax.swing.JPanel {
    private boolean selected;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    
    public Item() {
        initComponents();
        setOpaque(false);
    }
    
    private SPCT_Response data;
    public void setData(SPCT_Response data) {
        this.data = data;   
        hinhAnh.setImage();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(242, 242, 242));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        g2.dispose();
        super.paint(g); 
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDonGia = new javax.swing.JLabel();
        lbLoaiSP = new javax.swing.JLabel();
        hinhAnh = new View.PictureBox();
        lbTenSP1 = new javax.swing.JLabel();
        lbSize = new javax.swing.JLabel();

        lbDonGia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbDonGia.setForeground(new java.awt.Color(76, 76, 76));
        lbDonGia.setText("0 VNÐ");

        lbLoaiSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbLoaiSP.setForeground(new java.awt.Color(178, 178, 178));
        lbLoaiSP.setText("Item name");

        hinhAnh.setImage(new javax.swing.ImageIcon(getClass().getResource("/Image/TraSuaBacHa.png"))); // NOI18N

        lbTenSP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTenSP1.setForeground(new java.awt.Color(76, 76, 76));
        lbTenSP1.setText("Item name");

        lbSize.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbSize.setForeground(new java.awt.Color(114, 114, 114));
        lbSize.setText("M");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLoaiSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTenSP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(hinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSize)
                .addGap(29, 29, 29)
                .addComponent(lbDonGia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTenSP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLoaiSP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDonGia)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSize))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.PictureBox hinhAnh;
    private javax.swing.JLabel lbDonGia;
    private javax.swing.JLabel lbLoaiSP;
    private javax.swing.JLabel lbSize;
    private javax.swing.JLabel lbTenSP1;
    // End of variables declaration//GEN-END:variables
}
