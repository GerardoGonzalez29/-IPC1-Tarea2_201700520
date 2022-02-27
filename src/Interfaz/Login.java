package Interfaz;
import javax.swing.JOptionPane;
/**
 *
 * @author Gerardo_PC
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonlogin = new javax.swing.JButton();
        botonsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        texusuario = new javax.swing.JTextField();
        texpass = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonlogin.setText("Login");
        botonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonloginActionPerformed(evt);
            }
        });
        jPanel1.add(botonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 150, 40));

        botonsalir.setText("Salir");
        botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 150, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 200, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 200, 40));
        jPanel1.add(texusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 410, 30));
        jPanel1.add(texpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 410, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonloginActionPerformed
        String user = "Jose Gerardo Gonzalez Marroquin";
        String pass = "201700520";

        String userin = texusuario.getText();
        String passin = texpass.getText();

        if (userin.equals(user) && passin.equals(pass)) {
            Principal prin = new Principal();
            prin.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "El usuario y la contraseña no coinciden");
        }

    }//GEN-LAST:event_botonloginActionPerformed

    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonsalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonlogin;
    private javax.swing.JButton botonsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField texpass;
    private javax.swing.JTextField texusuario;
    // End of variables declaration//GEN-END:variables
}
