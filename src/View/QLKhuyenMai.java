/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import DomainModels.SanPham;
import Services.KhuyenMaiService;
import Services.SanPhamService;
import Services.impl.KhuyenMaiServiceImpl;
import ViewModels.KhuyenMaiViewModel;
import ViewModels.SanPhamViewModel;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import services.impl.SanPhamServiceImpl;

public class QLKhuyenMai extends javax.swing.JInternalFrame {

    private KhuyenMaiService khuyenMaiService = new KhuyenMaiServiceImpl();
    private SanPhamService sanPhamService =new SanPhamServiceImpl();
    private DefaultTableModel defaultTableModel;
    private DefaultComboBoxModel defaultComboBoxModel;

    public QLKhuyenMai() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        loadTableKM(khuyenMaiService.getAllKM());
        loadTableSP(sanPhamService.getSPKM());
    }
     public void loadTableKM(ArrayList<KhuyenMaiViewModel> list) {
        defaultTableModel = (DefaultTableModel) tblKhuyenMai.getModel();
        defaultTableModel.setRowCount(0);

        for (KhuyenMaiViewModel khuyenMaiViewModel : list) {
            if(khuyenMaiViewModel.getHinhThuc().equalsIgnoreCase("Theo %")){
                 defaultTableModel.addRow(new Object[]{
                khuyenMaiViewModel.getMaKM(), khuyenMaiViewModel.getTenKM(), khuyenMaiViewModel.getHinhThuc(),
                khuyenMaiViewModel.getGiamGia()+" %",khuyenMaiViewModel.getSanPham(), khuyenMaiViewModel.getThoiGianBatDau(),
                khuyenMaiViewModel.getThoiGianKetThuc(), khuyenMaiViewModel.trangThai(), khuyenMaiViewModel.getMoTa()
            });
            }
            else{
                 defaultTableModel.addRow(new Object[]{
                khuyenMaiViewModel.getMaKM(), khuyenMaiViewModel.getTenKM(), khuyenMaiViewModel.getHinhThuc(),
                khuyenMaiViewModel.getGiamGia()+" VNĐ",khuyenMaiViewModel.getSanPham(), khuyenMaiViewModel.getThoiGianBatDau(),
                khuyenMaiViewModel.getThoiGianKetThuc(), khuyenMaiViewModel.trangThai(), khuyenMaiViewModel.getMoTa()
            });
            }
           
        }
       
    }
      public void loadTableSP(ArrayList<SanPhamViewModel> list) {
        defaultTableModel = (DefaultTableModel) tblDanhSachSP.getModel();
        defaultTableModel.setRowCount(0);
          
          for (SanPhamViewModel sanPhamViewModel : list) {
              defaultTableModel.addRow(new Object[]{
                sanPhamViewModel.getSelect(),sanPhamViewModel.getMasp(),sanPhamViewModel.getTensp()
            });
          }  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbbHinhThucKM = new javax.swing.JComboBox<>();
        txtMaKM = new javax.swing.JTextField();
        txtMucKM = new javax.swing.JTextField();
        txtTenKM = new javax.swing.JTextField();
        txtTGBatDau = new javax.swing.JTextField();
        txtTGKetThuc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLamMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachSP = new javax.swing.JTable();
        rdoDangApDung = new javax.swing.JRadioButton();
        rdoChuaApDung = new javax.swing.JRadioButton();
        rdoHetHan = new javax.swing.JRadioButton();
        ckbSelectAll = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKhuyenMai = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1322, 817));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chương Trình Khuyến Mại", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Mã chương trình khuyến mại");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Hình thức khuyến mại");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Tên chương trình khuyến mại");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Mức khuyến mại");

        cbbHinhThucKM.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbbHinhThucKM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giảm theo %", "Giảm theo tiền" }));

        txtMucKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMucKMActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Trạng thái");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Mô tả");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Thời gian kết thúc khuyến mại");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Thời gian bắt đầu khuyến mại");

        btnLamMoi.setBackground(new java.awt.Color(255, 255, 153));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLamMoi.setText("Làm mới");

        btnThem.setBackground(new java.awt.Color(255, 255, 153));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 255, 153));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setBackground(new java.awt.Color(255, 255, 153));
        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        tblDanhSachSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Mã sản phẩm", "Tên sản phẩm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDanhSachSP);

        buttonGroup1.add(rdoDangApDung);
        rdoDangApDung.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoDangApDung.setText("Đang áp dụng");

        buttonGroup1.add(rdoChuaApDung);
        rdoChuaApDung.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoChuaApDung.setText("Chưa áp dụng");

        buttonGroup1.add(rdoHetHan);
        rdoHetHan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoHetHan.setText("Hết hạn");

        ckbSelectAll.setText("Select All");
        ckbSelectAll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbSelectAllItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaKM)
                        .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbbHinhThucKM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMucKM, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addComponent(txtTGBatDau)
                    .addComponent(txtTGKetThuc)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoDangApDung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoChuaApDung)
                        .addGap(18, 18, 18)
                        .addComponent(rdoHetHan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ckbSelectAll)
                        .addGap(426, 426, 426))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbHinhThucKM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMucKM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTGBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTGKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdoDangApDung)
                                    .addComponent(rdoChuaApDung)
                                    .addComponent(rdoHetHan)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ckbSelectAll)
                                .addGap(38, 38, 38)
                                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Khuyến Mại", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N

        tblKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khuyến mại", "Tên khuyến mại", "Hình thức giảm giá", "Mức giảm", "Sản phẩm", "Ngày bắt đầu", "Ngày kết thúc", "Trạng thái", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhuyenMaiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblKhuyenMai);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMucKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMucKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMucKMActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
//        KhuyenMaiViewModel kmvm = new KhuyenMaiViewModel();
//        //        SanPhamChiTietViewModel spctvm=new SanPhamChiTietViewModel();
//        //
//        //        spctvm.setIdSPCT((String) cbbSanPham.getSelectedItem());
//        //        spctvm.setIdKM((String) cbbSanPham.getSelectedItem());
//
//        kmvm.setMaKM(txtMaKM.getText());
//        kmvm.setTenKM(txtTenKM.getText());
//        kmvm.setGiamGia(Float.parseFloat(txtMucKM.getText()));
//        //        kmvm.setTenSP((String) cbbSanPham.getSelectedItem());
//        kmvm.setMoTa(txtMoTa.getText());
//
//        kmvm.setThoiGianBatDau(Date.valueOf(txtTGBatDau.getText()));
//        kmvm.setThoiGianKetThuc(Date.valueOf(txtTGKetThuc.getText()));
//
//        if (cbbHinhThucKM.getSelectedIndex() == 0) {
//            kmvm.setHinhThuc("Giảm theo %");
//        } else {
//            kmvm.setHinhThuc("Giảm theo tiền");
//        }
//        if (cbbTrangThai.getSelectedIndex() == 0) {
//            kmvm.setTrangThai("Đang áp dụng");
//        }
//        else if (cbbTrangThai.getSelectedIndex() == 1) {
//            kmvm.setTrangThai("Chưa áp dụng");
//        }
//        else {
//            kmvm.setTrangThai("Hết hạn");
//        }
//        if (khuyenMaiService.add(kmvm)) {
//            //            khuyenMaiService.addTableChung(spctvm);
//            JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
//            loadTable(khuyenMaiService.getAllKM());
//
//        } else {
//            JOptionPane.showMessageDialog(rootPane, "Thêm thất bại");
//        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
//        KhuyenMaiViewModel kmvm = new KhuyenMaiViewModel();
//        String maKM=txtMaKM.getText();
//        if (khuyenMaiService.delete(maKM)) {
//            //            khuyenMaiService.addTableChung(spctvm);
//            JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
//            loadTable(khuyenMaiService.getAllKM());
//
//        } else {
//            JOptionPane.showMessageDialog(rootPane, "Xóa thất bại");
//        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
//        KhuyenMaiViewModel kmvm = new KhuyenMaiViewModel();
//        //        SanPhamChiTietViewModel spctvm=new SanPhamChiTietViewModel();
//        //
//        //        spctvm.setIdSPCT((String) cbbSanPham.getSelectedItem());
//        //        spctvm.setIdKM((String) cbbSanPham.getSelectedItem());
//
//        String maKM=txtMaKM.getText();
//        kmvm.setTenKM(txtTenKM.getText());
//        kmvm.setGiamGia(Float.parseFloat(txtMucKM.getText()));
//        //        kmvm.setTenSP((String) cbbSanPham.getSelectedItem());
//        kmvm.setMoTa(txtMoTa.getText());
//
//        kmvm.setThoiGianBatDau(Date.valueOf(txtTGBatDau.getText()));
//        kmvm.setThoiGianKetThuc(Date.valueOf(txtTGKetThuc.getText()));
//
//        if (cbbHinhThucKM.getSelectedIndex() == 0) {
//            kmvm.setHinhThuc("Giảm theo %");
//        } else {
//            kmvm.setHinhThuc("Giảm theo tiền");
//        }
//        if (cbbTrangThai.getSelectedIndex() == 0) {
//            kmvm.setTrangThai("Đang áp dụng ");
//        }
//        else if (cbbTrangThai.getSelectedIndex() == 1) {
//            kmvm.setTrangThai("Chưa áp dụng");
//        }
//        else {
//            kmvm.setTrangThai("Hết hạn");
//        }
//        if (khuyenMaiService.update(kmvm, maKM)) {
//            //            khuyenMaiService.addTableChung(spctvm);
//            JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
//            loadTable(khuyenMaiService.getAllKM());
//
//        } else {
//            JOptionPane.showMessageDialog(rootPane, "Cập nhật thất bại");
//        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void ckbSelectAllItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckbSelectAllItemStateChanged
         if (ckbSelectAll.isSelected()) {
            for (int i = 0; i < tblDanhSachSP.getRowCount(); i++) {
                tblDanhSachSP.setValueAt(true, i, 0);
            }
        } else {
            for (int i = 0; i < tblDanhSachSP.getRowCount(); i++) {
                tblDanhSachSP.setValueAt(false, i, 0);
            }
        }
    }//GEN-LAST:event_ckbSelectAllItemStateChanged

    private void tblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhuyenMaiMouseClicked
        int row=tblKhuyenMai.getSelectedRow();
        String maKM=tblKhuyenMai.getValueAt(row, 0).toString();
        String tenKM=tblKhuyenMai.getValueAt(row, 1).toString();
        String hinhThuc=tblKhuyenMai.getValueAt(row, 2).toString();
        String mucGiam=tblKhuyenMai.getValueAt(row, 3).toString();
        String thoiGianBD=tblKhuyenMai.getValueAt(row, 5).toString();
        String thoiGianKT=tblKhuyenMai.getValueAt(row, 6).toString();
        String trangThai=tblKhuyenMai.getValueAt(row, 7).toString();
        String moTa=tblKhuyenMai.getValueAt(row, 8).toString();
        
        txtMaKM.setText(maKM);
        txtTenKM.setText(tenKM);
        
        txtMucKM.setText(mucGiam);
        txtTGBatDau.setText(thoiGianBD);
        txtTGKetThuc.setText(thoiGianKT);
        if(hinhThuc.equalsIgnoreCase("Theo %")){
            cbbHinhThucKM.setSelectedIndex(0);
        }
        else{
            cbbHinhThucKM.setSelectedIndex(1);
        }
        if(trangThai.equalsIgnoreCase("Đang áp dụng")){
            rdoDangApDung.setSelected(true);
        }
        else if(trangThai.equalsIgnoreCase("Chưa áp dụng")){
            rdoChuaApDung.setSelected(true);
        }
        else{
            rdoHetHan.setSelected(true);
        }
        txtMoTa.setText(moTa);
    }//GEN-LAST:event_tblKhuyenMaiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbHinhThucKM;
    private javax.swing.JCheckBox ckbSelectAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdoChuaApDung;
    private javax.swing.JRadioButton rdoDangApDung;
    private javax.swing.JRadioButton rdoHetHan;
    private javax.swing.JTable tblDanhSachSP;
    private javax.swing.JTable tblKhuyenMai;
    private javax.swing.JTextField txtMaKM;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtMucKM;
    private javax.swing.JTextField txtTGBatDau;
    private javax.swing.JTextField txtTGKetThuc;
    private javax.swing.JTextField txtTenKM;
    // End of variables declaration//GEN-END:variables

}
