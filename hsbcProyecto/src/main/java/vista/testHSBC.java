/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

//importando paquete vista y clase pojos

import javax.swing.JOptionPane; //libreria para ventanas emergente

import pojos.bancohsbc; //importando la libreria para componentes POO

public class testHSBC extends javax.swing.JFrame {

   
    
    
    public testHSBC() {
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

        lbltitulo = new javax.swing.JLabel();
        panelSeleccion = new javax.swing.JPanel();
        btnSucursales = new javax.swing.JButton();
        btnCLientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setText("Consulta de Datos banco HSBC");

        panelSeleccion.setBackground(new java.awt.Color(204, 0, 51));
        panelSeleccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecciona opcion"));

        btnSucursales.setText("Consulta sucursales");
        btnSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucursalesActionPerformed(evt);
            }
        });

        btnCLientes.setText("consulta Cientes");
        btnCLientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSeleccionLayout = new javax.swing.GroupLayout(panelSeleccion);
        panelSeleccion.setLayout(panelSeleccionLayout);
        panelSeleccionLayout.setHorizontalGroup(
            panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionLayout.createSequentialGroup()
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSeleccionLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnSucursales))
                    .addGroup(panelSeleccionLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnCLientes)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panelSeleccionLayout.setVerticalGroup(
            panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSeleccionLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(btnCLientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSucursales)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(panelSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lbltitulo)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbltitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCLientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLientesActionPerformed
        //boton consulata
        
        //instanciando objetos
        bancohsbc clienteUno = new bancohsbc(123, " Ricardo Zuniga", 10000.0);
        
                    clienteUno.imprimirDatosCliente(); //llamada del metodo imprimir(esta clase esta en pojos en el archivo .java)
                bancohsbc clienteDos = new bancohsbc(123, " Carlos Alcocer", 10000.0);
                                     clienteDos.imprimirDatosCliente(); //llamada del metodo imprimir(esta clase esta en pojos en el archivo .java)

    }//GEN-LAST:event_btnCLientesActionPerformed

    private void btnSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucursalesActionPerformed
        // TODO add your handling code here:
        
        
          
        //instanciando objetos
        bancohsbc SucurUno = new bancohsbc(1, "HSBC Azcapotzalco", 55231351);
        
                    SucurUno.imprimirDatosSucursales();//llamada del metodo imprimir(esta clase esta en pojos en el archivo .java)
                bancohsbc SucurDos = new bancohsbc(2, "HSBC Polanco", 53948181);
                                     SucurDos.imprimirDatosSucursales();//llamada del metodo imprimir(esta clase esta en pojos en el archivo .java)
        
    }//GEN-LAST:event_btnSucursalesActionPerformed

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
            java.util.logging.Logger.getLogger(testHSBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testHSBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testHSBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testHSBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testHSBC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCLientes;
    private javax.swing.JButton btnSucursales;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel panelSeleccion;
    // End of variables declaration//GEN-END:variables
}
