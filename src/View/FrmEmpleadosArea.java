/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Dao.DaoEmpleado_C;
import Dao.DaoEmpleados;
import Dto.Empleado_C;
import Dto.Empleados;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jotruvel
 */
public class FrmEmpleadosArea extends javax.swing.JFrame {

    DefaultTableModel modelEmpleadosC;

    public void casillaempleadosc() {
        txt_id_empleado_acc.setEnabled(rootPaneCheckingEnabled);
        txt_nombre_acc.setEnabled(rootPaneCheckingEnabled);
        cbopuesto_a.setEnabled(rootPaneCheckingEnabled);
        txtcontraseña.setEnabled(rootPaneCheckingEnabled);
        txtcontraseña2.setEnabled(rootPaneCheckingEnabled);

    }

    public void casillaempleadoscB() {
        txt_id_empleado_acc.setEnabled(!rootPaneCheckingEnabled);
        txt_nombre_acc.setEnabled(!rootPaneCheckingEnabled);
        cbopuesto_a.setEnabled(!rootPaneCheckingEnabled);
        txtcontraseña.setEnabled(!rootPaneCheckingEnabled);
        txtcontraseña2.setEnabled(!rootPaneCheckingEnabled);

    }

    public void limpiarcasillas() {
        txt_id_empleado_acc.setText("");
        txt_nombre_acc.setText("");
        txtcontraseña.setText("");
        txtcontraseña2.setText("");
    }

    /**
     * Creates new form Frm_M_Personal
     */
    public FrmEmpleadosArea() {
        initComponents();
        setLocationRelativeTo(null);
        modelEmpleadosC = new DefaultTableModel();
        modelEmpleadosC.addColumn("Número de empleado");
        modelEmpleadosC.addColumn("Nombre");
        modelEmpleadosC.addColumn("Puesto");
        this.txt_tabla_acceso.setModel(modelEmpleadosC);
        DaoEmpleado_C da = new DaoEmpleado_C();
        da.clean();
        da.buscartabla(txt_tabla_acceso);
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
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_id_empleado_acc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_nombre_acc = new javax.swing.JTextField();
        cbopuesto_a = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_tabla_acceso = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtcontraseña2 = new javax.swing.JPasswordField();
        txtcontraseña = new javax.swing.JPasswordField();
        btn_buscar_empleado_a = new javax.swing.JButton();
        btn_guardar_empleado_a = new javax.swing.JButton();
        btn_actualizar_empleado_a = new javax.swing.JButton();
        btn_elimar_empleado_a = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_modificar_empleado_a = new javax.swing.JButton();
        txt_filtro_a = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(245, 93, 13));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Flecha.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton7)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Nombre empleado: ");

        txt_id_empleado_acc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_id_empleado_acc.setForeground(new java.awt.Color(14, 88, 136));
        txt_id_empleado_acc.setEnabled(false);
        txt_id_empleado_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_empleado_accActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("ID Empleado:");

        txt_nombre_acc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_nombre_acc.setForeground(new java.awt.Color(245, 93, 13));
        txt_nombre_acc.setEnabled(false);

        cbopuesto_a.setBackground(new java.awt.Color(204, 255, 255));
        cbopuesto_a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASISTENTE", "COORDINADOR", "DIRECTOR", "OTRO" }));
        cbopuesto_a.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Contraseña: ");

        txt_tabla_acceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(txt_tabla_acceso);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Puesto: ");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Contraseña: ");

        txtcontraseña2.setForeground(new java.awt.Color(245, 93, 13));
        txtcontraseña2.setEnabled(false);

        txtcontraseña.setForeground(new java.awt.Color(245, 93, 13));
        txtcontraseña.setEnabled(false);
        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });

        btn_buscar_empleado_a.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar_empleado_a.setText("BUSCAR");
        btn_buscar_empleado_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_empleado_aActionPerformed(evt);
            }
        });

        btn_guardar_empleado_a.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_guardar_empleado_a.setText("GUARDAR");
        btn_guardar_empleado_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_empleado_aActionPerformed(evt);
            }
        });

        btn_actualizar_empleado_a.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_actualizar_empleado_a.setText("ACTUALIZAR");
        btn_actualizar_empleado_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_empleado_aActionPerformed(evt);
            }
        });

        btn_elimar_empleado_a.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_elimar_empleado_a.setText("ELIMINAR");
        btn_elimar_empleado_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elimar_empleado_aActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Filtro.png"))); // NOI18N
        jLabel2.setText("N. Empleado");

        btn_modificar_empleado_a.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_modificar_empleado_a.setText("MODIFICAR");
        btn_modificar_empleado_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_empleado_aActionPerformed(evt);
            }
        });

        txt_filtro_a.setForeground(new java.awt.Color(245, 93, 13));
        txt_filtro_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_filtro_aKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_id_empleado_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombre_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbopuesto_a, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btn_buscar_empleado_a)
                                .addGap(18, 18, 18)
                                .addComponent(btn_actualizar_empleado_a)
                                .addGap(26, 26, 26)
                                .addComponent(btn_elimar_empleado_a))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcontraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addComponent(btn_guardar_empleado_a)
                                .addGap(18, 18, 18)
                                .addComponent(btn_modificar_empleado_a))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_filtro_a, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_id_empleado_acc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_nombre_acc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbopuesto_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(btn_buscar_empleado_a)
                    .addComponent(btn_actualizar_empleado_a)
                    .addComponent(btn_elimar_empleado_a))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtcontraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_guardar_empleado_a)
                            .addComponent(btn_modificar_empleado_a))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_filtro_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("CERTIFICACIÓN", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Boton para regresar

        FrmMenu f = new FrmMenu();
        f.show();
        this.hide();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_buscar_empleado_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_empleado_aActionPerformed
        // Botón buscar empleado

        DaoEmpleado_C e = new DaoEmpleado_C();
        Empleado_C em = e.buscar(txt_id_empleado_acc.getText());

        if (txt_id_empleado_acc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vacio");
        } else {
            if (!e.isIsError() && em != null) {
                if (!em.getId_empleadoa().equals("")) {
                    txt_id_empleado_acc.setText(em.getId_empleadoa());
                    txt_nombre_acc.setText(em.getNombrea());
                    cbopuesto_a.setSelectedItem(em.getPuestoa());
                    txtcontraseña.setText(em.getContraseñaa());

                }
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ENCONTRAR, ERROR: " + e.getError());
            }
        }
    }//GEN-LAST:event_btn_buscar_empleado_aActionPerformed

    private void btn_guardar_empleado_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_empleado_aActionPerformed
        // Botón Guardar Empleados

        Empleado_C e = new Empleado_C();
        e.setId_empleadoa(txt_id_empleado_acc.getText());
        e.setNombrea(txt_nombre_acc.getText());
        e.setPuestoa(cbopuesto_a.getSelectedItem().toString());
        e.setContraseñaa(txtcontraseña.getText());
        e.setContraseña2a(txtcontraseña2.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres guardar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            if (txtcontraseña.getText().equals(txtcontraseña2.getText())) {
                DaoEmpleado_C da = new DaoEmpleado_C();
                int res = da.insertarA(e);
                if (!da.isIsError() && res != 0) {

                    JOptionPane.showMessageDialog(null, "Se Agrego correctamente. ");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo agregar, error: " + da.getError());
                }

                modelEmpleadosC.getDataVector().removeAllElements();
                txt_tabla_acceso.updateUI();

                da.clean();
                da.buscartabla(txt_tabla_acceso);

            } else {
                JOptionPane.showMessageDialog(null, "LAS CONTRASEÑAS NO SON IGUALES.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }

        casillaempleadoscB();
        limpiarcasillas();

    }//GEN-LAST:event_btn_guardar_empleado_aActionPerformed

    private void btn_actualizar_empleado_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_empleado_aActionPerformed
        // Botón actualizar registros
        Empleado_C e = new Empleado_C();
        e.setId_empleadoa(txt_id_empleado_acc.getText());
        e.setNombrea(txt_nombre_acc.getText());
        e.setPuestoa(cbopuesto_a.getSelectedItem().toString());
        e.setContraseñaa(txtcontraseña.getText());
        e.setContraseña2a(txtcontraseña2.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres guardar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            if (txtcontraseña.getText().equals(txtcontraseña2.getText())) {
                DaoEmpleado_C da = new DaoEmpleado_C();
                int res = da.actualizar(e);
                if (!da.isIsError() && res != 0) {

                    JOptionPane.showMessageDialog(null, "Se Agrego correctamente. ");
                } else {

                    JOptionPane.showMessageDialog(null, "No se pudo agregar, error: " + da.getError());
                }

                modelEmpleadosC.getDataVector().removeAllElements();
                txt_tabla_acceso.updateUI();

                da.clean();
                da.buscartabla(txt_tabla_acceso);

            } else {
                JOptionPane.showMessageDialog(null, "LAS CONTRASEÑAS NO SON IGUALES.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }

        JOptionPane.showMessageDialog(null, "SE BLOQUEARAN LAS CASILLAS");

        casillaempleadoscB();
        limpiarcasillas();

    }//GEN-LAST:event_btn_actualizar_empleado_aActionPerformed

    private void btn_elimar_empleado_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimar_empleado_aActionPerformed
        // botón Eliminar empleado

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres eliminar el registro", "confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            if (txt_id_empleado_acc.getText().toString().equals("") || txt_id_empleado_acc.getText() == null) {

                JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR SI NO HAY MATRICULA");
            } else {
                DaoEmpleado_C da = new DaoEmpleado_C();
                int resultado = da.eliminar(txt_id_empleado_acc.getText());
                if (!da.isIsError() || resultado != 0) {

                    JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
                } else {

                    JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMAR EL REGISTRO, error: " + da.getError());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "NO SE REALIZO NINGUNA MODIFICACIÓN");
        }

        modelEmpleadosC.getDataVector().removeAllElements();
        txt_tabla_acceso.updateUI();
        DaoEmpleado_C da = new DaoEmpleado_C();
        da.clean();
        da.buscartabla(txt_tabla_acceso);
        casillaempleadoscB();
        limpiarcasillas();
    }//GEN-LAST:event_btn_elimar_empleado_aActionPerformed

    private void btn_modificar_empleado_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_empleado_aActionPerformed
        // DESBLOQUEAR PARA INGRESAR DATOS Y ACTUALIZAR
        FrmConfirmacionEmpleadosArea f = new FrmConfirmacionEmpleadosArea();
        f.show();
        this.hide();


    }//GEN-LAST:event_btn_modificar_empleado_aActionPerformed

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void txt_filtro_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtro_aKeyTyped
        // TODO add your handling code here:

        modelEmpleadosC.getDataVector().removeAllElements();
        txt_tabla_acceso.updateUI();
        DaoEmpleado_C da = new DaoEmpleado_C();
        da.clean();
        DaoEmpleado_C de = new DaoEmpleado_C();
        de.filtro(txt_tabla_acceso, txt_filtro_a.getText());
    }//GEN-LAST:event_txt_filtro_aKeyTyped

    private void txt_id_empleado_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_empleado_accActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_empleado_accActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEmpleadosArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleadosArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleadosArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleadosArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmpleadosArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar_empleado_a;
    private javax.swing.JButton btn_buscar_empleado_a;
    private javax.swing.JButton btn_elimar_empleado_a;
    private javax.swing.JButton btn_guardar_empleado_a;
    private javax.swing.JButton btn_modificar_empleado_a;
    private javax.swing.JComboBox<String> cbopuesto_a;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txt_filtro_a;
    private javax.swing.JTextField txt_id_empleado_acc;
    private javax.swing.JTextField txt_nombre_acc;
    private javax.swing.JTable txt_tabla_acceso;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JPasswordField txtcontraseña2;
    // End of variables declaration//GEN-END:variables
}
