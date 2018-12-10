package GUI;

import javax.swing.JOptionPane;
import Managers.*;

/**
 *
 * @author copec
 */
public class MainFrame extends javax.swing.JFrame {

    ManejadorUsuarios usersManager;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        usersManager = new ManejadorUsuarios();
        usersManager.cargaUsuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bienvenida = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        Centro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        xdxd = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        userNName = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        inicioSesion = new javax.swing.JLabel();
        crearcuenta = new javax.swing.JButton();
        iniciarSesion = new javax.swing.JButton();
        RegistrationPanel = new javax.swing.JPanel();
        registrarUsuario = new javax.swing.JLabel();
        IniciaSesion = new javax.swing.JButton();
        Registraruser = new javax.swing.JButton();
        userName = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        repeatPass = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        repeatPassField = new javax.swing.JPasswordField();
        typesOfUsers = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Botones = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        register = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(530, 410));
        setPreferredSize(new java.awt.Dimension(550, 430));
        setResizable(false);

        Bienvenida.setPreferredSize(new java.awt.Dimension(1000, 100));
        Bienvenida.setLayout(new java.awt.BorderLayout(15, 15));

        welcome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        welcome.setText("     BIENVENIDO AL PANEL DEL INVENTARIO");
        welcome.setAlignmentX(1.0F);
        welcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        welcome.setPreferredSize(new java.awt.Dimension(519, 29));
        Bienvenida.add(welcome, java.awt.BorderLayout.CENTER);

        getContentPane().add(Bienvenida, java.awt.BorderLayout.NORTH);

        Centro.setPreferredSize(new java.awt.Dimension(400, 0));
        Centro.setLayout(new java.awt.CardLayout());

        xdxd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xdxd.setText("Selecciona una opción de la parte izquierda.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(xdxd)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(xdxd)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        Centro.add(jPanel1, "card4");

        userNName.setText("Nombre de usuario");

        password.setText("Contraseña");

        inicioSesion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        inicioSesion.setText("INICIO DE SESIÓN");
        inicioSesion.setToolTipText("");

        crearcuenta.setText("Crear usuario");
        crearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearcuentaActionPerformed(evt);
            }
        });

        iniciarSesion.setText("Iniciar Sesion");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addComponent(crearcuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(iniciarSesion))
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginPanelLayout.createSequentialGroup()
                                    .addComponent(userNName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginPanelLayout.createSequentialGroup()
                                    .addComponent(password)
                                    .addGap(71, 71, 71)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(inicioSesion)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(inicioSesion)
                .addGap(45, 45, 45)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNName)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearcuenta)
                    .addComponent(iniciarSesion))
                .addGap(21, 21, 21))
        );

        Centro.add(loginPanel, "card2");

        registrarUsuario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        registrarUsuario.setText("REGISTRAR USUARIO");

        IniciaSesion.setText("Iniciar sesion");
        IniciaSesion.setPreferredSize(new java.awt.Dimension(115, 23));
        IniciaSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciaSesionActionPerformed(evt);
            }
        });

        Registraruser.setText("Registrar usuario");
        Registraruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistraruserActionPerformed(evt);
            }
        });

        userName.setText("Nombre de usuario");

        pass.setText("Contraseña");

        repeatPass.setText("Repetir contraseña");

        typesOfUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operador", "Consultor", "Administrador" }));

        jLabel1.setText("Tipo de usuario");

        javax.swing.GroupLayout RegistrationPanelLayout = new javax.swing.GroupLayout(RegistrationPanel);
        RegistrationPanel.setLayout(RegistrationPanelLayout);
        RegistrationPanelLayout.setHorizontalGroup(
            RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrationPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(registrarUsuario)
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(RegistrationPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrationPanelLayout.createSequentialGroup()
                        .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(typesOfUsers, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(repeatPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pass, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(53, 53, 53)
                        .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userNameTextField)
                                .addComponent(passField)
                                .addComponent(repeatPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                            .addComponent(Registraruser)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(IniciaSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegistrationPanelLayout.setVerticalGroup(
            RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registrarUsuario)
                .addGap(18, 18, 18)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userName)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repeatPass)
                    .addComponent(repeatPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typesOfUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IniciaSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registraruser))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        Centro.add(RegistrationPanel, "card3");

        getContentPane().add(Centro, java.awt.BorderLayout.EAST);

        Botones.setPreferredSize(new java.awt.Dimension(120, 0));

        login.setText("Iniciar");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        register.setText("Registrar");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotonesLayout = new javax.swing.GroupLayout(Botones);
        Botones.setLayout(BotonesLayout);
        BotonesLayout.setHorizontalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        BotonesLayout.setVerticalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(login)
                .addGap(49, 49, 49)
                .addComponent(register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(22, 22, 22))
        );

        getContentPane().add(Botones, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Esta seguro?", "InfoBox: " + "confirmar", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            usersManager.guardaUsuario();
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void crearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearcuentaActionPerformed
        Centro.removeAll();
        Centro.repaint();
        Centro.revalidate();
        Centro.add(RegistrationPanel);
        Centro.repaint();
        Centro.revalidate();
    }//GEN-LAST:event_crearcuentaActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        Centro.removeAll();
        Centro.repaint();
        Centro.revalidate();
        Centro.add(RegistrationPanel);
        Centro.repaint();
        Centro.revalidate();
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        Centro.removeAll();
        Centro.repaint();
        Centro.revalidate();
        Centro.add(loginPanel);
        Centro.repaint();
        Centro.revalidate();
    }//GEN-LAST:event_loginActionPerformed

    private void IniciaSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciaSesionActionPerformed
        Centro.removeAll();
        Centro.repaint();
        Centro.revalidate();
        Centro.add(loginPanel);
        Centro.repaint();
        Centro.revalidate();
    }//GEN-LAST:event_IniciaSesionActionPerformed

    private void RegistraruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistraruserActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Esta seguro?", "InfoBox: " + "confirmar", JOptionPane.OK_CANCEL_OPTION);
       if(result == JOptionPane.OK_OPTION){
       registrar();
       usersManager.guardaUsuario();
       }
    }//GEN-LAST:event_RegistraruserActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public void registrar(){
        boolean jajatl;
        if(userNameTextField.getText().equals("") || passField.getText().equals("") || repeatPassField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "No se pueden dejar campos en blanco.", "Error en campos", JOptionPane.ERROR_MESSAGE);
        }if(!(passField.getText().equals(repeatPassField.getText()))){
        JOptionPane.showMessageDialog(this, "Contraseñas discrepantes.", "Error contraseñas", JOptionPane.ERROR_MESSAGE);
        }else{
        jajatl = usersManager.validarUsuario(userNameTextField.getText(), passField.getText());
        if(jajatl){
           JOptionPane.showMessageDialog(this, "Nombre de usuario ya está en uso.", "Error nombre de Usuario", JOptionPane.ERROR_MESSAGE);
        }else{
            usersManager.agregarUsuario(userNameTextField.getText(), passField.getText(), (typesOfUsers.getSelectedIndex()+1));
            JOptionPane.showMessageDialog(this, "Usuario creado satisfactoriamente", "Usuario creado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bienvenida;
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel Centro;
    private javax.swing.JButton IniciaSesion;
    private javax.swing.JButton Registraruser;
    private javax.swing.JPanel RegistrationPanel;
    private javax.swing.JButton crearcuenta;
    private javax.swing.JButton exit;
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JLabel inicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton register;
    private javax.swing.JLabel registrarUsuario;
    private javax.swing.JLabel repeatPass;
    private javax.swing.JPasswordField repeatPassField;
    private javax.swing.JComboBox<String> typesOfUsers;
    private javax.swing.JLabel userNName;
    private javax.swing.JLabel userName;
    private javax.swing.JTextField userNameField;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JLabel welcome;
    private javax.swing.JLabel xdxd;
    // End of variables declaration//GEN-END:variables
}
