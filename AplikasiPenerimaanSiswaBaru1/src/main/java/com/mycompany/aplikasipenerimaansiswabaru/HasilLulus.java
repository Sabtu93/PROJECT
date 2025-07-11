/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.aplikasipenerimaansiswabaru;

/**
 *
 * @author RIFQI
 */
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class HasilLulus extends javax.swing.JFrame {

    /**
     * Creates new form HasilLulus
     */
    
    public HasilLulus(ArrayList<Siswa1379> data) {
        initComponents();
        tampilkanData(data); // panggil fungsi untuk tampilkan data lulus dan tidak lulus
    }
    
    private void tampilkanData(ArrayList<Siswa1379> data) {
        DefaultTableModel modelLulus = (DefaultTableModel) tabelLulus1379.getModel();
        DefaultTableModel modelTidak = (DefaultTableModel) tabeltidakLulus1379.getModel();

        // Kosongkan isi tabel terlebih dahulu (jika sebelumnya ada data)
        modelLulus.setRowCount(0);
        modelTidak.setRowCount(0);

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (Siswa1379 s : data) {
            Object[] row = {
                s.getNama1379(),
                s.getNisn1379(),
                s.getAsal1379(),
                s.getNilai1379()
            };

            if (s.getNilai1379() >= 70) {
                modelLulus.addRow(row);
                jumlahLulus++;
            } else {
                modelTidak.addRow(row);
                jumlahTidakLulus++;
            }
        }

        // Tampilkan jumlah
        labelLulus1380.setText("Jumlah Lulus: " + jumlahLulus);
        labeltidakLulus1379.setText("Jumlah Tidak Lulus: " + jumlahTidakLulus);
    }
    
    public HasilLulus() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltidakLulus1379 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelLulus1379 = new javax.swing.JTable();
        labeltidakLulus1379 = new javax.swing.JLabel();
        labelLulus1380 = new javax.swing.JLabel();
        exit1379 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabeltidakLulus1379.setAutoCreateRowSorter(true);
        tabeltidakLulus1379.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAMA", "NISN", "ASAL SEKOLAH", "NILAI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabeltidakLulus1379);

        tabelLulus1379.setAutoCreateRowSorter(true);
        tabelLulus1379.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAMA", "NISN", "ASAL SEKOLAH", "NILAI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelLulus1379);

        labeltidakLulus1379.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labeltidakLulus1379.setText("jLabel1");

        labelLulus1380.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelLulus1380.setText("jLabel1");

        exit1379.setText("EXIT");
        exit1379.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1379ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLulus1380)
                    .addComponent(labeltidakLulus1379)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(exit1379)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(labelLulus1380)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(labeltidakLulus1379)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit1379)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit1379ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1379ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exit1379ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HasilLulus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HasilLulus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HasilLulus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HasilLulus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HasilLulus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit1379;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelLulus1380;
    private javax.swing.JLabel labeltidakLulus1379;
    private javax.swing.JTable tabelLulus1379;
    private javax.swing.JTable tabeltidakLulus1379;
    // End of variables declaration//GEN-END:variables
}
