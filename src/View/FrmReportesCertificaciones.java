/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Dao.DaoReporteEnvio_vista;
import Dao.DaoReporteRecepcion_vista;
import Dao.DaoReporteEntrega_vista;
import Dto.ReporteEntrega_vista;
import Dto.ReporteEnvio_vista;
import Dto.ReporteRecepcion_vista;
import static com.microsoft.schemas.office.excel.STObjectType.Enum.table;
import javax.swing.JTable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.apache.poi.hssf.usermodel.HeaderFooter.file;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author jotruvel
 */
public class FrmReportesCertificaciones extends javax.swing.JFrame {

    DefaultTableModel modeloenvio;
    DefaultTableModel modelorecepcion;
    DefaultTableModel modeloentrega;

    /**
     * Creates new form FrmReportesCertificiones
     */
    public FrmReportesCertificaciones() {
        initComponents();
        setLocationRelativeTo(null);

        //Envio
        modeloenvio = new DefaultTableModel();
        modeloenvio.addColumn("MATRICULA");
        modeloenvio.addColumn("NOMBRE");
        modeloenvio.addColumn("FECHA");
        modeloenvio.addColumn("OBSERVACIONES");
        modeloenvio.addColumn("TIPO CERTIFICADO");
        modeloenvio.addColumn("PAGO");
        modeloenvio.addColumn("CICLO DE EGRESO");
        modeloenvio.addColumn("CLAVE DE ESCUELA");
        modeloenvio.addColumn("ESCUELA UNITEC");
        modeloenvio.addColumn("CLAVE DE CARRERA");
        modeloenvio.addColumn("CARRERA");
        modeloenvio.addColumn("CLAVE DE ESCUELA PROC");
        modeloenvio.addColumn("ESCUELA PROCEDENCIA");
        modeloenvio.addColumn("CICLO INGRESO");
        modeloenvio.addColumn("CURP");
        this.tabla_reportes_envio.setModel(modeloenvio);
        DaoReporteEnvio_vista da = new DaoReporteEnvio_vista();
        da.buscartabla(tabla_reportes_envio);

        //Recepción
        modelorecepcion = new DefaultTableModel();
        modelorecepcion.addColumn("MATRICULA");
        modelorecepcion.addColumn("NOMBRE");
        modelorecepcion.addColumn("FECHA");
        modelorecepcion.addColumn("OBSERVACIONES");
        modelorecepcion.addColumn("TIPO CERTIFICADO");
        modelorecepcion.addColumn("PAGO");
        modelorecepcion.addColumn("CICLO DE EGRESO");
        modelorecepcion.addColumn("CLAVE DE ESCUELA");
        modelorecepcion.addColumn("ESCUELA UNITEC");
        modelorecepcion.addColumn("CLAVE DE CARRERA");
        modelorecepcion.addColumn("CARRERA");
        modelorecepcion.addColumn("CLAVE ESCUELA PROC");
        modelorecepcion.addColumn("ESCUELA PROCEDENCIA");
        modelorecepcion.addColumn("CICLO INGRESO");
        modelorecepcion.addColumn("CURP");
        this.tabla_recepcion.setModel(modelorecepcion);
        DaoReporteRecepcion_vista du = new DaoReporteRecepcion_vista();
        du.buscartabla(tabla_recepcion);

        //Entrega
        modeloentrega = new DefaultTableModel();
        modeloentrega.addColumn("MATRICULA");
        modeloentrega.addColumn("NOMBRE");
        modeloentrega.addColumn("FECHA");
        modeloentrega.addColumn("OBSERVACIONES");
        modeloentrega.addColumn("TIPO CERTIFICADO");
        modeloentrega.addColumn("PAGO");
        modeloentrega.addColumn("CICLO DE EGRESO");
        modeloentrega.addColumn("CLAVE DE ESCUELA");
        modeloentrega.addColumn("ESCUELAS UNITEC");
        modeloentrega.addColumn("CLAVE DE CARRERA");
        modeloentrega.addColumn("CARRERA");
        modeloentrega.addColumn("CLAVE DE ESCUELA PROC");
        modeloentrega.addColumn("ESCUELA PROCEDENCIA");
        modeloentrega.addColumn("CICLO INGRESO");
        modeloentrega.addColumn("CURP");
        this.tabla_reportes_entrega.setModel(modeloentrega);
        DaoReporteEntrega_vista dr = new DaoReporteEntrega_vista();
        dr.buscartabla(tabla_reportes_entrega);

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
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reportes_envio = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buscarfecha = new javax.swing.JButton();
        txt_f_m = new javax.swing.JTextField();
        fecha_envio_de = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_f_n = new javax.swing.JTextField();
        fecha_envio_hasta = new com.toedter.calendar.JDateChooser();
        EXPORTAR2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_recepcion = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_f_mr = new javax.swing.JTextField();
        txt_f_r = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fecha_recepcion_de = new com.toedter.calendar.JDateChooser();
        fecha_recepcion_hasta = new com.toedter.calendar.JDateChooser();
        jButton7 = new javax.swing.JButton();
        Exportar_recepcion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_reportes_entrega = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        filtro_m_e = new javax.swing.JTextField();
        txt_f_et = new javax.swing.JTextField();
        btnregresar = new javax.swing.JButton();
        fecha_entrega_de = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        fecha_entrega_hasta = new com.toedter.calendar.JDateChooser();
        btnBuscar_entrega = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Exportar_entrega = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/unitec173.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(374, 374, 374)
                .addComponent(jLabel4)
                .addGap(213, 213, 213))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel4)))
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabla_reportes_envio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_reportes_envio);

        jButton6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton6.setText("REGRESAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setText("BUSCAR POR MATRICULA:");

        jLabel9.setText("BUSCAR POR FECHA DE:");

        buscarfecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buscarfecha.setText("BUSCAR");
        buscarfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarfechaActionPerformed(evt);
            }
        });

        txt_f_m.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_f_m.setForeground(new java.awt.Color(245, 93, 13));
        txt_f_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f_mActionPerformed(evt);
            }
        });
        txt_f_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_f_mKeyTyped(evt);
            }
        });

        jLabel10.setText("BUSCAR POR NOMBRE:");

        jLabel11.setText("HASTA:");

        txt_f_n.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_f_n.setForeground(new java.awt.Color(245, 93, 13));
        txt_f_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f_nActionPerformed(evt);
            }
        });
        txt_f_n.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_f_nKeyTyped(evt);
            }
        });

        EXPORTAR2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        EXPORTAR2.setText("EXPORTAR EXCEL");
        EXPORTAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXPORTAR2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1246, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(EXPORTAR2))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(buscarfecha))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_f_n, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fecha_envio_de, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_f_m)
                            .addComponent(fecha_envio_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(EXPORTAR2)
                        .addGap(14, 14, 14)
                        .addComponent(jButton6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_f_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_f_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(fecha_envio_de, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addComponent(fecha_envio_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(buscarfecha)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("REPORTES ENVIO", jPanel2);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tabla_recepcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tabla_recepcion);

        jLabel5.setText("BUSCAR POR MATRICULA:");

        jLabel7.setText("BUSCAR POR NOMBRE:");

        txt_f_mr.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_f_mr.setForeground(new java.awt.Color(245, 93, 13));
        txt_f_mr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_f_mrKeyTyped(evt);
            }
        });

        txt_f_r.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_f_r.setForeground(new java.awt.Color(245, 93, 13));
        txt_f_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f_rActionPerformed(evt);
            }
        });
        txt_f_r.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_f_rKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("BUSCAR POR FECHA DE:");

        jLabel13.setText("HASTA:");

        jButton7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton7.setText("BUSCAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Exportar_recepcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Exportar_recepcion.setText("EXPORTAR EXCEL");
        Exportar_recepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exportar_recepcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Exportar_recepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fecha_recepcion_de, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_f_mr, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel13)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_f_r)
                            .addComponent(fecha_recepcion_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 427, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Exportar_recepcion)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(txt_f_mr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_f_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(fecha_recepcion_de, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha_recepcion_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jButton7)))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("REPORTES RECEPCIÓN", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tabla_reportes_entrega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabla_reportes_entrega);

        jLabel1.setText("BUSCAR POR MATRICULA:");

        jLabel2.setText("BUSCAR POR FECHA DE:");

        jLabel3.setText("BUSCAR POR NOMBRE:");

        filtro_m_e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtro_m_eKeyTyped(evt);
            }
        });

        txt_f_et.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f_etActionPerformed(evt);
            }
        });
        txt_f_et.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_f_etKeyTyped(evt);
            }
        });

        btnregresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnregresar.setText("REGRESAR");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        jLabel6.setText("HASTA:");

        btnBuscar_entrega.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar_entrega.setText("BUSCAR");
        btnBuscar_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_entregaActionPerformed(evt);
            }
        });

        jLabel14.setText("HASTA:");

        Exportar_entrega.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Exportar_entrega.setText("EXPORTAR EXCEL");
        Exportar_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exportar_entregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnregresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Exportar_entrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(601, 601, 601))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBuscar_entrega, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(filtro_m_e)
                                    .addComponent(fecha_entrega_de, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel14)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fecha_entrega_hasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_f_et, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Exportar_entrega)
                        .addGap(18, 18, 18)
                        .addComponent(btnregresar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(filtro_m_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_f_et, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fecha_entrega_de, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fecha_entrega_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(22, 22, 22)
                        .addComponent(btnBuscar_entrega)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("REPORTES ENTREGA", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_f_etActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f_etActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f_etActionPerformed

    private void txt_f_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f_rActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        // TODO add your handling code here:
        FrmTramiteCertificaciones f = new FrmTramiteCertificaciones();
        f.show();
        this.hide();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void filtro_m_eKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtro_m_eKeyTyped
        // Filtro para buscar por medio de la matricula en entrega 
        // Fitlro para buscar el regitro por medio del nnombre en entrega 
        modeloentrega.getDataVector().removeAllElements();
        tabla_reportes_entrega.updateUI();
        DaoReporteEntrega_vista et = new DaoReporteEntrega_vista();
        et.clean();
        et.filtroETM(tabla_reportes_entrega, filtro_m_e.getText());
    }//GEN-LAST:event_filtro_m_eKeyTyped

    private void txt_f_rKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_f_rKeyTyped
        // Filtro para buscar el regitro por medio del nombre en recepcion
        modelorecepcion.getDataVector().removeAllElements();
        tabla_recepcion.updateUI();
        DaoReporteRecepcion_vista rn = new DaoReporteRecepcion_vista();
        rn.clean();
        rn.filtrarNR(tabla_recepcion, txt_f_r.getText());
    }//GEN-LAST:event_txt_f_rKeyTyped

    private void txt_f_etKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_f_etKeyTyped
        // Fitlro para buscar el regitro por medio del nnombre en entrega 
        modeloentrega.getDataVector().removeAllElements();
        tabla_reportes_entrega.updateUI();
        DaoReporteEntrega_vista et = new DaoReporteEntrega_vista();
        et.clean();
        et.filtroNET(tabla_reportes_entrega, txt_f_et.getText());

    }//GEN-LAST:event_txt_f_etKeyTyped

    private void txt_f_mrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_f_mrKeyTyped
        // Metodo ´para buscar por la matricula en recepdcion
        modelorecepcion.getDataVector().removeAllElements();
        tabla_recepcion.updateUI();
        DaoReporteRecepcion_vista rn = new DaoReporteRecepcion_vista();
        rn.clean();
        rn.filtrarMR(tabla_recepcion, txt_f_mr.getText());
    }//GEN-LAST:event_txt_f_mrKeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // BUSCAR POR INTERVALO DE FECHA RECEPCION
        ReporteRecepcion_vista du = new ReporteRecepcion_vista();

        Date Fecha_recepcion_de = fecha_recepcion_de.getDate();
        SimpleDateFormat formatoFecha_recepcion_de = new SimpleDateFormat("dd/MM/yyyy");
        String FechaRecepcion_de_formateada = formatoFecha_recepcion_de.format(Fecha_recepcion_de);
        du.setFecha_recepcion_de(FechaRecepcion_de_formateada);

        Date Fecha_recepcion_hasta = fecha_recepcion_hasta.getDate();
        SimpleDateFormat formatoFecha_recepcion_hasta = new SimpleDateFormat("dd/MM/yyyy");
        String FechaRecepcion_hasta_formateada = formatoFecha_recepcion_hasta.format(Fecha_recepcion_hasta);
        du.setFecha_recepcion_hasta(FechaRecepcion_hasta_formateada);

        System.out.println(FechaRecepcion_de_formateada + "___" + FechaRecepcion_hasta_formateada);

        modelorecepcion.getDataVector().removeAllElements();
        tabla_recepcion.updateUI();
        DaoReporteRecepcion_vista dq = new DaoReporteRecepcion_vista();
        dq.filtrofecha(tabla_recepcion, FechaRecepcion_de_formateada, FechaRecepcion_hasta_formateada);


    }//GEN-LAST:event_jButton7ActionPerformed

    private void txt_f_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f_nActionPerformed

    private void buscarfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarfechaActionPerformed
        ReporteEnvio_vista rev = new ReporteEnvio_vista();

        //Formato fecha de
        Date Fecha_envio_de = fecha_envio_de.getDate();
        SimpleDateFormat formatoFecha_envio_de = new SimpleDateFormat("dd/MM/yyyy");
        String FechaEnvio_de_formateada = formatoFecha_envio_de.format(Fecha_envio_de);
        rev.setFecha_envio_de(FechaEnvio_de_formateada);

        // Formato fecha hasta
        Date Fecha_envio_hasta = fecha_envio_hasta.getDate();
        SimpleDateFormat formatoFecha_envio_hasta = new SimpleDateFormat("dd/MM/yyyy");
        String FechaEnvio_hasta_formateada = formatoFecha_envio_hasta.format(Fecha_envio_hasta);
        rev.setFecha_envio_hasta(FechaEnvio_hasta_formateada);
        
        //System.out.println(FechaEnvio_de_formateada + "__" + FechaEnvio_hasta_formateada);
        modeloenvio.getDataVector().removeAllElements();
        tabla_reportes_envio.updateUI();
        DaoReporteEnvio_vista drev = new DaoReporteEnvio_vista();
        drev.filtrofecha(tabla_reportes_envio, FechaEnvio_de_formateada, FechaEnvio_hasta_formateada);


    }//GEN-LAST:event_buscarfechaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        FrmTramiteCertificaciones f = new FrmTramiteCertificaciones();
        f.show();
        this.hide();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnBuscar_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_entregaActionPerformed
        ReporteEntrega_vista revv = new ReporteEntrega_vista();

        //Formato fecha de
        Date Fecha_entrega_de = fecha_entrega_de.getDate();
        SimpleDateFormat formatoFecha_entrega_de = new SimpleDateFormat("dd/MM/yyyy");
        String FechaEntrega_de_formateada = formatoFecha_entrega_de.format(Fecha_entrega_de);
        revv.setFecha_entrega_de(FechaEntrega_de_formateada);

        //Formato de fecha hasta
        Date Fecha_entrega_hasta = fecha_entrega_hasta.getDate();
        SimpleDateFormat formatoFecha_entrega_hasta = new SimpleDateFormat("dd/MM/yyyy");
        String FechaEntrega_hasta_formateada = formatoFecha_entrega_hasta.format(Fecha_entrega_hasta);
        revv.setFecha_entrega_hasta(FechaEntrega_hasta_formateada);

        System.out.println(FechaEntrega_de_formateada + "__" + FechaEntrega_hasta_formateada);

        modeloentrega.getDataVector().removeAllElements();;
        tabla_reportes_entrega.updateUI();
        DaoReporteEntrega_vista drevv = new DaoReporteEntrega_vista();
        drevv.filtrofecha(tabla_reportes_entrega, FechaEntrega_de_formateada, FechaEntrega_hasta_formateada);


    }//GEN-LAST:event_btnBuscar_entregaActionPerformed

    private void txt_f_nKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_f_nKeyTyped
        // Filtro de busqueda por medio del nombre.
        modeloenvio.getDataVector().removeAllElements();
        tabla_reportes_envio.updateUI();

        DaoReporteEnvio_vista da = new DaoReporteEnvio_vista();
        da.clean();
        da.filtroE(tabla_reportes_envio, txt_f_n.getText());
    }//GEN-LAST:event_txt_f_nKeyTyped

    private void txt_f_mKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_f_mKeyTyped
        // FILTRO DE BUSQUEDA POR MEDIO DE LA MATRICULA 
        modeloenvio.getDataVector().removeAllElements();
        tabla_reportes_envio.updateUI();

        DaoReporteEnvio_vista da = new DaoReporteEnvio_vista();
        da.clean();
        da.filtroEM(tabla_reportes_envio, txt_f_m.getText());
    }//GEN-LAST:event_txt_f_mKeyTyped

    private void EXPORTAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXPORTAR2ActionPerformed

        // Crear un nuevo libro de trabajo de Excel
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Crear una nueva hoja de trabajo de Excel
        XSSFSheet sheet = workbook.createSheet("CERTIFICADOS");

        // Crear un estilo de celda para el encabezado de la tabla
        XSSFCellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setAlignment(HorizontalAlignment.CENTER);
        headerCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        headerCellStyle.setFillForegroundColor(new XSSFColor(new java.awt.Color(0, 102, 204)));
        headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headerCellStyle.setBorderTop(BorderStyle.THIN);
        headerCellStyle.setBorderBottom(BorderStyle.THIN);
        headerCellStyle.setBorderLeft(BorderStyle.THIN);
        headerCellStyle.setBorderRight(BorderStyle.THIN);
        headerCellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
        headerCellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        headerCellStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        headerCellStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());

        // Crear un estilo de celda para los datos de la tabla
        XSSFCellStyle dataCellStyle = workbook.createCellStyle();
        dataCellStyle.setAlignment(HorizontalAlignment.LEFT);
        dataCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        dataCellStyle.setBorderTop(BorderStyle.THIN);
        dataCellStyle.setBorderBottom(BorderStyle.THIN);
        dataCellStyle.setBorderLeft(BorderStyle.THIN);
        dataCellStyle.setBorderRight(BorderStyle.THIN);
        dataCellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
        dataCellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        dataCellStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        dataCellStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());

        // Obtener los datos de la tabla
        int rowCount = tabla_reportes_envio.getRowCount();
        int columnCount = tabla_reportes_envio.getColumnCount();

        // Agregar el encabezado de la tabla al archivo de Excel
        XSSFRow headerRow = sheet.createRow(0);
        for (int i = 0; i < columnCount; i++) {
            XSSFCell cell = headerRow.createCell(i);
            cell.setCellValue(tabla_reportes_envio.getColumnName(i));
            cell.setCellStyle(headerCellStyle);
            sheet.autoSizeColumn(i);
        }

        // Agregar los datos de la tabla al archivo de Excel
        for (int i = 0; i < rowCount; i++) {
            XSSFRow row = sheet.createRow(i + 1);
            for (int j = 0; j < columnCount; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellValue(tabla_reportes_envio.getValueAt(i, j).toString());
                cell.setCellStyle(dataCellStyle);
                sheet.autoSizeColumn(j);
            }
        }

        // Guardar el archivo de Excel
        try {
            String desktopPath = System.getProperty("user.home") + "/Desktop/";
            File outputFile = new File(desktopPath + "Reporte_Recepcion_CERTIFICADOS.xlsx");
            FileOutputStream outputStream = new FileOutputStream(outputFile);
            workbook.write(outputStream);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_EXPORTAR2ActionPerformed

    private void Exportar_recepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exportar_recepcionActionPerformed
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Crear una nueva hoja de trabajo de Excel
        XSSFSheet sheet = workbook.createSheet("CERTIFICADOS");

        // Crear un estilo de celda para el encabezado de la tabla
        XSSFCellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setAlignment(HorizontalAlignment.CENTER);
        headerCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        headerCellStyle.setFillForegroundColor(new XSSFColor(new java.awt.Color(0, 102, 204)));
        headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headerCellStyle.setBorderTop(BorderStyle.THIN);
        headerCellStyle.setBorderBottom(BorderStyle.THIN);
        headerCellStyle.setBorderLeft(BorderStyle.THIN);
        headerCellStyle.setBorderRight(BorderStyle.THIN);
        headerCellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
        headerCellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        headerCellStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        headerCellStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());

        // Crear un estilo de celda para los datos de la tabla
        XSSFCellStyle dataCellStyle = workbook.createCellStyle();
        dataCellStyle.setAlignment(HorizontalAlignment.LEFT);
        dataCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        dataCellStyle.setBorderTop(BorderStyle.THIN);
        dataCellStyle.setBorderBottom(BorderStyle.THIN);
        dataCellStyle.setBorderLeft(BorderStyle.THIN);
        dataCellStyle.setBorderRight(BorderStyle.THIN);
        dataCellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
        dataCellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        dataCellStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        dataCellStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());

        // Obtener los datos de la tabla
        int rowCount = tabla_recepcion.getRowCount();
        int columnCount = tabla_recepcion.getColumnCount();

        // Agregar el encabezado de la tabla al archivo de Excel
        XSSFRow headerRow = sheet.createRow(0);
        for (int i = 0; i < columnCount; i++) {
            XSSFCell cell = headerRow.createCell(i);
            cell.setCellValue(tabla_recepcion.getColumnName(i));
            cell.setCellStyle(headerCellStyle);
            sheet.autoSizeColumn(i);
        }

        // Agregar los datos de la tabla al archivo de Excel
        for (int i = 0; i < rowCount; i++) {
            XSSFRow row = sheet.createRow(i + 1);
            for (int j = 0; j < columnCount; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellValue(tabla_recepcion.getValueAt(i, j).toString());
                cell.setCellStyle(dataCellStyle);
                sheet.autoSizeColumn(j);
            }
        }

        // Guardar el archivo de Excel
        try {
            String desktopPath = System.getProperty("user.home") + "/Desktop/";
            File outputFile = new File(desktopPath + "Reporte_Envio_CERTIFICADOS.xlsx");
            FileOutputStream outputStream = new FileOutputStream(outputFile);
            workbook.write(outputStream);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Exportar_recepcionActionPerformed

    private void Exportar_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exportar_entregaActionPerformed
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Crear una nueva hoja de trabajo de Excel
        XSSFSheet sheet = workbook.createSheet("CERTIFICADOS");

        // Crear un estilo de celda para el encabezado de la tabla
        XSSFCellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setAlignment(HorizontalAlignment.CENTER);
        headerCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        headerCellStyle.setFillForegroundColor(new XSSFColor(new java.awt.Color(0, 102, 204)));
        headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headerCellStyle.setBorderTop(BorderStyle.THIN);
        headerCellStyle.setBorderBottom(BorderStyle.THIN);
        headerCellStyle.setBorderLeft(BorderStyle.THIN);
        headerCellStyle.setBorderRight(BorderStyle.THIN);
        headerCellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
        headerCellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        headerCellStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        headerCellStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());

        // Crear un estilo de celda para los datos de la tabla
        XSSFCellStyle dataCellStyle = workbook.createCellStyle();
        dataCellStyle.setAlignment(HorizontalAlignment.LEFT);
        dataCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        dataCellStyle.setBorderTop(BorderStyle.THIN);
        dataCellStyle.setBorderBottom(BorderStyle.THIN);
        dataCellStyle.setBorderLeft(BorderStyle.THIN);
        dataCellStyle.setBorderRight(BorderStyle.THIN);
        dataCellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
        dataCellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        dataCellStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        dataCellStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());

        // Obtener los datos de la tabla
        int rowCount = tabla_reportes_entrega.getRowCount();
        int columnCount = tabla_reportes_entrega.getColumnCount();

        // Agregar el encabezado de la tabla al archivo de Excel
        XSSFRow headerRow = sheet.createRow(0);
        for (int i = 0; i < columnCount; i++) {
            XSSFCell cell = headerRow.createCell(i);
            cell.setCellValue(tabla_reportes_entrega.getColumnName(i));
            cell.setCellStyle(headerCellStyle);
            sheet.autoSizeColumn(i);
        }

        // Agregar los datos de la tabla al archivo de Excel
        for (int i = 0; i < rowCount; i++) {
            XSSFRow row = sheet.createRow(i + 1);
            for (int j = 0; j < columnCount; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellValue(tabla_reportes_entrega.getValueAt(i, j).toString());
                cell.setCellStyle(dataCellStyle);
                sheet.autoSizeColumn(j);
            }
        }

        // Guardar el archivo de Excel
        try {
            String desktopPath = System.getProperty("user.home") + "/Desktop/";
            File outputFile = new File(desktopPath + "Reporte_Entrega_CERTIFICADOS.xlsx");
            FileOutputStream outputStream = new FileOutputStream(outputFile);
            workbook.write(outputStream);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_Exportar_entregaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrmTramiteCertificaciones f = new FrmTramiteCertificaciones();
        f.show();
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_f_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f_mActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReportesCertificaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReportesCertificaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReportesCertificaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReportesCertificaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReportesCertificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXPORTAR2;
    private javax.swing.JButton Exportar_entrega;
    private javax.swing.JButton Exportar_recepcion;
    private javax.swing.JButton btnBuscar_entrega;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton buscarfecha;
    private com.toedter.calendar.JDateChooser fecha_entrega_de;
    private com.toedter.calendar.JDateChooser fecha_entrega_hasta;
    private com.toedter.calendar.JDateChooser fecha_envio_de;
    private com.toedter.calendar.JDateChooser fecha_envio_hasta;
    private com.toedter.calendar.JDateChooser fecha_recepcion_de;
    private com.toedter.calendar.JDateChooser fecha_recepcion_hasta;
    private javax.swing.JTextField filtro_m_e;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tabla_recepcion;
    private javax.swing.JTable tabla_reportes_entrega;
    private javax.swing.JTable tabla_reportes_envio;
    private javax.swing.JTextField txt_f_et;
    private javax.swing.JTextField txt_f_m;
    private javax.swing.JTextField txt_f_mr;
    private javax.swing.JTextField txt_f_n;
    private javax.swing.JTextField txt_f_r;
    // End of variables declaration//GEN-END:variables

    private XSSFCellStyle createHeaderStyle(XSSFWorkbook workbook) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
