/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmMenu.java
 *
 * Created on 13/08/2010, 03:00:55 PM
 */

package ComponentePresentacion;

//import ComponenteDatos.BDReporteProductos;
//import ComponenteReportes.ReporteEmpleado;
import javax.swing.UIManager;
import java.util.Date;
import java.text.SimpleDateFormat;


/**
 *
 * @author Richard
 */
public abstract class FrmMenu extends javax.swing.JFrame {
    // private BDReporteProductos jasper;
     //private ReporteEmpleado jasper;
    /** Creates new form FrmMenu */
   
    public FrmMenu() {
        this.setUndecorated(true);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        this.setLocationRelativeTo(null);
        //jasper = new ReporteEmpleado();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNomUserlogeado = new javax.swing.JLabel();
        lblApUsuariologeado = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMInicio = new javax.swing.JMenu();
        JMISalir = new javax.swing.JMenuItem();
        JMVenta = new javax.swing.JMenu();
        JMIGenerarVenta = new javax.swing.JMenuItem();
        JMMantenimiento = new javax.swing.JMenu();
        JMICategoria = new javax.swing.JMenuItem();
        JMICliente = new javax.swing.JMenuItem();
        JMIEmpleado = new javax.swing.JMenuItem();
        JMIProducto = new javax.swing.JMenuItem();
        JMIProveedor = new javax.swing.JMenuItem();
        JMIDetProv = new javax.swing.JMenuItem();
        JMIUsuario = new javax.swing.JMenuItem();
        JMReportes = new javax.swing.JMenu();
        JMReporteEmpleado = new javax.swing.JMenuItem();
        JMAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(70, 99, 138));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/imageToMP.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 16));
        jLabel4.setText("BRINDAR UN BUEN SERVICIO AL CLIENTE ES LO PRIMORDIAL ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 16));
        jLabel8.setText("POR ESO ATIENDELO BIEN Y SERAS RECOMPENSADO.....");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addContainerGap(244, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        jButton1.setText("AÑADIR ");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        jButton2.setText("ELIMINAR");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator2);

        jButton3.setText("BUSCAR");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator3);

        jButton4.setText("NUEVO");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 30));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BIENVENIDOS AL SISTEMA");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/p031_1_00.jpg"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DE MINIMARKET MAICKOL");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hora :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("00h:00m:00s");

        lblNomUserlogeado.setFont(new java.awt.Font("Californian FB", 0, 16));
        lblNomUserlogeado.setForeground(new java.awt.Color(255, 255, 255));
        lblNomUserlogeado.setText("Nombrel Usuario");

        lblApUsuariologeado.setFont(new java.awt.Font("Californian FB", 0, 16));
        lblApUsuariologeado.setForeground(new java.awt.Color(255, 255, 255));
        lblApUsuariologeado.setText("datos compltos del usuario que se logeo");

        jLabel11.setFont(new java.awt.Font("Californian FB", 0, 16));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblNomUserlogeado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblApUsuariologeado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(17, 17, 17)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10)
                            .addGap(60, 60, 60)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(101, 101, 101))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomUserlogeado)
                            .addComponent(jLabel11)
                            .addComponent(lblApUsuariologeado))
                        .addGap(11, 11, 11)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JMInicio.setText("INICIO");

        JMISalir.setText("Salir");
        JMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMISalirActionPerformed(evt);
            }
        });
        JMInicio.add(JMISalir);

        jMenuBar1.add(JMInicio);

        JMVenta.setText("VENTA");

        JMIGenerarVenta.setText("Generar Venta");
        JMIGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIGenerarVentaActionPerformed(evt);
            }
        });
        JMVenta.add(JMIGenerarVenta);

        jMenuBar1.add(JMVenta);

        JMMantenimiento.setText("MANTENIMIENTO");

        JMICategoria.setText("CATEGORIA");
        JMICategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICategoriaActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMICategoria);

        JMICliente.setText("CLIENTE");
        JMICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIClienteActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMICliente);

        JMIEmpleado.setText("EMPLEADO");
        JMIEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIEmpleadoActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMIEmpleado);

        JMIProducto.setText("PRODUCTO");
        JMIProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIProductoActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMIProducto);

        JMIProveedor.setText("PROVEEDOR");
        JMIProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIProveedorActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMIProveedor);

        JMIDetProv.setText("DETALLE-PROVEEDOR");
        JMIDetProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIDetProvActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMIDetProv);

        JMIUsuario.setText("USUARIO");
        JMIUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIUsuarioActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMIUsuario);

        jMenuBar1.add(JMMantenimiento);

        JMReportes.setText("REPORTES");

        JMReporteEmpleado.setText("REPORTE D' EMPLEADOS");
        JMReporteEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMReporteEmpleadoActionPerformed(evt);
            }
        });
        JMReportes.add(JMReporteEmpleado);

        jMenuBar1.add(JMReportes);

        JMAyuda.setText("AYUDA");
        jMenuBar1.add(JMAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMICategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICategoriaActionPerformed
        // TODO add your handling code here:
        FrmCategoria Frmc= new FrmCategoria();
        Frmc.setVisible(true);
    }//GEN-LAST:event_JMICategoriaActionPerformed

    private void JMIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIClienteActionPerformed
        // TODO add your handling code here:
        FrmCliente Frmcl= new FrmCliente();
        Frmcl.setVisible(true);
    }//GEN-LAST:event_JMIClienteActionPerformed

    private void JMIEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIEmpleadoActionPerformed
        // TODO add your handling code here:
        FrmEmpleado Frme= new FrmEmpleado();
        Frme.setVisible(true);
    }//GEN-LAST:event_JMIEmpleadoActionPerformed

    private void JMIProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIProductoActionPerformed
        // TODO add your handling code here:
        FrmProducto Frmp= new FrmProducto();
        Frmp.setVisible(true);
    }//GEN-LAST:event_JMIProductoActionPerformed

    private void JMIProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIProveedorActionPerformed
        // TODO add your handling code here:
        FrmProveedor Frmp= new FrmProveedor();
        Frmp.setVisible(true);
    }//GEN-LAST:event_JMIProveedorActionPerformed

    private void JMIUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIUsuarioActionPerformed
        // TODO add your handling code here:
        FrmUsuario FrmUs= new FrmUsuario();
        FrmUs.setVisible(true);
    }//GEN-LAST:event_JMIUsuarioActionPerformed

    private void JMIGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGenerarVentaActionPerformed
        // TODO add your handling code here:
        FrmNuevaCompra FrmComp= new FrmNuevaCompra();
        FrmComp.setVisible(true);
    }//GEN-LAST:event_JMIGenerarVentaActionPerformed

    private void JMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMISalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JMISalirActionPerformed

    private void JMIDetProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIDetProvActionPerformed
        // TODO add your handling code here:
        FrmDetalleProveedor frmdp= new FrmDetalleProveedor();
        frmdp.setVisible(true);

    }//GEN-LAST:event_JMIDetProvActionPerformed

    private void JMReporteEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMReporteEmpleadoActionPerformed
        // TODO add your handling code here:
         //jasper.runReporteEmpleado();
    }//GEN-LAST:event_JMReporteEmpleadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmMenu() {}.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMAyuda;
    private javax.swing.JMenuItem JMICategoria;
    private javax.swing.JMenuItem JMICliente;
    private javax.swing.JMenuItem JMIDetProv;
    private javax.swing.JMenuItem JMIEmpleado;
    private javax.swing.JMenuItem JMIGenerarVenta;
    private javax.swing.JMenuItem JMIProducto;
    private javax.swing.JMenuItem JMIProveedor;
    private javax.swing.JMenuItem JMISalir;
    private javax.swing.JMenuItem JMIUsuario;
    private javax.swing.JMenu JMInicio;
    private javax.swing.JMenu JMMantenimiento;
    private javax.swing.JMenuItem JMReporteEmpleado;
    private javax.swing.JMenu JMReportes;
    private javax.swing.JMenu JMVenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JLabel lblApUsuariologeado;
    public static javax.swing.JLabel lblNomUserlogeado;
    // End of variables declaration//GEN-END:variables

}
