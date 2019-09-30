package view;

import controller.projetoInterdisciplinar;
import view.Visual;
import java.lang.reflect.Method;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MetodoInstalacao extends javax.swing.JFrame {

    projetoInterdisciplinar pc;
    Visual visual;

    public MetodoInstalacao(projetoInterdisciplinar pc, Visual v) {
        initComponents();
        this.pc = pc;
        this.visual = v;
        Comentario.setLineWrap(true);
    
        if (pc.MetodoInstalacao != null) {
            Metodo.setSelectedItem(pc.MetodoInstalacao);
        }

        //Comentario.setWrapStyleWord(true);
        //1,2,3,4,5,6,7,8,11,11A,12,13M,13U,14M,14U, 15M,15U,16M,16U,17M,17U,18,21,22,23,24,25,26,27,33,34,35,36,41,42,43,51,52,53,61,62,63,71,72,72A,73,74
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Comentario = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Metodo = new javax.swing.JComboBox<>();
        Confirmar = new javax.swing.JButton();
        Exemplo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.cyan);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(189, 189, 189));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setForeground(new java.awt.Color(102, 204, 255));

        Comentario.setEditable(false);
        Comentario.setColumns(20);
        Comentario.setRows(5);
        Comentario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Comentario.setEnabled(false);
        jScrollPane1.setViewportView(Comentario);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Método de Instalação Número:");

        Metodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "11", "11A", "12", "13M", "13U", "14M", "14U", "15M", "15U", "16M", "16U", "17M", "17U", "18", "21", "22", "23", "24", "25", "26", "27", "33", "34", "35", "36", "41", "42", "43", "51", "52", "53", "61", "62", "63", "71", "72", "72A", "73", "74" }));
        Metodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetodoActionPerformed(evt);
            }
        });

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Exemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(Confirmar)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Exemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Confirmar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetodoActionPerformed

        //1,2,3,4,5,6,7,8,11,11A,12,13,14,15,16,17,18,21,22,23,24,25,26,27,33,34,35,36,41,42,43,51,52,53,61,62,63,71,72,72A,73,74
        String aux = pc.Descricao.get(Metodo.getSelectedIndex());

        Comentario.setText(pc.Descricao.get(Metodo.getSelectedIndex()));

        String caminho = "/Arquivos/" + Metodo.getSelectedItem() + ".png";
        ImageIcon logo = new ImageIcon(getClass().getResource(caminho));
        Exemplo.setIcon(logo);

    }//GEN-LAST:event_MetodoActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        
        pc.MetodoInstalacao = (String) Metodo.getSelectedItem();
        visual.AtualizaDados();
        setVisible(false);
      


    }//GEN-LAST:event_ConfirmarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Comentario;
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel Exemplo;
    private javax.swing.JComboBox<String> Metodo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}