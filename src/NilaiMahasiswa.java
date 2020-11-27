import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NilaiMahasiswa extends javax.swing.JFrame {

  
    public NilaiMahasiswa() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        cbonim = new javax.swing.JComboBox<>();
        txtmakul = new javax.swing.JTextField();
        cbonilai = new javax.swing.JComboBox<>();
        cmdupdate = new javax.swing.JButton();
        cmdsave = new javax.swing.JButton();
        cmddelete = new javax.swing.JButton();
        cmdcancel = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tnilai = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("DATA NILAI MAHASISWA");

        jLabel6.setText("SEARCH");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("NIM");

        jLabel2.setText("NAMA");

        jLabel3.setText("MAKUL");

        jLabel4.setText("NILAI");

        txtnama.setEditable(false);

        cbonim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- NIM -- " }));
        cbonim.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbonimPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        cbonilai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NILAI", "A", "AB", "B", "BC", "C", "CD", "D", "E" }));

        cmdupdate.setText("UPDATE");
        cmdupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdupdateActionPerformed(evt);
            }
        });

        cmdsave.setText("SAVE");
        cmdsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsaveActionPerformed(evt);
            }
        });

        cmddelete.setText("DELETE");
        cmddelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmddeleteActionPerformed(evt);
            }
        });

        cmdcancel.setText("CANCEL");
        cmdcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama)
                            .addComponent(cbonim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtmakul)
                            .addComponent(cbonilai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmddelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdcancel)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbonim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtmakul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbonilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdupdate)
                    .addComponent(cmdsave)
                    .addComponent(cmddelete)
                    .addComponent(cmdcancel))
                .addContainerGap())
        );

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        tnilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tnilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tnilaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tnilai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(421, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Fikky Ardianto
    // 201851136
    
    String koneksi   ="jdbc:mysql://localhost/dbakademik";
    String user      ="root";
    String pass      ="";
    Connection connection;
    Statement statement;
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
         Class.forName("com.mysql.jdbc.Driver");
         koneksi="jdbc:mysql://localhost/dbakademik";
         connection=(Connection) DriverManager.getConnection(koneksi,user, pass);
         statement=(Statement) connection.createStatement();
     }  catch (Exception DBException) { 
            JOptionPane.showMessageDialog(this, "Koneksi Gagal","Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error : " + DBException);
        } 
        bersih();
        loaddata();
    }//GEN-LAST:event_formWindowOpened

    private void cbonimPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbonimPopupMenuWillBecomeInvisible
        try{
            String sql = "select nama from mahasiswa where nim ='" + cbonim.getSelectedItem()+"'";
            ResultSet rs=statement.executeQuery(sql);
            
            while (rs.next()){
                String data = rs.getString("nama");
                txtnama.setText(data);
            }
        }catch(Exception e){
        System.err.println(e);
    }
    }//GEN-LAST:event_cbonimPopupMenuWillBecomeInvisible

    private void cmdsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsaveActionPerformed
        try{
            String sql;
            {
                sql="insert into nilaimakul value('";
                sql+=cbonim.getSelectedItem()+"','";
                sql+=txtmakul.getText()+"','";
                sql+=cbonilai.getSelectedItem()+"')";
            }
            statement.executeUpdate(sql);
                JOptionPane.showMessageDialog(this,"Simpan data berhasil","Informasi",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception DBException){
            JOptionPane.showMessageDialog(this,"Simpan data gagal","Error",JOptionPane.ERROR_MESSAGE);
            System.err.println("Error:"+DBException);
        }
        bersih();
        cbonim.setSelectedItem(0);
    }//GEN-LAST:event_cmdsaveActionPerformed

    private void tnilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tnilaiMouseClicked
        cbonim.setSelectedItem(tnilai.getValueAt(tnilai.getSelectedRow(),0).toString());
        txtnama.setText(tnilai.getValueAt(tnilai.getSelectedRow(),1).toString());
        txtmakul.setText(tnilai.getValueAt(tnilai.getSelectedRow(),2).toString());
        cbonilai.setSelectedItem(tnilai.getValueAt(tnilai.getSelectedRow(),3).toString());
        cbonim.setEditable(false);
        txtnama.setEditable(false);
        txtmakul.setEditable(false);
        cmdsave.setEnabled(false);
        cmdupdate.setEnabled (true);
        cmddelete.setEnabled (true);
    }//GEN-LAST:event_tnilaiMouseClicked

    private void cmdcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancelActionPerformed
        dispose();
    }//GEN-LAST:event_cmdcancelActionPerformed

    private void cmddeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmddeleteActionPerformed
        try{
            int reply = JOptionPane.showConfirmDialog(this,
                    "Apakah anda yakin akan menghapus data ini?",
                    "Konfirmasi",JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);
            if (reply==JOptionPane.YES_OPTION){
                String sql="delete from nilaimakul where nim='"+cbonim.getSelectedItem()
                        +"' AND makul='"+txtmakul.getText()+"'";
                statement.executeUpdate(sql);
            }
        }catch(Exception DBException){
            JOptionPane.showMessageDialog(this, "Hapus Data Gagal", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error : " + DBException);
        }
        bersih();
        cbonim.requestFocus();
        cmdsave.setEnabled(true);
        cmdupdate.setEnabled (false);
        cmddelete.setEnabled (false);
    }//GEN-LAST:event_cmddeleteActionPerformed

    private void cmdupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdupdateActionPerformed
        try{
            String sql;
            {
                sql="update nilaimakul set makul='";
                sql+=txtmakul.getText()+"',nilai='";
                sql+=cbonilai.getSelectedItem()+"'";
                sql+="where nim='";
                sql+=cbonim.getSelectedItem()+"'";
                sql+="AND makul='"+txtmakul.getText()+"'";
            }
            statement.executeUpdate(sql);
                JOptionPane.showMessageDialog(this,"Update data berhasil","Informasi",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception DBException){
            JOptionPane.showMessageDialog(this,"Update data gagal","Error",JOptionPane.ERROR_MESSAGE);
            System.err.println("Error:"+DBException);
        }
        bersih();
        cbonim.setSelectedIndex(0);
        cbonilai.setSelectedIndex(0);
        cmdsave.setEnabled(true);
        cmdupdate.setEnabled (false);
        cmddelete.setEnabled (false);
    }//GEN-LAST:event_cmdupdateActionPerformed

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("NIM");
        tabel.addColumn("NAMA");
        tabel.addColumn("MAKUL");
        tabel.addColumn("NILAI");
    try{
        String sql = "select nm.nim, mhs.nama, nm.makul, nm.nilai from nilaimakul nm LEFT JOIN mahasiswa mhs ON mhs.nim = nm.nim where nm.nim like '%" + txtcari.getText() + "%' or mhs.nama like '%" + txtcari.getText() +"%'";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            tabel.addRow(new Object[]{
               rs.getString(1),
               rs.getString(2),
               rs.getString(3),
               rs.getString(4),
            });
        }
        tnilai.setModel(tabel);
    }catch(Exception DBException){
        System.err.println("Error : " + DBException);
    }
    }//GEN-LAST:event_txtcariKeyPressed

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
            java.util.logging.Logger.getLogger(NilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NilaiMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbonilai;
    private javax.swing.JComboBox<String> cbonim;
    private javax.swing.JButton cmdcancel;
    private javax.swing.JButton cmddelete;
    private javax.swing.JButton cmdsave;
    private javax.swing.JButton cmdupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tnilai;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtmakul;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables

    private void bersih() {
        txtmakul.setText("");
        cbonilai.setSelectedIndex(0);
        try{
            String sql = "select nm.nim, mhs.nama, nm.makul, nm.nilai"
                       + " FROM mahasiswa mhs, nilaimakul nm"
                       + " WHERE mhs.nim=nm.nim";
        ResultSet rs=statement.executeQuery(sql);
        final String[] header={"NIM","NAMA","MAKUL","NILAI"};
        rs.last();
        int n=rs.getRow();
        Object[][] data = new Object[n][4];
        int p=0;
        rs.beforeFirst();
        while (rs.next()){
                     data [p][0]=rs.getString(1);
                     data [p][1]=rs.getString(2);
                     data [p][2]=rs.getString(3);
                     data [p][3]=rs.getString(4);
                     p++;
                 }
        tnilai.setModel(new javax.swing.table.DefaultTableModel(data, header));
        tnilai.setAlignmentX(CENTER_ALIGNMENT);
        }catch(Exception DBException){
            System.err.println("Error : " + DBException);
        }
    }

    private void loaddata() {
       try{
           cbonim.removeAllItems();
           String sql = "select * from mahasiswa";
           ResultSet rs=statement.executeQuery(sql);
           
           while (rs.next()){
               cbonim.addItem(rs.getString("nim"));
             
           }
           rs.close();
       }catch(SQLException e){
           System.out.println("Terjadi Kesalahan");
       }
    }
}
