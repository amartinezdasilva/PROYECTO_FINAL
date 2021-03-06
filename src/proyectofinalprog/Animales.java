/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalprog;

import java.applet.AudioClip;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aaron
 */
public class Animales extends javax.swing.JFrame {

    Connection cn = null;

    /**
     * Creates new form Animales
     */
    public Animales() {

        initComponents();
        this.setLocationRelativeTo(null);
        conectar();
        buscarid.setVisible(false);
        buscarid();
        datos();
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zoo.jpg")));
        descripcion.setText("Bichorassic Park es uno de los lugares más emblemáticos de nuestra ciudad. Año tras año ejerce una labor divulgativa excepcional, permitiendo que todos los niños y niñas gallegos crezcan conociendo un poco más las características y costumbres de los animales y que sepan apreciar la siempre sorprendente naturaleza. Identificando además a nuestro zoo como un recurso y oferta cultural, lúdica y de esparcimiento familiar.");
    }

    public void conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/zoo", "root", "pedrapedra6");
            datos();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        oso = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        buscarid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animales");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Jirafa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 100, -1));

        oso.setText("Oso pardo");
        oso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                osoActionPerformed(evt);
            }
        });
        getContentPane().add(oso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, -1));

        jButton3.setText("Tigre");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 100, -1));

        jButton4.setText("Lobo ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 100, -1));

        jButton5.setText("Leon");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, -1));

        jButton6.setText("Puma");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, -1));

        jButton7.setText("Lince Iberico");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 100, -1));

        jButton8.setText("Cebra");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 100, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("-MAMÍFEROS-");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" -REPTILES-");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, 20));

        jButton9.setText("Piton");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 100, -1));

        jButton10.setText("Tortuga");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 100, -1));

        jButton11.setText("Lagarto");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("-ARÁCNIDOS-");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 100, 20));

        jButton12.setText("Tarantula");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 100, -1));

        jButton13.setText("Escorpion");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText(" -INSECTOS-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 100, 20));

        jButton14.setText("El bicho");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 100, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("    -AVES-");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 100, 20));

        jButton15.setText("Aguila Real");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 100, -1));

        jButton16.setText("Avestruz");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 100, -1));

        jButton17.setText("Buitre");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 100, -1));
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 310, 220));

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(datos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 720, 200));

        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        descripcion.setLineWrap(true);
        descripcion.setRows(5);
        jScrollPane2.setViewportView(descripcion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 410, 220));

        buscarid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaridActionPerformed(evt);
            }
        });
        getContentPane().add(buscarid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 10, -1));

        jButton2.setText("DATOS ANIMAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 120, 20));

        jButton18.setText("VOLVER");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void osoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_osoActionPerformed
        descripcion.setText("Es un habitante característico de los bosques  maduros de Europa , Asia templada y América del Norte. En este vasto territorio aparece bajo cierto número de subespecies,  que se diferencian unas de otras por la coloración  y el tamaño, hasta tal punto que antiguamente  se les consideraba como especies autóctonas.");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oso.jpg")));

        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/pardo.wav"));
        sonido.play();
        buscarid.setText("1");

    }//GEN-LAST:event_osoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tigre.jpg")));
        descripcion.setText("El tigre (Panthera tigris) es una de las cuatro especies de la subfamilia de los panterinos (familia Felidae) pertenecientes al género Panthera. Se encuentra solamente en el continente asiático; es un predador carnívoro y es la especie de félido más grande del mundo junto con el león pudiendo alcanzar ambos un tamaño comparable al de los felinos fósiles de mayor tamaño");
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/tigre.wav"));
        sonido.play();
        buscarid.setText("2");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        descripcion.setText("El lobo (Canis lupus) es una especie de mamífero placentario del orden de los carnívoros. El perro doméstico (Canis lupus familiaris) se considera miembro de la misma especie según distintos indicios, la secuencia del ADN y otros estudios genéticos.2 Los lobos fueron antaño abundantes y se distribuían por Norteamérica, Eurasia y el Oriente Medio. ");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lobo.png")));
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/lobo.wav"));
        sonido.play();
        buscarid.setText("3");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        descripcion.setText("El león (Panthera leo) es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera. Los leones salvajes viven en África subsahariana y Asia, con una población en peligro crítico al noroeste de la India, habiendo desaparecido del norte de África, de Oriente Próximo y del oeste de Asia en tiempos históricos");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/leon.jpg")));
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/leon.wav"));
        sonido.play();
        buscarid.setText("4");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        descripcion.setText("Este gran felino vive en más lugares que cualquier otro mamífero salvaje terrestre del continente, ya que se extiende desde el Yukón, en Canadá, hasta el sur de la Cordillera de los Andes y la Patagonia, Argentina y Chile en América del Sur. El puma es adaptable y generalista, por lo que se encuentra en los principales biomas de toda América");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/puma.jpg")));
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/puma.wav"));
        sonido.play();
        buscarid.setText("5");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        descripcion.setText("El lince ibérico (Lynx pardinus) es una especie de mamífero carnívoro de la familia Felidae, endémico de la península ibérica. Actualmente solo existen dos poblaciones en Andalucía aisladas entre sí con un total de algo más de 300 individuos en aumento,3 más otra en los Montes de Toledo de unos quince individuos y por ello escasamente viable, lo que lo convierte en uno de los felinos más amenazados del mundo.");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lince.jpg")));
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/lince.wav"));
        sonido.play();
        buscarid.setText("6");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        descripcion.setText("La palabra «cebra» no representa una entidad desde el punto de vista evolutivo, sino que es una agrupación artificial de tres especies que tienen en común la coloración a rayas blancas y negras, que no es un carácter derivado, sino primitivo.");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cebra.jpg")));

        buscarid.setText("7");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        descripcion.setText("La jirafa (Giraffa camelopardalis) es una especie de mamífero artiodáctilo de la familia Giraffidae propio de África. Es la más alta de todas las especies de animales terrestres existentes. Puede alcanzar una altura de 5,8 metros y un peso que varía entre 750 y 1600kg.");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jirafa.jpg")));
        buscarid.setText("8");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        descripcion.setText("Los pitónidos o pitones (Pythonidae) son una familia de serpientes constrictoras propias del paleotrópico. Otras fuentes consideran este grupo una subfamilia de la familia de las boas (Boidae) (subfamilia Pythoninae)");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/piton.jpg")));
        buscarid.setText("9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        descripcion.setText("Las tortugas o quelonios (Testudines) forman un orden de reptiles (Sauropsida) caracterizados por tener un tronco ancho y corto, y un caparazón o envoltura que protege los órganos internos de su cuerpo. De su caparazón salen, por delante, la cabeza y las patas delanteras, y por detrás las patas traseras y la cola.");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tortuga.jpg")));
        buscarid.setText("10");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        descripcion.setText("Los lacertilios o lagartos (Lacertilia) son un suborden de reptiles que incluye la mayoría de los reptiles actuales, como varanos, iguanas, corytophanidae, camaleones, lagartos, lagartijas y geckos así como algunas formas fósiles muy notables, como los mosasaurios del Cretácico Superior.");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lagarto.jpg")));
        buscarid.setText("11");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        descripcion.setText("Se llama tarántulas a las arañas más grandes de la familia licósidos (Lycosidae), especialmente miembros del género Lycosa como Lycosa tarantula. Los colonizadores del Nuevo Mundo pasaron a llamar \"Tarántulas\" a las arañas, mucho más grandes, de las familias americanas Theraphosidae y Dipluridae");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarantula.jpg")));
        buscarid.setText("12");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        descripcion.setText("Los escorpiones o alacranes (Scorpiones o Scorpionida) son un orden de arácnidos provistos de un par de apéndices en forma de pinza (pedipalpos) y una cola acabada en un aguijón provisto de veneno.");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escorpion.jpg")));
        buscarid.setText("13");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        descripcion.setText("AY MI MADRE EL BICHOOOO \nSIUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bicho.jpg")));
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/siu.wav"));
        sonido.play();
        buscarid.setText("14");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        descripcion.setText("El águila real o águila caudal  (Aquila chrysaetos, del latín: aquila, \"águila\" y del griego: χρυσός, \"dorado\" y ἀετός, \"águila\" ) es una especie de ave accipitriforme de la familia Accipitridae.1 Es una de las aves de presa más conocidas y ampliamente distribuidas de la Tierra.");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agula.jpg")));
        buscarid.setText("15");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        descripcion.setText("El avestruz (Struthio camelus) es una especie de ave estrutioniforme de la familia Struthionidae.3 Es un ave grande que no vuela, sino que es corredora. Se halla en África, y en tiempos pasados también habitó en Oriente Medio. Es la más grande y la más pesada de las aves que aún existen; puede alcanzar los 3 metros de altura y pesar unos 180 kg");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avestruz.jpg")));
        buscarid.setText("16");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        descripcion.setText("Los buitres son aves rapaces del orden Falconiformes que suelen alimentarse especialmente de animales muertos, aunque a falta de estos, son capaces de cazar presas vivas. Los buitres se encuentran distribuidos por todos los continentes, excepto la Antártida y Oceanía");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buitre.jpeg")));
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/buitre.wav"));
        sonido.play();
        buscarid.setText("17");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void buscaridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaridActionPerformed

    }//GEN-LAST:event_buscaridActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscarid();
        datos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Menu obxM = new Menu();
        obxM.setVisible(true);
        Animales.this.setVisible(false);
    }//GEN-LAST:event_jButton18ActionPerformed

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
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarid;
    private javax.swing.JTable datos;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton oso;
    // End of variables declaration//GEN-END:variables
      String id = "";

    public void buscarid() {
        if (buscarid.getText().equals("")) {
            id = "Select * from animales";
        } else {
            id = "select * from animales where idanimal=" + buscarid.getText() + ";";
        }
    }

    public void datos() {
        DefaultTableModel mod = new DefaultTableModel();
        mod.addColumn("idanimal");
        mod.addColumn("nombreCientifico");
        mod.addColumn("nombreComun");
        mod.addColumn("peso");
        mod.addColumn("estatura");
        mod.addColumn("tipo");
        mod.addColumn("alimentacion");
        mod.addColumn("habitat");
        mod.addColumn("localizacionZoo");

        datos.setModel(mod);
        String[] dato = new String[9];
        Statement ps;
        try {

            Statement stm = (Statement) cn.createStatement();
            ResultSet rs = stm.executeQuery(id);
            while (rs.next()) {
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getString(5);
                dato[5] = rs.getString(6);
                dato[6] = rs.getString(7);
                dato[7] = rs.getString(8);
                dato[8] = rs.getString(9);

                mod.addRow(dato);
            }
            datos.setModel(mod);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
