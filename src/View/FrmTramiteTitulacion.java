/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Dao.DaoTramites_titulacion_envio;
import Dao.DaoTramites_titulacion_entrega;
import Dao.DaoTramites_titulacion_recepcion;
import Dao.DaoVistas_C;
import Dto.Tramites_titulacion_entrega;
import Dto.Tramites_titulacion_envio;
import Dto.Tramites_titulacion_recepcion;

import Dto.Vista_C;
import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author jotruvel
 */
public class FrmTramiteTitulacion extends javax.swing.JFrame {
    DefaultTableModel modeloenvio;
    DefaultTableModel modelorecepcion;
    DefaultTableModel modeloentrega;
    
    public void desbloquear() {
        calendar_entrega.setEnabled(rootPaneCheckingEnabled);
        txtobs_entrega.setEnabled(rootPaneCheckingEnabled);
        btnguardar_entrega.setEnabled(rootPaneCheckingEnabled);
        btnexportar_entraga.setEnabled(rootPaneCheckingEnabled);
        calendar_envio.setEnabled(rootPaneCheckingEnabled);
        txtobs_envio.setEnabled(rootPaneCheckingEnabled);
        btnguardar_envio.setEnabled(rootPaneCheckingEnabled);
        btnexportar_envio.setEnabled(rootPaneCheckingEnabled);
        caledar_recepcion.setEnabled(rootPaneCheckingEnabled);
        txtobs_recepcion.setEnabled(rootPaneCheckingEnabled);
        btnguardar_recepcion.setEnabled(rootPaneCheckingEnabled);
        btnexportar_recepcion.setEnabled(rootPaneCheckingEnabled);
        txtciclo_egreso.setEnabled(rootPaneCheckingEnabled);

    }

    public void limpiarcasilla() {
        txtobs_entrega.setText("");
        txtobs_recepcion.setText("");
        txtobs_envio.setText("");
        calendar_entrega.setDateFormatString("");
        calendar_envio.setDateFormatString("");
        caledar_recepcion.setDateFormatString("");
        txtciclo_egreso.setText("");
    }

    public void bloquear() {
        calendar_entrega.setEnabled(!rootPaneCheckingEnabled);
        txtobs_entrega.setEnabled(!rootPaneCheckingEnabled);
        btnguardar_entrega.setEnabled(!rootPaneCheckingEnabled);
        btnexportar_entraga.setEnabled(!rootPaneCheckingEnabled);
        calendar_envio.setEnabled(!rootPaneCheckingEnabled);
        txtobs_envio.setEnabled(!rootPaneCheckingEnabled);
        btnguardar_envio.setEnabled(!rootPaneCheckingEnabled);
        btnexportar_envio.setEnabled(!rootPaneCheckingEnabled);
        caledar_recepcion.setEnabled(!rootPaneCheckingEnabled);
        txtobs_recepcion.setEnabled(!rootPaneCheckingEnabled);
        btnguardar_recepcion.setEnabled(!rootPaneCheckingEnabled);
        btnexportar_recepcion.setEnabled(!rootPaneCheckingEnabled);
        txtciclo_egreso.setEnabled(!rootPaneCheckingEnabled);

    }

    /**
     * Creates new form FrmTitulacion
     */
    public FrmTramiteTitulacion() {
        initComponents();
        //this.setExtendedState(4);
        //Envio
        modeloenvio = new DefaultTableModel();
        modeloenvio.addColumn("MATRICULA");
        modeloenvio.addColumn("NOMBRE");
        modeloenvio.addColumn("FECHA");
        modeloenvio.addColumn("OBSERVACIONES");
        modeloenvio.addColumn("TIPO DOCUMENTO");
        modeloenvio.addColumn("PAGO");
        modeloenvio.addColumn("CICLO EGRESO");
        modeloenvio.addColumn("PRESENTO EGEL");
        modeloenvio.addColumn("MEDIO TITULACIÓN");
        modeloenvio.addColumn("QUIEN REGISTRO");
        this.tabla_envio.setModel(modeloenvio);
        DaoTramites_titulacion_envio da = new DaoTramites_titulacion_envio();
        da.buscartabla(tabla_envio);
        //Recpcion
        modelorecepcion = new DefaultTableModel();
        modelorecepcion.addColumn("MATRICULA");
        modelorecepcion.addColumn("NOMBRE");
        modelorecepcion.addColumn("FECHA");
        modelorecepcion.addColumn("OBSERVACIONES");
        modelorecepcion.addColumn("TIPO DOCUMENTO");
        modelorecepcion.addColumn("PAGO");
        modelorecepcion.addColumn("CICLO EGRESO");
        modelorecepcion.addColumn("PRESENTO EGEL");
        modelorecepcion.addColumn("MEDIO TITULACIÓN");
        modelorecepcion.addColumn("QUIEN REGISTRO");
        this.tabla_recepcion.setModel(modelorecepcion);
        DaoTramites_titulacion_recepcion dar = new DaoTramites_titulacion_recepcion();
        dar.buscartablar(tabla_recepcion);
        //Entrega
        modeloentrega = new DefaultTableModel();
        modeloentrega.addColumn("MATRICULA");
        modeloentrega.addColumn("NOMBRE");
        modeloentrega.addColumn("FECHA");
        modeloentrega.addColumn("OBSERVACIONES");
        modeloentrega.addColumn("TIPO DOCUMENTO");
        modeloentrega.addColumn("PAGO");
        modeloentrega.addColumn("CICLO EGRESO");
        modeloentrega.addColumn("PRESENTO EGEL");
        modeloentrega.addColumn("MEDIO TITULACIÓN");
        modeloentrega.addColumn("QUIEN REGISTRO");
        this.tabla_entrega.setModel(modeloentrega);
        DaoTramites_titulacion_entrega dae = new DaoTramites_titulacion_entrega();
        dae.buscartabla(tabla_entrega);
        JDateChooser dateChooser = new JDateChooser();
        calendar_entrega.setDateFormatString("dd/MM/yyyy");
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
        jLabel1 = new javax.swing.JLabel();
        txtmatricula = new javax.swing.JTextField();
        btnbuscarvistas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtescuela_unitec = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcarrera_unitec = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtciclo_ingreso = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtcorreo_i = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtcorreo_p = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtciclo_egreso = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtdomicilio = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtcurp = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txttipo_ingreso = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtestatus = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtnombre_escuela_p = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txttelefono_emergencias = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        calendar_envio = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtmatricula_envio = new javax.swing.JTextField();
        txtnombre_envio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_envio = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtobs_envio = new javax.swing.JTextArea();
        btnguardar_envio = new javax.swing.JButton();
        btnexportar_envio = new javax.swing.JButton();
        cbo_tipo1 = new javax.swing.JComboBox<>();
        cbo_ptipo3 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cbo_titulacionenvio = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        cbo_egelenvio = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        caledar_recepcion = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtmatricula_recepcion = new javax.swing.JTextField();
        txtnombre_recepcion = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_recepcion = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtobs_recepcion = new javax.swing.JTextArea();
        btnguardar_recepcion = new javax.swing.JButton();
        btnexportar_recepcion = new javax.swing.JButton();
        cbo_tipo2 = new javax.swing.JComboBox<>();
        cbo_ptipo2 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cbo_egelrecepcion = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        cbo_titulacionrecepcion = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        calendar_entrega = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobs_entrega = new javax.swing.JTextArea();
        txtnombre_entrega = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_entrega = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnexportar_entraga = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtmatricula_entrega = new javax.swing.JTextField();
        btnguardar_entrega = new javax.swing.JButton();
        cbo_tipo3 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cbo_ptipo1 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        cbo_egelentrega = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        cbo_titulacionentrega = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bucar alumno"));

        jLabel1.setText("Matricula:");

        txtmatricula.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtmatricula.setForeground(new java.awt.Color(245, 93, 13));

        btnbuscarvistas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnbuscarvistas.setText("BUSCAR");
        btnbuscarvistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarvistasActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbuscarvistas)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarvistas)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos alumno"));

        jLabel6.setText("Nombre:");

        txtnombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(14, 88, 136));

        txtescuela_unitec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtescuela_unitec.setForeground(new java.awt.Color(14, 88, 136));

        jLabel8.setText("Escuela: ");

        jLabel10.setText("Carrera:");

        txtcarrera_unitec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcarrera_unitec.setForeground(new java.awt.Color(14, 88, 136));
        txtcarrera_unitec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcarrera_unitecActionPerformed(evt);
            }
        });

        jLabel19.setText("Ciclo ingreso:");

        txtciclo_ingreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtciclo_ingreso.setForeground(new java.awt.Color(14, 88, 136));

        jLabel22.setText("teléfono:");

        txttelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txttelefono.setForeground(new java.awt.Color(14, 88, 136));

        jLabel25.setText("Celular:");

        txtcelular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcelular.setForeground(new java.awt.Color(14, 88, 136));

        jLabel26.setText("correo institucional:");

        txtcorreo_i.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcorreo_i.setForeground(new java.awt.Color(14, 88, 136));

        jLabel27.setText("correo");

        txtcorreo_p.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcorreo_p.setForeground(new java.awt.Color(14, 88, 136));

        jLabel32.setText("Ciclo egreso:");

        txtciclo_egreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtciclo_egreso.setForeground(new java.awt.Color(14, 88, 136));
        txtciclo_egreso.setEnabled(false);
        txtciclo_egreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciclo_egresoActionPerformed(evt);
            }
        });

        jLabel36.setText("Domicilio:");

        txtdomicilio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtdomicilio.setForeground(new java.awt.Color(14, 88, 136));

        jLabel37.setText("CURP:");

        txtcurp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcurp.setForeground(new java.awt.Color(14, 88, 136));

        jLabel38.setText("Tipo Ingreso:");

        txttipo_ingreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txttipo_ingreso.setForeground(new java.awt.Color(14, 88, 136));

        jLabel28.setText("Estatus:");

        txtestatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtestatus.setForeground(new java.awt.Color(0, 102, 255));

        jLabel39.setText("Escuela Procedencia:");

        txtnombre_escuela_p.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtnombre_escuela_p.setForeground(new java.awt.Color(14, 88, 136));

        jLabel23.setText("teléfono emergencia:");

        txttelefono_emergencias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txttelefono_emergencias.setForeground(new java.awt.Color(14, 88, 136));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcarrera_unitec)
                            .addComponent(txtdomicilio)
                            .addComponent(txtescuela_unitec, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)
                                .addComponent(txtcurp, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttelefono)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtestatus))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel38)
                                .addGap(18, 18, 18)
                                .addComponent(txttipo_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(txtciclo_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtciclo_egreso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre_escuela_p)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(txttelefono_emergencias, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcorreo_i, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(txtcorreo_p)))
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)
                            .addComponent(txtcurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(txttipo_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel8)
                            .addComponent(txtescuela_unitec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(txtestatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtciclo_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(txtciclo_egreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtcarrera_unitec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txtdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)
                            .addComponent(txtnombre_escuela_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtcorreo_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(txtcorreo_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttelefono_emergencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("FECHA DE ENVIO: ");

        calendar_envio.setDateFormatString("dd/MM/yyyy");
        calendar_envio.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("OBSERVACIONES: ");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("BUSCAR POR MATRICULA: ");

        txtmatricula_envio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula_envioActionPerformed(evt);
            }
        });
        txtmatricula_envio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula_envioKeyTyped(evt);
            }
        });

        txtnombre_envio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombre_envioKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("BUSCAR POR NOMBRE: ");

        tabla_envio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabla_envio);

        txtobs_envio.setColumns(20);
        txtobs_envio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtobs_envio.setForeground(new java.awt.Color(14, 88, 136));
        txtobs_envio.setRows(5);
        txtobs_envio.setEnabled(false);
        jScrollPane4.setViewportView(txtobs_envio);

        btnguardar_envio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnguardar_envio.setText("GUARDAR");
        btnguardar_envio.setEnabled(false);
        btnguardar_envio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar_envioActionPerformed(evt);
            }
        });

        btnexportar_envio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnexportar_envio.setText("EXPORTAR A EXCEL");
        btnexportar_envio.setEnabled(false);
        btnexportar_envio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportar_envioActionPerformed(evt);
            }
        });

        cbo_tipo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbo_tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TITULO" }));

        cbo_ptipo3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbo_ptipo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VALE", "PAGO" }));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("Pago:");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setText("Documento:");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setText("Medio Titulación:");

        cbo_titulacionenvio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbo_titulacionenvio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EXP. PROFESIONAL", "POSGRADO UNITEC", "MAESTRIA EXTERNA", "ACREDITACIÓN INGLES", "INCUBADORA DE NEGOCIOS", "SEGUNDA CARRERA", "SEMINARIO UNITEC", "TESIS", "EGEL" }));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel30.setText("EGEL:");

        cbo_egelenvio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbo_egelenvio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(btnexportar_envio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnguardar_envio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbo_egelenvio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbo_ptipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbo_tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbo_titulacionenvio, 0, 1, Short.MAX_VALUE))
                            .addComponent(calendar_envio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtmatricula_envio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnombre_envio, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre_envio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(txtmatricula_envio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calendar_envio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(8, 8, 8)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(cbo_tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(cbo_ptipo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(cbo_titulacionenvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(cbo_egelenvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar_envio)
                        .addGap(18, 18, 18)
                        .addComponent(btnexportar_envio)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("ENVIO", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("FECHA DE RECEPCION: ");

        caledar_recepcion.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("OBSERVACIONES: ");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("BUSCAR POR MATRICULA: ");

        txtmatricula_recepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula_recepcionActionPerformed(evt);
            }
        });
        txtmatricula_recepcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula_recepcionKeyTyped(evt);
            }
        });

        txtnombre_recepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_recepcionActionPerformed(evt);
            }
        });
        txtnombre_recepcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombre_recepcionKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("BUSCAR POR NOMBRE: ");

        tabla_recepcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tabla_recepcion);

        txtobs_recepcion.setColumns(1);
        txtobs_recepcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtobs_recepcion.setForeground(new java.awt.Color(14, 88, 136));
        txtobs_recepcion.setRows(1);
        txtobs_recepcion.setEnabled(false);
        jScrollPane6.setViewportView(txtobs_recepcion);

        btnguardar_recepcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnguardar_recepcion.setText("GUARDAR");
        btnguardar_recepcion.setEnabled(false);
        btnguardar_recepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar_recepcionActionPerformed(evt);
            }
        });

        btnexportar_recepcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnexportar_recepcion.setText("EXPORTAR A EXCEL");
        btnexportar_recepcion.setEnabled(false);
        btnexportar_recepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportar_recepcionActionPerformed(evt);
            }
        });

        cbo_tipo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbo_tipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TITULO" }));

        cbo_ptipo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbo_ptipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VALE", "PAGO" }));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("Pago:");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setText("Documento:");

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setText("EGEL: ");

        cbo_egelrecepcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbo_egelrecepcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel34.setText("Medio Titulación:");

        cbo_titulacionrecepcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbo_titulacionrecepcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EXP. PROFESIONAL", "POSGRADO UNITEC", "MAESTRIA EXTERNA", "ACREDITACIÓN INGLES", "INCUBADORA DE NEGOCIOS", "SEGUNDA CARRERA", "SEMINARIO UNITEC", "TESIS", "EGEL" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnguardar_recepcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnexportar_recepcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cbo_tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(caledar_recepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbo_ptipo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel31)
                                            .addGap(132, 132, 132)))
                                    .addComponent(jLabel15))
                                .addGap(0, 63, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(cbo_egelrecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_titulacionrecepcion, 0, 1, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtmatricula_recepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnombre_recepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre_recepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(txtmatricula_recepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(caledar_recepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cbo_ptipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(cbo_tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(cbo_egelrecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(cbo_titulacionrecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar_recepcion)
                        .addGap(18, 18, 18)
                        .addComponent(btnexportar_recepcion)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("RECEPCIÓN", jPanel8);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        calendar_entrega.setDateFormatString("");
        calendar_entrega.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("FECHA DE ENTREGA: ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("OBSERVACIONES: ");

        txtobs_entrega.setColumns(20);
        txtobs_entrega.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtobs_entrega.setForeground(new java.awt.Color(14, 88, 136));
        txtobs_entrega.setLineWrap(true);
        txtobs_entrega.setRows(5);
        txtobs_entrega.setEnabled(false);
        jScrollPane1.setViewportView(txtobs_entrega);

        txtnombre_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_entregaActionPerformed(evt);
            }
        });
        txtnombre_entrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombre_entregaKeyTyped(evt);
            }
        });

        tabla_entrega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla_entrega);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("BUSCAR POR NOMBRE: ");

        btnexportar_entraga.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnexportar_entraga.setText("EXPORTAR A EXCEL");
        btnexportar_entraga.setEnabled(false);
        btnexportar_entraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportar_entragaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("BUSCAR POR MATRICULA: ");

        txtmatricula_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatricula_entregaActionPerformed(evt);
            }
        });
        txtmatricula_entrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatricula_entregaKeyTyped(evt);
            }
        });

        btnguardar_entrega.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnguardar_entrega.setText("GUARDAR");
        btnguardar_entrega.setEnabled(false);
        btnguardar_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar_entregaActionPerformed(evt);
            }
        });

        cbo_tipo3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbo_tipo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TITULO" }));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setText("Pago: ");

        cbo_ptipo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbo_ptipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VALE", "PAGO" }));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel35.setText("Documento:");

        jLabel40.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel40.setText("EGEL: ");

        jLabel41.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel41.setText("EGEL:");

        cbo_egelentrega.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbo_egelentrega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel42.setText("Medio Titulación:");

        cbo_titulacionentrega.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbo_titulacionentrega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EXP. PROFESIONAL", "POSGRADO UNITEC", "MAESTRIA EXTERNA", "ACREDITACIÓN INGLES", "INCUBADORA DE NEGOCIOS", "SEGUNDA CARRERA", "SEMINARIO UNITEC", "TESIS", "EGEL" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(calendar_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnexportar_entraga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnguardar_entrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_ptipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35)
                        .addGap(26, 26, 26)
                        .addComponent(cbo_tipo3, 0, 175, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18)
                        .addComponent(cbo_egelentrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(cbo_titulacionentrega, 0, 1, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtmatricula_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnombre_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(717, 717, 717)
                    .addComponent(jLabel40)
                    .addContainerGap(718, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(txtmatricula_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calendar_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbo_ptipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel35))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(cbo_tipo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(cbo_egelentrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(cbo_titulacionentrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnguardar_entrega)
                        .addGap(18, 18, 18)
                        .addComponent(btnexportar_entraga)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(207, 207, 207)
                    .addComponent(jLabel40)
                    .addContainerGap(207, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("ENTREGA", jPanel6);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(213, 213, 213))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("REPORTES");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("REPORTE TITULACION");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarvistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarvistasActionPerformed
        // Boton para buscar

        DaoVistas_C e = new DaoVistas_C();
        Vista_C em = e.buscar(txtmatricula.getText());

        if (txtmatricula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vacio");
        } else {
            if (!e.isIsError() && em != null) {
                if (!em.getMatricula().equals("")) {
                    txtmatricula.setText(em.getMatricula());
                    txtnombre.setText(em.getNombre());
                    txtescuela_unitec.setText((em.getNombre_escuela()));
                    txtcarrera_unitec.setText(em.getNombre_carrera());
                    txtestatus.setText(em.getEstatus());
                    txttipo_ingreso.setText(em.getTipo_ingreso());
                    txtnombre_escuela_p.setText(em.getNombre_escuela_p());
                    txttelefono.setText(em.getTelefono_part());
                    txtcelular.setText(em.getCelular());
                    txttelefono_emergencias.setText(em.getTel_emergencia());
                    txtcorreo_p.setText(em.getCorreo_p());
                    txtcorreo_i.setText(em.getCorreo_i());
                    txtciclo_ingreso.setText(em.getCiclo_ingreso());
                    txtcurp.setText(em.getCurp());
                    txtdomicilio.setText(em.getDomicilio());

                }
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ENCONTRAR, ERROR: " + e.getError());
            }
        }

    }//GEN-LAST:event_btnbuscarvistasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FrmDesbloquearTitulacion f = new FrmDesbloquearTitulacion();
        f.show();
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrmMenu f = new FrmMenu();
        f.show();
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcarrera_unitecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcarrera_unitecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcarrera_unitecActionPerformed

    private void txtciclo_egresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciclo_egresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciclo_egresoActionPerformed

    private void txtmatricula_envioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula_envioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula_envioActionPerformed

    private void txtmatricula_envioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula_envioKeyTyped
        //Bucar matricula tabla de certificacion_envio
        modeloenvio.getDataVector().removeAllElements();
        tabla_envio.updateUI();
        DaoTramites_titulacion_envio dae = new DaoTramites_titulacion_envio();
        dae.clean();
        //DaoEscuelasUnitec de= new DaoEscuelasUnitec();
        dae.filtrarME(tabla_envio, txtmatricula_envio.getText());
    }//GEN-LAST:event_txtmatricula_envioKeyTyped

    private void txtnombre_envioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombre_envioKeyTyped
        // Buscar por nombre en tabla de envio
        modeloenvio.getDataVector().removeAllElements();
        tabla_envio.updateUI();
        DaoTramites_titulacion_envio dae = new DaoTramites_titulacion_envio();
        dae.clean();
        //DaoEscuelasUnitec de= new DaoEscuelasUnitec();
        dae.filtrarNE(tabla_envio, txtnombre_envio.getText());
    }//GEN-LAST:event_txtnombre_envioKeyTyped

    private void btnguardar_envioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar_envioActionPerformed
        // Boitón para guardar registros el la base de datos de envio de certificados

        Tramites_titulacion_envio e = new Tramites_titulacion_envio();
        e.setMatricula(txtmatricula.getText());
        e.setNombre(txtnombre.getText());
        Date fechaEnvio = calendar_envio.getDate();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaEnvioFormateada = formatoFecha.format(fechaEnvio);
        e.setFecha_envio(fechaEnvioFormateada);
        e.setObservaciones(txtobs_envio.getText());
        e.setTipo_certificado(cbo_tipo1.getSelectedItem().toString());
        e.setPago(cbo_ptipo3.getSelectedItem().toString());
        e.setCiclo_egreso(txtciclo_egreso.getText());
        e.setEgel(cbo_egelenvio.getSelectedItem().toString());
        e.setMedio_titulación(cbo_titulacionenvio.getSelectedItem().toString());

        if(txtciclo_egreso.getText().equals("")){
            JOptionPane.showMessageDialog(null, "CAMPO CICLO DE EGRESO VACIO");
        }else{

            int opcion = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO QUE QUIERES GUARDAR EL REGISTRO", "Confirmar", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_NO_OPTION ) {

                DaoTramites_titulacion_envio da = new DaoTramites_titulacion_envio();
                int res = da.insertar(e);
                if (!da.isIsError() && res != 0) {

                    JOptionPane.showMessageDialog(null, "SE AGREGO CORRECTAMENTE. ");
                } else {

                    JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR, error: " + da.getError());
                }

            } else {
                JOptionPane.showMessageDialog(null, "NO SE REALIZO NINGUNA MODIFICACIÓN");
            }
        }

        modeloenvio.getDataVector().removeAllElements();
        tabla_envio.updateUI();

        DaoTramites_titulacion_envio da = new DaoTramites_titulacion_envio();
        da.clean();
        da.buscartabla(tabla_envio);
        bloquear();
        limpiarcasilla();

    }//GEN-LAST:event_btnguardar_envioActionPerformed

    private void btnexportar_envioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportar_envioActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo");
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try {
                TableModel modelo = tabla_envio.getModel();
                FileWriter excel = new FileWriter(archivo);
                for (int i = 0; i < modelo.getColumnCount(); i++) {
                    excel.write(modelo.getColumnName(i) + "\t");
                }
                excel.write("\n");
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    for (int j = 0; j < modelo.getColumnCount(); j++) {
                        excel.write(modelo.getValueAt(i, j).toString() + "\t");
                    }
                    excel.write("\n");
                }
                excel.close();
                JOptionPane.showMessageDialog(this, "ARCHIVO EXPORTADO CON EXITO");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "ERROR AL EXPORTAR EL ARCHIVO: " + e.getMessage());
            }
        }
        bloquear();
    }//GEN-LAST:event_btnexportar_envioActionPerformed

    private void txtmatricula_recepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula_recepcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula_recepcionActionPerformed

    private void txtmatricula_recepcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula_recepcionKeyTyped
        // Filtro por matricula para recepcion
        modelorecepcion.getDataVector().removeAllElements();
        tabla_recepcion.updateUI();
        DaoTramites_titulacion_recepcion dar = new DaoTramites_titulacion_recepcion();
        dar.clean();
        //DaoEscuelasUnitec de= new DaoEscuelasUnitec();
        dar.filtrarMR(tabla_recepcion, txtmatricula_recepcion.getText());
    }//GEN-LAST:event_txtmatricula_recepcionKeyTyped

    private void txtnombre_recepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_recepcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_recepcionActionPerformed

    private void txtnombre_recepcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombre_recepcionKeyTyped
        // Filtro para buscar por medio de nombre en recepcon
        modelorecepcion.getDataVector().removeAllElements();
        tabla_recepcion.updateUI();
        DaoTramites_titulacion_recepcion dar = new DaoTramites_titulacion_recepcion();
        dar.clean();
        //DaoEscuelasUnitec de= new DaoEscuelasUnitec();
        dar.filtrarNR(tabla_recepcion, txtnombre_recepcion.getText());
    }//GEN-LAST:event_txtnombre_recepcionKeyTyped

    private void btnguardar_recepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar_recepcionActionPerformed
        // Boton para guardar registros en la base de datos de recepcion de certificados

        Tramites_titulacion_recepcion e = new Tramites_titulacion_recepcion();
        e.setMatricula(txtmatricula.getText());
        e.setNombre(txtnombre.getText());
        Date FechaRe = caledar_recepcion.getDate();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaRepFormateada = formatoFecha.format(FechaRe);
        e.setFecha_recepcion(fechaRepFormateada);
        e.setObservaciones(txtobs_recepcion.getText());
        e.setTipo_certificado(cbo_tipo2.getSelectedItem().toString());
        e.setPago(cbo_ptipo2.getSelectedItem().toString());
        e.setCiclo_egreso(txtciclo_egreso.getText());
        e.setEgel(cbo_egelrecepcion.getSelectedItem().toString());
        e.setMedio_titulación(cbo_titulacionrecepcion.getSelectedItem().toString());

        int opcion = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO QUE QUIERES GUARDAR EL REGISTRO", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            DaoTramites_titulacion_recepcion da = new DaoTramites_titulacion_recepcion();
            int res = da.insertarr(e);
            if (!da.isIsError() && res != 0) {

                JOptionPane.showMessageDialog(null, "SE AGREGO CORRECTAMENTE. ");
            } else {

                JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR, error: " + da.getError());
            }

        } else {
            JOptionPane.showMessageDialog(null, "NO SE REALIZO NINGUNA MODIFICACIÓN");
        }

        modelorecepcion.getDataVector().removeAllElements();
        tabla_recepcion.updateUI();

        DaoTramites_titulacion_recepcion da = new DaoTramites_titulacion_recepcion();
        da.clean();
        da.buscartablar(tabla_recepcion);
        bloquear();
        limpiarcasilla();
    }//GEN-LAST:event_btnguardar_recepcionActionPerformed

    private void btnexportar_recepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportar_recepcionActionPerformed
        // TODO add your handling code here:

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo");
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try {
                TableModel modelo = tabla_recepcion.getModel();
                FileWriter excel = new FileWriter(archivo);
                for (int i = 0; i < modelo.getColumnCount(); i++) {
                    excel.write(modelo.getColumnName(i) + "\t");
                }
                excel.write("\n");
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    for (int j = 0; j < modelo.getColumnCount(); j++) {
                        excel.write(modelo.getValueAt(i, j).toString() + "\t");
                    }
                    excel.write("\n");
                }
                excel.close();
                JOptionPane.showMessageDialog(this, "ARCHIVO EXPORTADO CON EXITO");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "ERROR AL EXPORTAR EL ARCHIVO: " + e.getMessage());
            }
        }
        bloquear();
    }//GEN-LAST:event_btnexportar_recepcionActionPerformed

    private void txtnombre_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_entregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_entregaActionPerformed

    private void txtnombre_entregaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombre_entregaKeyTyped
        modeloentrega.getDataVector().removeAllElements();
        tabla_entrega.updateUI();
        DaoTramites_titulacion_entrega da = new DaoTramites_titulacion_entrega();
        da.clean();
        //DaoEscuelasUnitec de= new DaoEscuelasUnitec();
        da.filtrarN(tabla_entrega, txtnombre_entrega.getText());
    }//GEN-LAST:event_txtnombre_entregaKeyTyped

    private void btnexportar_entragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportar_entragaActionPerformed
        // TODO add your handling code here:

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo");
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try {
                TableModel modelo = tabla_entrega.getModel();
                FileWriter excel = new FileWriter(archivo);
                for (int i = 0; i < modelo.getColumnCount(); i++) {
                    excel.write(modelo.getColumnName(i) + "\t");
                }
                excel.write("\n");
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    for (int j = 0; j < modelo.getColumnCount(); j++) {
                        excel.write(modelo.getValueAt(i, j).toString() + "\t");
                    }
                    excel.write("\n");
                }
                excel.close();
                JOptionPane.showMessageDialog(this, "ARCHIVO EXPORTADO CON EXITO");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "ERROR AL EXPORTAR EL ARCHIVO: " + e.getMessage());
            }
        }
        bloquear();
    }//GEN-LAST:event_btnexportar_entragaActionPerformed

    private void txtmatricula_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatricula_entregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatricula_entregaActionPerformed

    private void txtmatricula_entregaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatricula_entregaKeyTyped
        //Bucar matricula tabla de certificacion_envio

        modeloentrega.getDataVector().removeAllElements();
        tabla_entrega.updateUI();
        DaoTramites_titulacion_entrega da = new DaoTramites_titulacion_entrega();
        da.clean();
        //DaoEscuelasUnitec de= new DaoEscuelasUnitec();
        da.filtrar(tabla_entrega, txtmatricula_entrega.getText());
    }//GEN-LAST:event_txtmatricula_entregaKeyTyped

    private void btnguardar_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar_entregaActionPerformed
        // Boton de para guardar el registro de entrega

        Tramites_titulacion_entrega e = new Tramites_titulacion_entrega();

        System.out.println(calendar_entrega.getDate().toString());

        e.setMatricula(txtmatricula.getText());
        e.setNombre(txtnombre.getText());
        Date FechaEntrega =calendar_entrega.getDate();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaRepFormateada = formatoFecha.format(FechaEntrega);
        e.setFecha_entrega(fechaRepFormateada);
        e.setObservaciones(txtobs_entrega.getText());
        e.setTipo_certificado(cbo_tipo3.getSelectedItem().toString());
        e.setPago(cbo_ptipo1.getSelectedItem().toString());
        e.setCiclo_egreso(txtciclo_egreso.getText());
        e.setEgel(cbo_egelentrega.getSelectedItem().toString());
        e.setMedio_titulación(cbo_titulacionentrega.getSelectedItem().toString());

        int opcion = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO QUE QUIERES GUARDAR EL REGISTRO", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            DaoTramites_titulacion_entrega da = new DaoTramites_titulacion_entrega();
            int res = da.insertar(e);
            if (!da.isIsError() && res != 0) {

                JOptionPane.showMessageDialog(null, "SE AGREGO CORRECTAMENTE. ");
            } else {

                JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR, error: " + da.getError());
            }

        } else {
            JOptionPane.showMessageDialog(null, "NO SE REALIZO NINGUNA MODIFICACIÓN");
        }

        modeloentrega.getDataVector().removeAllElements();
        tabla_entrega.updateUI();

        DaoTramites_titulacion_entrega da = new DaoTramites_titulacion_entrega();
        da.clean();
        da.buscartabla(tabla_entrega);
        bloquear();
        limpiarcasilla();
    }//GEN-LAST:event_btnguardar_entregaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       FrmReportesTitulacion f = new FrmReportesTitulacion();
       f.show();
       this.hide();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTramiteTitulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTramiteTitulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTramiteTitulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTramiteTitulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTramiteTitulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarvistas;
    private javax.swing.JButton btnexportar_entraga;
    private javax.swing.JButton btnexportar_envio;
    private javax.swing.JButton btnexportar_recepcion;
    private javax.swing.JButton btnguardar_entrega;
    private javax.swing.JButton btnguardar_envio;
    private javax.swing.JButton btnguardar_recepcion;
    private com.toedter.calendar.JDateChooser caledar_recepcion;
    private com.toedter.calendar.JDateChooser calendar_entrega;
    private com.toedter.calendar.JDateChooser calendar_envio;
    private javax.swing.JComboBox<String> cbo_egelentrega;
    private javax.swing.JComboBox<String> cbo_egelenvio;
    private javax.swing.JComboBox<String> cbo_egelrecepcion;
    private javax.swing.JComboBox<String> cbo_ptipo1;
    private javax.swing.JComboBox<String> cbo_ptipo2;
    private javax.swing.JComboBox<String> cbo_ptipo3;
    private javax.swing.JComboBox<String> cbo_tipo1;
    private javax.swing.JComboBox<String> cbo_tipo2;
    private javax.swing.JComboBox<String> cbo_tipo3;
    private javax.swing.JComboBox<String> cbo_titulacionentrega;
    private javax.swing.JComboBox<String> cbo_titulacionenvio;
    private javax.swing.JComboBox<String> cbo_titulacionrecepcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabla_entrega;
    private javax.swing.JTable tabla_envio;
    private javax.swing.JTable tabla_recepcion;
    private javax.swing.JTextField txtcarrera_unitec;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtciclo_egreso;
    private javax.swing.JTextField txtciclo_ingreso;
    private javax.swing.JTextField txtcorreo_i;
    private javax.swing.JTextField txtcorreo_p;
    private javax.swing.JTextField txtcurp;
    private javax.swing.JTextField txtdomicilio;
    private javax.swing.JTextField txtescuela_unitec;
    private javax.swing.JTextField txtestatus;
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtmatricula_entrega;
    private javax.swing.JTextField txtmatricula_envio;
    private javax.swing.JTextField txtmatricula_recepcion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombre_entrega;
    private javax.swing.JTextField txtnombre_envio;
    private javax.swing.JTextField txtnombre_escuela_p;
    private javax.swing.JTextField txtnombre_recepcion;
    private javax.swing.JTextArea txtobs_entrega;
    private javax.swing.JTextArea txtobs_envio;
    private javax.swing.JTextArea txtobs_recepcion;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttelefono_emergencias;
    private javax.swing.JTextField txttipo_ingreso;
    // End of variables declaration//GEN-END:variables
}
