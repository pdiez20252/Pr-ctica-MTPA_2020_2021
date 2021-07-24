package com.mycompany.mtpa.cliente.cliente.vista;

import com.mycompany.mtpa.servidor.Partida;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Salon extends javax.swing.JFrame {

    //ArrayList<Partida> lista = new ArrayList<Partida>();
    
    private JTextField txtUsuario;
    private JPasswordField txtPass;
    private Socket socketCliente;
    private PrintWriter salida;
    private Scanner entrada;
    
    public Salon() {
        super();
        try {
            socketCliente = new Socket("localhost", 1009);
            salida = new PrintWriter(socketCliente.getOutputStream());
            entrada = new Scanner(socketCliente.getInputStream());
            pack();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Servidor no conectado",  "Error",JOptionPane.ERROR_MESSAGE);
        }
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

        txtPartida = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaPersona = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sala = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPartidaActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jTablaPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Partida", "Contrincantes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaPersonaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaPersona);

        jLabel1.setText("Crear partida:");

        jLabel2.setText("Salones");

        sala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Futbol", "Marcas", "Colores", "Animales" }));
        sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaActionPerformed(evt);
            }
        });

        jLabel3.setText("Para unirte a una partida en esta sala, dale click o bien crea partida");

        jButton1.setText("Recargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sala, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btnCrear)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        sala.getAccessibleContext().setAccessibleName("");
        sala.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPartidaActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
         String partnomb =  txtPartida.getText();  
         
        if(partnomb.isEmpty()){
            JOptionPane.showMessageDialog(null, "El nombre de la partida no puede estar vacío",  "Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
        //convertimos salaactual de tipo int a String para que el servidor nos entienda    
        String salaactual = salaactual()+"";
        //protocolo crearPartida:nomPartida:pass
        String mensaje = "crearPartida:"+partnomb+":"+salaactual+"\n";
        salida.write(mensaje);
        salida.flush();
        String respuesta = entrada.nextLine();
        if(respuesta.equals("false")){
            JOptionPane.showMessageDialog(null, "Error al crear partida",  "Error",JOptionPane.ERROR_MESSAGE);
        }
        //ahora mostramos las partidas por pantalla, protocolo mostrar::
        mostrar();
        
        /*
        Partida partida = new Partida(txtPartida.getText(), salaactual()); //crear partida con el nombre que el usuario le pase y la sala actual
        lista.add(partida); 
        
        txtPartida.setText("");*/
        
        }
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void jTablaPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaPersonaMouseClicked
     /*jTablaPersona target = (jTablaPersona)e.getSource();
    int row = target.getSelectedRow();
    int column = target.getSelectedColumn();
    if((row >=0) && (column >=0)){
      //Stuff
    }   
*/


// TODO add your handling code here:
    }//GEN-LAST:event_jTablaPersonaMouseClicked

    
    
    
    
    private void salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaActionPerformed
            salaactual();
            mostrar();  
    }//GEN-LAST:event_salaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrar();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public int salaactual(){
    int salon = sala.getSelectedIndex();  
    return salon;
}    
    
    public void mostrar(){ 
        int i = 0;
        String salaactual = salaactual()+""; //bad smell
        String mensaje = "mostrar::"+i+"\n";
        salida.write(mensaje);
        salida.flush();
        String respuesta = entrada.nextLine();
        System.out.println(""+respuesta);
        String[] dividir = respuesta.split(":");
        int tamanolista = Integer.parseInt(dividir[0]);
        int j=0;
        String matriz[][] = new String [tamanolista][2];
        for(i=0; i<tamanolista;i++){
             mensaje = "mostrar::"+i+"\n";
             salida.write(mensaje);
             salida.flush();
             respuesta = entrada.nextLine();
             dividir = respuesta.split(":");
             String partida = dividir[1];
             String sala = dividir[2];
             int numSala = Integer.parseInt(sala);
             System.out.println(partida);
                if(salaactual() == numSala){
                matriz[j][0]= partida;
                j++;
            }
            
            
            //matriz[i][1]=lista.get(i).getNumParticipantes(); //AÑADIR
        }
                jTablaPersona.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Partida", "Contrincantes"
            }
             
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });            
                
                
        
    }
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
            java.util.logging.Logger.getLogger(Salon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salon().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaPersona;
    private javax.swing.JComboBox<String> sala;
    private javax.swing.JTextField txtPartida;
    // End of variables declaration//GEN-END:variables
}
