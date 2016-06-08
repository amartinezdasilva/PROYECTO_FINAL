/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalprog;
import DataBaseLibrary.Metodos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static proyectofinalprog.Socios.sql;

/**
 *
 * @author Nabor
 */
public class Encargado extends javax.swing.JFrame {

    /**
     * Creates new form Encargado
     */
    
    Metodos library = new Metodos();
    com.mysql.jdbc.Connection conn=null;
    String skl;
    public Encargado() {
        initComponents();
        jPanel1.setVisible(false);
       Conectar("jdbc:mysql://localhost", "zoo","user=root","password=pedrapedra6");
       this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigoEn = new javax.swing.JTextField();
        passEn = new javax.swing.JTextField();
        conectar = new javax.swing.JButton();
        desconectar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        eliminarSocio = new javax.swing.JButton();
        despedir = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codigoEn.setText("Codigo Encargado");
        codigoEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoEnActionPerformed(evt);
            }
        });

        passEn.setText("Contraseña");

        conectar.setText("Conectar");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });

        desconectar.setText("Desconectar");

        eliminarSocio.setText("Eliminar Socio");
        eliminarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarSocioActionPerformed(evt);
            }
        });

        despedir.setText("Despedir Empleado");
        despedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirActionPerformed(evt);
            }
        });

        ingresar.setText("Registrar Nuevo Empleado");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eliminarSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(despedir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(eliminarSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(despedir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresar)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codigoEn, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(passEn))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(conectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(128, 128, 128)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(volver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conectar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desconectar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(volver)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarSocioActionPerformed
        Encargado.this.setVisible(false);
        EliminarSocio obxES = new EliminarSocio();
        obxES.setVisible(true);
    }//GEN-LAST:event_eliminarSocioActionPerformed

    private void codigoEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoEnActionPerformed
        
    }//GEN-LAST:event_codigoEnActionPerformed

    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed
       sql="";
        
        MultipleWhere("contraseña","empleados","idempleado",codigoEn.getText(),"ocupacion","Encargado");
        if(passEn.getText().equalsIgnoreCase(sql) /**&& skl.equalsIgnoreCase("Encargado")**/){
        jPanel1.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Contraseña o Ocupación Incorrecta!");
            sql="";
        }
    }//GEN-LAST:event_conectarActionPerformed

    private void despedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirActionPerformed
        Encargado.this.setVisible(false);
        DespedirEmpleado obxDE = new DespedirEmpleado();
        obxDE.setVisible(true);
    }//GEN-LAST:event_despedirActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        Encargado.this.setVisible(false);
        RegistrarEmpleado obxRE = new RegistrarEmpleado();
        obxRE.setVisible(true);
    }//GEN-LAST:event_ingresarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Encargado.this.setVisible(false);
        Logeo obxL = new Logeo();
        obxL.setVisible(true);
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(Encargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encargado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoEn;
    private javax.swing.JButton conectar;
    private javax.swing.JButton desconectar;
    private javax.swing.JButton despedir;
    private javax.swing.JButton eliminarSocio;
    private javax.swing.JButton ingresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passEn;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

  public String MultipleWhere(String parametro,String nomTabla,String ID,String valores,String ID2,String valores2) {
       
      
       try {
            Statement st= conn.createStatement();
               ResultSet rs= st.executeQuery("Select "+parametro+" from "+nomTabla+" where "+ID+"='"+valores+"'"+"AND "+ID2+" = '"+valores2+"'");
                    String [] datos= new String[6];
          while(rs.next()){
          
            for (int i = 0; i < datos.length; i++) {
                datos[i]=rs.getString(i+1);
                 sql= sql +""+datos[i];
                
            }
              
              }
                   
        } catch (SQLException ex) {
            System.out.println("Error en la visualizacion "+ex.getMessage());
        }
        return sql;
 }
public Connection Conectar(String servidor,String base,String usuario,String contraseña){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn =(com.mysql.jdbc.Connection) DriverManager.getConnection(servidor+"/"+base+"?"+usuario+"&"+contraseña);
            System.out.println("Conectado correctamente");
        }catch(Exception conectar){
            System.out.println(conectar.getMessage());
        }
        return conn; 
    }

}
