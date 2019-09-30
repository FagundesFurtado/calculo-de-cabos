/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.projetoInterdisciplinar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Visual extends javax.swing.JFrame {

    public projetoInterdisciplinar pc = new projetoInterdisciplinar();

    public Visual() {
        initComponents();
        pc.leituraDasDescricoes();

        AtualizaDados();
        GroupCircuito.add(RadioForca);
        GroupCircuito.add(RadioIluminacao);
        GroupCabo.add(RadioCobre);
        GroupCabo.add(RadioAluminio);
        Abas.setEnabledAt(1, false);

    }

    public void AtualizaDados() {

        if (pc.MetodoInstalacao != null) {
            String caminho = "/Arquivos/" + pc.MetodoInstalacao + ".png";
            ImageIcon logo = new ImageIcon(getClass().getResource(caminho));
            this.ExemploPrincipal.setIcon(logo);

        }

        this.Tensao.setText(String.valueOf(pc.Tensao));
        this.MetodoInstalacao.setText(pc.MetodoInstalacao);
        this.ComprimentoCircuito.setText(String.valueOf(pc.Comprimento));
        this.QuedaTensao.setText(String.valueOf(pc.QuedaDeTensao));
        this.FatordePotencia.setText(String.valueOf(pc.FatorDePotencia));
        this.Potencia.setText(String.valueOf(pc.Potencia));
        MetodoInstalacao.setEditable(false);

    }

    public void AtualizaInfo() {
        pc.Temperatura = Temperatura.getSelectedIndex();
        pc.Comprimento = Float.parseFloat(ComprimentoCircuito.getText());
        pc.QuedaDeTensao = Float.parseFloat(QuedaTensao.getText());
        pc.FatorDePotencia = Float.parseFloat(FatordePotencia.getText());
        pc.Potencia = Float.parseFloat(Potencia.getText());

        pc.Circuito = GroupCircuito.getButtonCount();
        pc.Cabo = GroupCabo.getButtonCount();
        pc.Tensao = Integer.parseInt(this.Tensao.getText());
        pc.Sistema = Sistema.getSelectedIndex();
        pc.Material = String.valueOf(TipoCabo.getSelectedItem());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupCircuito = new javax.swing.ButtonGroup();
        GroupCabo = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        Abas = new javax.swing.JTabbedPane();
        Panel1 = new javax.swing.JPanel();
        Bt1Avancar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tensao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Sistema = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        TipoCabo = new javax.swing.JComboBox<>();
        RadioForca = new javax.swing.JRadioButton();
        RadioIluminacao = new javax.swing.JRadioButton();
        RadioCobre = new javax.swing.JRadioButton();
        RadioAluminio = new javax.swing.JRadioButton();
        Panel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Temperatura = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ComprimentoCircuito = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        QuedaTensao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        FatordePotencia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Potencia = new javax.swing.JTextField();
        MetodoInstalacao = new javax.swing.JTextField();
        BtInstalacao = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ExemploPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculador de Cabos");
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(203, 217, 235));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Abas.setBackground(new java.awt.Color(0, 0, 0));

        Panel1.setBackground(new java.awt.Color(203, 217, 235));

        Bt1Avancar.setText("Avançar");
        Bt1Avancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt1AvancarActionPerformed(evt);
            }
        });

        jLabel1.setText("Circuito:");

        jLabel2.setText("Cabo:");

        Tensao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TensaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Tensão:");

        jLabel5.setText("Sistema:");

        Sistema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monofásio a dois condutores", "Monofásico a três condutores", "Duas fases com neutro", "Duas fases sem neutro", "Trifásfico sem neutro", "Trifásico com neutro" }));

        jLabel12.setText("Tipo de Cabo:");

        TipoCabo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XLPE", "PVC" }));

        RadioForca.setText("Força");
        RadioForca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioForcaActionPerformed(evt);
            }
        });

        RadioIluminacao.setText("Iluminacao");

        RadioCobre.setText("Cobre");

        RadioAluminio.setText("Aluminio");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Bt1Avancar))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(94, 94, 94)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioIluminacao)
                            .addComponent(RadioForca)
                            .addComponent(RadioCobre)
                            .addComponent(RadioAluminio))
                        .addGap(126, 126, 126)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(45, 45, 45)
                                .addComponent(Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tensao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TipoCabo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 627, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioForca))
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(RadioIluminacao)
                        .addGap(25, 25, 25)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2))
                            .addComponent(RadioCobre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(TipoCabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioAluminio)
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(Bt1Avancar)
                .addContainerGap())
        );

        RadioForca.getAccessibleContext().setAccessibleName("BtnForca");

        Abas.addTab(" ", Panel1);

        Panel2.setBackground(new java.awt.Color(203, 217, 235));

        jButton2.setText("Avançar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Temperatura Ambiente: (ºC)");

        Temperatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemperaturaActionPerformed(evt);
            }
        });

        jLabel8.setText("Comprimento do Circuito: (m)");

        jLabel9.setText("Queda de tensão máxima: (%)");

        jLabel10.setText("Fator de Potência:");

        jLabel11.setText("Potência(W):");

        MetodoInstalacao.setEditable(false);
        MetodoInstalacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetodoInstalacaoActionPerformed(evt);
            }
        });

        BtInstalacao.setText("Método de Instalação");
        BtInstalacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInstalacaoActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComprimentoCircuito, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtInstalacao)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QuedaTensao, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(MetodoInstalacao, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(78, 78, 78)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FatordePotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(53, 53, 53)
                                        .addComponent(Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ExemploPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 2, Short.MAX_VALUE))))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MetodoInstalacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtInstalacao))
                        .addGap(28, 28, 28)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(ExemploPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ComprimentoCircuito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(FatordePotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(QuedaTensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        Abas.addTab(" ", Panel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Abas, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Abas, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Abas.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TensaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TensaoActionPerformed

    private void TemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemperaturaActionPerformed

    private void BtInstalacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInstalacaoActionPerformed

        MetodoInstalacao mt = new MetodoInstalacao(pc, this);

        AtualizaDados();
        mt.setVisible(true);


    }//GEN-LAST:event_BtInstalacaoActionPerformed

    private void Bt1AvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt1AvancarActionPerformed

        if ((RadioAluminio.isSelected() || RadioCobre.isSelected()) && (RadioForca.isSelected() || RadioIluminacao.isSelected()) && Integer.parseInt(Tensao.getText()) != 0) {

            AtualizaInfo();
            AtualizaDados();
            Abas.setEnabledAt(1, true);
            Abas.setSelectedIndex(1);

        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }


    }//GEN-LAST:event_Bt1AvancarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        AtualizaInfo();

        Abas.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed


    private void MetodoInstalacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetodoInstalacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MetodoInstalacaoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AtualizaInfo();
        AtualizaDados();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void RadioForcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioForcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioForcaActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Abas;
    private javax.swing.JButton Bt1Avancar;
    private javax.swing.JButton BtInstalacao;
    private javax.swing.JTextField ComprimentoCircuito;
    private javax.swing.JLabel ExemploPrincipal;
    private javax.swing.JTextField FatordePotencia;
    private javax.swing.ButtonGroup GroupCabo;
    private javax.swing.ButtonGroup GroupCircuito;
    private javax.swing.JTextField MetodoInstalacao;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JTextField Potencia;
    private javax.swing.JTextField QuedaTensao;
    private javax.swing.JRadioButton RadioAluminio;
    private javax.swing.JRadioButton RadioCobre;
    private javax.swing.JRadioButton RadioForca;
    private javax.swing.JRadioButton RadioIluminacao;
    private javax.swing.JComboBox<String> Sistema;
    private javax.swing.JComboBox<String> Temperatura;
    private javax.swing.JTextField Tensao;
    private javax.swing.JComboBox<String> TipoCabo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
