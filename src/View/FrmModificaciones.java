/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Dao.DaoCarrerasUnitec;
import Dao.DaoEmpleados;
import Dao.DaoEscuelasProcedencia;
import Dao.DaoEscuelasUnitec;
import Dao.DaoEstados;
import Dao.DaoIngreso;
import Dao.DaoIngresoGral;
import Dao.DaoMediosTitulacion;
import Dao.DaoPais;
import Dto.CarrerasUnitec;
import Dto.Empleados;
import Dto.EscuelasProcedencia;
import Dto.EscuelasUnitec;
import Dto.Estados;
import Dto.Ingreso;
import Dto.IngresoGeneral;
import Dto.MediosTitulacion;
import Dto.Pais;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jotruvel
 */
public class FrmModificaciones extends javax.swing.JFrame {

    DefaultTableModel modeloEmpleados;
    DefaultTableModel modeloescuelasunitec;
    DefaultTableModel modelocarrerasunitec;
    DefaultTableModel modeloescuelasprocedencia;
    DefaultTableModel modelopais;
    DefaultTableModel modelomedios_titulacion;
    DefaultTableModel modeloestados;
    DefaultTableModel modeloingreso;
    DefaultTableModel modeloingreso_general;

    public void desbloquear() {
        txtid_empleado.setEnabled(rootPaneCheckingEnabled);
        txtnombre.setEnabled(rootPaneCheckingEnabled);
        cbopuesto.setEnabled(rootPaneCheckingEnabled);
        txtcontraseña.setEnabled(rootPaneCheckingEnabled);
        txtcontraseña2.setEnabled(rootPaneCheckingEnabled);
        txtid_escuela.setEnabled(rootPaneCheckingEnabled);
        txtnombre_escuela.setEnabled(rootPaneCheckingEnabled);
        txtid_careras_unitec.setEnabled(rootPaneCheckingEnabled);
        txtnombre_carreras_unitec.setEnabled(rootPaneCheckingEnabled);
        txtidescuela_p.setEnabled(!rootPaneCheckingEnabled);
        txtescuela_p.setEnabled(!rootPaneCheckingEnabled);
        txtid_medio_titulacion.setEnabled(rootPaneCheckingEnabled);
        txtmedio_titulacion.setEnabled(rootPaneCheckingEnabled);
        txtidescuela_p.setEnabled(rootPaneCheckingEnabled);
        txtescuela_p.setEnabled(rootPaneCheckingEnabled);
        txt_id_ingreso.setEnabled(rootPaneCheckingEnabled);
        txt_ingreso.setEnabled(rootPaneCheckingEnabled);
        txt_id_ingreso_gral.setEnabled(rootPaneCheckingEnabled);
        txt_ingreso_gral.setEnabled(rootPaneCheckingEnabled);

    }

    public void bloquear() {
        txtid_empleado.setEnabled(!rootPaneCheckingEnabled);
        txtnombre.setEnabled(!rootPaneCheckingEnabled);
        cbopuesto.setEnabled(!rootPaneCheckingEnabled);
        txtcontraseña.setEnabled(!rootPaneCheckingEnabled);
        txtcontraseña2.setEnabled(!rootPaneCheckingEnabled);
        txtid_escuela.setEnabled(!rootPaneCheckingEnabled);
        txtnombre_escuela.setEnabled(!rootPaneCheckingEnabled);
        txtid_careras_unitec.setEnabled(!rootPaneCheckingEnabled);
        txtnombre_carreras_unitec.setEnabled(!rootPaneCheckingEnabled);
        txtidescuela_p.setEnabled(!rootPaneCheckingEnabled);
        txtescuela_p.setEnabled(!rootPaneCheckingEnabled);
        txtid_medio_titulacion.setEnabled(!rootPaneCheckingEnabled);
        txtmedio_titulacion.setEnabled(!rootPaneCheckingEnabled);
        txtidescuela_p.setEnabled(!rootPaneCheckingEnabled);
        txtescuela_p.setEnabled(!rootPaneCheckingEnabled);
        txt_id_ingreso.setEnabled(!rootPaneCheckingEnabled);
        txt_ingreso.setEnabled(!rootPaneCheckingEnabled);
        txt_id_ingreso_gral.setEnabled(!rootPaneCheckingEnabled);
        txt_ingreso_gral.setEnabled(!rootPaneCheckingEnabled);
    }


    public void limpiarcasillas() {
        txtid_empleado.setText("");
        txtnombre.setText("");
        txtcontraseña.setText("");
        txtcontraseña2.setText("");
        txtid_escuela.setText("");
        txtnombre_escuela.setText("");
        txtid_careras_unitec.setText("");
        txtnombre_carreras_unitec.setText("");
        txtnombre_carreras_unitec.setText("");
        txtescuela_p.setText("");
        txtidescuela_p.setText("");
        txtid_medio_titulacion.setText("");
        txtmedio_titulacion.setText("");
        txt_id_ingreso.setText("");
        txt_ingreso.setText("");
        txt_id_ingreso_gral.setText("");
        txt_ingreso_gral.setText("");


    }

    /**
     * Creates new form FrmModificaciones
     */
    public FrmModificaciones() {

        initComponents();
        setLocationRelativeTo(null);
        modeloEmpleados = new DefaultTableModel();
        modeloEmpleados.addColumn("Número de Empleado");
        modeloEmpleados.addColumn("Nombre");
        modeloEmpleados.addColumn("Puesto");
        this.tablaEmpleados.setModel(modeloEmpleados);
        DaoEmpleados da = new DaoEmpleados();
        da.clean();
        da.buscartabla(tablaEmpleados);
        // TABLA ESCUELAS UNITEC
        modeloescuelasunitec = new DefaultTableModel();
        modeloescuelasunitec.addColumn("Número de escuela");
        modeloescuelasunitec.addColumn("Nombre de la escuela");
        this.tablaescuelas_unitec.setModel(modeloescuelasunitec);
        DaoEscuelasUnitec de = new DaoEscuelasUnitec();
        de.clean();
        de.buscartabla(tablaescuelas_unitec);
        // TABLA CARRERAS UNITEC
        modelocarrerasunitec = new DefaultTableModel();
        modelocarrerasunitec.addColumn("ID Carrera");
        modelocarrerasunitec.addColumn("Nombre Carrera");
        this.tablacarreras_unitec.setModel(modelocarrerasunitec);
        DaoCarrerasUnitec di = new DaoCarrerasUnitec();
        di.clean();
        di.buscartabla(tablacarreras_unitec);
        //TABLA ESCUELAS DE PROCEDENCIA
        modeloescuelasprocedencia = new DefaultTableModel();
        modeloescuelasprocedencia.addColumn("ID Escuela");
        modeloescuelasprocedencia.addColumn("Nombre de la Escuela");
        this.tablaescuelas_procedencia.setModel(modeloescuelasprocedencia);
        DaoEscuelasProcedencia du = new DaoEscuelasProcedencia();
        du.clean();
        du.buscartabla(tablaescuelas_procedencia);
        //TABLA PAIS
       
        //TABLA MEDIOS TITULACIÓN
        modelomedios_titulacion = new DefaultTableModel();
        modelomedios_titulacion.addColumn("ID Medio Titulacion");
        modelomedios_titulacion.addColumn("Medio Titulacion");
        this.tablamedios_titulacion.setModel(modelomedios_titulacion);
        DaoMediosTitulacion od = new DaoMediosTitulacion();
        od.clean();
        od.buscartabla(tablamedios_titulacion);

        //TABLA ESTADOS
        
        //variable

        //TABLA INGRESOS
        modeloingreso = new DefaultTableModel();
        modeloingreso.addColumn("ID Ingreso");
        modeloingreso.addColumn("Ingreso");
        this.tabla_ingreso.setModel(modeloingreso);
        DaoIngreso din = new DaoIngreso();
        din.clean();
        din.buscartabla(tabla_ingreso);

        //TABLA INGRESO GENERAL
        modeloingreso_general = new DefaultTableModel();
        modeloingreso_general.addColumn("ID Ingreso_General");
        modeloingreso_general.addColumn("Ingreso General");
        this.tabla_ingreso_general.setModel(modeloingreso_general);
        DaoIngresoGral ding = new DaoIngresoGral();
        ding.clean();
        ding.buscartabla(tabla_ingreso_general);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtid_empleado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        cbopuesto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtcontraseña2 = new javax.swing.JPasswordField();
        txtcontraseña = new javax.swing.JPasswordField();
        btnBuscarEmpleado = new javax.swing.JButton();
        btnGuardarEmpleados = new javax.swing.JButton();
        btnActualizarEmpleado = new javax.swing.JButton();
        btnelimarEmpleado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtid_escuela = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnguardarEscuelasUnitec = new javax.swing.JButton();
        btnBuscarEscuelaUnitec = new javax.swing.JButton();
        btn_act = new javax.swing.JButton();
        btneliminarEscuelaUnitec = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaescuelas_unitec = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_filtro_esc = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        txtnombre_escuela = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtid_careras_unitec = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtnombre_carreras_unitec = new javax.swing.JTextField();
        btnGuardarCarrerasUnitec = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnEliminarCarreraUnitec = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablacarreras_unitec = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txt_filtro_carr = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtidescuela_p = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtescuela_p = new javax.swing.JTextField();
        btnguardarEscuelaProcedencia = new javax.swing.JButton();
        btnBuscarEscuelaProcedencia = new javax.swing.JButton();
        btnActualizarEscuelasProcedencia = new javax.swing.JButton();
        btnEliminarEscuelasProcedencia = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaescuelas_procedencia = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_filtro_p = new javax.swing.JTextField();
        btn_modificar_ep = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtid_medio_titulacion = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtmedio_titulacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnEliminarMediotitulacion = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablamedios_titulacion = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txt_filtro_t = new javax.swing.JTextField();
        btn_modificar_mt = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txt_id_ingreso = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_ingreso = new javax.swing.JTextField();
        btn_buscar_ingreso = new javax.swing.JButton();
        btn_actualizar_ingreso = new javax.swing.JButton();
        btn_eliminar_ingreso = new javax.swing.JButton();
        btn_guardar_ingreso = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla_ingreso = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        txt_filtro_ingreso = new javax.swing.JTextField();
        btn_modificar_i = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabla_ingreso_general = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txt_id_ingreso_gral = new javax.swing.JTextField();
        txt_ingreso_gral = new javax.swing.JTextField();
        btn_ingreso_gral = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txt_filtro_ingreso_gral = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        btn_modificar_ig = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(14, 88, 136));

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
                .addGap(150, 150, 150))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Nombre empleado: ");

        txtid_empleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtid_empleado.setForeground(new java.awt.Color(0, 51, 153));
        txtid_empleado.setEnabled(false);
        txtid_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_empleadoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Número empleado: ");

        txtnombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(245, 93, 13));
        txtnombre.setEnabled(false);

        cbopuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASISTENTE", "COORDINADOR", "DIRECTOR", "OTRO" }));
        cbopuesto.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Contraseña: ");

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Puesto: ");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Contraseña: ");

        txtcontraseña2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcontraseña2.setForeground(new java.awt.Color(0, 51, 153));
        txtcontraseña2.setEnabled(false);

        txtcontraseña.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcontraseña.setForeground(new java.awt.Color(0, 51, 153));
        txtcontraseña.setEnabled(false);

        btnBuscarEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscarEmpleado.setText("BUSCAR");
        btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoActionPerformed(evt);
            }
        });

        btnGuardarEmpleados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardarEmpleados.setForeground(new java.awt.Color(0, 153, 0));
        btnGuardarEmpleados.setText("GUARDAR");
        btnGuardarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadosActionPerformed(evt);
            }
        });

        btnActualizarEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnActualizarEmpleado.setText("ACTUALIZAR");
        btnActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEmpleadoActionPerformed(evt);
            }
        });

        btnelimarEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnelimarEmpleado.setForeground(new java.awt.Color(255, 0, 0));
        btnelimarEmpleado.setText("ELIMINAR");
        btnelimarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelimarEmpleadoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Filtro.png"))); // NOI18N
        jLabel2.setText("Nombre Empleado");

        txt_filtro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_filtro.setForeground(new java.awt.Color(245, 93, 13));
        txt_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroActionPerformed(evt);
            }
        });
        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_filtroKeyTyped(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton11.setText("MODIFICAR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
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
                                .addComponent(txtid_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbopuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnBuscarEmpleado)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizarEmpleado)
                                .addGap(26, 26, 26)
                                .addComponent(btnelimarEmpleado))
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
                                .addComponent(btnGuardarEmpleados)
                                .addGap(18, 18, 18)
                                .addComponent(jButton11))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtid_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbopuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(btnBuscarEmpleado)
                    .addComponent(btnActualizarEmpleado)
                    .addComponent(btnelimarEmpleado))
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
                            .addComponent(btnGuardarEmpleados)
                            .addComponent(jButton11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("EMPLEADOS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("ID escuela: ");

        txtid_escuela.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtid_escuela.setForeground(new java.awt.Color(14, 88, 136));
        txtid_escuela.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Nombre Escuela: ");

        btnguardarEscuelasUnitec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnguardarEscuelasUnitec.setForeground(new java.awt.Color(0, 153, 0));
        btnguardarEscuelasUnitec.setText("GUARDAR");
        btnguardarEscuelasUnitec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarEscuelasUnitecActionPerformed(evt);
            }
        });

        btnBuscarEscuelaUnitec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscarEscuelaUnitec.setText("BUSCAR");
        btnBuscarEscuelaUnitec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEscuelaUnitecActionPerformed(evt);
            }
        });

        btn_act.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_act.setText("ACTUALIZAR");
        btn_act.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actActionPerformed(evt);
            }
        });

        btneliminarEscuelaUnitec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btneliminarEscuelaUnitec.setForeground(new java.awt.Color(255, 0, 0));
        btneliminarEscuelaUnitec.setText("ELIMINAR");
        btneliminarEscuelaUnitec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarEscuelaUnitecActionPerformed(evt);
            }
        });

        tablaescuelas_unitec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaescuelas_unitec);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Filtro.png"))); // NOI18N
        jLabel3.setText("Nombre Escuela");

        txt_filtro_esc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_filtro_esc.setForeground(new java.awt.Color(245, 93, 13));
        txt_filtro_esc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtro_escActionPerformed(evt);
            }
        });
        txt_filtro_esc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_filtro_escKeyTyped(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton13.setText("MODIFICAR");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        txtnombre_escuela.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtnombre_escuela.setForeground(new java.awt.Color(245, 93, 13));
        txtnombre_escuela.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_filtro_esc, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jButton13)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_act))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtid_escuela, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtnombre_escuela, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnguardarEscuelasUnitec)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscarEscuelaUnitec)
                                        .addGap(48, 48, 48)
                                        .addComponent(btneliminarEscuelaUnitec)))))
                        .addGap(0, 268, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtid_escuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(btnBuscarEscuelaUnitec)
                    .addComponent(btneliminarEscuelaUnitec)
                    .addComponent(txtnombre_escuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardarEscuelasUnitec))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(btn_act))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_filtro_esc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ESCUELAS UNITEC", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("ID carrera: ");

        txtid_careras_unitec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtid_careras_unitec.setForeground(new java.awt.Color(14, 88, 136));
        txtid_careras_unitec.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("Nombre Escuela: ");

        txtnombre_carreras_unitec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtnombre_carreras_unitec.setForeground(new java.awt.Color(245, 93, 13));
        txtnombre_carreras_unitec.setEnabled(false);

        btnGuardarCarrerasUnitec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardarCarrerasUnitec.setForeground(new java.awt.Color(0, 153, 0));
        btnGuardarCarrerasUnitec.setText("GUARDAR");
        btnGuardarCarrerasUnitec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCarrerasUnitecActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton4.setText("ACTUALIZAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnEliminarCarreraUnitec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminarCarreraUnitec.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarCarreraUnitec.setText("ELIMINAR");
        btnEliminarCarreraUnitec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCarreraUnitecActionPerformed(evt);
            }
        });

        tablacarreras_unitec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablacarreras_unitec);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Filtro.png"))); // NOI18N
        jLabel5.setText("Nombre carrera");

        txt_filtro_carr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtro_carrActionPerformed(evt);
            }
        });
        txt_filtro_carr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_filtro_carrKeyTyped(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton14.setText("MODIFICAR");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_filtro_carr, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(btnGuardarCarrerasUnitec)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton14))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtid_careras_unitec, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre_carreras_unitec, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(jButton2)
                                .addGap(31, 31, 31)
                                .addComponent(jButton4)
                                .addGap(29, 29, 29)
                                .addComponent(btnEliminarCarreraUnitec)))
                        .addGap(0, 162, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtid_careras_unitec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtnombre_carreras_unitec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(btnEliminarCarreraUnitec))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCarrerasUnitec)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_filtro_carr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CARRERAS UNITEC", jPanel5);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("ID Escuela: ");

        txtidescuela_p.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtidescuela_p.setForeground(new java.awt.Color(14, 88, 136));
        txtidescuela_p.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("Escuela Procedencia:");

        txtescuela_p.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtescuela_p.setForeground(new java.awt.Color(245, 93, 13));
        txtescuela_p.setEnabled(false);
        txtescuela_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtescuela_pActionPerformed(evt);
            }
        });

        btnguardarEscuelaProcedencia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnguardarEscuelaProcedencia.setForeground(new java.awt.Color(0, 153, 0));
        btnguardarEscuelaProcedencia.setText("GUARDAR");
        btnguardarEscuelaProcedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarEscuelaProcedenciaActionPerformed(evt);
            }
        });

        btnBuscarEscuelaProcedencia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscarEscuelaProcedencia.setText("BUSCAR");
        btnBuscarEscuelaProcedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEscuelaProcedenciaActionPerformed(evt);
            }
        });

        btnActualizarEscuelasProcedencia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnActualizarEscuelasProcedencia.setText("ACTUALIZAR");
        btnActualizarEscuelasProcedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEscuelasProcedenciaActionPerformed(evt);
            }
        });

        btnEliminarEscuelasProcedencia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminarEscuelasProcedencia.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarEscuelasProcedencia.setText("ELIMINAR");
        btnEliminarEscuelasProcedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEscuelasProcedenciaActionPerformed(evt);
            }
        });

        tablaescuelas_procedencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaescuelas_procedencia);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Filtro.png"))); // NOI18N
        jLabel6.setText("NombreProcedencia");

        txt_filtro_p.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_filtro_p.setForeground(new java.awt.Color(245, 93, 13));
        txt_filtro_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtro_pActionPerformed(evt);
            }
        });
        txt_filtro_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_filtro_pKeyTyped(evt);
            }
        });

        btn_modificar_ep.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_modificar_ep.setText("MODIFICAR");
        btn_modificar_ep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_epActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(txtidescuela_p, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtescuela_p, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(btnBuscarEscuelaProcedencia)
                                        .addGap(46, 46, 46)
                                        .addComponent(btnActualizarEscuelasProcedencia)
                                        .addGap(27, 27, 27)
                                        .addComponent(btnEliminarEscuelasProcedencia))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(btnguardarEscuelaProcedencia)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_modificar_ep))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_filtro_p, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 159, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtidescuela_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtescuela_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEscuelaProcedencia)
                    .addComponent(btnActualizarEscuelasProcedencia)
                    .addComponent(btnEliminarEscuelasProcedencia))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardarEscuelaProcedencia)
                    .addComponent(btn_modificar_ep))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_filtro_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ESCUELAS PROCEDENCIA", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setText("ID Titulación: ");

        txtid_medio_titulacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtid_medio_titulacion.setForeground(new java.awt.Color(14, 88, 136));
        txtid_medio_titulacion.setEnabled(false);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setText("Titulación: ");

        txtmedio_titulacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtmedio_titulacion.setForeground(new java.awt.Color(245, 93, 13));
        txtmedio_titulacion.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 0));
        jButton5.setText("GUARDAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton6.setText("ACTUALIZAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnEliminarMediotitulacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminarMediotitulacion.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarMediotitulacion.setText("ELIMINAR");
        btnEliminarMediotitulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMediotitulacionActionPerformed(evt);
            }
        });

        tablamedios_titulacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tablamedios_titulacion);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Filtro.png"))); // NOI18N
        jLabel14.setText("Nombre Medio T.");

        txt_filtro_t.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_filtro_t.setForeground(new java.awt.Color(245, 93, 13));
        txt_filtro_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtro_tActionPerformed(evt);
            }
        });
        txt_filtro_t.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_filtro_tKeyTyped(evt);
            }
        });

        btn_modificar_mt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_modificar_mt.setText("MODIFICAR");
        btn_modificar_mt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_mtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_filtro_t, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(txtid_medio_titulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtmedio_titulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(jButton1)
                                        .addGap(72, 72, 72)
                                        .addComponent(jButton6)
                                        .addGap(70, 70, 70)
                                        .addComponent(btnEliminarMediotitulacion))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_modificar_mt)))))
                        .addGap(0, 404, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtid_medio_titulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtmedio_titulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton6)
                    .addComponent(btnEliminarMediotitulacion))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(btn_modificar_mt))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtro_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MEDIOS TITULACIÓN", jPanel9);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setText("ID Ingreso:");

        txt_id_ingreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_id_ingreso.setForeground(new java.awt.Color(14, 88, 136));
        txt_id_ingreso.setEnabled(false);
        txt_id_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_ingresoActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setText("Ingreso:");

        txt_ingreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_ingreso.setForeground(new java.awt.Color(245, 93, 13));
        txt_ingreso.setEnabled(false);

        btn_buscar_ingreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar_ingreso.setText("BUSCAR");
        btn_buscar_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_ingresoActionPerformed(evt);
            }
        });

        btn_actualizar_ingreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_actualizar_ingreso.setText("ACTUALIZAR");
        btn_actualizar_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_ingresoActionPerformed(evt);
            }
        });

        btn_eliminar_ingreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_eliminar_ingreso.setForeground(new java.awt.Color(255, 0, 0));
        btn_eliminar_ingreso.setText("ELIMINAR ");
        btn_eliminar_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_ingresoActionPerformed(evt);
            }
        });

        btn_guardar_ingreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_guardar_ingreso.setForeground(new java.awt.Color(0, 153, 0));
        btn_guardar_ingreso.setText("GUARDAR");
        btn_guardar_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_ingresoActionPerformed(evt);
            }
        });

        tabla_ingreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane8.setViewportView(tabla_ingreso);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Filtro.png"))); // NOI18N
        jLabel29.setText("Nombre Ingreso");

        txt_filtro_ingreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_filtro_ingreso.setForeground(new java.awt.Color(245, 93, 13));
        txt_filtro_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtro_ingresoActionPerformed(evt);
            }
        });
        txt_filtro_ingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_filtro_ingresoKeyTyped(evt);
            }
        });

        btn_modificar_i.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_modificar_i.setText("MODIFICAR");
        btn_modificar_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_iActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_filtro_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_guardar_ingreso)
                                    .addComponent(txt_id_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel28)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(btn_buscar_ingreso)
                                        .addGap(70, 70, 70)
                                        .addComponent(btn_actualizar_ingreso)
                                        .addGap(69, 69, 69)
                                        .addComponent(btn_eliminar_ingreso))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_modificar_i)))))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txt_id_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(txt_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_ingreso)
                    .addComponent(btn_actualizar_ingreso)
                    .addComponent(btn_eliminar_ingreso))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar_ingreso)
                    .addComponent(btn_modificar_i))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txt_filtro_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INGRESO ", jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        tabla_ingreso_general.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane9.setViewportView(tabla_ingreso_general);

        jLabel30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel30.setText("ID Ingreso gral: ");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setText("Ingreso general:");

        txt_id_ingreso_gral.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_id_ingreso_gral.setForeground(new java.awt.Color(14, 88, 136));
        txt_id_ingreso_gral.setEnabled(false);
        txt_id_ingreso_gral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_ingreso_gralActionPerformed(evt);
            }
        });

        txt_ingreso_gral.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_ingreso_gral.setForeground(new java.awt.Color(14, 88, 136));
        txt_ingreso_gral.setEnabled(false);

        btn_ingreso_gral.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_ingreso_gral.setText("BUSCAR");
        btn_ingreso_gral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingreso_gralActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton8.setText("ACTUALIZAR ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 0, 0));
        jButton9.setText("ELIMINAR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Filtro.png"))); // NOI18N
        jLabel32.setText("Nombre Ingreso");

        txt_filtro_ingreso_gral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtro_ingreso_gralActionPerformed(evt);
            }
        });
        txt_filtro_ingreso_gral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_filtro_ingreso_gralKeyTyped(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 153, 0));
        jButton10.setText("GUARDAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        btn_modificar_ig.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_modificar_ig.setText("MODIFICAR");
        btn_modificar_ig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_igActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id_ingreso_gral, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(21, 21, 21)
                                        .addComponent(txt_ingreso_gral, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)
                                        .addComponent(btn_ingreso_gral)
                                        .addGap(70, 70, 70)
                                        .addComponent(jButton8)
                                        .addGap(71, 71, 71)
                                        .addComponent(jButton9))
                                    .addComponent(btn_modificar_ig)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_filtro_ingreso_gral, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 243, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(txt_id_ingreso_gral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ingreso_gral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ingreso_gral)
                    .addComponent(jButton9)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(btn_modificar_ig))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txt_filtro_ingreso_gral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INGRESO GENERAL", jPanel12);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void btnEliminarMediotitulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMediotitulacionActionPerformed
        // BOTON PARA ELIMINAR UN REGISTRO EN METODOS DE TITULACION

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres eliminar el registro", "confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            if (txtid_medio_titulacion.getText().toString().equals("") || txtid_medio_titulacion.getText() == null) {
                Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR SI NO HAY MATRICULA");;
            } else {
                DaoMediosTitulacion da = new DaoMediosTitulacion();
                int resultado = da.eliminar(txtid_medio_titulacion.getText());
                if (!da.isIsError() || resultado != 0) {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
                } else {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMAR EL REGISTRO, error: " + da.getError());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "NO SE REALIZO NINGUNA MODIFICACIÓN");
        }

        modelomedios_titulacion.getDataVector().removeAllElements();
        tablamedios_titulacion.updateUI();
        DaoMediosTitulacion da = new DaoMediosTitulacion();
        da.clean();
        da.buscartabla(tablamedios_titulacion);
        bloquear();
        limpiarcasillas();

    }//GEN-LAST:event_btnEliminarMediotitulacionActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // BOTON PARA GUARDAR UN REGISTRO EN MEDIOS DE TITULACIÓN

        MediosTitulacion e = new MediosTitulacion();
        e.setId_medio_titulacion(txtid_medio_titulacion.getText());
        e.setMedio_titulacion(txtmedio_titulacion.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres guardar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            DaoMediosTitulacion da = new DaoMediosTitulacion();
            int res = da.insertar(e);
            if (!da.isIsError() && res != 0) {
                JOptionPane.showMessageDialog(null, "Se Agrego correctamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar, error: " + da.getError());
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }

        DaoMediosTitulacion da = new DaoMediosTitulacion();
        modelomedios_titulacion.getDataVector().removeAllElements();
        tablamedios_titulacion.updateUI();
        da.clean();
        da.buscartabla(tablamedios_titulacion);
        limpiarcasillas();
        bloquear();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTON PARA BUSCAR UN REGISTRO DE METODOS DE TITULACIÓN

        DaoMediosTitulacion e = new DaoMediosTitulacion();
        MediosTitulacion em = e.buscar(txtid_medio_titulacion.getText());

        if (txtid_medio_titulacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vacio");
        } else {
            if (!e.isIsError() && em != null) {
                if (!em.getId_medio_titulacion().equals("")) {
                    txtid_medio_titulacion.setText(em.getId_medio_titulacion());
                    txtmedio_titulacion.setText(em.getMedio_titulacion());

                }
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ENCONTRAR, ERROR: " + e.getError());
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarEscuelasProcedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEscuelasProcedenciaActionPerformed
        // BOTON PARA ELIMINAR REGISTRO DE ESCUELAS DE PROCEDENCIA

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres eliminar el registro", "confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            if (txtidescuela_p.getText().toString().equals("") || txtidescuela_p.getText() == null) {
                Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR SI NO HAY MATRICULA");;
            } else {
                DaoEscuelasProcedencia da = new DaoEscuelasProcedencia();
                int resultado = da.eliminar(txtidescuela_p.getText());
                if (!da.isIsError() || resultado != 0) {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
                } else {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMAR EL REGISTRO, error: " + da.getError());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "NO SE REALIZO NINGUNA MODIFICACIÓN");
        }

        modeloescuelasprocedencia.getDataVector().removeAllElements();
        tablaescuelas_procedencia.updateUI();
        DaoEscuelasProcedencia da = new DaoEscuelasProcedencia();
        da.clean();
        da.buscartabla(tablaescuelas_procedencia);

        bloquear();
        limpiarcasillas();

    }//GEN-LAST:event_btnEliminarEscuelasProcedenciaActionPerformed

    private void btnBuscarEscuelaProcedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEscuelaProcedenciaActionPerformed
        // BOTON PARA BUSCAR UN REGISTRPO EN ESCUELAS DE PROCEDENCIA

        DaoEscuelasProcedencia e = new DaoEscuelasProcedencia();
        EscuelasProcedencia em = e.buscar(txtidescuela_p.getText());

        if (txtidescuela_p.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vacio");
        } else {
            if (!e.isIsError() && em != null) {
                if (!em.getId_escuela().equals("")) {
                    txtidescuela_p.setText(em.getId_escuela());
                    txtescuela_p.setText(em.getNombre_escuela_p());

                }
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ENCONTRAR, ERROR: " + e.getError());
            }
        }
    }//GEN-LAST:event_btnBuscarEscuelaProcedenciaActionPerformed

    private void btnguardarEscuelaProcedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarEscuelaProcedenciaActionPerformed
        // Guardar un registro de escuelas de procedencia

        EscuelasProcedencia e = new EscuelasProcedencia();
        e.setId_escuela(txtidescuela_p.getText());
        e.setNombre_escuela_p(txtescuela_p.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres guardar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            DaoEscuelasProcedencia da = new DaoEscuelasProcedencia();
            int res = da.insertar(e);
            if (!da.isIsError() && res != 0) {
                JOptionPane.showMessageDialog(null, "Se Agrego correctamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar, error: " + da.getError());
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }

        DaoEscuelasProcedencia da = new DaoEscuelasProcedencia();
        modeloescuelasprocedencia.getDataVector().removeAllElements();
        tablaescuelas_procedencia.updateUI();
        da.clean();
        da.buscartabla(tablaescuelas_procedencia);

        bloquear();
        limpiarcasillas();
    }//GEN-LAST:event_btnguardarEscuelaProcedenciaActionPerformed

    private void btnEliminarCarreraUnitecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCarreraUnitecActionPerformed
        // Eliminar una carrera unitec

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres eliminar el registro", "confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            if (txtid_careras_unitec.getText().toString().equals("") || txtid_careras_unitec.getText() == null) {
                Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR SI NO HAY MATRICULA");;
            } else {
                DaoCarrerasUnitec da = new DaoCarrerasUnitec();
                int resultado = da.eliminar(txtid_careras_unitec.getText());
                if (!da.isIsError() || resultado != 0) {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
                } else {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMAR EL REGISTRO, error: " + da.getError());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "NO SE REALIZO NINGUNA MODIFICACIÓN");
        }

        modelocarrerasunitec.getDataVector().removeAllElements();
        tablacarreras_unitec.updateUI();
        DaoCarrerasUnitec da = new DaoCarrerasUnitec();
        da.clean();
        da.buscartabla(tablacarreras_unitec);
        bloquear();
        limpiarcasillas();
    }//GEN-LAST:event_btnEliminarCarreraUnitecActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTON PARA BUSCAR UN REGISTRPO EN CARRERAS UNITEC

        DaoCarrerasUnitec e = new DaoCarrerasUnitec();
        CarrerasUnitec em = e.buscar(txtid_careras_unitec.getText());

        if (txtid_careras_unitec.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vacio");
        } else {
            if (!e.isIsError() && em != null) {
                if (!em.getId_carrera().equals("")) {
                    txtid_careras_unitec.setText(em.getId_carrera());
                    txtnombre_carreras_unitec.setText(em.getNombre());

                }
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ENCONTRAR, ERROR: " + e.getError());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarCarrerasUnitecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCarrerasUnitecActionPerformed
        // BOTON PARA GUARDAR UN REGISTRO DE CARRERAS UNITEC

        CarrerasUnitec e = new CarrerasUnitec();
        e.setId_carrera(txtid_careras_unitec.getText());
        e.setNombre(txtnombre_carreras_unitec.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quierer guardar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            DaoCarrerasUnitec da = new DaoCarrerasUnitec();
            int res = da.insertar(e);
            if (!da.isIsError() && res != 0) {
                JOptionPane.showMessageDialog(null, "Se Agrego correctamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar, error: " + da.getError());
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }
        DaoCarrerasUnitec da = new DaoCarrerasUnitec();
        modelocarrerasunitec.getDataVector().removeAllElements();
        tablacarreras_unitec.updateUI();
        da.clean();
        da.buscartabla(tablacarreras_unitec);

        bloquear();
        limpiarcasillas();
    }//GEN-LAST:event_btnGuardarCarrerasUnitecActionPerformed

    private void btneliminarEscuelaUnitecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarEscuelaUnitecActionPerformed
        // Eliminar una escuela unitec

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres eliminar el registro", "confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            if (txtid_escuela.getText().toString().equals("") || txtid_escuela.getText() == null) {
                Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR SI NO HAY MATRICULA");;
            } else {
                DaoEscuelasUnitec da = new DaoEscuelasUnitec();
                int resultado = da.eliminar(txtid_escuela.getText());
                if (!da.isIsError() || resultado != 0) {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
                } else {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMAR EL REGISTRO, error: " + da.getError());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "NO SE REALIZO NINGUNA MODIFICACIÓN");
        }

        modeloescuelasunitec.getDataVector().removeAllElements();
        tablaescuelas_unitec.updateUI();
        DaoEscuelasUnitec da = new DaoEscuelasUnitec();
        da.clean();
        da.buscartabla(tablaescuelas_unitec);

        bloquear();
        limpiarcasillas();
    }//GEN-LAST:event_btneliminarEscuelaUnitecActionPerformed

    private void btnBuscarEscuelaUnitecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEscuelaUnitecActionPerformed
        // BUSCAR ESCUELA UNITEC

        DaoEscuelasUnitec e = new DaoEscuelasUnitec();
        EscuelasUnitec em = e.buscar(txtid_escuela.getText());

        if (txtid_escuela.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "CAMPO VACIO");
        } else {
            if (!e.isIsError() && em!= null) {
                if (!em.getId_escuela().equals("")) {
                    txtid_escuela.setText(em.getId_escuela());
                    txtnombre_escuela.setText(em.getNombre_escuela());

                }
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ENCONTRAR, ERROR: " + e.getError());
            }
        }
    }//GEN-LAST:event_btnBuscarEscuelaUnitecActionPerformed

    private void btnguardarEscuelasUnitecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarEscuelasUnitecActionPerformed
        // Guardar escuelas unitec
        EscuelasUnitec e = new EscuelasUnitec();
        e.setId_escuela(txtid_escuela.getText());
        e.setNombre_escuela(txtnombre_escuela.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres guardar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            DaoEscuelasUnitec da = new DaoEscuelasUnitec();
            int res = da.insertar(e);
            if (!da.isIsError() && res != 0) {
                JOptionPane.showMessageDialog(null, "Se Agrego correctamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar, error: " + da.getError());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }

        DaoEscuelasUnitec da = new DaoEscuelasUnitec();
        modeloescuelasunitec.getDataVector().removeAllElements();
        tablaescuelas_unitec.updateUI();
        da.clean();
        da.buscartabla(tablaescuelas_unitec);
        bloquear();
        limpiarcasillas();
    }//GEN-LAST:event_btnguardarEscuelasUnitecActionPerformed

    private void btnelimarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimarEmpleadoActionPerformed
        // botón Eliminar empleado

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres eliminar el registro", "confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            if (txtid_empleado.getText().toString().equals("") || txtid_empleado.getText() == null) {
                Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR SI NO HAY MATRICULA");;
            } else {
                DaoEmpleados da = new DaoEmpleados();
                int resultado = da.eliminar(txtid_empleado.getText());
                if (!da.isIsError() || resultado != 0) {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
                } else {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMAR EL REGISTRO, error: " + da.getError());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "NO SE REALIZO NINGUNA MODIFICACIÓN");
        }

        modeloEmpleados.getDataVector().removeAllElements();
        tablaEmpleados.updateUI();
        DaoEmpleados da = new DaoEmpleados();
        da.clean();
        da.buscartabla(tablaEmpleados);
        bloquear();
        limpiarcasillas();
    }//GEN-LAST:event_btnelimarEmpleadoActionPerformed

    private void btnActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmpleadoActionPerformed
        // Botón actualizar registros
        Empleados e = new Empleados();
        e.setId_empleado(txtid_empleado.getText());
        e.setNombre(txtnombre.getText());
        e.setPuesto(cbopuesto.getSelectedItem().toString());
        e.setContraseña(txtcontraseña.getText());
        e.setContraseña2(txtcontraseña2.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO QUE QUIERES  ACTUALIZAR EL REGISTRO", "CONFIRMAR", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            if (txtcontraseña.getText().equals(txtcontraseña2.getText())) {
                DaoEmpleados da = new DaoEmpleados();
                int res = da.actualizar(e);
                if (!da.isIsError() && res != 0) {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec100x50.jpg"));
                    JOptionPane.showMessageDialog(null, "Se Agrego correctamente. ");
                } else {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec100x50.jpg"));
                    JOptionPane.showMessageDialog(null, "No se pudo agregar, error: " + da.getError());
                }

                modeloEmpleados.getDataVector().removeAllElements();
                tablaEmpleados.updateUI();

                da.clean();
                da.buscartabla(tablaEmpleados);

            } else {
                JOptionPane.showMessageDialog(null, "LAS CONTRASEÑAS NO SON IGUALES.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }

        JOptionPane.showMessageDialog(null, "SE BLOQUEARAN LAS CASILLAS");

        bloquear();
        limpiarcasillas();


    }//GEN-LAST:event_btnActualizarEmpleadoActionPerformed

    private void btnGuardarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadosActionPerformed
        // Botón Guardar Empleados

        Empleados e = new Empleados();
        e.setId_empleado(txtid_empleado.getText());
        e.setNombre(txtnombre.getText());
        e.setPuesto(cbopuesto.getSelectedItem().toString());
        e.setContraseña(txtcontraseña.getText());
        e.setContraseña2(txtcontraseña2.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres guardar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            if (txtcontraseña.getText().equals(txtcontraseña2.getText())) {
                DaoEmpleados da = new DaoEmpleados();
                int res = da.insertar(e);
                if (!da.isIsError() && res != 0) {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec100x50.jpg"));
                    JOptionPane.showMessageDialog(null, "Se Agrego correctamente. ");
                } else {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec100x50.jpg"));
                    JOptionPane.showMessageDialog(null, "No se pudo agregar, error: " + da.getError());
                }

                modeloEmpleados.getDataVector().removeAllElements();
                tablaEmpleados.updateUI();

                da.clean();
                da.buscartabla(tablaEmpleados);

            } else {
                JOptionPane.showMessageDialog(null, "LAS CONTRASEÑAS NO SON IGUALES.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }

        bloquear();
        limpiarcasillas();


    }//GEN-LAST:event_btnGuardarEmpleadosActionPerformed

    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        // Botón buscar empleado

        DaoEmpleados e = new DaoEmpleados();
        Empleados em = e.buscar(txtid_empleado.getText());

        if (txtid_empleado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vacio");
        } else {
            if (!e.isIsError() && em != null) {
                if (!em.getId_empleado().equals("")) {
                    txtid_empleado.setText(em.getId_empleado());
                    txtnombre.setText(em.getNombre());
                    cbopuesto.setSelectedItem(em.getPuesto());
                    txtcontraseña.setText(em.getContraseña());

                }
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ENCONTRAR, ERROR: " + e.getError());
            }
        }
    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

    private void btn_actActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actActionPerformed
        // Boton para actualizar el registro
        EscuelasUnitec e = new EscuelasUnitec();
        e.setId_escuela(txtid_escuela.getText());
        e.setNombre_escuela(txtnombre_escuela.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres actualizar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            DaoEscuelasUnitec da = new DaoEscuelasUnitec();
            int res = da.actualizar(e);
            if (!da.isIsError() && res != 0) {
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar agregar, error: " + da.getError());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }

        DaoEscuelasUnitec da = new DaoEscuelasUnitec();
        modeloescuelasunitec.getDataVector().removeAllElements();
        tablaescuelas_unitec.updateUI();
        da.clean();
        da.buscartabla(tablaescuelas_unitec);

        bloquear();
        limpiarcasillas();


    }//GEN-LAST:event_btn_actActionPerformed

    private void btnActualizarEscuelasProcedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEscuelasProcedenciaActionPerformed
        // Boton para actualizar el registro en escuelas de procedencia

        EscuelasProcedencia e = new EscuelasProcedencia();
        e.setId_escuela(txtidescuela_p.getText());
        e.setNombre_escuela_p(txtescuela_p.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres actualizar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            DaoEscuelasProcedencia da = new DaoEscuelasProcedencia();
            int res = da.actualizar(e);
            if (!da.isIsError() && res != 0) {
                JOptionPane.showMessageDialog(null, "Se Actualizo correctamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar, error: " + da.getError());
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }

        DaoEscuelasProcedencia da = new DaoEscuelasProcedencia();
        modeloescuelasprocedencia.getDataVector().removeAllElements();
        tablaescuelas_procedencia.updateUI();
        da.clean();
        da.buscartabla(tablaescuelas_procedencia);

        bloquear();
        limpiarcasillas();

    }//GEN-LAST:event_btnActualizarEscuelasProcedenciaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Boton para actualizar un registro
        CarrerasUnitec e = new CarrerasUnitec();
        e.setId_carrera(txtid_careras_unitec.getText());
        e.setNombre(txtnombre_carreras_unitec.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quierer actualizar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            DaoCarrerasUnitec da = new DaoCarrerasUnitec();
            int res = da.actualizar(e);
            if (!da.isIsError() && res != 0) {
                JOptionPane.showMessageDialog(null, "Se Actualizo correctamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar, error: " + da.getError());
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }
        DaoCarrerasUnitec da = new DaoCarrerasUnitec();
        modelocarrerasunitec.getDataVector().removeAllElements();
        tablacarreras_unitec.updateUI();
        da.clean();
        da.buscartabla(tablacarreras_unitec);

        bloquear();
        limpiarcasillas();


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Boton para actualizar el registro

        MediosTitulacion e = new MediosTitulacion();
        e.setId_medio_titulacion(txtid_medio_titulacion.getText());
        e.setMedio_titulacion(txtmedio_titulacion.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres actualizar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            DaoMediosTitulacion da = new DaoMediosTitulacion();
            int res = da.actualizar(e);
            if (!da.isIsError() && res != 0) {
                JOptionPane.showMessageDialog(null, "Se Actualizo correctamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar, error: " + da.getError());
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }

        DaoMediosTitulacion da = new DaoMediosTitulacion();
        modelomedios_titulacion.getDataVector().removeAllElements();
        tablamedios_titulacion.updateUI();
        da.clean();
        da.buscartabla(tablamedios_titulacion);
        limpiarcasillas();
        bloquear();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void txt_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroActionPerformed
        // Filtrar busqueda 


    }//GEN-LAST:event_txt_filtroActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Boton para regresar

        FrmMenu f = new FrmMenu();
        f.show();
        this.hide();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void txt_filtro_escActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtro_escActionPerformed
        // Barra para filtrar la busqueda 


    }//GEN-LAST:event_txt_filtro_escActionPerformed

    private void txt_filtro_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtro_pActionPerformed
        // Barra del filtro de busqueda de procedencia 


    }//GEN-LAST:event_txt_filtro_pActionPerformed

    private void txt_filtro_carrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtro_carrActionPerformed
        // Barra de filtro de busqueda


    }//GEN-LAST:event_txt_filtro_carrActionPerformed

    private void txt_filtro_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtro_tActionPerformed
        // Barra para filtrar el metodo de titulacion


    }//GEN-LAST:event_txt_filtro_tActionPerformed

    private void txt_filtroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyTyped
        // TODO add your handling code here:

        modeloEmpleados.getDataVector().removeAllElements();
        tablaEmpleados.updateUI();
        DaoEmpleados da = new DaoEmpleados();
        da.clean();
        DaoEmpleados de = new DaoEmpleados();
        de.filtro(tablaEmpleados, txt_filtro.getText());
    }//GEN-LAST:event_txt_filtroKeyTyped

    private void txt_filtro_escKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtro_escKeyTyped
        // TODO add your handling code here:

        modeloescuelasunitec.getDataVector().removeAllElements();
        tablaescuelas_unitec.updateUI();
        DaoEscuelasUnitec da = new DaoEscuelasUnitec();
        da.clean();
        //DaoEscuelasUnitec de= new DaoEscuelasUnitec();
        da.filtrar(tablaescuelas_unitec, txt_filtro_esc.getText());
    }//GEN-LAST:event_txt_filtro_escKeyTyped

    private void txt_filtro_carrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtro_carrKeyTyped
        // TODO add your handling code here:
        DaoCarrerasUnitec da = new DaoCarrerasUnitec();
        modelocarrerasunitec.getDataVector().removeAllElements();
        tablacarreras_unitec.updateUI();
        da.clean();
        da.filtroC(tablacarreras_unitec, txt_filtro_carr.getText());
    }//GEN-LAST:event_txt_filtro_carrKeyTyped

    private void txt_filtro_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtro_pKeyTyped
        // TODO add your handling code here:
        DaoEscuelasProcedencia da = new DaoEscuelasProcedencia();
        modeloescuelasprocedencia.getDataVector().removeAllElements();
        tablaescuelas_procedencia.updateUI();
        da.clean();
        da.filtrop(tablaescuelas_procedencia, txt_filtro_p.getText());
    }//GEN-LAST:event_txt_filtro_pKeyTyped

    private void txt_filtro_tKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtro_tKeyTyped
        // TODO add your handling code here:
        DaoMediosTitulacion da = new DaoMediosTitulacion();
        modelomedios_titulacion.getDataVector().removeAllElements();
        tablamedios_titulacion.updateUI();
        da.clean();
        da.filtrot(tablamedios_titulacion, txt_filtro_t.getText());
    }//GEN-LAST:event_txt_filtro_tKeyTyped

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // DESBLOQUEAR PARA INGRESAR DATOS Y ACTUALIZAR

       FrmDesbloquearModificaciones f = new FrmDesbloquearModificaciones();
       f.show();
       this.hide();


    }//GEN-LAST:event_jButton11ActionPerformed

    private void txtescuela_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtescuela_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtescuela_pActionPerformed

    private void txt_id_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_ingresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_ingresoActionPerformed

    private void btn_buscar_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_ingresoActionPerformed
        // Boton para buscar el ingreso
        DaoIngreso i = new DaoIngreso();
        Ingreso in = i.buscar(txt_id_ingreso.getText());

        if (txt_id_ingreso.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vacio");
        } else {
            if (!i.isIsError() && in != null) {
                if (!in.getId_ingreso().equals("")) {
                    txt_id_ingreso.setText(in.getId_ingreso());
                    txt_ingreso.setText(in.getIngreso());
                }
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ENCONTRAR, ERROR: " + i.getError());
            }
        }

    }//GEN-LAST:event_btn_buscar_ingresoActionPerformed

    private void btn_actualizar_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_ingresoActionPerformed
        // Boton para actualizar el registro de ingreso
        Ingreso ig = new Ingreso();
        ig.setId_ingreso(txt_id_ingreso.getText());
        ig.setIngreso(txt_ingreso.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres actualizar el registro.", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {

            DaoIngreso ing = new DaoIngreso();
            int res = ing.actualizar(ig);
            if (!ing.isIsError() && res != 0) {
                JOptionPane.showMessageDialog(null, "Se agrego correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar, error" + ing.getError());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificacion");
        }

        DaoIngreso ing = new DaoIngreso();
        modeloingreso.getDataVector().removeAllElements();
        tabla_ingreso.updateUI();
        ing.clean();
        ing.buscartabla(tabla_ingreso);
        limpiarcasillas();
        bloquear();

    }//GEN-LAST:event_btn_actualizar_ingresoActionPerformed

    private void btn_guardar_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_ingresoActionPerformed
        // Bototn para guardar el registro de ingreso 
        Ingreso in = new Ingreso();
        in.setId_ingreso(txt_id_ingreso.getText());
        in.setIngreso(txt_ingreso.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres guardar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {

            DaoIngreso ing = new DaoIngreso();
            int res = ing.insertar(in);
            if (!ing.isIsError() && res != 0) {
                JOptionPane.showMessageDialog(null, "Se agrego correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar, error" + ing.getError());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificacion");
        }

        DaoIngreso ing = new DaoIngreso();
        modeloingreso.getDataVector().removeAllElements();
        tabla_ingreso.updateUI();
        ing.clean();
        ing.buscartabla(tabla_ingreso);
        limpiarcasillas();
        bloquear();
    }//GEN-LAST:event_btn_guardar_ingresoActionPerformed

    private void btn_eliminar_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_ingresoActionPerformed
        // Boton ara eliminar el registro de ingreso 
        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres eliminar el registro.", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            if (txt_id_ingreso.getText().toString().equals(" ") || txt_id_ingreso.getText() == null) {
                Icon m = new ImageIcon(getClass().getResource("/Image/unitec/.jpeg"));
                JOptionPane.showMessageDialog(null, "No se puede eliminar si no hay matricula ");
            } else {
                DaoIngreso in = new DaoIngreso();
                int resultado = in.eliminar(txt_id_ingreso.getText());
                if (!in.isIsError() || resultado != 0) {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "Se elimino el registro");

                } else {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "No se puedo elimanr el registro");
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificacion");
        }

        modeloingreso.getDataVector().removeAllElements();
        tabla_ingreso.updateUI();
        DaoIngreso in = new DaoIngreso();
        in.clean();
        in.buscartabla(tabla_ingreso);
        limpiarcasillas();
        bloquear();
    }//GEN-LAST:event_btn_eliminar_ingresoActionPerformed

    private void txt_filtro_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtro_ingresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtro_ingresoActionPerformed

    private void txt_filtro_ingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtro_ingresoKeyTyped
        // TODO add your handling code here:
        DaoIngreso da = new DaoIngreso();
        modeloingreso.getDataVector().removeAllElements();
        tabla_ingreso.updateUI();
        da.clean();
        da.filtroi(tabla_ingreso, txt_filtro_ingreso.getText());
    }//GEN-LAST:event_txt_filtro_ingresoKeyTyped

    private void btn_modificar_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_iActionPerformed
        // TODO add your handling code here:
       FrmDesbloquearModificaciones f = new FrmDesbloquearModificaciones();
       f.show();
       this.hide();
        
    }//GEN-LAST:event_btn_modificar_iActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
       FrmDesbloquearModificaciones f = new FrmDesbloquearModificaciones();
       f.show();
       this.hide();

       
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
       FrmDesbloquearModificaciones f = new FrmDesbloquearModificaciones();
       f.show();
       this.hide();
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void btn_modificar_epActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_epActionPerformed
       FrmDesbloquearModificaciones f = new FrmDesbloquearModificaciones();
       f.show();
       this.hide();
    }//GEN-LAST:event_btn_modificar_epActionPerformed

    private void txt_id_ingreso_gralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_ingreso_gralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_ingreso_gralActionPerformed

    private void btn_ingreso_gralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingreso_gralActionPerformed
        // Boton para buscar el registros ingreso gral

        DaoIngresoGral ingl = new DaoIngresoGral();
        IngresoGeneral igl = ingl.buscar(txt_id_ingreso_gral.getText());

        if (txt_id_ingreso_gral.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vacio");
        } else {
            if (!ingl.isIsError() && igl != null) {
                if (!igl.getId_ingreso_gral().equals("")) {
                    txt_id_ingreso_gral.setText(igl.getId_ingreso_gral());
                    txt_ingreso_gral.setText(igl.getIngreso_gral());

                }
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ENCONTRAR, ERROR: " + ingl.getError());
            }
        }

    }//GEN-LAST:event_btn_ingreso_gralActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // Boton para actualizar el regisytro de ingreso general

        IngresoGeneral e = new IngresoGeneral();
        e.setId_ingreso_gral(txt_id_ingreso_gral.getText());
        e.setIngreso_gral(txt_ingreso_gral.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres actualizar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            DaoIngresoGral da = new DaoIngresoGral();
            int res = da.actualizar(e);
            if (!da.isIsError() && res != 0) {
                JOptionPane.showMessageDialog(null, "Se Actualizo correctamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar, error: " + da.getError());
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }

        DaoIngresoGral da = new DaoIngresoGral();
        modeloingreso_general.getDataVector().removeAllElements();
        tabla_ingreso_general.updateUI();
        da.clean();
        da.buscartabla(tabla_ingreso_general);
        limpiarcasillas();
        bloquear();

    }//GEN-LAST:event_jButton8ActionPerformed


    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // Boton para guardar ingreso general
        IngresoGeneral e = new IngresoGeneral();
        e.setId_ingreso_gral(txt_id_ingreso_gral.getText());
        e.setIngreso_gral(txt_ingreso_gral.getText());

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres guardar el registro", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            DaoIngresoGral da = new DaoIngresoGral();
            int res = da.insertar(e);
            if (!da.isIsError() && res != 0) {
                JOptionPane.showMessageDialog(null, "Se Agrego correctamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar, error: " + da.getError());
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se realizo ninguna modificación");
        }

        DaoIngresoGral da = new DaoIngresoGral();
        modeloingreso_general.getDataVector().removeAllElements();
        tabla_ingreso_general.updateUI();
        da.clean();
        da.buscartabla(tabla_ingreso_general);
        limpiarcasillas();
        bloquear();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // Bton para eliminar ingreso general

        int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres eliminar el registro", "confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            if (txt_id_ingreso_gral.getText().toString().equals("") || txt_id_ingreso_gral.getText() == null) {
                Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR SI NO HAY MATRICULA");;
            } else {
                DaoIngresoGral da = new DaoIngresoGral();
                int resultado = da.eliminar(txt_id_ingreso_gral.getText());
                if (!da.isIsError() || resultado != 0) {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
                } else {
                    Icon m = new ImageIcon(getClass().getResource("/Image/unitec.jpeg"));
                    JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMAR EL REGISTRO, error: " + da.getError());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "NO SE REALIZO NINGUNA MODIFICACIÓN");
        }

        modeloingreso_general.getDataVector().removeAllElements();
        tabla_ingreso_general.updateUI();
        DaoIngresoGral da = new DaoIngresoGral();
        da.clean();
        da.buscartabla(tabla_ingreso_general);
        limpiarcasillas();
        bloquear();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void txt_filtro_ingreso_gralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtro_ingreso_gralActionPerformed
        // Filtro para buscar el registro 

    }//GEN-LAST:event_txt_filtro_ingreso_gralActionPerformed

    private void txt_filtro_ingreso_gralKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtro_ingreso_gralKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
        DaoIngresoGral da = new DaoIngresoGral();
        modeloingreso_general.getDataVector().removeAllElements();
        tabla_ingreso_general.updateUI();
        da.clean();
        da.filtroig(tabla_ingreso_general, txt_filtro_ingreso_gral.getText());
    }//GEN-LAST:event_txt_filtro_ingreso_gralKeyTyped

    private void btn_modificar_mtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_mtActionPerformed
        // TODO add your handling code here:

        FrmDesbloquearModificaciones f = new FrmDesbloquearModificaciones();
       f.show();
       this.hide();
    }//GEN-LAST:event_btn_modificar_mtActionPerformed

    private void btn_modificar_igActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_igActionPerformed
        // TODO add your handling code here:

       FrmDesbloquearModificaciones f = new FrmDesbloquearModificaciones();
       f.show();
       this.hide();
    }//GEN-LAST:event_btn_modificar_igActionPerformed

    private void txtid_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_empleadoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmModificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmModificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmModificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmModificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmModificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarEmpleado;
    private javax.swing.JButton btnActualizarEscuelasProcedencia;
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnBuscarEscuelaProcedencia;
    private javax.swing.JButton btnBuscarEscuelaUnitec;
    private javax.swing.JButton btnEliminarCarreraUnitec;
    private javax.swing.JButton btnEliminarEscuelasProcedencia;
    private javax.swing.JButton btnEliminarMediotitulacion;
    private javax.swing.JButton btnGuardarCarrerasUnitec;
    private javax.swing.JButton btnGuardarEmpleados;
    private javax.swing.JButton btn_act;
    private javax.swing.JButton btn_actualizar_ingreso;
    private javax.swing.JButton btn_buscar_ingreso;
    private javax.swing.JButton btn_eliminar_ingreso;
    private javax.swing.JButton btn_guardar_ingreso;
    private javax.swing.JButton btn_ingreso_gral;
    private javax.swing.JButton btn_modificar_ep;
    private javax.swing.JButton btn_modificar_i;
    private javax.swing.JButton btn_modificar_ig;
    private javax.swing.JButton btn_modificar_mt;
    private javax.swing.JButton btnelimarEmpleado;
    private javax.swing.JButton btneliminarEscuelaUnitec;
    private javax.swing.JButton btnguardarEscuelaProcedencia;
    private javax.swing.JButton btnguardarEscuelasUnitec;
    private javax.swing.JComboBox<String> cbopuesto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTable tabla_ingreso;
    private javax.swing.JTable tabla_ingreso_general;
    private javax.swing.JTable tablacarreras_unitec;
    private javax.swing.JTable tablaescuelas_procedencia;
    private javax.swing.JTable tablaescuelas_unitec;
    private javax.swing.JTable tablamedios_titulacion;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_filtro_carr;
    private javax.swing.JTextField txt_filtro_esc;
    private javax.swing.JTextField txt_filtro_ingreso;
    private javax.swing.JTextField txt_filtro_ingreso_gral;
    private javax.swing.JTextField txt_filtro_p;
    private javax.swing.JTextField txt_filtro_t;
    private javax.swing.JTextField txt_id_ingreso;
    private javax.swing.JTextField txt_id_ingreso_gral;
    private javax.swing.JTextField txt_ingreso;
    private javax.swing.JTextField txt_ingreso_gral;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JPasswordField txtcontraseña2;
    private javax.swing.JTextField txtescuela_p;
    private javax.swing.JTextField txtid_careras_unitec;
    private javax.swing.JTextField txtid_empleado;
    private javax.swing.JTextField txtid_escuela;
    private javax.swing.JTextField txtid_medio_titulacion;
    private javax.swing.JTextField txtidescuela_p;
    private javax.swing.JTextField txtmedio_titulacion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombre_carreras_unitec;
    private javax.swing.JTextField txtnombre_escuela;
    // End of variables declaration//GEN-END:variables
}
