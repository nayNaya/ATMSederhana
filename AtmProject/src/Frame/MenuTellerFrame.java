package Frame;
import Logic.Nasabah;
import javax.swing.JOptionPane;
public class MenuTellerFrame extends FrameDasar {

    public MenuTellerFrame(Nasabah nasabah) {
        super(nasabah);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tarik_tf = new javax.swing.JButton();
        setor_tf = new javax.swing.JButton();
        transfer_tf = new javax.swing.JButton();
        keluar_tf = new javax.swing.JButton();
        cekSaldo_tf = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Broadway", 1, 32)); // NOI18N
        jLabel1.setText("LAYANAN TELLER");

        tarik_tf.setIcon(new javax.swing.ImageIcon("D:\\Kuliah Sem. 3\\DB lanjutan\\money-withdrawal.png")); // NOI18N
        tarik_tf.setText("Tarik");
        tarik_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarik_tfActionPerformed(evt);
            }
        });

        setor_tf.setIcon(new javax.swing.ImageIcon("D:\\Kuliah Sem. 3\\DB lanjutan\\bank (1).png")); // NOI18N
        setor_tf.setText("Setor Uang");
        setor_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setor_tfActionPerformed(evt);
            }
        });

        transfer_tf.setIcon(new javax.swing.ImageIcon("D:\\Kuliah Sem. 3\\DB lanjutan\\money-transfer (1).png")); // NOI18N
        transfer_tf.setText("Transfer");
        transfer_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer_tfActionPerformed(evt);
            }
        });

        keluar_tf.setBackground(new java.awt.Color(84, 188, 231));
        keluar_tf.setText("Keluar ");
        keluar_tf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        keluar_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_tfActionPerformed(evt);
            }
        });

        cekSaldo_tf.setIcon(new javax.swing.ImageIcon("D:\\Kuliah Sem. 3\\DB lanjutan\\benefits.png")); // NOI18N
        cekSaldo_tf.setText("Cek Saldo");
        cekSaldo_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekSaldo_tfActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(123, 217, 240));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cekSaldo_tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(transfer_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(setor_tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tarik_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(keluar_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cekSaldo_tf)
                    .addComponent(tarik_tf))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transfer_tf)
                    .addComponent(setor_tf))
                .addGap(32, 32, 32)
                .addComponent(keluar_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluar_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_tfActionPerformed
        this.changeFrame(new MenuUtamaFrame());
    }//GEN-LAST:event_keluar_tfActionPerformed

    private void cekSaldo_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekSaldo_tfActionPerformed
      JOptionPane.showMessageDialog(rootPane,"RP" +getTellerControll().checkDeposit(),"Ini Saldo Anda ", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cekSaldo_tfActionPerformed

    private void transfer_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer_tfActionPerformed
       String akun = JOptionPane.showInputDialog(rootPane,"Masukan Nomor Rekening Tujuan","Transfer Uang",JOptionPane.QUESTION_MESSAGE);
       Nasabah nasabah = this.getTellerControll().cekTransfer(akun);
       this.changeFrame(new TransferTellerFrame(nasabah,this.getNasabah()));
    }//GEN-LAST:event_transfer_tfActionPerformed

    private void setor_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setor_tfActionPerformed
       int uang = Integer.parseInt(JOptionPane.showInputDialog(rootPane,"Masukan Setoran Tunai Anda","Setor Tunai",JOptionPane.QUESTION_MESSAGE ));
       this.getTellerControll().saving(uang);
       JOptionPane.showMessageDialog(rootPane,"Rp"+this.getTellerControll().checkDeposit(),"Uang Anda",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_setor_tfActionPerformed

    private void tarik_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarik_tfActionPerformed
       int uang = Integer.parseInt(JOptionPane.showInputDialog(rootPane,"Masukan Uang Yang Akan di Tarik","Tarik Tunai",JOptionPane.QUESTION_MESSAGE ));
       this.getTellerControll().withdraw(uang);
       JOptionPane.showMessageDialog(rootPane,"Rp"+this.getTellerControll().checkDeposit(),"Uang Anda",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_tarik_tfActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cekSaldo_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton keluar_tf;
    private javax.swing.JButton setor_tf;
    private javax.swing.JButton tarik_tf;
    private javax.swing.JButton transfer_tf;
    // End of variables declaration//GEN-END:variables
}
