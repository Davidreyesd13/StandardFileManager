package standardfilemanager;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.*;
import static java.lang.Math.random;

public class Main extends javax.swing.JFrame {

    Random random = new Random();

    public Main() {
        initComponents();

        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JDialog();
        MainMenu_Indices = new javax.swing.JButton();
        MainMenu_Registros = new javax.swing.JButton();
        MainMenu_Campos = new javax.swing.JButton();
        MainMenu_Utilidades1 = new javax.swing.JButton();
        jb_cerrar_archivo = new javax.swing.JButton();
        Campos_Menu = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jb_listcampo = new javax.swing.JButton();
        jb_addcampo = new javax.swing.JButton();
        JB_Regresar = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jb_borrarcampos = new javax.swing.JButton();
        jb_modcampos = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        Registros_Menu = new javax.swing.JDialog();
        Registros_TabbedMenu = new javax.swing.JTabbedPane();
        Registros_CargarMenu = new javax.swing.JPanel();
        RCA_Headbar = new javax.swing.JPanel();
        RCA_Footbar = new javax.swing.JPanel();
        RCA_TitleFooter = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        JB_Cruzar_Archivos = new javax.swing.JButton();
        JB_Regresar_Al_Menu_Principal = new javax.swing.JButton();
        JB_Crear_Registros = new javax.swing.JButton();
        JB_Buscar_Campos = new javax.swing.JButton();
        JB_Modificar_Campos = new javax.swing.JButton();
        JB_Borrar_Campos = new javax.swing.JButton();
        JB_Listar_Registros = new javax.swing.JButton();
        Indices_Menu = new javax.swing.JDialog();
        JDialogEsUnaBasura = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        IC_Headbar = new javax.swing.JPanel();
        IC_TitleFooter = new javax.swing.JSeparator();
        IC_Title = new javax.swing.JLabel();
        ReIndexar_Button = new javax.swing.JButton();
        CE_IndicesButton = new javax.swing.JButton();
        IC_Footbar = new javax.swing.JPanel();
        JB_Regresar1 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        Under_FileTextArea = new javax.swing.JTextArea();
        Utilidades_Menu = new javax.swing.JDialog();
        Exportar_Excel = new javax.swing.JPanel();
        EE_Headbar = new javax.swing.JPanel();
        EE_Footbar = new javax.swing.JPanel();
        EE_Title = new javax.swing.JLabel();
        EE_TitleFooter = new javax.swing.JSeparator();
        BE_ExportarExcel = new javax.swing.JButton();
        BE_ExportarXML = new javax.swing.JButton();
        JB_Regresar2 = new javax.swing.JButton();
        jd_ModCampos = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jcb_moditemcampos = new javax.swing.JComboBox<>();
        jb_modificar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jtf_modnamecampos = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        namelog = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        SP_longi_mod_campos = new javax.swing.JSpinner();
        CB_modcampostipo = new javax.swing.JComboBox<>();
        rb_modllaveprimaria = new javax.swing.JRadioButton();
        rb_modllavesecundaria = new javax.swing.JRadioButton();
        jd_deletecampos = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jcb_itemborrarcampo = new javax.swing.JComboBox<>();
        jb_borrarcampo = new javax.swing.JButton();
        jb_regresarborrarcampos = new javax.swing.JButton();
        Listar_Campos = new javax.swing.JDialog();
        jPanel18 = new javax.swing.JPanel();
        TA_ListarCampos = new javax.swing.JTextArea();
        BTN_CancelarListarCampos = new javax.swing.JButton();
        AddCampo = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TF_NombreDelCampo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CB_TipodeDato = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        SP_LongitudDelCampo = new javax.swing.JSpinner();
        rb_llaveprimariadelcampo = new javax.swing.JRadioButton();
        rb_llavesecundariadelcampo = new javax.swing.JRadioButton();
        jb_regresarmenucampos = new javax.swing.JButton();
        jb_crearcampo = new javax.swing.JButton();
        CA_Registro = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        CA_TablaRegistro = new javax.swing.JTable();
        CA_CrearRegistro = new javax.swing.JButton();
        CA_Salir = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        BU_Registro = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        BU_llaves = new javax.swing.JComboBox<>();
        BU_SearchKey = new javax.swing.JFormattedTextField();
        BU_Search = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        BU_Tabla = new javax.swing.JTable();
        BU_Salir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MO_Registro = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        MO_llaves = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        MO_SearchKey = new javax.swing.JFormattedTextField();
        MO_Search = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        MO_Tabla = new javax.swing.JTable();
        MO_Cambiar = new javax.swing.JButton();
        MO_Salir = new javax.swing.JButton();
        BO_Registro = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BO_llaves = new javax.swing.JComboBox<>();
        BO_SearchKey = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        BO_Tabla = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        LI_Registro = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        LI_Tabla = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Cruzar_Archivo = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        CA_habilitarcruce = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        Cruzar_Tabla = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        CA_abrirarchivo = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        Tabla_Cruzada = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CA_agregar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Underground_OpenFile = new javax.swing.JTextArea();
        BarraAzulSuperior = new javax.swing.JPanel();
        BarraMoradaDerecha = new javax.swing.JPanel();
        BarraMoradaIzquierda1 = new javax.swing.JPanel();
        BarraAzulInferior1 = new javax.swing.JPanel();
        BarraAzulInferior_Text = new javax.swing.JLabel();
        MainTitile_Header = new javax.swing.JLabel();
        SubHeader = new javax.swing.JLabel();
        jb_abrir_archivo = new javax.swing.JButton();
        jb_crear_archivo = new javax.swing.JToggleButton();
        jb_abrir_archivo1 = new javax.swing.JButton();

        Menu.setUndecorated(true);
        Menu.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainMenu_Indices.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MainMenu_Indices.setText("Menu de Indices");
        MainMenu_Indices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainMenu_Indices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenu_IndicesActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(MainMenu_Indices, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 190, 50));

        MainMenu_Registros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MainMenu_Registros.setText("Menu de Registros");
        MainMenu_Registros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainMenu_Registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenu_RegistrosActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(MainMenu_Registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 190, 50));

        MainMenu_Campos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MainMenu_Campos.setText("Menu de Campos");
        MainMenu_Campos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainMenu_Campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenu_CamposActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(MainMenu_Campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 190, 50));

        MainMenu_Utilidades1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MainMenu_Utilidades1.setText("Menu de Utilidades");
        MainMenu_Utilidades1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainMenu_Utilidades1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenu_Utilidades1ActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(MainMenu_Utilidades1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 190, 50));

        jb_cerrar_archivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_cerrar_archivo.setText("Cerrar Archivo Abierto");
        jb_cerrar_archivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_cerrar_archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cerrar_archivoMouseClicked(evt);
            }
        });
        jb_cerrar_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cerrar_archivoActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(jb_cerrar_archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 190, 60));

        Campos_Menu.setBackground(new java.awt.Color(51, 51, 51));
        Campos_Menu.setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_listcampo.setBackground(new java.awt.Color(0, 51, 102));
        jb_listcampo.setText("Listar");
        jb_listcampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_listcampoMouseClicked(evt);
            }
        });
        jb_listcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listcampoActionPerformed(evt);
            }
        });
        jPanel1.add(jb_listcampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 259, -1));

        jb_addcampo.setBackground(new java.awt.Color(0, 51, 102));
        jb_addcampo.setText("Añadir");
        jb_addcampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_addcampoMouseClicked(evt);
            }
        });
        jPanel1.add(jb_addcampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 259, -1));

        JB_Regresar.setBackground(new java.awt.Color(0, 51, 102));
        JB_Regresar.setText("Regresar");
        JB_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(JB_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 93, -1));

        jb_salvar.setBackground(new java.awt.Color(0, 51, 102));
        jb_salvar.setText("Salvar");
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 93, -1));

        jb_borrarcampos.setBackground(new java.awt.Color(0, 51, 102));
        jb_borrarcampos.setText("Eliminar");
        jb_borrarcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarcamposActionPerformed(evt);
            }
        });
        jPanel1.add(jb_borrarcampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 259, -1));

        jb_modcampos.setBackground(new java.awt.Color(0, 51, 102));
        jb_modcampos.setText("Modificar");
        jb_modcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modcamposActionPerformed(evt);
            }
        });
        jPanel1.add(jb_modcampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 259, -1));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 401, 460, -1));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 23, -1, 380));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 390));

        javax.swing.GroupLayout Campos_MenuLayout = new javax.swing.GroupLayout(Campos_Menu.getContentPane());
        Campos_Menu.getContentPane().setLayout(Campos_MenuLayout);
        Campos_MenuLayout.setHorizontalGroup(
            Campos_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Campos_MenuLayout.setVerticalGroup(
            Campos_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Registros_Menu.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registros_CargarMenu.setBackground(new java.awt.Color(255, 204, 204));
        Registros_CargarMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RCA_Headbar.setBackground(new java.awt.Color(255, 153, 102));

        javax.swing.GroupLayout RCA_HeadbarLayout = new javax.swing.GroupLayout(RCA_Headbar);
        RCA_Headbar.setLayout(RCA_HeadbarLayout);
        RCA_HeadbarLayout.setHorizontalGroup(
            RCA_HeadbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        RCA_HeadbarLayout.setVerticalGroup(
            RCA_HeadbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Registros_CargarMenu.add(RCA_Headbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 40));

        RCA_Footbar.setBackground(new java.awt.Color(255, 153, 102));

        javax.swing.GroupLayout RCA_FootbarLayout = new javax.swing.GroupLayout(RCA_Footbar);
        RCA_Footbar.setLayout(RCA_FootbarLayout);
        RCA_FootbarLayout.setHorizontalGroup(
            RCA_FootbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        RCA_FootbarLayout.setVerticalGroup(
            RCA_FootbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Registros_CargarMenu.add(RCA_Footbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 770, 40));

        RCA_TitleFooter.setBackground(new java.awt.Color(0, 0, 0));
        RCA_TitleFooter.setForeground(new java.awt.Color(0, 0, 0));
        Registros_CargarMenu.add(RCA_TitleFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 310, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Menu Registros");
        Registros_CargarMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 160, -1));

        JB_Cruzar_Archivos.setText("Cruzar Archivos");
        JB_Cruzar_Archivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_Cruzar_Archivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Cruzar_ArchivosActionPerformed(evt);
            }
        });
        Registros_CargarMenu.add(JB_Cruzar_Archivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 140, 30));

        JB_Regresar_Al_Menu_Principal.setText("Regresar");
        JB_Regresar_Al_Menu_Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Regresar_Al_Menu_PrincipalActionPerformed(evt);
            }
        });
        Registros_CargarMenu.add(JB_Regresar_Al_Menu_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        JB_Crear_Registros.setText("Crear Registro");
        JB_Crear_Registros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_Crear_Registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_Crear_RegistrosMouseClicked(evt);
            }
        });
        Registros_CargarMenu.add(JB_Crear_Registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 140, 30));

        JB_Buscar_Campos.setText("Buscar Registro");
        JB_Buscar_Campos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_Buscar_Campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Buscar_CamposActionPerformed(evt);
            }
        });
        Registros_CargarMenu.add(JB_Buscar_Campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 140, 30));

        JB_Modificar_Campos.setText("Modificar Registro");
        JB_Modificar_Campos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_Modificar_Campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Modificar_CamposActionPerformed(evt);
            }
        });
        Registros_CargarMenu.add(JB_Modificar_Campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 140, 30));

        JB_Borrar_Campos.setText("Borrar Registro");
        JB_Borrar_Campos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_Borrar_Campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Borrar_CamposActionPerformed(evt);
            }
        });
        Registros_CargarMenu.add(JB_Borrar_Campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 140, 30));

        JB_Listar_Registros.setText("Listar Registro");
        JB_Listar_Registros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_Listar_Registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Listar_RegistrosActionPerformed(evt);
            }
        });
        Registros_CargarMenu.add(JB_Listar_Registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 140, 30));

        Registros_TabbedMenu.addTab("", Registros_CargarMenu);

        Registros_Menu.getContentPane().add(Registros_TabbedMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Indices_Menu.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JDialogEsUnaBasura.setBackground(new java.awt.Color(0, 0, 0));

        IC_Headbar.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout IC_HeadbarLayout = new javax.swing.GroupLayout(IC_Headbar);
        IC_Headbar.setLayout(IC_HeadbarLayout);
        IC_HeadbarLayout.setHorizontalGroup(
            IC_HeadbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        IC_HeadbarLayout.setVerticalGroup(
            IC_HeadbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        IC_TitleFooter.setBackground(new java.awt.Color(0, 0, 0));
        IC_TitleFooter.setForeground(new java.awt.Color(0, 0, 0));

        IC_Title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        IC_Title.setText("Menu Indices");

        ReIndexar_Button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ReIndexar_Button.setText("Re-Indexar Archivos");
        ReIndexar_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReIndexar_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReIndexar_ButtonActionPerformed(evt);
            }
        });

        CE_IndicesButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CE_IndicesButton.setText("Crear Indices");
        CE_IndicesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CE_IndicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CE_IndicesButtonActionPerformed(evt);
            }
        });

        IC_Footbar.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout IC_FootbarLayout = new javax.swing.GroupLayout(IC_Footbar);
        IC_Footbar.setLayout(IC_FootbarLayout);
        IC_FootbarLayout.setHorizontalGroup(
            IC_FootbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        IC_FootbarLayout.setVerticalGroup(
            IC_FootbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        JB_Regresar1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JB_Regresar1.setText("Regresar");
        JB_Regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Regresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IC_TitleFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IC_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CE_IndicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReIndexar_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(JB_Regresar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(IC_Footbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IC_Headbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addComponent(IC_Footbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(IC_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(IC_TitleFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CE_IndicesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ReIndexar_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JB_Regresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(IC_Headbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout JDialogEsUnaBasuraLayout = new javax.swing.GroupLayout(JDialogEsUnaBasura);
        JDialogEsUnaBasura.setLayout(JDialogEsUnaBasuraLayout);
        JDialogEsUnaBasuraLayout.setHorizontalGroup(
            JDialogEsUnaBasuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogEsUnaBasuraLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JDialogEsUnaBasuraLayout.setVerticalGroup(
            JDialogEsUnaBasuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogEsUnaBasuraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Indices_Menu.getContentPane().add(JDialogEsUnaBasura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 470));

        Under_FileTextArea.setColumns(20);
        Under_FileTextArea.setRows(5);
        jScrollPane9.setViewportView(Under_FileTextArea);

        Indices_Menu.getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Utilidades_Menu.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exportar_Excel.setBackground(new java.awt.Color(255, 255, 255));
        Exportar_Excel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EE_Headbar.setBackground(new java.awt.Color(33, 115, 70));

        javax.swing.GroupLayout EE_HeadbarLayout = new javax.swing.GroupLayout(EE_Headbar);
        EE_Headbar.setLayout(EE_HeadbarLayout);
        EE_HeadbarLayout.setHorizontalGroup(
            EE_HeadbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        EE_HeadbarLayout.setVerticalGroup(
            EE_HeadbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        Exportar_Excel.add(EE_Headbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 40));

        EE_Footbar.setBackground(new java.awt.Color(33, 115, 70));

        javax.swing.GroupLayout EE_FootbarLayout = new javax.swing.GroupLayout(EE_Footbar);
        EE_Footbar.setLayout(EE_FootbarLayout);
        EE_FootbarLayout.setHorizontalGroup(
            EE_FootbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        EE_FootbarLayout.setVerticalGroup(
            EE_FootbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        Exportar_Excel.add(EE_Footbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 680, 40));

        EE_Title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        EE_Title.setText("Exportar archivo");
        Exportar_Excel.add(EE_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 340, 50));

        EE_TitleFooter.setBackground(new java.awt.Color(0, 0, 0));
        EE_TitleFooter.setForeground(new java.awt.Color(0, 0, 0));
        Exportar_Excel.add(EE_TitleFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 300, 10));

        BE_ExportarExcel.setBackground(new java.awt.Color(33, 115, 70));
        BE_ExportarExcel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BE_ExportarExcel.setForeground(new java.awt.Color(255, 255, 255));
        BE_ExportarExcel.setText("Exportar a Excel");
        BE_ExportarExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BE_ExportarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BE_ExportarExcelActionPerformed(evt);
            }
        });
        Exportar_Excel.add(BE_ExportarExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 310, 60));

        BE_ExportarXML.setBackground(new java.awt.Color(33, 115, 70));
        BE_ExportarXML.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BE_ExportarXML.setForeground(new java.awt.Color(255, 255, 255));
        BE_ExportarXML.setText("Exportar XML a SCHEMA");
        BE_ExportarXML.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BE_ExportarXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BE_ExportarXMLActionPerformed(evt);
            }
        });
        Exportar_Excel.add(BE_ExportarXML, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 310, 70));

        JB_Regresar2.setBackground(new java.awt.Color(33, 115, 70));
        JB_Regresar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JB_Regresar2.setText("Regresar");
        JB_Regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Regresar2ActionPerformed(evt);
            }
        });
        Exportar_Excel.add(JB_Regresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 310, 70));

        Utilidades_Menu.getContentPane().add(Exportar_Excel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jd_ModCampos.setUndecorated(true);
        jd_ModCampos.setResizable(false);

        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("Nombre");

        jTextField2.setEditable(false);
        jTextField2.setText("Tipo");

        namelog.setEditable(false);
        namelog.setText("Longitud");

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        CB_modcampostipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "int", "short", "char", "byte", "string", "long", "float", "boolean", "double" }));

        rb_modllaveprimaria.setText("Llave Primaria");

        rb_modllavesecundaria.setText("Llave Secundaria");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rb_modllaveprimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_modllavesecundaria, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                            .addComponent(SP_longi_mod_campos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_modnamecampos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcb_moditemcampos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(namelog, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(CB_modcampostipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jcb_moditemcampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_modnamecampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CB_modcampostipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namelog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SP_longi_mod_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_modllaveprimaria)
                    .addComponent(rb_modllavesecundaria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jb_modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jd_ModCamposLayout = new javax.swing.GroupLayout(jd_ModCampos.getContentPane());
        jd_ModCampos.getContentPane().setLayout(jd_ModCamposLayout);
        jd_ModCamposLayout.setHorizontalGroup(
            jd_ModCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_ModCamposLayout.setVerticalGroup(
            jd_ModCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ModCamposLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jb_borrarcampo.setText("Borrar campo");
        jb_borrarcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarcampoActionPerformed(evt);
            }
        });

        jb_regresarborrarcampos.setText("Regresar");
        jb_regresarborrarcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_regresarborrarcamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcb_itemborrarcampo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_borrarcampo, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(jb_regresarborrarcampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jcb_itemborrarcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_borrarcampo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_regresarborrarcampos)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_deletecamposLayout = new javax.swing.GroupLayout(jd_deletecampos.getContentPane());
        jd_deletecampos.getContentPane().setLayout(jd_deletecamposLayout);
        jd_deletecamposLayout.setHorizontalGroup(
            jd_deletecamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_deletecamposLayout.setVerticalGroup(
            jd_deletecamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TA_ListarCampos.setColumns(20);
        TA_ListarCampos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        TA_ListarCampos.setRows(5);
        TA_ListarCampos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        TA_ListarCampos.setEnabled(false);

        BTN_CancelarListarCampos.setBackground(new java.awt.Color(204, 204, 204));
        BTN_CancelarListarCampos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTN_CancelarListarCampos.setText("Cancelar");
        BTN_CancelarListarCampos.setBorder(null);
        BTN_CancelarListarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CancelarListarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(BTN_CancelarListarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(TA_ListarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(445, Short.MAX_VALUE)
                .addComponent(BTN_CancelarListarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(TA_ListarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(102, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout Listar_CamposLayout = new javax.swing.GroupLayout(Listar_Campos.getContentPane());
        Listar_Campos.getContentPane().setLayout(Listar_CamposLayout);
        Listar_CamposLayout.setHorizontalGroup(
            Listar_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Listar_CamposLayout.setVerticalGroup(
            Listar_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Listar_CamposLayout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setText("Nombre");

        jLabel2.setText("Tipo de dato del campo");

        CB_TipodeDato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "int", "byte", "double", "char", "string", "long", "float", "boolean", "short" }));

        jLabel3.setText("Longitud");

        rb_llaveprimariadelcampo.setText("Llave Primaria");

        rb_llavesecundariadelcampo.setText("Llave Secundaria");

        jb_regresarmenucampos.setText("Regresar");
        jb_regresarmenucampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_regresarmenucamposActionPerformed(evt);
            }
        });

        jb_crearcampo.setText("Crear");
        jb_crearcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearcampoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SP_LongitudDelCampo)
                            .addComponent(CB_TipodeDato, 0, 217, Short.MAX_VALUE)
                            .addComponent(TF_NombreDelCampo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rb_llaveprimariadelcampo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jb_regresarmenucampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_llavesecundariadelcampo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jb_crearcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TF_NombreDelCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CB_TipodeDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SP_LongitudDelCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_llaveprimariadelcampo)
                    .addComponent(rb_llavesecundariadelcampo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_regresarmenucampos)
                    .addComponent(jb_crearcampo))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout AddCampoLayout = new javax.swing.GroupLayout(AddCampo.getContentPane());
        AddCampo.getContentPane().setLayout(AddCampoLayout);
        AddCampoLayout.setHorizontalGroup(
            AddCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AddCampoLayout.setVerticalGroup(
            AddCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CA_Registro.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        CA_Registro.setTitle("Añadir Registro");

        jPanel5.setBackground(new java.awt.Color(255, 153, 102));

        CA_TablaRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CA_TablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(CA_TablaRegistro);

        CA_CrearRegistro.setBackground(new java.awt.Color(255, 0, 51));
        CA_CrearRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CA_CrearRegistro.setForeground(new java.awt.Color(255, 255, 255));
        CA_CrearRegistro.setText("Agregar");
        CA_CrearRegistro.setBorder(null);
        CA_CrearRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CA_CrearRegistroActionPerformed(evt);
            }
        });

        CA_Salir.setBackground(new java.awt.Color(204, 204, 204));
        CA_Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CA_Salir.setText("Regresar");
        CA_Salir.setBorder(null);
        CA_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CA_SalirActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Titulo.setText("Añadir Registro");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CA_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CA_CrearRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CA_CrearRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CA_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout CA_RegistroLayout = new javax.swing.GroupLayout(CA_Registro.getContentPane());
        CA_Registro.getContentPane().setLayout(CA_RegistroLayout);
        CA_RegistroLayout.setHorizontalGroup(
            CA_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CA_RegistroLayout.setVerticalGroup(
            CA_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        BU_Registro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 153, 102));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        BU_llaves.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BU_llavesItemStateChanged(evt);
            }
        });

        BU_SearchKey.setBackground(new java.awt.Color(0, 0, 0));
        BU_SearchKey.setForeground(new java.awt.Color(255, 255, 255));

        BU_Search.setBackground(new java.awt.Color(255, 153, 153));
        BU_Search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BU_Search.setText("Search");
        BU_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BU_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BU_SearchActionPerformed(evt);
            }
        });

        BU_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(BU_Tabla);

        BU_Salir.setBackground(new java.awt.Color(255, 0, 51));
        BU_Salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BU_Salir.setForeground(new java.awt.Color(255, 255, 255));
        BU_Salir.setText("Salir");
        BU_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BU_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BU_SalirActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Llave a Buscar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BU_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(BU_llaves, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(BU_SearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BU_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BU_llaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BU_SearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BU_Search))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(BU_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Buscar Registro");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BU_Registro.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 460));

        MO_Registro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 153, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Modificar Registros");

        MO_llaves.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MO_llavesItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Llave a Modificar");

        MO_SearchKey.setBackground(new java.awt.Color(0, 0, 0));
        MO_SearchKey.setForeground(new java.awt.Color(255, 255, 255));

        MO_Search.setBackground(new java.awt.Color(255, 255, 255));
        MO_Search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MO_Search.setText("Search");
        MO_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MO_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MO_SearchActionPerformed(evt);
            }
        });

        MO_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(MO_Tabla);

        MO_Cambiar.setBackground(new java.awt.Color(255, 255, 255));
        MO_Cambiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MO_Cambiar.setText("Efectuar Cambios");
        MO_Cambiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MO_Cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MO_CambiarActionPerformed(evt);
            }
        });

        MO_Salir.setBackground(new java.awt.Color(255, 0, 0));
        MO_Salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MO_Salir.setForeground(new java.awt.Color(255, 255, 255));
        MO_Salir.setText("Salir");
        MO_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MO_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MO_Cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MO_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(MO_llaves, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(34, 34, 34)
                            .addComponent(MO_SearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(MO_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MO_llaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MO_SearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MO_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MO_Cambiar)
                    .addComponent(MO_Salir))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MO_Registro.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 500));

        jPanel11.setBackground(new java.awt.Color(255, 153, 102));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("Borrar Registro");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Llave a Borrar");

        BO_llaves.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BO_llavesItemStateChanged(evt);
            }
        });

        BO_SearchKey.setBackground(new java.awt.Color(0, 0, 0));
        BO_SearchKey.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Search");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BO_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(BO_Tabla);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("Borrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 0, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Salir");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(BO_llaves, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(BO_SearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BO_llaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BO_SearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BO_RegistroLayout = new javax.swing.GroupLayout(BO_Registro.getContentPane());
        BO_Registro.getContentPane().setLayout(BO_RegistroLayout);
        BO_RegistroLayout.setHorizontalGroup(
            BO_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BO_RegistroLayout.setVerticalGroup(
            BO_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 153, 102));

        LI_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(LI_Tabla);

        jButton11.setBackground(new java.awt.Color(255, 51, 51));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Salir");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setText("Listar Registros");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LI_RegistroLayout = new javax.swing.GroupLayout(LI_Registro.getContentPane());
        LI_Registro.getContentPane().setLayout(LI_RegistroLayout);
        LI_RegistroLayout.setHorizontalGroup(
            LI_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LI_RegistroLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LI_RegistroLayout.setVerticalGroup(
            LI_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LI_RegistroLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 153, 102));

        CA_habilitarcruce.setBackground(new java.awt.Color(255, 0, 51));
        CA_habilitarcruce.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CA_habilitarcruce.setForeground(new java.awt.Color(255, 255, 255));
        CA_habilitarcruce.setText("Habilitar Cruce");
        CA_habilitarcruce.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CA_habilitarcruce.setEnabled(false);
        CA_habilitarcruce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CA_habilitarcruceActionPerformed(evt);
            }
        });

        Cruzar_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(Cruzar_Tabla);

        jButton13.setBackground(new java.awt.Color(255, 0, 51));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Salir");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        CA_abrirarchivo.setBackground(new java.awt.Color(255, 0, 51));
        CA_abrirarchivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CA_abrirarchivo.setForeground(new java.awt.Color(255, 255, 255));
        CA_abrirarchivo.setText("Abrir Archivo");
        CA_abrirarchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CA_abrirarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CA_abrirarchivoActionPerformed(evt);
            }
        });

        Tabla_Cruzada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane12.setViewportView(Tabla_Cruzada);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Campos a Cruzar");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Campos Cruzados");

        CA_agregar.setBackground(new java.awt.Color(255, 0, 51));
        CA_agregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CA_agregar.setForeground(new java.awt.Color(255, 255, 255));
        CA_agregar.setText("Agregar");
        CA_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CA_agregar.setEnabled(false);
        CA_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CA_agregarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cruzar las Tablas");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(CA_abrirarchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(CA_habilitarcruce, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(CA_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CA_habilitarcruce, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CA_abrirarchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CA_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Cruzar_ArchivoLayout = new javax.swing.GroupLayout(Cruzar_Archivo.getContentPane());
        Cruzar_Archivo.getContentPane().setLayout(Cruzar_ArchivoLayout);
        Cruzar_ArchivoLayout.setHorizontalGroup(
            Cruzar_ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Cruzar_ArchivoLayout.setVerticalGroup(
            Cruzar_ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Underground_OpenFile.setBackground(new java.awt.Color(35, 35, 35));
        Underground_OpenFile.setColumns(20);
        Underground_OpenFile.setRows(5);
        Underground_OpenFile.setEnabled(false);
        jScrollPane2.setViewportView(Underground_OpenFile);

        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraAzulSuperior.setBackground(new java.awt.Color(102, 102, 255));
        BarraAzulSuperior.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout BarraAzulSuperiorLayout = new javax.swing.GroupLayout(BarraAzulSuperior);
        BarraAzulSuperior.setLayout(BarraAzulSuperiorLayout);
        BarraAzulSuperiorLayout.setHorizontalGroup(
            BarraAzulSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        BarraAzulSuperiorLayout.setVerticalGroup(
            BarraAzulSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(BarraAzulSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 30));

        BarraMoradaDerecha.setBackground(new java.awt.Color(153, 102, 255));

        javax.swing.GroupLayout BarraMoradaDerechaLayout = new javax.swing.GroupLayout(BarraMoradaDerecha);
        BarraMoradaDerecha.setLayout(BarraMoradaDerechaLayout);
        BarraMoradaDerechaLayout.setHorizontalGroup(
            BarraMoradaDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        BarraMoradaDerechaLayout.setVerticalGroup(
            BarraMoradaDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(BarraMoradaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 30, 420));

        BarraMoradaIzquierda1.setBackground(new java.awt.Color(153, 102, 255));

        javax.swing.GroupLayout BarraMoradaIzquierda1Layout = new javax.swing.GroupLayout(BarraMoradaIzquierda1);
        BarraMoradaIzquierda1.setLayout(BarraMoradaIzquierda1Layout);
        BarraMoradaIzquierda1Layout.setHorizontalGroup(
            BarraMoradaIzquierda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        BarraMoradaIzquierda1Layout.setVerticalGroup(
            BarraMoradaIzquierda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(BarraMoradaIzquierda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 30, 420));

        BarraAzulInferior1.setBackground(new java.awt.Color(153, 153, 255));
        BarraAzulInferior1.setForeground(new java.awt.Color(153, 153, 255));

        BarraAzulInferior_Text.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BarraAzulInferior_Text.setForeground(new java.awt.Color(255, 255, 255));
        BarraAzulInferior_Text.setText("Rigoberto Barahona Saenz - Kenneth Espinoza - David Reyes  @2023 Estructura de Datos ll");

        javax.swing.GroupLayout BarraAzulInferior1Layout = new javax.swing.GroupLayout(BarraAzulInferior1);
        BarraAzulInferior1.setLayout(BarraAzulInferior1Layout);
        BarraAzulInferior1Layout.setHorizontalGroup(
            BarraAzulInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraAzulInferior1Layout.createSequentialGroup()
                .addComponent(BarraAzulInferior_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        BarraAzulInferior1Layout.setVerticalGroup(
            BarraAzulInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraAzulInferior1Layout.createSequentialGroup()
                .addComponent(BarraAzulInferior_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        getContentPane().add(BarraAzulInferior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 800, 50));

        MainTitile_Header.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        MainTitile_Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainTitile_Header.setText("Standard File Manager");
        getContentPane().add(MainTitile_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 560, 60));

        SubHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SubHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubHeader.setText("Submenus de Funciones");
        getContentPane().add(SubHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 470, 30));

        jb_abrir_archivo.setText("Abrir Archivo");
        jb_abrir_archivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_abrir_archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_abrir_archivoMouseClicked(evt);
            }
        });
        jb_abrir_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_abrir_archivoActionPerformed(evt);
            }
        });
        getContentPane().add(jb_abrir_archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 200, 60));

        jb_crear_archivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jb_crear_archivo.setText("Crear un Nuevo Archivo");
        jb_crear_archivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_crear_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crear_archivoActionPerformed(evt);
            }
        });
        getContentPane().add(jb_crear_archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 200, 60));

        jb_abrir_archivo1.setText("Salir del programa");
        jb_abrir_archivo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_abrir_archivo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_abrir_archivo1MouseClicked(evt);
            }
        });
        jb_abrir_archivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_abrir_archivo1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb_abrir_archivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 200, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenu_CamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenu_CamposActionPerformed
        showCamposMenu();
    }//GEN-LAST:event_MainMenu_CamposActionPerformed

    private void MainMenu_RegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenu_RegistrosActionPerformed
        showRegistrosMenu();
    }//GEN-LAST:event_MainMenu_RegistrosActionPerformed

    private void MainMenu_IndicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenu_IndicesActionPerformed
        showIndicesMenu();
    }//GEN-LAST:event_MainMenu_IndicesActionPerformed

    private void jb_addcampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_addcampoMouseClicked
        AddCampo.setModal(true);
        AddCampo.pack();
        AddCampo.setLocationRelativeTo(this);
        AddCampo.setVisible(true);
    }//GEN-LAST:event_jb_addcampoMouseClicked

    private void jb_listcampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_listcampoMouseClicked
        listar_campos();
    }//GEN-LAST:event_jb_listcampoMouseClicked

    private void jb_abrir_archivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_abrir_archivoMouseClicked

    }//GEN-LAST:event_jb_abrir_archivoMouseClicked

    private void jb_cerrar_archivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cerrar_archivoMouseClicked

    }//GEN-LAST:event_jb_cerrar_archivoMouseClicked

    private void MainMenu_Utilidades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenu_Utilidades1ActionPerformed
        Menu.setVisible(false);
        Utilidades_Menu.pack();
        Utilidades_Menu.setLocationRelativeTo(this);
        Utilidades_Menu.setVisible(true);

    }//GEN-LAST:event_MainMenu_Utilidades1ActionPerformed

    private void jb_crear_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crear_archivoActionPerformed
        try {
            Boolean existe = false;
            JFileChooser directorio = new JFileChooser("./");
            directorio.setApproveButtonText("Guardar");
            int seleccion = directorio.showOpenDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File newfile = new File(directorio.getSelectedFile() + ".txt");
                BufferedWriter salida = new BufferedWriter(new FileWriter(newfile));
                salida.close();
                // CARGADO DE ARCHIVOS A EL ARCHIVO BINARIO
                int id;
                ag.cargarArchivo();
                for (int i = 0; i < ag.getLista_archivos().size(); i++) {
                    if (ag.getLista_archivos().get(i).getArchivo().getName().equals(newfile.getName())) {
                        existe = true;
                    } // Fin If
                } // Fin For
                if (existe == false) {
                    id = ag.GenerarId();
                    archivo = new Archivo(newfile, id);
                    Guardar = newfile.getName();
                    ag.AddArchivo(archivo);
                    ag.escribirArchivo();
                    archivo = null;
                    JOptionPane.showMessageDialog(null, "¡Se ha creado su archivo exitosamente!");
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede crear el archivo porque ya existe");
                } // Fin If
            } // Fin If
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jb_crear_archivoActionPerformed

    private void jb_abrir_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_abrir_archivoActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null, "¿Desea utilizar un archivo de prueba?", "Confirmación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                boolean existePrueba = false;
                ag.cargarArchivo();
                for (Archivo archivo : ag.getLista_archivos()) {
                    if (archivo.getArchivo().getName().equals("PersonFile.txt")) {
                        existePrueba = true;
                        break;
                    } // Fin If
                } // Fin For
                ag.escribirArchivo();
                arboles.cargarArchivo();
                if (existePrueba) {
                    ag.cargarArchivo();
                    for (int i = 0; i < ag.getLista_archivos().size(); i++) {
                        if (ag.getLista_archivos().get(i).getArchivo().getName().equals("PersonFile.txt")) {
                            archivo = ag.getLista_archivos().get(i);
                            arbol_actual = arboles.getListaarboles().get(i).getArbol();
                            arbol_secundarioactual = arbolessecundarios.getListaArboles().get(i).getArbolSecundario();
                            Guardar = "PersonFile.txt";
                            break;
                        } // Fin If
                    } // Fin For
                    this.setVisible(false);
                    Menu.setSize(286, 415);
                    Menu.setLocationRelativeTo(null);
                    Menu.setVisible(true);
                } else {
                    GenerarPersonFile();
                    this.setVisible(false);
                    Menu.pack();
                    Menu.setLocationRelativeTo(null);
                    Menu.setVisible(true);
                } // Fin If
            } else {
                File archivo_abrir = null;
                FileReader fr = null;
                BufferedReader br = null;
                Underground_OpenFile.setText("");
                JFileChooser filechooser = new JFileChooser("./");
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
                filechooser.setFileFilter(filtro);
                int seleccion = filechooser.showOpenDialog(null);
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    archivo_abrir = filechooser.getSelectedFile();
                    Guardar = archivo_abrir.getName();
                    boolean valid = false;
                    ag.cargarArchivo();
                    for (int i = 0; i < ag.getLista_archivos().size(); i++) {
                        if (ag.getLista_archivos().get(i).getArchivo().equals(archivo_abrir)) {
                            valid = true;
                            archivo = ag.getLista_archivos().get(i);
                            formatear_CBbox_Modificar();
                            formatear_CBbox_borrar();
                            listar_campos();
                            for (int j = 0; j < archivo.getCampos().size(); j++) {
                                nuevoscampos.add(archivo.getCampos().get(j));
                            } // Fin For
                            break;
                        } // Fin If
                    } // Fin For
                    if (!valid) {
                        // CARGADO DE ARCHIVOS A EL ARCHIVO BINARIO
                        int ID;
                        ag.cargarArchivo();
                        ID = ag.GenerarId();
                        archivo = new Archivo(archivo_abrir, ID);
                        Guardar = null;
                        ag.AddArchivo(archivo);
                        ag.escribirArchivo();
                        formatear_CBbox_Modificar();
                        formatear_CBbox_borrar();
                        listar_campos();
                        Guardar = archivo.getArchivo().getName();
                    } // Fin If
                    fr = new FileReader(archivo_abrir);
                    br = new BufferedReader(fr);
                    String linea;
                    Underground_OpenFile.append("");
                    while ((linea = br.readLine()) != null) {
                        Underground_OpenFile.append(linea);
                        Underground_OpenFile.append("\n");
                    } // Fin While
                    try {
                        br.close();
                        fr.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    } // Fin Try Catch
                    arboles.cargarArchivo();
                    // Esto verifica que el arbol no exista
                    for (int i = 0; i < arboles.getListaarboles().size(); i++) {
                        if (arboles.getListaarboles().get(i).getArchivo().equals(archivo.getArchivo())) {
                            arbol_actual = arboles.getListaarboles().get(i).getArbol();
                            break;
                        } // Fin If
                    } // Fin For
                    arbolessecundarios.cargarArchivo();
                    for (int i = 0; i < arbolessecundarios.getListaArboles().size(); i++) {
                        if (arbolessecundarios.getListaArboles().get(i).getIDArchivoActual() == archivo.getID()) {
                            arbol_secundarioactual = arbolessecundarios.getListaArboles().get(i).getArbolSecundario();
                            break;
                        } // Fin If
                    } // Fin For
                    salvado = false;
                    this.setVisible(false);
                    Menu.setSize(286, 415);
                    Menu.setLocationRelativeTo(null);
                    Menu.setVisible(true);
                } // Fin If
            } // Fin If
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede abrir el archivo porque no existe");
        }
    }//GEN-LAST:event_jb_abrir_archivoActionPerformed

    private void jb_cerrar_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cerrar_archivoActionPerformed
        try {

            if (salvado == true) {
                if (JOptionPane.showConfirmDialog(null, "¿Desea salvar los cambios en el archivo?", "Confirmación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    // Actualiza el text area
                    FileReader fr = null;
                    BufferedReader br = null;
                    fr = new FileReader(archivo.getArchivo());
                    br = new BufferedReader(fr);
                    Underground_OpenFile.setText("");
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        Underground_OpenFile.append(linea);
                    } // Fin While
                    try {
                        br.close();
                        fr.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    } // Fin Try Catch
                    // Actualiza el file dentro del archivo binario
                    EscribirCamposBinario();
                    JOptionPane.showMessageDialog(this, "¡Se ha guardado el archivo exitosamente!");
                    this.setVisible(true);
                } else {
                    FileWriter fw = null;
                    BufferedWriter bw = null;
                    fw = new FileWriter(archivo.getArchivo());
                    bw = new BufferedWriter(fw);
                    bw.write(Underground_OpenFile.getText());
                    Underground_OpenFile.setText("");
                    bw.flush();
                    ag.cargarArchivo();
                    for (Archivo newarchivo : ag.getLista_archivos()) {
                        if (newarchivo.getID() == archivo.getID()) {
                            newarchivo.setArchivo(archivo.getArchivo());
                            break;
                        } // Fin If
                    } // Fin For
                    ag.escribirArchivo();
                    try {
                        bw.close();
                        fw.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    } // Fin Try Catch
                } // Fin If
            } else {
                FileWriter fw = null;
                BufferedWriter bw = null;
                fw = new FileWriter(archivo.getArchivo());
                bw = new BufferedWriter(fw);
                bw.write(Underground_OpenFile.getText());
                Underground_OpenFile.setText("");
                bw.flush();
                ag.cargarArchivo();
                for (Archivo newarchivo : ag.getLista_archivos()) {
                    if (newarchivo.getID() == archivo.getID()) {
                        newarchivo.setArchivo(archivo.getArchivo());
                        break;
                    } // Fin If
                } // Fin For
                ag.escribirArchivo();
                try {
                    bw.close();
                    fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                } // Fin Try Catch
            } // Fin If
            Guardar = null;
            archivo = null;
            nuevoscampos.clear();
            JOptionPane.showMessageDialog(this, "Archivo cerrado");
            Menu.setVisible(false);
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jb_cerrar_archivoActionPerformed

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        try {
            // Actualiza el Text Area
            FileReader fr = null;
            BufferedReader br = null;
            fr = new FileReader(archivo.getArchivo());
            br = new BufferedReader(fr);
            Underground_OpenFile.setText("");
            String linea;
            while ((linea = br.readLine()) != null) {
                Underground_OpenFile.append(linea);
            } // Fin While
            try {
                br.close();
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            } // Fin Try Catch
            // Actualiza el file dentro del archivo binario
            EscribirCamposBinario();
            listar_campos();
            if (crear == true || mod == true || dele == true) {
                JOptionPane.showMessageDialog(null, "Archivo Salvado Exitosamente");
            } // Fin If
            crear = false;
            mod = false;
            dele = false;
            salvado = false;
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    }//GEN-LAST:event_jb_salvarActionPerformed

    private void JB_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RegresarActionPerformed
        // TODO add your handling code here:
        Menu.setVisible(true);
        Campos_Menu.setVisible(false);
        TA_ListarCampos.setText("");
    }//GEN-LAST:event_JB_RegresarActionPerformed

    private void jb_abrir_archivo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_abrir_archivo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_abrir_archivo1MouseClicked

    private void jb_abrir_archivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_abrir_archivo1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_abrir_archivo1ActionPerformed

    private void jb_modcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modcamposActionPerformed
        formatear_CBbox_Modificar();
        jd_ModCampos.setLocationRelativeTo(null);
        jd_ModCampos.setModal(true);
        jd_ModCampos.pack();
        jd_ModCampos.setVisible(true);

    }//GEN-LAST:event_jb_modcamposActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Campos_Menu.setVisible(true);
        jd_ModCampos.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jb_borrarcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarcamposActionPerformed
        formatear_CBbox_borrar();
        jd_deletecampos.setLocationRelativeTo(this);
        jd_deletecampos.setModal(true);
        jd_deletecampos.pack();
        jd_deletecampos.setVisible(true);
    }//GEN-LAST:event_jb_borrarcamposActionPerformed

    private void jb_regresarborrarcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_regresarborrarcamposActionPerformed
        // TODO add your handling code here:
        jd_deletecampos.setVisible(false);
        Campos_Menu.setVisible(true);
    }//GEN-LAST:event_jb_regresarborrarcamposActionPerformed

    private void jb_borrarcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarcampoActionPerformed
        if (jcb_itemborrarcampo.getSelectedIndex() > 0) {
            try {
                boolean llave_primaria = false;
                for (int i = 0; i < nuevoscampos.size(); i++) {
                    if (nuevoscampos.get(i).getNombre() == campact.getNombre()) {
                        llave_primaria = nuevoscampos.get(i).isLlavePrimaria();
                    } // Fin If              
                } // Fin For
                if (llave_primaria) {
                    JOptionPane.showMessageDialog(this, "No se puede eliminar el campo debido a que es llave primaria");
                    jcb_itemborrarcampo.setSelectedIndex(0);
                } else {
                    salvado = true;
                    for (int i = 0; i < nuevoscampos.size(); i++) {
                        if (nuevoscampos.get(i).getNombre() == campact.getNombre()) {
                            nuevoscampos.remove(i);
                        } // Fin If              
                    } // Fin For
                    cambios_txt();
                    dele = true;
                    formatear_CBbox_Modificar();
                    formatear_CBbox_borrar();
                    JOptionPane.showMessageDialog(this, "¡Se ha eliminado el campo exitosamente!");
                } // Fin If
            } catch (Exception e) {
                e.printStackTrace();
            } // Fin Try Catch
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un campo para que sea eliminado");
        }
        try {
            Campos campo_borrar = null;
            String nombre_campo_borrar;
            nombre_campo_borrar = (String) jcb_itemborrarcampo.getSelectedItem();
            for (Campos campos : nuevoscampos) {
                if (campos.getNombre().equals(nombre_campo_borrar)) {
                    campo_borrar = campos;
                } // Fin If
            }
            if (campo_borrar != null) {
                campact = campo_borrar;
            } // Fin If
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Fin For
    }//GEN-LAST:event_jb_borrarcampoActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        if (jcb_moditemcampos.getSelectedIndex() >= 0) {
            try {
                salvado = true;
                boolean existe = false;
                String nombre;
                int longitud;
                String tipo_de_dato;
                boolean llave_primaria = false;
                boolean llave_secundaria = false;
                nombre = jtf_modnamecampos.getText();
                // VALIDACION QUE SE PUEDE BORRAR O CAMBIAR
                for (int i = 0; i < nuevoscampos.size(); i++) {
                    if (i != jcb_moditemcampos.getSelectedIndex()) {
                        if (nuevoscampos.get(i).getNombre().equals(nombre)) {
                            existe = true;
                        } // Fin If
                    } // Fin If
                } // Fin For
                tipo_de_dato = (String) CB_modcampostipo.getSelectedItem();
                longitud = Integer.parseInt(SP_longi_mod_campos.getValue().toString());
                if (rb_modllaveprimaria.isSelected()) {
                    llave_primaria = true;
                } // Fin If
                if (rb_modllavesecundaria.isSelected()) {
                    llave_secundaria = true;
                } // Fin If
                if (existe == false) {
                    if (nombre.equals("")) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un nombre para el campo");
                        jtf_modnamecampos.setText("");
                        CB_modcampostipo.setSelectedIndex(0);
                        SP_longi_mod_campos.setValue(1);
                        rb_modllaveprimaria.setSelected(false);
                        rb_modllavesecundaria.setSelected(false);
                        jcb_moditemcampos.setSelectedIndex(0);
                    } else if (longitud < 1) {
                        JOptionPane.showMessageDialog(null, "La longitud de un campo no puede ser negativa");
                        jtf_modnamecampos.setText("");
                        CB_modcampostipo.setSelectedIndex(0);
                        SP_longi_mod_campos.setValue(1);
                        rb_modllaveprimaria.setSelected(false);
                        rb_llavesecundariadelcampo.setSelected(false);
                        jcb_moditemcampos.setSelectedIndex(0);
                    } else {
                        for (Campos campo : nuevoscampos) {
                            if (campo.getNombre() == campact.getNombre()) {
                                campo.setNombre(nombre);
                                campo.setTipo_de_dato(tipo_de_dato);
                                campo.setLongitud(longitud);
                                campo.setLlaveprimaria(llave_primaria);
                                campo.setLlave_secundaria(llave_secundaria);
                            } // Fin If
                        } // Fin For
                        formatear_CBbox_Modificar();
                        formatear_CBbox_borrar();
                        cambios_txt();
                        jtf_modnamecampos.setText("");
                        CB_modcampostipo.setSelectedIndex(0);
                        SP_longi_mod_campos.setValue(1);
                        rb_modllaveprimaria.setSelected(false);
                        rb_modllavesecundaria.setSelected(false);
                        jcb_moditemcampos.setSelectedIndex(0);
                        JOptionPane.showMessageDialog(this, "¡Se ha modificado el campo exitosamente!");
                        mod = true;
                    } // Fin If
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede modificar el campo porque ya existe un campo con el mismo nombre");
                    jtf_modnamecampos.setText("");
                    CB_modcampostipo.setSelectedIndex(0);
                    SP_longi_mod_campos.setValue(1);
                    rb_modllaveprimaria.setSelected(false);
                    rb_llavesecundariadelcampo.setSelected(false);
                    jcb_moditemcampos.setSelectedIndex(0);
                } // Fin If
            } catch (Exception e) {
                e.printStackTrace();
            } // Fin Try Catch
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un campo para que sea modificado");
        } // Fin If
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jb_regresarmenucamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_regresarmenucamposActionPerformed
        try {
            rb_llaveprimariadelcampo.setEnabled(true);
            rb_llavesecundariadelcampo.setEnabled(true);
            AddCampo.setVisible(false);
            Campos_Menu.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jb_regresarmenucamposActionPerformed

    private void jb_crearcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearcampoActionPerformed
        try {
            salvado = true;
            boolean existe = false;
            String nombre = TF_NombreDelCampo.getText();
            // Validacion del campo para ver si el nombre ya existe
            for (int i = 0; i < nuevoscampos.size(); i++) {
                if (nuevoscampos.get(i).getNombre().equals(nombre)) {
                    existe = true;
                } // Fin If
            }// Fin For
            String tipo_de_dato;
            int longitud;
            tipo_de_dato = (String) CB_TipodeDato.getSelectedItem();
            longitud = Integer.parseInt(SP_LongitudDelCampo.getValue().toString());
            boolean llave_primaria = false;
            boolean llave_secundaria = false;
            if (rb_llaveprimariadelcampo.isSelected() == true && rb_llavesecundariadelcampo.isSelected() == true) {
                llave_primaria = true;
                llave_secundaria = true;
            } else if (rb_llaveprimariadelcampo.isSelected() == false && rb_llavesecundariadelcampo.isSelected() == true) {
                llave_primaria = false;
                llave_secundaria = true;
            } else if (rb_llaveprimariadelcampo.isSelected() == true && rb_llavesecundariadelcampo.isSelected() == false) {
                llave_primaria = true;
                llave_secundaria = false;
            } // Fin If
            int ID_archivo, ID_campo = GenerarIDCampo();
            ID_archivo = archivo.getID();
            Campos campo_nuevo = new Campos(ID_campo, ID_archivo, nombre, tipo_de_dato, longitud, llave_primaria, llave_secundaria);
            if (nuevoscampos.isEmpty()) {
                if (nombre.equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un nombre para el campo");
                    TF_NombreDelCampo.setText("");
                    CB_TipodeDato.setSelectedIndex(0);
                    SP_LongitudDelCampo.setValue(1);
                    rb_llaveprimariadelcampo.setSelected(false);
                    rb_llavesecundariadelcampo.setSelected(false);
                } else if (llave_primaria == false) {
                    JOptionPane.showMessageDialog(null, "El primer campo ingresado debe ser una llave primaria");
                    TF_NombreDelCampo.setText("");
                    CB_TipodeDato.setSelectedIndex(0);
                    SP_LongitudDelCampo.setValue(1);
                    rb_llaveprimariadelcampo.setSelected(false);
                    rb_llavesecundariadelcampo.setSelected(false);
                } else if (llave_primaria == true && llave_secundaria == true) {
                    JOptionPane.showMessageDialog(null, "No se puede seleccionar que sea llave primaria y secundaria a la vez");
                    TF_NombreDelCampo.setText("");
                    CB_TipodeDato.setSelectedIndex(0);
                    SP_LongitudDelCampo.setValue(1);
                    rb_llaveprimariadelcampo.setSelected(false);
                    rb_llavesecundariadelcampo.setSelected(false);
                } else if (longitud < 1) {
                    JOptionPane.showMessageDialog(null, "La longitud del campo no puede ser negativa");
                    TF_NombreDelCampo.setText("");
                    CB_TipodeDato.setSelectedIndex(0);
                    SP_LongitudDelCampo.setValue(1);
                    rb_llaveprimariadelcampo.setSelected(false);
                    rb_llavesecundariadelcampo.setSelected(false);
                } else {
                    campact = campo_nuevo;
                    nuevoscampos.add(campo_nuevo);
                    archivo.getCampos().add(campact);
                    añadir_campo_txt(campo_nuevo);

                    TF_NombreDelCampo.setText("");
                    CB_TipodeDato.setSelectedIndex(0);
                    SP_LongitudDelCampo.setValue(1);
                    for (int i = 0; i < nuevoscampos.size(); i++) {
                        if (nuevoscampos.get(i).isLlavePrimaria()) {
                            rb_llaveprimariadelcampo.setEnabled(false);
                        } // Fin If
                    } // Fin For
                    for (int i = 0; i < nuevoscampos.size(); i++) {
                        if (nuevoscampos.get(i).isLlave_secundaria()) {
                            rb_llavesecundariadelcampo.setEnabled(false);
                        } // Fin If
                    } // Fin For
                    rb_llaveprimariadelcampo.setSelected(false);
                    rb_llavesecundariadelcampo.setSelected(false);
                    crear = true;
                } // Fin If
            } else {
                if (existe == false) {
                    if (nombre.equals("")) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un nombre para el campo");
                        TF_NombreDelCampo.setText("");
                        CB_TipodeDato.setSelectedIndex(0);
                        SP_LongitudDelCampo.setValue(1);
                        for (int i = 0; i < nuevoscampos.size(); i++) {
                            if (nuevoscampos.get(i).isLlavePrimaria()) {
                                rb_llaveprimariadelcampo.setEnabled(false);
                            } // Fin If
                        } // Fin For
                        for (int i = 0; i < nuevoscampos.size(); i++) {
                            if (nuevoscampos.get(i).isLlave_secundaria()) {
                                rb_llavesecundariadelcampo.setEnabled(false);
                            } // Fin If
                        } // Fin For
                        rb_llaveprimariadelcampo.setSelected(false);
                        rb_llavesecundariadelcampo.setSelected(false);
                    } else if (llave_primaria == true && llave_secundaria == true) {
                        JOptionPane.showMessageDialog(null, "No se puede seleccionar que sea llave primaria y secundaria a la vez");
                        TF_NombreDelCampo.setText("");
                        CB_TipodeDato.setSelectedIndex(0);
                        SP_LongitudDelCampo.setValue(1);
                        for (int i = 0; i < nuevoscampos.size(); i++) {
                            if (nuevoscampos.get(i).isLlavePrimaria()) {
                                rb_llaveprimariadelcampo.setEnabled(false);
                            } // Fin If
                        } // Fin For
                        for (int i = 0; i < nuevoscampos.size(); i++) {
                            if (nuevoscampos.get(i).isLlave_secundaria()) {
                                rb_llavesecundariadelcampo.setEnabled(false);
                            } // Fin If
                        } // Fin For
                        rb_llaveprimariadelcampo.setSelected(false);
                        rb_llavesecundariadelcampo.setSelected(false);
                    } else if (longitud < 1) {
                        JOptionPane.showMessageDialog(null, "La longitud del campo no puede ser negativa");
                        TF_NombreDelCampo.setText("");
                        CB_TipodeDato.setSelectedIndex(0);
                        SP_LongitudDelCampo.setValue(1);
                        for (int i = 0; i < nuevoscampos.size(); i++) {
                            if (nuevoscampos.get(i).isLlavePrimaria()) {
                                rb_llaveprimariadelcampo.setEnabled(false);
                            } // Fin If
                        } // Fin For
                        for (int i = 0; i < nuevoscampos.size(); i++) {
                            if (nuevoscampos.get(i).isLlave_secundaria()) {
                                rb_llavesecundariadelcampo.setEnabled(false);
                            } // Fin If
                        } // Fin For
                        rb_llaveprimariadelcampo.setSelected(false);
                        rb_llavesecundariadelcampo.setSelected(false);
                    } else {
                        campact = campo_nuevo;
                        nuevoscampos.add(campo_nuevo);
                        añadir_campo_txt(campo_nuevo);
                        TF_NombreDelCampo.setText("");
                        CB_TipodeDato.setSelectedIndex(0);
                        SP_LongitudDelCampo.setValue(1);
                        for (int i = 0; i < nuevoscampos.size(); i++) {
                            if (nuevoscampos.get(i).isLlavePrimaria()) {
                                rb_llaveprimariadelcampo.setEnabled(false);
                            } // Fin If
                        } // Fin For
                        for (int i = 0; i < nuevoscampos.size(); i++) {
                            if (nuevoscampos.get(i).isLlave_secundaria()) {
                                rb_llavesecundariadelcampo.setEnabled(false);
                            } // Fin If
                        } // Fin For
                        rb_llaveprimariadelcampo.setSelected(false);
                        rb_llavesecundariadelcampo.setSelected(false);
                        crear = true;
                    } // Fin If
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede crear el campo porque ya existe un campo con el mismo nombre");
                    TF_NombreDelCampo.setText("");
                    CB_TipodeDato.setSelectedIndex(0);
                    SP_LongitudDelCampo.setValue(1);
                    for (int i = 0; i < nuevoscampos.size(); i++) {
                        if (nuevoscampos.get(i).isLlavePrimaria()) {
                            rb_llaveprimariadelcampo.setEnabled(false);
                        } // Fin If
                    } // Fin For
                    for (int i = 0; i < nuevoscampos.size(); i++) {
                        if (nuevoscampos.get(i).isLlave_secundaria()) {
                            rb_llaveprimariadelcampo.setEnabled(false);
                        } // Fin If
                    } // Fin For
                    rb_llaveprimariadelcampo.setSelected(false);
                    rb_llavesecundariadelcampo.setSelected(false);
                } // Fin If
            } // Fin If
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch

    }//GEN-LAST:event_jb_crearcampoActionPerformed

    private void JB_Cruzar_ArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Cruzar_ArchivosActionPerformed
        //if (!(arbol_actual == null)) si no da
        if (arbol_actual != null) {
            CA_abrirarchivo.setEnabled(true);
            CA_habilitarcruce.setEnabled(false);
            CA_agregar.setEnabled(false);
            showCruzar_Archivo();
        } else {
            JOptionPane.showMessageDialog(this, "No tienes registros creados en estos momentos.");
        }
    }//GEN-LAST:event_JB_Cruzar_ArchivosActionPerformed

    private void JB_Crear_RegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_Crear_RegistrosMouseClicked
        CA_TablaRegistro.setModel(new DefaultTableModel());
        DefaultTableModel model = (DefaultTableModel) CA_TablaRegistro.getModel();
        for (int i = 0; i < archivo.getCampos().size(); i++) {
            model.addColumn(archivo.getCampos().get(i).getNombre());
        } // Fin For
        model.setNumRows(1);
        CA_Registro.pack();
        CA_Registro.setModal(true);
        CA_Registro.setLocationRelativeTo(null);
        Registros_Menu.setVisible(false);
        CA_Registro.setVisible(true);
    }//GEN-LAST:event_JB_Crear_RegistrosMouseClicked

    private void CA_CrearRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CA_CrearRegistroActionPerformed

        DefaultTableModel model = (DefaultTableModel) CA_TablaRegistro.getModel();
        if (!ValidaciondeingresoTabla(CA_TablaRegistro, true)) {
            return;
        } // Fin If
        if (archivo.getCant_Registros() == 0) {
            RandomAccessFile flujo;
            try {
                File archivo_temp = archivo.getArchivo();
                flujo = new RandomAccessFile(new File(archivo.getArchivo().getAbsolutePath()), "rw");
                String metadata2;
                metadata2 = Under_FileTextArea.getText();
                metadata2 += LlenadoEspacios(metadata2.length(), 250);
                StringBuffer sbmetadata = new StringBuffer(metadata2);
                sbmetadata.setLength(250);
                flujo.writeChars(sbmetadata.toString());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } // Fin Try Catch
        } // Fin If
        //Aqui es donde se guarda el registro a ingresar
        String guardar = "";
        arboles.cargarArchivo();
        // Esto es para los que ya estan creados en el arbol
        boolean omitidos = false;
        // Verifica si el arbol esta creado
        boolean arbolcreado = false;
        int getposarbol = 0;//agarra la posicion del arbol
        // Esto verifica que el arbol no exista
        for (int i = 0; i < arboles.getListaarboles().size(); i++) {
            if (arboles.getListaarboles().get(i).getArchivo().equals(archivo.getArchivo())) {
                arbolcreado = true;
                getposarbol = i;//se agarra la posicion del arbol creado
                arbol_actual = arboles.getListaarboles().get(i).getArbol();
                break;
            } // Fin If
        } // Fin For
        int llaveprimaria = 0;
        for (int i = 0; i < archivo.getCampos().size(); i++) {
            if (archivo.getCampos().get(i).isLlavePrimaria()) {
                llaveprimaria = i;
            } // Fin If
        } // Fin For
        // Aqui se empieza a trabajar en la creacion
        if (arbolcreado == false) {
            // Aqui es sie el arbol no esta creado pues se crea dentro de la lista de arboles y se hace el registro
            arboles.cargarArchivo();
            int id = arboles.GenerarId();
            Archivoconarbolb Archivodelarbol = new Archivoconarbolb(archivo.getArchivo(), id);
            Archivodelarbol.setArbol(6);
            for (int i = 0; i < model.getRowCount(); i++) {
                guardar = "";
                for (int j = 0; j < model.getColumnCount(); j++) {
                    guardar += model.getValueAt(i, j).toString() + "|";
                } // Fin For
                guardar += llenar(guardar.length()) + "\n";
                String llave = model.getValueAt(i, llaveprimaria).toString();
                if (archivo.getCampos().get(llaveprimaria).getTipo_de_dato().equals("String")) {
                    int num = archivo.getCampos().get(llaveprimaria).getLongitud() - llave.length();
                    llave = espacios.substring(0, num) + llave;
                } else if (archivo.getCampos().get(llaveprimaria).getTipo_de_dato().equals("int")) {
                    int num = archivo.getCampos().get(llaveprimaria).getLongitud() - llave.length();
                    llave = espacios.substring(0, num) + llave;
                } // Fin If
                arbolessecundarios.cargarArchivo();
                if (Archivodelarbol.getArbol().B_Tree_Search(Archivodelarbol.getArbol().getRaiz(), llave) != null) {
                    omitidos = true;
                } else {
                    int rrn = 0;
                    try {
                        // Aqui manda a llamar el RRN para designarlo al arbol
                        rrn = guardarRegistro(guardar);
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    } // Fin Try Catch
                    Archivodelarbol.getArbol().B_Tree_Insert(llave, rrn);
                    if (arbol_secundarioactual != null) {
                        int llavesecundaria = 0;
                        arbolessecundarios.cargarArchivo();
                        for (int r = 0; r < archivo.getCampos().size(); r++) {
                            if (archivo.getCampos().get(r).isLlave_secundaria()) {
                                llavesecundaria = r;
                            } // Fin If
                        } // Fin For
                        int archivodelarbol = 0;
                        for (int r = 0; r < arbolessecundarios.getListaArboles().size(); r++) {
                            if (arbolessecundarios.getListaArboles().get(r).getIDArchivoActual() == archivo.getID()) {
                                archivodelarbol = r;
                            } // Fin If
                        } // Fin For
                        for (int r = 0; r < model.getRowCount(); r++) {
                            for (int s = 0; s < model.getColumnCount(); s++) {
                            }//fin segundo for
                            String llave_secundaria = model.getValueAt(r, llavesecundaria).toString();
                            if (archivo.getCampos().get(llavesecundaria).getTipo_de_dato().equals("int")) {
                                int num = archivo.getCampos().get(llavesecundaria).getLongitud() - llave_secundaria.length();
                                llave_secundaria = espacios.substring(0, num) + llave_secundaria;
                            } // Fin If
                            if (arbolessecundarios.getListaArboles().get(archivodelarbol).getArbolSecundario().B_Tree_Search(arbolessecundarios.getListaArboles().get(archivodelarbol).getArbolSecundario().getRaiz(), llave_secundaria) != null) {
                                omitidos = true;
                            } else {
                                arbolessecundarios.getListaArboles().get(archivodelarbol).getArbolSecundario().B_Tree_Insert(llave_secundaria, rrn);
                                arbol_secundarioactual = arbolessecundarios.getListaArboles().get(archivodelarbol).getArbolSecundario();
                                arbolessecundarios.escribirArchivo();
                            } // Fin If
                        } // Fin For
                    } // Fin Ff 
                } // Fin If
            } // Fin For
            arbol_actual = Archivodelarbol.getArbol();
            arboles.getListaarboles().add(Archivodelarbol);
            arboles.escribirArchivo();
        } else {
            // Aqui se hace cuando el arbol ya esta creado
            arboles.cargarArchivo();
            for (int i = 0; i < model.getRowCount(); i++) {
                guardar = "";
                for (int j = 0; j < model.getColumnCount(); j++) {
                    guardar += model.getValueAt(i, j).toString() + "|";
                } // Fin For
                guardar += llenar(guardar.length()) + "\n";
                int posicion_llave = getPosKey();
                String llave = model.getValueAt(i, posicion_llave).toString();
                if (archivo.getCampos().get(llaveprimaria).getTipo_de_dato().equals("String")) {
                    int num = archivo.getCampos().get(llaveprimaria).getLongitud() - llave.length();
                    llave = espacios.substring(0, num) + llave;
                } else if (archivo.getCampos().get(llaveprimaria).getTipo_de_dato().equals("int")) {
                    int num = archivo.getCampos().get(llaveprimaria).getLongitud() - llave.length();
                    llave = espacios.substring(0, num) + llave;
                } // Fin If
                int llavesecundaria = 0;
                for (int r = 0; r < archivo.getCampos().size(); r++) {
                    if (archivo.getCampos().get(r).isLlave_secundaria()) {
                        llavesecundaria = r;
                    } // Fin If
                } // Fin For
                String llave_secun = "";
                for (int r = 0; r < model.getRowCount(); r++) {
                    for (int s = 0; s < model.getColumnCount(); s++) {
                    } // Fin Segundo For
                    llave_secun = model.getValueAt(r, llavesecundaria).toString();
                    if (archivo.getCampos().get(llavesecundaria).getTipo_de_dato().equals("int")) {
                        int num = archivo.getCampos().get(llavesecundaria).getLongitud() - llave_secun.length();
                        llave_secun = espacios.substring(0, num) + llave_secun;
                    } // Fin If
                } // Fin For
                int validacion = 0;
                for (int r = 0; r < arbolessecundarios.getListaArboles().size(); r++) {
                    if (arbolessecundarios.getListaArboles().get(r).getIDArchivoActual() == archivo.getID()) {
                        validacion = r;
                    } // Fin If
                } // Fin For
                if (arbol_secundarioactual != null) {
                    if (!archivo.getArchivo().getName().equals("PersonFile")) {
                        if (arboles.getListaarboles().get(getposarbol).getArbol().B_Tree_Search(arboles.getListaarboles().get(getposarbol).getArbol().getRaiz(), llave) != null || arbolessecundarios.getListaArboles().get(validacion).getArbolSecundario().B_Tree_Search(arbolessecundarios.getListaArboles().get(validacion).getArbolSecundario().getRaiz(), llave_secun) != null) {
                            omitidos = true;
                        } // Fin If
                    } // Fin If
                } // Fin If
                if (arboles.getListaarboles().get(getposarbol).getArbol().B_Tree_Search(arboles.getListaarboles().get(getposarbol).getArbol().getRaiz(), llave) != null) {
                    omitidos = true;
                } else {
                    int rrn = 0;
                    try {
                        rrn = guardarRegistro(guardar); //aqui manda a llamar al rrn para designarlo al arbol
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    } // Fin Try Catch
                    arboles.getListaarboles().get(getposarbol).getArbol().B_Tree_Insert(llave, rrn);
                    if (arbol_secundarioactual != null) {
                        llavesecundaria = 0;
                        arbolessecundarios.cargarArchivo();
                        for (int r = 0; r < archivo.getCampos().size(); r++) {
                            if (archivo.getCampos().get(r).isLlave_secundaria()) {
                                llavesecundaria = r;
                            } // Fin Ff
                        } // Fin For
                        int archivodelarbol = 0;
                        for (int r = 0; r < arbolessecundarios.getListaArboles().size(); r++) {
                            if (arbolessecundarios.getListaArboles().get(r).getIDArchivoActual() == archivo.getID()) {
                                archivodelarbol = r;
                            } // Fin If
                        } // Fin For
                        for (int r = 0; r < model.getRowCount(); r++) {
                            for (int s = 0; s < model.getColumnCount(); s++) {
                            } // Fin Segundo For
                            String llave_secundaria = model.getValueAt(r, llavesecundaria).toString();
                            if (archivo.getCampos().get(llavesecundaria).getTipo_de_dato().equals("int")) {
                                int num = archivo.getCampos().get(llavesecundaria).getLongitud() - llave_secundaria.length();
                                llave_secundaria = espacios.substring(0, num) + llave_secundaria;
                            } // Fin If
                            if (arbolessecundarios.getListaArboles().get(archivodelarbol).getArbolSecundario().B_Tree_Search(arbolessecundarios.getListaArboles().get(archivodelarbol).getArbolSecundario().getRaiz(), llave_secundaria) != null) {
                                omitidos = true;
                            } else {
                                arbolessecundarios.getListaArboles().get(archivodelarbol).getArbolSecundario().B_Tree_Insert(llave_secundaria, rrn);
                                arbol_secundarioactual = arbolessecundarios.getListaArboles().get(archivodelarbol).getArbolSecundario();
                                arbolessecundarios.escribirArchivo();
                            } // Fin If
                        } // Fin For
                    } // Fin If
                } // Fin If
            } // Fin for
            arbol_actual = arboles.getListaarboles().get(getposarbol).getArbol();
            arboles.escribirArchivo();
        } // Fin If
        String message;
        // Esto lo que hace es enviar un mensaje a ver si el registro ya existe en el arbol
        if (omitidos) {
            message = "Algunos registros no fueron guardados ya que habia un registro con la misma llave primaria o secundaria almacenado en el archivo";
        } else {
            message = "¡Guardado Exitoso!";
        } // Fin If
        arboles.escribirArchivo();
        JOptionPane.showMessageDialog(null, message);
        CA_TablaRegistro.setModel(new DefaultTableModel());
        DefaultTableModel modelo = (DefaultTableModel) CA_TablaRegistro.getModel();
        for (int i = 0; i < archivo.getCampos().size(); i++) {
            modelo.addColumn(archivo.getCampos().get(i).getNombre());
        } // Fin For
        modelo.setNumRows(1);

    }//GEN-LAST:event_CA_CrearRegistroActionPerformed

    private int tam_registro() {
        int length = 0;
        for (Campos campo : archivo.getCampos()) {
            length += campo.getLongitud();
        } // Fin For
        return length + archivo.getCampos().size();
    } // Fin Tam Registro

    private int getPosKey() {
        for (int i = 0; i < archivo.getCampos().size(); i++) {
            if (archivo.getCampos().get(i).isLlavePrimaria()) {
                return i;
            } // Fin If
        } // Fin For
        return -1;
    } // Fin Get Pos Key

    private int setRrn() {
        ag.cargarArchivo();
        if (archivo.getAvailList().isEmpty()) {
            int pos_archivo = 0;
            for (int i = 0; i < ag.getLista_archivos().size(); i++) {
                if (ag.getLista_archivos().get(i).getID() == archivo.getID()) {
                    pos_archivo = i;
                    break;
                } // Fin If
            } // Fin For
            if (ag.getLista_archivos().get(pos_archivo).getCant_Registros() == 0) {
                ag.cargarArchivo();
                int rrn = 500;
                ag.getLista_archivos().get(pos_archivo).setCant_Registros(true);
                archivo = ag.getLista_archivos().get(pos_archivo);
                ag.escribirArchivo();
                return rrn;
            } else {
                ag.cargarArchivo();
                int rrn = (250 + (tam_registro() * ag.getLista_archivos().get(pos_archivo).getCant_Registros())) * 2;
                ag.getLista_archivos().get(pos_archivo).setCant_Registros(true);
                archivo = ag.getLista_archivos().get(pos_archivo);
                ag.escribirArchivo();
                return rrn;
            } // Fin If
        } // Fin If
        return (int) archivo.getAvailList().peekFirst();
    } // Fin If

    private int guardarRegistro(String registro) throws FileNotFoundException, IOException {
        int rrn = setRrn();
        if (archivo.getAvailList().isEmpty()) {
            try {
                RandomAccessFile flujo = new RandomAccessFile(new File(archivo.getArchivo().getAbsolutePath()), "rw");
                registro += LlenadoEspacios(registro.length(), tam_registro());
                StringBuffer sbregistro = new StringBuffer(registro);
                sbregistro.setLength(tam_registro());
                flujo.seek(rrn);
                flujo.writeChars(sbregistro.toString());
                return rrn;
            } catch (IOException ex) {
                ex.printStackTrace();
            } // Fin Try Catch
        } else {
            try {
                rrn = (int) archivo.getAvailList().peekLast();
                ag.cargarArchivo();
                for (int i = 0; i < ag.getLista_archivos().size(); i++) {
                    if (ag.getLista_archivos().get(i).getID() == archivo.getID()) {
                        ag.getLista_archivos().get(i).getAvailList().removeLast();
                        archivo = ag.getLista_archivos().get(i);
                        break;
                    } // Fin If
                } // Fin For
                ag.escribirArchivo();
                RandomAccessFile flujo = new RandomAccessFile(new File(archivo.getArchivo().getAbsolutePath()), "rw");
                registro += LlenadoEspacios(registro.length(), tam_registro());
                StringBuffer sbregistro = new StringBuffer(registro);
                sbregistro.setLength(tam_registro());
                flujo.seek(rrn);
                flujo.writeChars(sbregistro.toString());
                if (!archivo.getAvailList().isEmpty()) {
                    int rrn2 = (int) archivo.getAvailList().peekLast();
                    RandomAccessFile raf = new RandomAccessFile(new File(archivo.getArchivo().getAbsolutePath()), "rw");
                    String cabeza_availist = Integer.toString(rrn2);
                    StringBuffer sbcabeza = new StringBuffer(cabeza_availist);
                    sbcabeza.setLength(50);
                    raf.seek((archivo.getSizeMetadata() + 1) * 2);
                    raf.writeChars(sbcabeza.toString());
                } else {
                    RandomAccessFile raf = new RandomAccessFile(new File(archivo.getArchivo().getAbsolutePath()), "rw");
                    String cabeza_availist = "-1";
                    StringBuffer sbcabeza = new StringBuffer(cabeza_availist);
                    sbcabeza.setLength(50);
                    raf.seek((archivo.getSizeMetadata() + 1) * 2);
                    raf.writeChars(sbcabeza.toString());
                } // Fin If
                return rrn;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } // Fin Try Catch
        } // Fin If
        return rrn;
    } // Fin Guardar Registro

    public String LlenadoEspacios(int tamRegistro, int tamRegistroMaximo) {
        String acum = "";
        for (int i = tamRegistro; i < tamRegistroMaximo; i++) {
            acum += " ";
        } // Fin For
        return acum;
    } // Fin Llenado Espacios

    public String llenar(int n) {
        int lengthT = 0;
        for (int i = 0; i < archivo.getCampos().size(); i++) {
            lengthT += archivo.getCampos().get(i).getLongitud();
        } // Fin For
        String spaces = "";
        for (int i = n; i < lengthT + archivo.getCampos().size(); i++) {
            spaces += " ";
        } // Fin For
        return spaces;
    } // Fin Llenar

    private boolean ValidaciondeingresoTabla(JTable tabla, boolean guardar) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        if (tabla.isEditing()) {
            tabla.getCellEditor().stopCellEditing();
        } // Fin If
        if (model.getRowCount() != 0) {
            for (int i = 0; i < model.getColumnCount(); i++) {
                if (model.getValueAt(model.getRowCount() - 1, i) == null) {
                    if (guardar) {
                        model.removeRow(model.getRowCount() - 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "No puede dejar ningun campo vacio!");
                        return false;
                    } // Fin If
                } // Fin If
                if (model.getValueAt(model.getRowCount() - 1, i).toString().length() > archivo.getCampos().get(i).getLongitud()) {
                    JOptionPane.showMessageDialog(null, "En el campo \""
                            + archivo.getCampos().get(i).getNombre() + "\" se esta pasando de la longitud maxima"
                            + " que es " + archivo.getCampos().get(i).getLongitud());
                    model.setValueAt("", model.getRowCount() - 1, i);
                    return false;
                } // Fin If
                if ("int".equals(archivo.getCampos().get(i).getTipo_de_dato())) {
                    try {
                        Integer.parseInt(model.getValueAt(model.getRowCount() - 1, i).toString());
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "En el campo \""
                                + archivo.getCampos().get(i).getNombre()
                                + "\" esta ingresando caracteres y solo se permiten enteros!");
                        return false;
                    } // Fin Try Catch
                } // Fin If
            } // Fin For
        } // Fin If
        return true;
    } // Fin Validacion Ingreso Tabla

    private void CA_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CA_SalirActionPerformed
        Registros_Menu.pack();
        Registros_Menu.setLocationRelativeTo(this);
        CA_Registro.setVisible(false);
        Registros_Menu.setVisible(true);
    }//GEN-LAST:event_CA_SalirActionPerformed

    private void JB_Regresar_Al_Menu_PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Regresar_Al_Menu_PrincipalActionPerformed
        Registros_Menu.dispose();
        Menu.setSize(286, 415);
        Menu.setLocationRelativeTo(this);
        Menu.setVisible(true);
    }//GEN-LAST:event_JB_Regresar_Al_Menu_PrincipalActionPerformed

    private void JB_Buscar_CamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Buscar_CamposActionPerformed
        // Si hay campos para listar
        //  Si no nada; es porque era (!(arbol_actual == null))
        if (!(arbol_actual == null)) {
            DefaultTableModel modelo = new DefaultTableModel();
            BU_Tabla.setModel(new DefaultTableModel());
            DefaultTableModel model = (DefaultTableModel) BU_Tabla.getModel();
            for (int i = 0; i < archivo.getCampos().size(); i++) {
                model.addColumn(archivo.getCampos().get(i).getNombre());
            } // Fin For
            CA_TablaRegistro.setModel(modelo);
            BU_llaves.setModel(new DefaultComboBoxModel<>());
            BU_llaves.addItem(archivo.getCampos().get(0).getNombre());
            for (int i = 0; i < archivo.getCampos().size(); i++) {
                if (archivo.getCampos().get(i).isLlave_secundaria()) {
                    BU_llaves.addItem(archivo.getCampos().get(i).getNombre());
                    break;
                } // Fin If
            } // Fin For
            BU_SearchKey.setText("");
            BU_Registro.pack();
            BU_Registro.setModal(true);
            BU_Registro.setLocationRelativeTo(this);
            BU_Registro.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No tienes registros guardados en estos momentos");
        }
    }//GEN-LAST:event_JB_Buscar_CamposActionPerformed

    private void BU_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BU_SearchActionPerformed
        if (archivo.getLongitudLlavePrimaria() < BU_SearchKey.getText().length()) {
            JOptionPane.showMessageDialog(this, "La llave ingresada excede la longitud permitida.");
            return;
        } // Fin If
        if (BU_SearchKey.getText().equals("") || BU_llaves.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese el la llave del registro que desea buscar.");
            return;
        } // Fin If
        int llavesecundaria = 0;
        for (int i = 0; i < archivo.getCampos().size(); i++) {
            if (archivo.getCampos().get(i).isLlave_secundaria()) {
                llavesecundaria = i;
            } // Fin If
        } // Fin For
        for (int i = 0; i < arboles.getListaarboles().size(); i++) {
            if (arboles.getListaarboles().get(i).getArchivo().equals(archivo.getArchivo())) {
                arbol_actual = arboles.getListaarboles().get(i).getArbol();
                break;
            } // Fin If
        } // Fin For
        int poscombobox = BU_llaves.getSelectedIndex();
        if (poscombobox == 0) {
            if (arbol_actual != null) {
                DefaultTableModel model = (DefaultTableModel) BU_Tabla.getModel();
                model.getDataVector().removeAllElements();
                if (true || BU_llaves.getSelectedIndex() == 0) {
                    int pk = 0;
                    String llave = BU_SearchKey.getText();
                    if (archivo.getCampos().get(pk).getTipo_de_dato().equals("int")) {
                        int num = archivo.getCampos().get(pk).getLongitud() - llave.length();
                        llave = espacios.substring(0, num) + llave;
                    } else if (archivo.getCampos().get(pk).getTipo_de_dato().equals("String")) {
                        int num = archivo.getCampos().get(pk).getLongitud() - llave.length();
                        llave = espacios.substring(0, num) + llave;
                    } // Fin If
                    SearchCampoBuffer = new ArrayList<Long>();
                    arbol_actual.searchByAffinity(arbol_actual.getRaiz(), llave, SearchCampoBuffer);//searchbyaffinity lo que hace es devolver el rrn de la llave que buscamos
                    if (SearchCampoBuffer.size() == 0) {
                        JOptionPane.showMessageDialog(null, "No se encontro ningun registro con ese valor");
                        BU_SearchKey.setText("");
                        return;
                    } // Fin If
                    for (long l : SearchCampoBuffer) {
                        // Aal rrn se le asigan el valor que el rrn le ha enviado
                        CampoSearch = Math.toIntExact(l);
                        try {
                            String data = Read_Campos(Math.toIntExact(CampoSearch));
                            String arr[] = data.split("\\|");
                            Object arr2[] = new Object[model.getColumnCount()];
                            for (int i = 0; i < model.getColumnCount(); i++) {
                                arr2[i] = arr[i];
                            } // Fin For
                            model.addRow(arr2);
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "Hubo un error severo");
                            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); Reintroducir y ver si funciona asi
                        } // Fin Try Catch
                    } // Fin For
                } // Fin If
            } else {
                JOptionPane.showMessageDialog(null, "No se puede buscar porque no existen registros creados");
            } // Fin If
        } else if (poscombobox == 1) {
            if (arbol_secundarioactual != null) {
                DefaultTableModel model = (DefaultTableModel) BU_Tabla.getModel();
                model.getDataVector().removeAllElements();
                if (true || BU_llaves.getSelectedIndex() == 0) {
                    String llave = BU_SearchKey.getText();
                    if (archivo.getCampos().get(llavesecundaria).getTipo_de_dato().equals("int")) {
                        int num = archivo.getCampos().get(llavesecundaria).getLongitud() - llave.length();
                        llave = espacios.substring(0, num) + llave;
                    } else if (archivo.getCampos().get(llavesecundaria).getTipo_de_dato().equals("String")) {
                        int num = archivo.getCampos().get(llavesecundaria).getLongitud() - llave.length();
                        llave = espacios.substring(0, num) + llave;
                    } // Fin If
                    SearchCampoBuffer = new ArrayList<>();
                    arbol_secundarioactual.searchByAffinity(arbol_secundarioactual.getRaiz(), llave, SearchCampoBuffer);
                    if (SearchCampoBuffer.size() == 0) {
                        JOptionPane.showMessageDialog(null, "No se encontro ningun registro con ese valor");
                        BU_SearchKey.setText("");
                        // return aqui
                    } // Fin If
                    for (long l : SearchCampoBuffer) {
                        CampoSearch = Math.toIntExact(l);
                        try {
                            String data = Read_Campos(Math.toIntExact(CampoSearch));
                            String arr[] = data.split("\\|");
                            Object arr2[] = new Object[model.getColumnCount()];
                            for (int i = 0; i < model.getColumnCount(); i++) {
                                arr2[i] = arr[i];
                            } // Fin For
                            model.addRow(arr2);
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "Hubo un error severo");

                            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); Reintroducir y ver si funciona asi
                        } // Fin Try Catch
                    } // Fin For
                } // Fin If
            } else {
                JOptionPane.showMessageDialog(null, "No se puede buscar porque no existen indices nuevos creados");
            } // Fin If
        } // Fin If
    }//GEN-LAST:event_BU_SearchActionPerformed

    private void BU_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BU_SalirActionPerformed
        Registros_Menu.setVisible(true);
        BU_Registro.setVisible(false);
    }//GEN-LAST:event_BU_SalirActionPerformed

    private void JB_Modificar_CamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Modificar_CamposActionPerformed
        // Si no da; intenten  if (!(arbol_actual == null))
        if (arbol_actual != null) {
            MO_Tabla.setModel(new DefaultTableModel());
            DefaultTableModel model = (DefaultTableModel) MO_Tabla.getModel();
            for (int i = 0; i < archivo.getCampos().size(); i++) {
                model.addColumn(archivo.getCampos().get(i).getNombre());
            } // Fin For
            MO_llaves.setModel(new DefaultComboBoxModel());
            MO_llaves.addItem(archivo.getCampos().get(0).getNombre());
            for (int i = 0; i < archivo.getCampos().size(); i++) {
                if (archivo.getCampos().get(i).isLlave_secundaria()) {
                    MO_llaves.addItem(archivo.getCampos().get(i).getNombre());
                    break;
                } // Fin If
            } // Fin For
            MO_SearchKey.setText("");
            showMO_Registro();
        } else {
            JOptionPane.showMessageDialog(this, "No se detecto ningun registro para modificar");
        } // Fin If
    }//GEN-LAST:event_JB_Modificar_CamposActionPerformed

    private void MO_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MO_SearchActionPerformed
        if (MO_SearchKey.getText().equals("") || MO_llaves.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Indique que Llave quiere buscar");
            MO_SearchKey.setText("");
            return;
        } // Fin If
        int llaveSecundaria = 0;
        String Second = "";
        for (int i = 0; i < archivo.getCampos().size(); i++) {
            if (archivo.getCampos().get(i).isLlave_secundaria()) {
                llaveSecundaria = i;
                Second = archivo.getCampos().get(i).getNombre();
            } // Fin If
        } // Fin For
        for (int i = 0; i < arboles.getListaarboles().size(); i++) {
            if (arboles.getListaarboles().get(i).getArchivo().equals(archivo.getArchivo())) {
                arbol_actual = arboles.getListaarboles().get(i).getArbol();
                break;
            } // Fin If
        } // Fin For
        int posComboBox = MO_llaves.getSelectedIndex();
        if (posComboBox == 0) {
            if (archivo.getLongitudLlavePrimaria() < MO_SearchKey.getText().length()) {
                JOptionPane.showMessageDialog(this, "La llave ingresada excede la longitud permitida");
                MO_SearchKey.setText("");
                return;
            } // Fin If
            if (arbol_actual != null) {
                DefaultTableModel model = (DefaultTableModel) MO_Tabla.getModel();
                model.getDataVector().removeAllElements();
                if (true || MO_llaves.getSelectedIndex() == 0) {
                    int pk = 0;
                    String llave = MO_SearchKey.getText();
                    if (archivo.getCampos().get(pk).getTipo_de_dato().equals("int")) {
                        int num = archivo.getCampos().get(pk).getLongitud() - llave.length();
                        llave = espacios.substring(0, num) + llave;
                    } else if (archivo.getCampos().get(pk).getTipo_de_dato().equals("String")) {
                        int num = archivo.getCampos().get(pk).getLongitud() - llave.length();
                        llave = espacios.substring(0, num) + llave;
                    } // Fin If
                    SearchCampoBuffer = new ArrayList<>();
                    // Search By Affinity lo que hace es devolver el rrn de la llave que buscamos
                    arbol_actual.searchByAffinity(arbol_actual.getRaiz(), llave, SearchCampoBuffer);
                    if (SearchCampoBuffer.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No se encontro el registro pedido");
                        MO_SearchKey.setText("");
                        return;
                    } // Fin If
                    for (long rrn : SearchCampoBuffer) {
                        // Al RRN se le asigan el valor que el rrn le ha enviado
                        CampoModify = Math.toIntExact(rrn);
                        try {
                            String linea = Read_Campos(Math.toIntExact(CampoModify));
                            String arreglo[] = linea.split("\\|");
                            Object arreglo2[] = new Object[model.getColumnCount()];
                            for (int i = 0; i < model.getColumnCount(); i++) {
                                llaveprimariaTemp = arreglo[0];
                                llavesecundariaTemp = arreglo[llaveSecundaria];
                                arreglo2[i] = arreglo[i];
                            } // Fin For
                            model.addRow(arreglo2);
                        } catch (IOException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } // Fin Try
                    } // Fin For
                } // Fin If
            } else {
                JOptionPane.showMessageDialog(null, "No existen registros");
            } // Fin If
        } else if (posComboBox == 1) {
            if (archivo.getLongitudLlaveSecundaria() < MO_SearchKey.getText().length()) {
                JOptionPane.showMessageDialog(this, "La llave ingresada excede la longitud permitida");
                MO_SearchKey.setText("");
                return;
            } // Fin If
            if (arbol_secundarioactual != null) {
                DefaultTableModel model = (DefaultTableModel) MO_Tabla.getModel();
                model.getDataVector().removeAllElements();
                if (true || MO_llaves.getSelectedIndex() == 0) {
                    String llave = MO_SearchKey.getText();
                    if (archivo.getCampos().get(llaveSecundaria).getTipo_de_dato().equals("int")) {
                        int num = archivo.getCampos().get(llaveSecundaria).getLongitud() - llave.length();
                        llave = espacios.substring(0, num) + llave;
                    } else if (archivo.getCampos().get(llaveSecundaria).getTipo_de_dato().equals("String")) {
                        int num = archivo.getCampos().get(llaveSecundaria).getLongitud() - llave.length();
                        llave = espacios.substring(0, num) + llave;
                    } // Fin If
                    SearchCampoBuffer = new ArrayList<>();
                    // Search By Affinity lo que hace es devolver el rrn de la llave que buscamos
                    arbol_secundarioactual.searchByAffinity(arbol_secundarioactual.getRaiz(), llave, SearchCampoBuffer);
                    if (SearchCampoBuffer.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No se pudo encontrar ese registro");
                        MO_SearchKey.setText("");
                        return;
                    } // Fin If
                    for (long l : SearchCampoBuffer) {
                        // Al RRN se le asigan el valor que el rrn le ha enviado
                        CampoModify = Math.toIntExact(l);
                        try {
                            String data = Read_Campos(Math.toIntExact(CampoModify));
                            String arreglo[] = data.split("\\|");
                            Object arreglo2[] = new Object[model.getColumnCount()];
                            for (int i = 0; i < model.getColumnCount(); i++) {
                                llaveprimariaTemp = arreglo[0];
                                if (arreglo[i].equals(Second)) {
                                    llavesecundariaTemp = arreglo[i];
                                } // Fin If
                                arreglo2[i] = arreglo[i];
                            } // Fin For
                            model.addRow(arreglo2);
                        } catch (IOException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } // Fin Try Catch
                    } // Fin For
                } // Fin If
            } else {
                JOptionPane.showMessageDialog(null, "No existen los indices");
            } // Fin If
        } // Fin If
        MO_SearchKey.setText("");
    }//GEN-LAST:event_MO_SearchActionPerformed

    private void MO_CambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MO_CambiarActionPerformed
        if (MO_Tabla.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "Aun no ha buscado ningun registro");
            MO_SearchKey.setText("");
            return;
        } // Fin If
        if (ValidaciondeingresoTabla(MO_Tabla, false)) {
            String columnaLlavePrimaria = "", columnaLlaveSecundaria = "";
            for (int i = 0; i < archivo.getCampos().size(); i++) {
                if (archivo.getCampos().get(i).isLlavePrimaria()) {
                    columnaLlavePrimaria = archivo.getCampos().get(i).getNombre();
                } // Fin If
            } // Fin For
            for (int i = 0; i < archivo.getCampos().size(); i++) {
                if (archivo.getCampos().get(i).isLlave_secundaria()) {
                    columnaLlaveSecundaria = archivo.getCampos().get(i).getNombre();
                } // Fin If
            } // Fin For
            DefaultTableModel model = (DefaultTableModel) MO_Tabla.getModel();
            String guardar = "";
            String llavePrimaria = "", llaveSecundaria = "";
            for (int j = 0; j < model.getColumnCount(); j++) {
                guardar += model.getValueAt(0, j).toString() + "|";
                if (model.getColumnName(j).equals(columnaLlavePrimaria)) {
                    llavePrimaria = model.getValueAt(0, j).toString();
                } // Fin If
                if (model.getColumnName(j).equals(columnaLlaveSecundaria)) {
                    llaveSecundaria = model.getValueAt(0, j).toString();
                } // Fin If
            } // Fin For
            if (!llavePrimaria.equals(llaveprimariaTemp)) {
                JOptionPane.showMessageDialog(this, "La llave primaria no se debe modificar");
                DefaultTableModel modelo = (DefaultTableModel) MO_Tabla.getModel();
                if (modelo.getRowCount() != 0) {
                    modelo.removeRow(0);
                } // Fin If
                MO_Tabla.setModel(modelo);
                return;
            } // Fin If
            if (!llaveSecundaria.equals(llavesecundariaTemp)) {
                JOptionPane.showMessageDialog(this, "La llave secundaria no se debe modificar");
                DefaultTableModel modelo = (DefaultTableModel) MO_Tabla.getModel();
                if (modelo.getRowCount() != 0) {
                    modelo.removeRow(0);
                } // Fin If
                MO_Tabla.setModel(modelo);
                return;
            } // Fin If
            model.removeRow(0);
            try {
                ModifyCamps(guardar, CampoModify);
                JOptionPane.showMessageDialog(null, "Registro modificado exitosamente");
                MO_SearchKey.setText("");
                MO_llaves.setSelectedIndex(0);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } // Fin Try Catch
        } // Fin If
    }//GEN-LAST:event_MO_CambiarActionPerformed

    private void MO_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MO_SalirActionPerformed
        MO_Registro.setVisible(false);
        Registros_Menu.setVisible(true);
    }//GEN-LAST:event_MO_SalirActionPerformed

    private void JB_Borrar_CamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Borrar_CamposActionPerformed
        // Si no da; (!(arbol == null))    
        if (arbol_actual != null) {
            DefaultTableModel model = new DefaultTableModel();
            BO_Tabla.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{}));
            for (int i = 0; i < archivo.getCampos().size(); i++) {
                model.addColumn(archivo.getCampos().get(i).getNombre());
            } // Fin For
            BO_llaves.setModel(new DefaultComboBoxModel<>());
            BO_llaves.addItem(archivo.getCampos().get(0).getNombre());
            for (int i = 0; i < archivo.getCampos().size(); i++) {
                if (archivo.getCampos().get(i).isLlave_secundaria()) {
                    BO_llaves.addItem(archivo.getCampos().get(i).getNombre());
                    break;
                } // Fin If
            } // Fin For
            BO_SearchKey.setText("");
            BO_Tabla.setModel(model);
            showBO_Registro();
        } else {
            JOptionPane.showMessageDialog(this, "No tienes registros guardados en estos momentos.");
        } // Fin If
    }//GEN-LAST:event_JB_Borrar_CamposActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (archivo.getLongitudLlavePrimaria() < BO_SearchKey.getText().length()) {
            JOptionPane.showMessageDialog(this, "La llave ingresada excede la longitud permitida.");
            //return;
        } // Fin If
        if (BO_SearchKey.getText().equals("") || BO_llaves.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese el la llave del registro que desea buscar.");
            //return;
        } // Fin If
        int llavesecundaria = 0;
        for (int i = 0; i < archivo.getCampos().size(); i++) {
            if (archivo.getCampos().get(i).isLlave_secundaria()) {
                llavesecundaria = i;
            } // Fin If
        } // Fin For
        for (int i = 0; i < arboles.getListaarboles().size(); i++) {
            if (arboles.getListaarboles().get(i).getArchivo().equals(archivo.getArchivo())) {
                arbol_actual = arboles.getListaarboles().get(i).getArbol();
                break;
            } // Fin If
        } // Fin For
        int poscombobox = BO_llaves.getSelectedIndex();
        if (poscombobox == 0) {
            if (arbol_actual != null) {
                DefaultTableModel model = (DefaultTableModel) BO_Tabla.getModel();
                model.getDataVector().removeAllElements();
                if (true || BO_llaves.getSelectedIndex() == 0) {
                    int pk = 0;
                    String llave = BO_SearchKey.getText();
                    if (archivo.getCampos().get(pk).getTipo_de_dato().equals("int")) {
                        int num = archivo.getCampos().get(pk).getLongitud() - llave.length();
                        llave = espacios.substring(0, num) + llave;
                    } else if (archivo.getCampos().get(pk).getTipo_de_dato().equals("String")) {
                        int num = archivo.getCampos().get(pk).getLongitud() - llave.length();
                        llave = espacios.substring(0, num) + llave;
                    } // Fin If
                    SearchCampoBuffer = new ArrayList<Long>();
                    // Search By Affinity lo que hace es devolver el rrn de la llave que buscamos
                    arbol_actual.searchByAffinity(arbol_actual.getRaiz(), llave, SearchCampoBuffer);
                    if (SearchCampoBuffer.size() == 0) {
                        JOptionPane.showMessageDialog(null, "No se encontro ningun registro con ese valor");
                        BO_SearchKey.setText("");
                        return;
                    } // Fin If
                    for (long l : SearchCampoBuffer) {
                        CampoSearch = Math.toIntExact(l);//al rrn se le asigan el valor que el rrn le ha enviado
                        try {
                            String data = Read_Campos(Math.toIntExact(CampoSearch));
                            String arr[] = data.split("\\|");
                            Object arr2[] = new Object[model.getColumnCount()];
                            for (int i = 0; i < model.getColumnCount(); i++) {
                                arr2[i] = arr[i];
                            }
                            model.addRow(arr2);
                            //jTf_buscarRegistros.setEditable(false);
                            // jCb_llavesBuscarregistros.setEnabled(false);
                        } catch (IOException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } // Fin Try Catch
                    } // Fin For
                } // Fin If
            } else {
                JOptionPane.showMessageDialog(null, "No se puede buscar porque no existen registros creados");
            } // Fin If
        } else if (poscombobox == 1) {
            if (arbol_secundarioactual != null) {
                DefaultTableModel model = (DefaultTableModel) MO_Tabla.getModel();
                model.getDataVector().removeAllElements();
                if (true || MO_llaves.getSelectedIndex() == 0) {
                    String llave = MO_SearchKey.getText();
                    if (archivo.getCampos().get(llavesecundaria).getTipo_de_dato().equals("int")) {
                        int num = archivo.getCampos().get(llavesecundaria).getLongitud() - llave.length();
                        llave = espacios.substring(0, num) + llave;
                    } else if (archivo.getCampos().get(llavesecundaria).getTipo_de_dato().equals("String")) {
                        int num = archivo.getCampos().get(llavesecundaria).getLongitud() - llave.length();
                        llave = espacios.substring(0, num) + llave;
                    } // Fin If
                    SearchCampoBuffer = new ArrayList<Long>();
                    // Search By Affinity lo que hace es devolver el rrn de la llave que buscamos
                    arbol_secundarioactual.searchByAffinity(arbol_secundarioactual.getRaiz(), llave, SearchCampoBuffer);
                    if (SearchCampoBuffer.size() == 0) {
                        JOptionPane.showMessageDialog(null, "No se encontro ningun registro con ese valor");
                        BO_SearchKey.setText("");
                        return;
                    } // Fin If
                    for (long l : SearchCampoBuffer) {
                        // Al RRN se le asigan el valor que el rrn le ha enviado
                        CampoSearch = Math.toIntExact(l);
                        try {
                            String data = Read_Campos(Math.toIntExact(CampoSearch));
                            String arr[] = data.split("\\|");
                            Object arr2[] = new Object[model.getColumnCount()];
                            for (int i = 0; i < model.getColumnCount(); i++) {
                                arr2[i] = arr[i];
                            } // Fin For
                            model.addRow(arr2);
                        } catch (IOException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } // Fin Try Catch
                    } // Fin For
                } // Fin If
            } else {
                JOptionPane.showMessageDialog(null, "No se puede buscar porque no existen indices nuevos creados");
            } // Fin If
        } // Fin If
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (MO_Tabla.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "No has buscado ningún registro todavía.");
            return;
        } // Fin If
        int getposarbol1 = 0;//esto es para agrrar la posicion dle arbolcreado
        for (int i = 0; i < arboles.getListaarboles().size(); i++) {
            if (arboles.getListaarboles().get(i).getArchivo().equals(archivo.getArchivo())) {
                getposarbol1 = i;
                arbol_actual = arboles.getListaarboles().get(i).getArbol();
                break;
            } // Fin If
        } // Fin For
        // ArrayList<Long> KeyCache = new ArrayList();
        KeyCache = new ArrayList<Long>();
        arbol_actual.BTree_KeysInOrder(arbol_actual.getRaiz(), KeyCache);
        if (!KeyCache.isEmpty()) {
            int c = 0;
            for (long key : SearchCampoBuffer) {
                if (true || Campos.class.cast(BO_llaves.getSelectedItem()).isLlavePrimaria()) {
                    String data = "";
                    try {
                        data = Read_Campos(Math.toIntExact(key));
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    } // Fin Try Catch
                    char[] data2 = data.toCharArray();
                    data2[0] = '*';
                    data2[1] = '|';
                    String StringBuffer = "";
                    boolean es_primer_registro_eliminado = true;
                    if (archivo.getAvailList().isEmpty()) {
                        StringBuffer = rrnAsString(-1);
                    } else {
                        StringBuffer = rrnAsString((int) archivo.getAvailList().peekFirst());
                        RandomAccessFile flujo;
                        try {
                            flujo = new RandomAccessFile(new File(archivo.getArchivo().getAbsolutePath()), "rw");
                            StringBuffer sbregistro = new StringBuffer(StringBuffer);
                            sbregistro.setLength(10);
                            flujo.seek((archivo.getSizeMetadata() + 1) * 2);
                            flujo.writeChars(sbregistro.toString());
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } // Fin Try Catch
                        es_primer_registro_eliminado = false;
                    }
                    int aux_cont = 0;
                    for (int i = 2; i < StringBuffer.length(); i++) {
                        data2[i] = StringBuffer.charAt(aux_cont);
                        aux_cont++;
                    } // Fin For
                    try {
                        int posicion_llave = getPosKey();
                        String llave = BO_Tabla.getValueAt(c++, posicion_llave).toString();
                        if (archivo.getCampos().get(posicion_llave).getTipo_de_dato().equals("int")) {
                            int num = archivo.getCampos().get(posicion_llave).getLongitud() - llave.length();
                            llave = espacios.substring(0, num) + llave;
                        } // Fin If
                        int llavesecundaria = 0;
                        for (int r = 0; r < archivo.getCampos().size(); r++) {
                            if (archivo.getCampos().get(r).isLlave_secundaria()) {
                                llavesecundaria = r;
                            } // Fin If
                        } // Fin For
                        String llave_secun = "";
                        for (int r = 0; r < BO_Tabla.getRowCount(); r++) {
                            for (int s = 0; s < BO_Tabla.getColumnCount(); s++) {
                            } // Fin For
                            llave_secun = BO_Tabla.getValueAt(r, llavesecundaria).toString();
                            if (archivo.getCampos().get(llavesecundaria).getTipo_de_dato().equals("int")) {
                                int num = archivo.getCampos().get(llavesecundaria).getLongitud() - llave_secun.length();
                                llave_secun = espacios.substring(0, num) + llave_secun;
                            } // Fin If
                        } // Fin For
                        int validacion = 0;
                        for (int r = 0; r < arbolessecundarios.getListaArboles().size(); r++) {
                            if (arbolessecundarios.getListaArboles().get(r).getIDArchivoActual() == archivo.getID()) {
                                validacion = r;
                            } // Fin If
                        } // Fin For
                        if (arbol_secundarioactual != null) {
                            arbolessecundarios.cargarArchivo();
                            arbolessecundarios.getListaArboles().get(validacion).getArbolSecundario().B_Tree_Delete_Key(arbol_secundarioactual.getRaiz(), llave_secun);
                            arbol_secundarioactual = arbolessecundarios.getListaArboles().get(validacion).getArbolSecundario();
                            arbolessecundarios.escribirArchivo();
                        } // Fin If
                        //ESTO ELIMINA EL REGISTRO DE LA LISTA DE REGISTROS
                        arboles.cargarArchivo();
                        arboles.getListaarboles().get(getposarbol1).getArbol().B_Tree_Delete_Key(arboles.getListaarboles().get(getposarbol1).getArbol().getRaiz(), llave);
                        arbol_actual = arboles.getListaarboles().get(getposarbol1).getArbol();
                        arboles.escribirArchivo();
                        ModifyCamps(new String(data2), Math.toIntExact(key));
                        ag.cargarArchivo();
                        for (int i = 0; i < ag.getLista_archivos().size(); i++) {
                            if (ag.getLista_archivos().get(i).getID() == archivo.getID()) {
                                ag.getLista_archivos().get(i).getAvailList().add(Math.toIntExact(key));
                                archivo = ag.getLista_archivos().get(i);
                                break;
                            } // Fin If
                        } // Fin For
                        ag.escribirArchivo();
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    } // Fin Try Catch
                } // Fin If
            } // Fin For 
            BO_SearchKey.setText("");
            DefaultTableModel model = new DefaultTableModel();
            BO_Tabla.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{}));
            for (int i = 0; i < archivo.getCampos().size(); i++) {
                model.addColumn(archivo.getCampos().get(i).getNombre());
            } // Fin For
            BO_Tabla.setModel(model);
            JOptionPane.showMessageDialog(this, "El registro a sido eliminado exitosamente");
        } else {
            JOptionPane.showMessageDialog(this, "No existen registros guardados.");
        } // Fin If        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        BO_Registro.setVisible(false);
        Registros_Menu.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void JB_Listar_RegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Listar_RegistrosActionPerformed
        //if (!(arbol_actual == null)) {
        if (arbol_actual != null) {
            arbol_actual.BTree_KeysInOrder(arbol_actual.getRaiz(), KeyCache);
            List_Registros();
            showLI_Registro();
        } else {
            JOptionPane.showMessageDialog(this, "No tienes registros guardados en estos momentos.");
        } // Fin If
    }//GEN-LAST:event_JB_Listar_RegistrosActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        LI_Registro.setVisible(false);
        Registros_Menu.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void CA_abrirarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CA_abrirarchivoActionPerformed
        if (CA_abrirarchivo.isEnabled()) {
            String save = "";
            try {
                if (JOptionPane.showConfirmDialog(null, "Desea utilizar un archivo existente?", "Verificacion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    boolean existeArchivo = false;
                    ag.cargarArchivo();
                    for (Archivo archivo : ag.getLista_archivos()) {
                        if (archivo.getArchivo().getName().equals("PersonFile.txt")) {
                            existeArchivo = true;
                            break;
                        } // Fin If
                    } // Fin For
                    ag.escribirArchivo();
                    if (existeArchivo) {
                        ag.cargarArchivo();
                        for (int i = 0; i < ag.getLista_archivos().size(); i++) {
                            if (ag.getLista_archivos().get(i).getArchivo().getName().equals("PersonFile.txt")) {
                                File_Cruzar = ag.getLista_archivos().get(i);
                                save = "PersonFile.txt";
                                break;
                            } // Fin If
                        } // Fin For
                    } else {
                        System.out.println("entra aqui no creado");
                        //GenerarPersonFile(); 
                        // El metodo masivo de crear un nuevo Person File (Safo, que lo haga Kenneth) de crear un nuevo person file de scratch
                    } // Fin If
                    //termina abrir de prueba
                } else {
                    File archivo_abrir = null;
                    FileReader fr = null;
                    BufferedReader br = null;
                    Underground_OpenFile.setText("");
                    JFileChooser filechooser = new JFileChooser("./");
                    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
                    filechooser.setFileFilter(filtro);
                    int seleccion = filechooser.showOpenDialog(null);
                    if (seleccion == JFileChooser.APPROVE_OPTION) {
                        archivo_abrir = filechooser.getSelectedFile();
                        save = archivo_abrir.getName();
                        boolean valid = false;
                        ag.cargarArchivo();
                        for (int i = 0; i < ag.getLista_archivos().size(); i++) {
                            if (ag.getLista_archivos().get(i).getArchivo().equals(archivo_abrir)) {
                                valid = true;
                                File_Cruzar = ag.getLista_archivos().get(i);
                                break;
                            } // Fin If
                        } // Fin For
                        if (!valid) {
                            JOptionPane.showMessageDialog(this, "Archivo seleccionado no es valido");
                        } // Fin If
                        fr = new FileReader(archivo_abrir);
                        br = new BufferedReader(fr);
                        try {
                            br.close();
                            fr.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        } // Fin Try Catch
                        salvado = false;
                    } // Fin If
                    JOptionPane.showMessageDialog(this, "Archivo Cargado Exitosamente");
                    CA_abrirarchivo.setEnabled(false);
                    CA_habilitarcruce.setEnabled(true);
                } // Fin If
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se puede abrir el archivo porque no existe");
            } // Fin Try Catch
        } else {
            JOptionPane.showMessageDialog(null, "Sigua bien la secuencia de eventos");
        }
    }//GEN-LAST:event_CA_abrirarchivoActionPerformed

    private void CA_habilitarcruceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CA_habilitarcruceActionPerformed
        if (CA_habilitarcruce.isEnabled()) {
            //  if (!(archivo_para_cruzar == null)) {
            if (File_Cruzar != null) {
                boolean Crossable = false;
                //Reviso si el archivo tiene relación de campos y también meto en un arraylist todos los campos de ambos archivos
                Campos_Cruzar.clear();
                //No se que putas es ya o a que quiere indicar
                int ya = 0;
                for (int j = 0; j < archivo.getCampos().size(); j++) {
                    Campos_Cruzar.add(archivo.getCampos().get(j));
                    for (int k = 0; k < File_Cruzar.getCampos().size(); k++) {
                        if (File_Cruzar.getCampos().get(k).Cross_Campos().equals(archivo.getCampos().get(j).Cross_Campos())) {
                            Crossable = true;
                        } else {
                            if (ya == 0) {
                                Campos_Cruzar.add(File_Cruzar.getCampos().get(k));
                            }
                        }
                    }
                    ya++;
                }
                if (Crossable) {
                    //Resetear la tabla
                    Cruzar_Tabla.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{}));
                    //Agarra el modelo de la tabla y meto los campos a dicha tabla
                    DefaultTableModel model = (DefaultTableModel) Cruzar_Tabla.getModel();
                    model.addColumn("Nombre del Campo");
                    model.addColumn("Tipo de Dato");
                    model.addColumn("Longitud del Campo");
                    String SplitCamp = "";
                    String[] split;
                    for (int i = 0; i < Campos_Cruzar.size(); i++) {
                        Object[] new_row = new Object[model.getColumnCount()];
                        SplitCamp += (Campos_Cruzar.get(i).getNombre() + "¡" + Campos_Cruzar.get(i).getTipo_de_dato() + "¡" + Campos_Cruzar.get(i).getLongitud());
                        split = SplitCamp.split("¡");
                        SplitCamp = "";
                        for (int j = 0; j < model.getColumnCount(); j++) {
                            new_row[j] = split[j];
                        }
                        model.addRow(new_row);
                    }
                    Cruzar_Tabla.setModel(model);
                    CA_habilitarcruce.setEnabled(false);
                    CA_agregar.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "No es posible cruzar los archivos prque no existe una relación de campos entre ambos archivos");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Todavía no has seleccionado un archivo para cruzar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sigua bien la secuencia de eventos");
        }
    }//GEN-LAST:event_CA_habilitarcruceActionPerformed

    private void CA_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CA_agregarActionPerformed
        if (CA_agregar.isEnabled()) {
            if (Cruzar_Tabla.getRowCount() < 1) {
                JOptionPane.showMessageDialog(this, "No existen mas campos para cruzar.");
            } else if (Cruzar_Tabla.getSelectedRow() >= 0) {
                //campos_para_cruzar.remove(jTbl_CamposParaCruceSelecionar.getSelectedRow());
                String nombre_campo = Cruzar_Tabla.getValueAt(Cruzar_Tabla.getSelectedRow(), 0).toString();
                DefaultTableModel modelo = (DefaultTableModel) Tabla_Cruzada.getModel();
                modelo.addColumn(nombre_campo);
                Tabla_Cruzada.setModel(modelo);
            } else {
                JOptionPane.showMessageDialog(this, "No has seleccionado un campo de la tabla.");
            }
        }
    }//GEN-LAST:event_CA_agregarActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Cruzar_Archivo.setVisible(false);
        Registros_Menu.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void BO_llavesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BO_llavesItemStateChanged
        try {
            DefaultTableModel model = (DefaultTableModel) BO_Tabla.getModel();
            if (model.getRowCount() != 0) {
                model.removeRow(0);
            } // Fin If
            BO_Tabla.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BO_llavesItemStateChanged

    private void MO_llavesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MO_llavesItemStateChanged
        try {
            DefaultTableModel model = (DefaultTableModel) MO_Tabla.getModel();
            if (model.getRowCount() != 0) {
                model.removeRow(0);
            }
            MO_Tabla.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_MO_llavesItemStateChanged

    private void BU_llavesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BU_llavesItemStateChanged
        try {
            DefaultTableModel model = (DefaultTableModel) BU_Tabla.getModel();
            if (model.getRowCount() != 0) {
                model.removeRow(0);
            } // Fin If
            BU_Tabla.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BU_llavesItemStateChanged

    private void BE_ExportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BE_ExportarExcelActionPerformed
        //KeyCache = new ArrayList();
        Excel modelo_excel = new Excel();
        JFileChooser directorio = new JFileChooser();
        directorio.setApproveButtonText("Exportar");
        int seleccion = directorio.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                //File archivo_excel = new File(directorio.getSelectedFile() + ".xlsx");
                File archivo_excel = new File(directorio.getSelectedFile() + ".xls");
                modelo_excel.Arbol_Ordenado(arbol_actual.getRaiz(), KeyCache, arbol_actual);
                JOptionPane.showMessageDialog(null, modelo_excel.Fill_Excel(archivo, archivo_excel, KeyCache));
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BE_ExportarExcelActionPerformed

    private void BE_ExportarXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BE_ExportarXMLActionPerformed
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.newDocument();
            String Title = "";
            Title = Guardar.substring(0, Guardar.length() - 4);
            Title = Title.replace(" ", "_");
            Element root = documento.createElement(Title);
            documento.appendChild(root);
            KeyCache = new ArrayList();
            arbol_actual.BTree_KeysInOrder(arbol_actual.getRaiz(), KeyCache);
            for (int i = 0; i < KeyCache.size(); i++) {
                long RRN = KeyCache.get(i);
                String data = Read_Registro(Math.toIntExact(RRN));
                String arr[] = data.split("\\|");
                Element row = documento.createElement("Registro");
                for (int j = 0; j < archivo.getCampos().size(); j++) {
                    Element campo = documento.createElement(archivo.getCampos().get(j).getNombre());
                    String insertar = arr[j];
                    Text dato = documento.createTextNode(insertar);
                    campo.appendChild(dato);
                    row.appendChild(campo);
                } // Fin For
                root.appendChild(row);
            } // Fin For
            Source source = new DOMSource(documento);
            String nameArchivo;
            nameArchivo = Title + ".xml";
            Result result = new StreamResult(new File(nameArchivo));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            JOptionPane.showMessageDialog(this, "Se ha exportado de manera exitosa");
            KeyCache = new ArrayList();
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    }//GEN-LAST:event_BE_ExportarXMLActionPerformed

    private void ReIndexar_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReIndexar_ButtonActionPerformed
        if (arbol_secundarioactual == null) {
        } else {
            JOptionPane.showMessageDialog(null, "Sus indices han sido actualizados");
        }
    }//GEN-LAST:event_ReIndexar_ButtonActionPerformed

    private void CE_IndicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CE_IndicesButtonActionPerformed
        arbolessecundarios.cargarArchivo();
        boolean arbolseccreado = false;
        int llave_secundaria_pos = 0;
        for (int i = 0; i < archivo.getCampos().size(); i++) {
            if (archivo.getCampos().get(i).isLlave_secundaria()) {
                llave_secundaria_pos = i;
            }
        }
        for (int i = 0; i < arbolessecundarios.getListaArboles().size(); i++) {
            if (arbolessecundarios.getListaArboles().get(i).getIDArchivoActual() == archivo.getID()) {
                arbolseccreado = true;
                arbol_secundarioactual = arbolessecundarios.getListaArboles().get(i).getArbolSecundario();
                break;
            }
        }
        if (arbolseccreado == false) {
            arbolessecundarios.cargarArchivo();
            Archivoarbolsecundario archivosecundario = new Archivoarbolsecundario(archivo.getArchivo(), archivo.getID(), new Arbol_Binario(6));
            for (int i = 0; i < archivo.getCant_Registros(); i++) {
                if (i == 0) {
                    try {
                        int rrn = 500;
                        String data = Read_Registro(rrn);
                        String arr[] = data.split("\\|");
                        String llave = arr[llave_secundaria_pos];
                        if (archivo.getCampos().get(llave_secundaria_pos).getTipo_de_dato().equals("int")) {
                            int num = archivo.getCampos().get(llave_secundaria_pos).getLongitud() - llave.length();
                            llave = espacios.substring(0, num) + llave;
                        }
                        archivosecundario.getArbolSecundario().B_Tree_Insert(llave, rrn);
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        int rrn2 = (250 + (tam_registro() * i)) * 2;
                        String data;
                        data = Read_Registro(rrn2);
                        String arr[] = data.split("\\|");
                        String llave = arr[llave_secundaria_pos];
                        if (archivo.getCampos().get(llave_secundaria_pos).getTipo_de_dato().equals("int")) {
                            int num = archivo.getCampos().get(llave_secundaria_pos).getLongitud() - llave.length();
                            llave = espacios.substring(0, num) + llave;
                        }
                        archivosecundario.getArbolSecundario().B_Tree_Insert(llave, rrn2);
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            arbolessecundarios.getListaArboles().add(archivosecundario);
            arbol_secundarioactual = archivosecundario.getArbolSecundario();
            arbolessecundarios.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Se crearon los indices nuevos");
        } else {
            JOptionPane.showMessageDialog(null, "Presione el boton reindexar para actualizar sus indices");
        } // Fin If
    }//GEN-LAST:event_CE_IndicesButtonActionPerformed

    private void JB_Regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Regresar1ActionPerformed
        // TODO add your handling code here:
        Indices_Menu.setVisible(false);
        Menu.setSize(286, 415);
        Menu.setVisible(true);
    }//GEN-LAST:event_JB_Regresar1ActionPerformed

    private void JB_Regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Regresar2ActionPerformed
        Utilidades_Menu.setVisible(false);
        Menu.setSize(286, 415);
        Menu.setVisible(true);
    }//GEN-LAST:event_JB_Regresar2ActionPerformed

    private void jb_listcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listcampoActionPerformed
        // DESPLIEGA EL JDIALOG DONDE SE LISTAN TODOS LOS CAMPOS DE MANERA FORMATEADA
        try {
            Campos_Menu.setVisible(false);
            Listar_Campos.setModal(true);
            Listar_Campos.pack();
            Listar_Campos.setLocationRelativeTo(this);
            Listar_Campos.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    }//GEN-LAST:event_jb_listcampoActionPerformed

    private void BTN_CancelarListarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CancelarListarCamposActionPerformed
        // REGRESAMOS DEL JDIALOG LISTAR CAMPOS AL MENU DE CAMPOS
        try {
            Listar_Campos.setVisible(false);
            Campos_Menu.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    }//GEN-LAST:event_BTN_CancelarListarCamposActionPerformed

    void añadir_campo_txt(Campos campos) {
        String linea = campos.campo_para_archivo();
        escribir_archivo_txt(linea);
        JOptionPane.showMessageDialog(this, "¡Se ha creado el campo exitosamente!");
    }

    void listar_campos() {
        try {
            TA_ListarCampos.setText("");
            for (int i = 0; i < archivo.getCampos().size(); i++) {
                TA_ListarCampos.append(archivo.getCampos().get(i).toString());
            } // Fin For
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    }

    void escribir_archivo_txt(String linea) {
        // Forma de Escribir:
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo.getArchivo(), true);
            bw = new BufferedWriter(fw);
            bw.write(linea);
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
        try {
            bw.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } // Fin Try Catch
    }

    public void cambios_txt() {
        // Forma de Escribir:
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            String linea = "";
            for (int i = 0; i < nuevoscampos.size(); i++) {
                linea += nuevoscampos.get(i).campo_para_archivo();
            } // Fin For
            fw = new FileWriter(archivo.getArchivo());
            bw = new BufferedWriter(fw);
            bw.write(linea);
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
        try {
            bw.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } // Fin Try Catch
    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    void formatear_CBbox_borrar() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        for (int i = 0; i < nuevoscampos.size(); i++) {
            Campos campo_temporal = nuevoscampos.get(i);
            modelo.addElement(campo_temporal.getNombre());
        }// Fin If
        jcb_itemborrarcampo.setModel(modelo);
    }

    void formatear_CBbox_Modificar() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        for (int i = 0; i < nuevoscampos.size(); i++) {
            Campos campo_temporal = nuevoscampos.get(i);
            modelo.addElement(campo_temporal.getNombre());
        }// Fin If
        jcb_moditemcampos.setModel(modelo);
    }

    public void showArchivosMenu() {
        Menu.setModal(true);
        Menu.pack();
        Menu.setLocationRelativeTo(this);
        Menu.setVisible(true);
    }

    public void showCamposMenu() {
        this.setVisible(false);
        Campos_Menu.setModal(true);
        Campos_Menu.pack();
        Campos_Menu.setLocationRelativeTo(this);
        Campos_Menu.setVisible(true);

    }

    public void showRegistrosMenu() {
        Registros_Menu.setModal(true);
        Registros_Menu.pack();
        Registros_Menu.setLocationRelativeTo(this);
        Registros_Menu.setVisible(true);
    }

    public void showIndicesMenu() {
        Indices_Menu.setModal(true);
        Indices_Menu.pack();
        Indices_Menu.setLocationRelativeTo(this);
        Indices_Menu.setVisible(true);
    }

    public void showUtilidadesMenu() {
        Utilidades_Menu.setModal(true);
        Utilidades_Menu.pack();
        Utilidades_Menu.setLocationRelativeTo(this);
        Utilidades_Menu.setVisible(true);
    }

    public void showBU_Registro() {
        BU_Registro.setModal(true);
        BU_Registro.pack();
        BU_Registro.setLocationRelativeTo(this);
        BU_Registro.setVisible(true);
    }

    public void showMO_Registro() {
        MO_Registro.setModal(true);
        MO_Registro.pack();
        MO_Registro.setLocationRelativeTo(this);
        MO_Registro.setVisible(true);
    }

    public void showBO_Registro() {
        BO_Registro.setModal(true);
        BO_Registro.pack();
        BO_Registro.setLocationRelativeTo(this);
        BO_Registro.setVisible(true);
    }

    public void showLI_Registro() {
        LI_Registro.setModal(true);
        LI_Registro.pack();
        LI_Registro.setLocationRelativeTo(this);
        LI_Registro.setVisible(true);
    }

    public void showCruzar_Archivo() {
        Cruzar_Archivo.setModal(true);
        Cruzar_Archivo.pack();
        Cruzar_Archivo.setLocationRelativeTo(this);
        Cruzar_Archivo.setVisible(true);
    }

    void EscribirCamposBinario() {
        try {
            archivo.setCampos(nuevoscampos);
            FileWriter fw = null;
            BufferedWriter bw = null;
            fw = new FileWriter(archivo.getArchivo());
            bw = new BufferedWriter(fw);
            bw.write(Underground_OpenFile.getText());
            bw.flush();
            ag.cargarArchivo();
            for (Archivo newarchivo : ag.getLista_archivos()) {
                if (newarchivo.getID() == archivo.getID()) {
                    newarchivo.setArchivo(archivo.getArchivo());
                    newarchivo.setCampos(nuevoscampos);
                    break;
                } // Fin If
            } // Fin For
            ag.escribirArchivo();
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            } // Fin Try Catch
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    } // Fin Try Catch

    private String Read_Campos(int RRN) throws FileNotFoundException, IOException {
        File new_archivo = new File(archivo.getArchivo().getAbsolutePath());
        RandomAccessFile af = new RandomAccessFile(new_archivo, "rw");
        String linea = "";
        af.seek(RRN);//
        for (int i = 0; i < tam_registro(); i++) {
            linea += af.readChar();
        } // Fin For
        return linea;
    }

    private void ModifyCamps(String data, int rrn) throws FileNotFoundException, IOException {
        RandomAccessFile Flush = new RandomAccessFile(new File(archivo.getArchivo().getAbsolutePath()), "rw");
        data += LlenadoEspacios(data.length(), tam_registro());
        StringBuffer sbregistro = new StringBuffer(data);
        sbregistro.setLength(tam_registro());
        Flush.seek(rrn);
        Flush.writeChars(sbregistro.toString());
    } // Fin Modificar

    private String rrnAsString(int rrn) {
        String rrnString = "";
        rrnString += rrn;
        for (int i = rrnString.length(); i < 5; i++) {
            rrnString += '.';
        } // Fin For
        return rrnString;
    } // Fin RRN as String

    private String Read_Registro(int RRN) throws FileNotFoundException, IOException {
        File new_archivo = new File(archivo.getArchivo().getAbsolutePath());
        RandomAccessFile af = new RandomAccessFile(new_archivo, "rw");
        String linea = "";
        af.seek(RRN);//
        for (int i = 0; i < tam_registro(); i++) {
            linea += af.readChar();
        } // Fin For
        return linea;
    } // Fin Leer Registro 

    public void List_Registros() {
        LI_Tabla.setModel(new DefaultTableModel());
        DefaultTableModel model = (DefaultTableModel) LI_Tabla.getModel();
        for (int i = 0; i < archivo.getCampos().size(); i++) {
            model.addColumn(archivo.getCampos().get(i).getNombre());
        } // Fin For
        LI_Tabla.setModel(model);
        // Hay int avanzar y retroceder; en el button de ir a listar registros declaran retroceder como y avanzar como 5; solo en esta funcion se llaman estas variables
        for (int i = 0; i < 5 && i < KeyCache.size(); i++) {
            long RRN = KeyCache.get(i);
            try {
                String data = Read_Registro(Math.toIntExact(RRN));
                String arr[] = data.split("\\|");
                Object arr2[] = new Object[model.getColumnCount()];
                for (int j = 0; j < model.getColumnCount(); j++) {
                    arr2[j] = arr[j];
                } // Fin For
                model.addRow(arr2);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } // Fin Try Catchs
        } // Fin For
    }

    private void GenerarPersonFile() {
        try {
            String lineacampos;
            // Obtenemos los campos en "duro" y los guardamos en un arreglo
            lineacampos = "PersonId¡int¡6¡Si¡No&PersonName¡String¡20¡No¡No&PersonAge¡int¡3¡No¡No&CityId¡int¡2¡No¡Si¡";
            String[] campos = lineacampos.split("\\&");
            // Guarda el archivo actual en el binario con los demas archivos
            ag.cargarArchivo();
            int ID;
            ID = ag.GenerarId();
            archivo = new Archivo(new File("PersonFile.txt"), ID);
            Guardar = "PersonFile.txt";
            ag.AddArchivo(archivo);
            ag.escribirArchivo();
            for (int i = 0; i < campos.length; i++) {
                // De la linea de un campo luego necesitamos darle split a los atributos del campo 
                String[] campos2 = campos[i].split("\\¡");
                String nombreCampo = campos2[0];
                String tipoCampo = campos2[1];
                int longitudCampo = (Integer.parseInt(campos2[2]));
                boolean llavePrimaria, llaveSecundaria;
                llavePrimaria = false;
                llaveSecundaria = false;
                if (campos2[3].equals("Si")) {
                    llavePrimaria = true;
                }// Fin If
                if (campos2[4].equals("Si")) {
                    llaveSecundaria = true;
                }// Fin If                
                // Seteamos dichos campos en el archivo actual
                int IDCampo;
                IDCampo = GenerarIDCampo();
                Campos campo = new Campos(ID, IDCampo, nombreCampo, tipoCampo, longitudCampo, llavePrimaria, llaveSecundaria);
                archivo.addCampo(campo);
                ag.cargarArchivo();
                for (Archivo archivo : ag.getLista_archivos()) {
                    if (archivo.getID() == archivo.getID()) {
                        archivo.addCampo(campo);
                        break;
                    } // Fin If
                } // Fin For
                ag.escribirArchivo();
            } // Fin For
            ArrayList<String> PersonFirstName = new ArrayList();
            // Se generan 60 nombres aleatorios
// Se generan 60 nombres aleatorios
            PersonFirstName.add("Diego");
            PersonFirstName.add("Bilgai");
            PersonFirstName.add("Hector");
            PersonFirstName.add("Onasis");
            PersonFirstName.add("Monica");
            PersonFirstName.add("Valeria");
            PersonFirstName.add("Ana");
            PersonFirstName.add("Cecilia");
            PersonFirstName.add("Jesus");
            PersonFirstName.add("Ariel");
            PersonFirstName.add("Sahory");
            PersonFirstName.add("Scarleth");
            PersonFirstName.add("Alejandro");
            PersonFirstName.add("Fernando");
            PersonFirstName.add("Paola");
            PersonFirstName.add("David");
            PersonFirstName.add("Josue");
            PersonFirstName.add("Daniel");
            PersonFirstName.add("Andres");
            PersonFirstName.add("Carlos");
            PersonFirstName.add("Eduardo");
            PersonFirstName.add("Aline");
            PersonFirstName.add("Alejandra");
            PersonFirstName.add("Elsi");
            PersonFirstName.add("Xiomara");
            PersonFirstName.add("Juan");
            PersonFirstName.add("Jose");
            PersonFirstName.add("Omar");
            PersonFirstName.add("Maria");
            PersonFirstName.add("Catalina");
            PersonFirstName.add("Pamela");
            PersonFirstName.add("Pablo");
            PersonFirstName.add("Cristopher");
            PersonFirstName.add("Roberto");
            PersonFirstName.add("Rafael");
            PersonFirstName.add("Carlo");
            PersonFirstName.add("Leonardo");
            PersonFirstName.add("Karen");
            PersonFirstName.add("Geovanny");
            PersonFirstName.add("Rodrigo");
            PersonFirstName.add("Nicole");
            PersonFirstName.add("Ariela");
            PersonFirstName.add("Cristina");
            PersonFirstName.add("Ashley");
            PersonFirstName.add("Andrea");
            PersonFirstName.add("Mario");
            PersonFirstName.add("Gisselle");
            PersonFirstName.add("Erica");
            PersonFirstName.add("Diana");
            PersonFirstName.add("Santiago");
            PersonFirstName.add("Angel");
            PersonFirstName.add("Matias");
            PersonFirstName.add("Soad");
            PersonFirstName.add("Gabriel");
            PersonFirstName.add("Ruben");
            PersonFirstName.add("Alvaro");
            PersonFirstName.add("Luisa");
            PersonFirstName.add("Adrian");
            PersonFirstName.add("Allan");
            PersonFirstName.add("Javier");
            PersonFirstName.add("Luis");
            ArrayList<String> PersonLastName = new ArrayList();
            // Se generan 35 apellidos aleatorios
            PersonLastName.add("Varela");
            PersonLastName.add("Diaz");
            PersonLastName.add("Reyes");
            PersonLastName.add("Andino");
            PersonLastName.add("Castillo");
            PersonLastName.add("Mendoza");
            PersonLastName.add("Meraz");
            PersonLastName.add("Padilla");
            PersonLastName.add("Romero");
            PersonLastName.add("Fuentes");
            PersonLastName.add("Cano");
            PersonLastName.add("Rodriguez");
            PersonLastName.add("Osorto");
            PersonLastName.add("Coello");
            PersonLastName.add("Dominguez");
            PersonLastName.add("Fernandez");
            PersonLastName.add("Valladares");
            PersonLastName.add("Cortes");
            PersonLastName.add("Marcia");
            PersonLastName.add("Murcia");
            PersonLastName.add("Pineda");
            PersonLastName.add("Paz");
            PersonLastName.add("Rojas");
            PersonLastName.add("Morales");
            PersonLastName.add("Chirinos");
            PersonLastName.add("Gallo");
            PersonLastName.add("Velasquez");
            PersonLastName.add("Miranda");
            PersonLastName.add("Melendez");
            PersonLastName.add("Garcia");
            PersonLastName.add("Turcios");
            PersonLastName.add("Aguilera");
            PersonLastName.add("Flores");
            PersonLastName.add("Barahona");
            PersonLastName.add("Alvarado");
            PersonLastName.add("Ortiz");
            PersonLastName.add("Amaya");
            PersonLastName.add("Iscoa");
            PersonLastName.add("Gonzalez");
            PersonLastName.add("Lopez");
            PersonLastName.add("Cruz");
            PersonLastName.add("Sanchez");
            PersonLastName.add("Mejia");
            PersonLastName.add("Martinez");
            PersonLastName.add("Hernandez");
            PersonLastName.add("Perez");
            PersonLastName.add("Duarte");
            PersonLastName.add("Figueroa");
            PersonLastName.add("Licona");
            PersonLastName.add("Gomez");
            PersonLastName.add("Caceres");
            PersonLastName.add("Ayala");
            PersonLastName.add("Suazo");
            PersonLastName.add("Cabrera");
            PersonLastName.add("Sosa");
            PersonLastName.add("Torres");
            PersonLastName.add("Caballero");
            PersonLastName.add("Acosta");
            PersonLastName.add("Silva");
            PersonLastName.add("Medina");
            PersonLastName.add("Galeano");
            Arbol_Binario Btreepersons_secundario = new Arbol_Binario(6);
            Archivoconarbolb archivo_prueba = new Archivoconarbolb(archivo.getArchivo(), archivo.getID());
            Archivoarbolsecundario archivo_prueba_secundario = new Archivoarbolsecundario(archivo.getArchivo(), archivo.getID(), Btreepersons_secundario);
            RandomAccessFile flujo = new RandomAccessFile(new File("PersonFile.txt"), "rw");
            Arbol_Binario BTreePersons = new Arbol_Binario(6);
            String metadata2;
            metadata2 = "PersonId¡int¡6¡Si¡No&PersonName¡String¡20¡No¡No&PersonAge¡int¡3¡No¡No&CityId¡int¡2¡No¡Si¡";
            metadata2 += LlenadoEspacios(metadata2.length(), 250);
            StringBuffer sbmetadata = new StringBuffer(metadata2);
            sbmetadata.setLength(250);
            flujo.writeChars(sbmetadata.toString());
            // Escribimos los campos en "duro" dentro del archivo
            random = new Random();
            int personID;
            personID = 100000;
            long RRN;
            String nombre, apellido, registro, primaryKey, secondaryKey;
            int edad, cityID;
            for (int i = 1; i <= 10000; i++) {
                // Se iran escribiendo de forma aleatoria los registros dentro del archivo
                nombre = PersonFirstName.get((int) Math.floor(Math.random() * 60));
                apellido = PersonLastName.get((int) Math.floor(Math.random() * 60));
                edad = 1 + random.nextInt(99);
                cityID = 1 + random.nextInt(99);
                registro = personID + "|" + nombre + " " + apellido + "|" + edad + "|" + cityID + "|";
                // Llena de espacios si no se completaron los 35 caracteres
                registro += LlenadoEspacios(registro.length(), 35);
                StringBuffer sb = new StringBuffer(registro);
                sb.setLength(35);
                flujo.writeChars(sb.toString());
                RRN = setRrn();
                // Obtenemos la llave primaria para poder insertarla en el arbolB
                primaryKey = String.valueOf(personID);
                primaryKey = espacios.substring(0, 6 - primaryKey.length()) + primaryKey;
                BTreePersons.B_Tree_Insert(primaryKey, RRN);
                personID++;
                // Obtenemos la llave secundaria para poder insertarla en el arbolB
                secondaryKey = String.valueOf(cityID);
                secondaryKey = espacios.substring(0, 2 - secondaryKey.length()) + secondaryKey;
                if (Btreepersons_secundario.B_Tree_Search(Btreepersons_secundario.getRaiz(), secondaryKey) == null) {
                    Btreepersons_secundario.B_Tree_Insert(secondaryKey, RRN);
                }
            } // Fin For
            // Escrbir en el archivoconArbolB
            archivo_prueba.setArbol(BTreePersons);
            // Escribir en el binario de arbol
            arboles.cargarArchivo();
            arboles.getListaarboles().add(archivo_prueba);
            arboles.escribirArchivo();
            arbol_actual = BTreePersons;
            //
            archivo_prueba_secundario.setArbolSecundario(Btreepersons_secundario);
            // Escribir en el binario de arbol
            arbolessecundarios.cargarArchivo();
            arbolessecundarios.getListaArboles().add(archivo_prueba_secundario);
            arbol_secundarioactual = Btreepersons_secundario;
            arbolessecundarios.escribirArchivo();
            GenerarCityFile();
            JOptionPane.showMessageDialog(null, "Debido a que las llaves secundarias se repiten solo hemos guardado ciert cantidad de registros en indices  ");
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    } // Fin Generar Person File

    private void GenerarCityFile() {
        try {
            String lineacampos;
            // Obtenemos los campos en "duro"y los guardamos en un arreglo
            lineacampos = "CityId¡int¡2¡Si¡No&CityName¡char¡30¡No¡No¡";
            String[] campos = lineacampos.split("\\&");
            // Guarda el archivo actual en el binario con los demas archivos
            ag.cargarArchivo();
            int ID;
            ID = ag.GenerarId();
            Archivo archivoC = new Archivo(new File("CityFile.txt"), ID);
            ag.AddArchivo(archivoC);
            ag.escribirArchivo();
            for (int i = 0; i < campos.length; i++) {
                // De la linea de un campo luego necesitamos darle split a los atributos del campo 
                String[] campos2 = campos[i].split("\\¡");
                String nombreCampo = campos2[0];
                String tipoCampo = campos2[1];
                int longitudCampo = (Integer.parseInt(campos2[2]));
                boolean llavePrimaria, llaveSecundaria;
                llavePrimaria = false;
                llaveSecundaria = false;
                if (campos2[3].equals("Si")) {
                    llavePrimaria = true;
                }// Fin If
                if (campos2[4].equals("Si")) {
                    llaveSecundaria = true;
                }// Fin If                
                // Seteamos dichos campos en el archivo actual
                int IDCampo;
                IDCampo = GenerarIDCampo();
                Campos campo = new Campos(ID, IDCampo, nombreCampo, tipoCampo, longitudCampo, llavePrimaria, llaveSecundaria);
                ag.cargarArchivo();
                for (Archivo archivo : ag.getLista_archivos()) {
                    if (archivo.getID() == archivoC.getID()) {
                        archivo.addCampo(campo);
                        break;
                    } // Fin If
                } // Fin For
                ag.escribirArchivo();
            } // Fin For
            ArrayList<String> CityName = new ArrayList();
            // Se generan 35 ciudades aleatorias
            CityName.add("Tokio");
            CityName.add("Nueva York");
            CityName.add("Los Angeles");
            CityName.add("Paris");
            CityName.add("Seul");
            CityName.add("Londres");
            CityName.add("Osaka");
            CityName.add("Shanghai");
            CityName.add("Chicago");
            CityName.add("Moscu");
            CityName.add("Pekin");
            CityName.add("Colonia");
            CityName.add("Houston");
            CityName.add("Washington D.C.");
            CityName.add("Sao Paulo");
            CityName.add("Hong Kong");
            CityName.add("Dallas");
            CityName.add("Ciudad de Mexico");
            CityName.add("Canton");
            CityName.add("Singapur");
            CityName.add("Boston");
            CityName.add("Estambul");
            CityName.add("Filadelfia");
            CityName.add("San Francisco");
            CityName.add("Taipei");
            CityName.add("Amsterdam");
            CityName.add("Buenos Aires");
            CityName.add("Milan");
            CityName.add("Bangkok");
            CityName.add("Atalanta");
            CityName.add("Barcelona");
            CityName.add("Liverpool");
            CityName.add("Madrid");
            CityName.add("Delhi");
            CityName.add("Tegucigalpa");
            CityName.add("Lisboa");
            CityName.add("Las Vegas");
            CityName.add("Manchester");
            CityName.add("Lyon");
            CityName.add("Venecia");
            CityName.add("Praga");
            CityName.add("Dubai");
            CityName.add("Turin");
            CityName.add("Guadalajara");
            CityName.add("Oslo");
            CityName.add("Bucarest");
            CityName.add("Memphis");
            CityName.add("Ottawa");
            CityName.add("Valencia");
            CityName.add("Florencia");
            CityName.add("Alejandria");
            CityName.add("Bremen");
            CityName.add("Bristol");
            CityName.add("Niza");
            CityName.add("Ginebra");
            CityName.add("Sofia");
            CityName.add("Oporto");
            CityName.add("Leipzig");
            CityName.add("Sevilla");
            CityName.add("Quebec");
            CityName.add("Nantes");
            CityName.add("Zagreb");
            CityName.add("Kuala Lumpur");
            CityName.add("Zaragoza");
            CityName.add("Murcia");
            CityName.add("San Pedro Sula");
            CityName.add("La Esperanza");
            CityName.add("Bilbao");
            CityName.add("Kiev");
            CityName.add("San Petersburgo");
            CityName.add("Atenas");
            CityName.add("Francfort");
            CityName.add("Basilea");
            CityName.add("Gotemburgo");
            CityName.add("Auckland");
            CityName.add("Wellington");
            CityName.add("Stuttgart");
            CityName.add("La Ceiba");
            CityName.add("Comayagua");
            CityName.add("El Progreso");
            CityName.add("Choloma");
            CityName.add("Danli");
            CityName.add("La Lima");
            CityName.add("Juticalpa");
            CityName.add("Tela");
            CityName.add("Trujillo");
            CityName.add("Catacamas");
            CityName.add("Omoa");
            CityName.add("Tocoa");
            CityName.add("Talanga");
            CityName.add("Virginia");
            CityName.add("Marcala");
            CityName.add("Yuscaran");
            CityName.add("Puerto Lempira");
            CityName.add("Gracias");
            CityName.add("Amapala");
            CityName.add("San Diego");
            CityName.add("Montevideo");
            CityName.add("Marsella");
            CityName.add("Minsk");
            CityName.add("Riga");
            Collections.shuffle(CityName);
            ag.escribirArchivo();
            RandomAccessFile flujo = new RandomAccessFile(new File("CityFile.txt"), "rw");
            String metadata2;
            metadata2 = "CityId¡int¡2¡Si¡No&CityName¡char¡30¡No¡No¡";
            metadata2 += LlenadoEspacios(metadata2.length(), 250);
            StringBuffer sbmetadata = new StringBuffer(metadata2);
            sbmetadata.setLength(250);
            flujo.writeChars(sbmetadata.toString());
            String registro, primaryKey;
            for (int i = 0; i <= 99; i++) {
                if (i <= 9) {
                    registro = "0" + i + "|" + CityName.get(i) + "|";
                    registro += LlenadoEspacios(registro.length(), 34);
                    primaryKey = "0" + i;
                } else {
                    registro = i + "|" + CityName.get(i) + "|";
                    registro += LlenadoEspacios(registro.length(), 34);
                    primaryKey = i + "";
                } // Fin If
                StringBuffer sb = new StringBuffer(registro);
                sb.setLength(34);
                flujo.writeChars(sb.toString());
                primaryKey = espacios.substring(0, 2 - primaryKey.length()) + primaryKey;
            } // Fin For            
            flujo.close();
        } catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
    }

    public int GenerarIDCampo() {
        // CAMBIAR
        boolean valid;
        while (true) {
            valid = true;
            int ran;
            ran = 1 + random.nextInt(1000);
            for (Campos campo : archivo.getCampos()) {
                if (campo.getID() == ran) {
                    valid = false;
                    break;
                } // Fin If
            } // Fin For
            if (valid) {
                return ran;
            } // Fin If
        } // Fin While
    } // Fin Generar ID Campo

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddCampo;
    private javax.swing.JButton BE_ExportarExcel;
    private javax.swing.JButton BE_ExportarXML;
    private javax.swing.JDialog BO_Registro;
    private javax.swing.JFormattedTextField BO_SearchKey;
    private javax.swing.JTable BO_Tabla;
    private javax.swing.JComboBox<String> BO_llaves;
    private javax.swing.JButton BTN_CancelarListarCampos;
    private javax.swing.JDialog BU_Registro;
    private javax.swing.JButton BU_Salir;
    private javax.swing.JButton BU_Search;
    private javax.swing.JFormattedTextField BU_SearchKey;
    private javax.swing.JTable BU_Tabla;
    private javax.swing.JComboBox<String> BU_llaves;
    private javax.swing.JPanel BarraAzulInferior1;
    private javax.swing.JLabel BarraAzulInferior_Text;
    private javax.swing.JPanel BarraAzulSuperior;
    private javax.swing.JPanel BarraMoradaDerecha;
    private javax.swing.JPanel BarraMoradaIzquierda1;
    private javax.swing.JButton CA_CrearRegistro;
    private javax.swing.JDialog CA_Registro;
    private javax.swing.JButton CA_Salir;
    private javax.swing.JTable CA_TablaRegistro;
    private javax.swing.JButton CA_abrirarchivo;
    private javax.swing.JButton CA_agregar;
    private javax.swing.JButton CA_habilitarcruce;
    private javax.swing.JComboBox<String> CB_TipodeDato;
    private javax.swing.JComboBox<String> CB_modcampostipo;
    private javax.swing.JButton CE_IndicesButton;
    private javax.swing.JDialog Campos_Menu;
    private javax.swing.JDialog Cruzar_Archivo;
    private javax.swing.JTable Cruzar_Tabla;
    private javax.swing.JPanel EE_Footbar;
    private javax.swing.JPanel EE_Headbar;
    private javax.swing.JLabel EE_Title;
    private javax.swing.JSeparator EE_TitleFooter;
    private javax.swing.JPanel Exportar_Excel;
    private javax.swing.JPanel IC_Footbar;
    private javax.swing.JPanel IC_Headbar;
    private javax.swing.JLabel IC_Title;
    private javax.swing.JSeparator IC_TitleFooter;
    private javax.swing.JDialog Indices_Menu;
    private javax.swing.JButton JB_Borrar_Campos;
    private javax.swing.JButton JB_Buscar_Campos;
    private javax.swing.JButton JB_Crear_Registros;
    private javax.swing.JButton JB_Cruzar_Archivos;
    private javax.swing.JButton JB_Listar_Registros;
    private javax.swing.JButton JB_Modificar_Campos;
    private javax.swing.JButton JB_Regresar;
    private javax.swing.JButton JB_Regresar1;
    private javax.swing.JButton JB_Regresar2;
    private javax.swing.JButton JB_Regresar_Al_Menu_Principal;
    private javax.swing.JPanel JDialogEsUnaBasura;
    private javax.swing.JDialog LI_Registro;
    private javax.swing.JTable LI_Tabla;
    private javax.swing.JDialog Listar_Campos;
    private javax.swing.JButton MO_Cambiar;
    private javax.swing.JDialog MO_Registro;
    private javax.swing.JButton MO_Salir;
    private javax.swing.JButton MO_Search;
    private javax.swing.JFormattedTextField MO_SearchKey;
    private javax.swing.JTable MO_Tabla;
    private javax.swing.JComboBox<String> MO_llaves;
    private javax.swing.JButton MainMenu_Campos;
    private javax.swing.JButton MainMenu_Indices;
    private javax.swing.JButton MainMenu_Registros;
    private javax.swing.JButton MainMenu_Utilidades1;
    private javax.swing.JLabel MainTitile_Header;
    private javax.swing.JDialog Menu;
    private javax.swing.JPanel RCA_Footbar;
    private javax.swing.JPanel RCA_Headbar;
    private javax.swing.JSeparator RCA_TitleFooter;
    private javax.swing.JButton ReIndexar_Button;
    private javax.swing.JPanel Registros_CargarMenu;
    private javax.swing.JDialog Registros_Menu;
    private javax.swing.JTabbedPane Registros_TabbedMenu;
    private javax.swing.JSpinner SP_LongitudDelCampo;
    private javax.swing.JSpinner SP_longi_mod_campos;
    private javax.swing.JLabel SubHeader;
    private javax.swing.JTextArea TA_ListarCampos;
    private javax.swing.JTextField TF_NombreDelCampo;
    private javax.swing.JTable Tabla_Cruzada;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextArea Under_FileTextArea;
    private javax.swing.JTextArea Underground_OpenFile;
    private javax.swing.JDialog Utilidades_Menu;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jb_abrir_archivo;
    private javax.swing.JButton jb_abrir_archivo1;
    private javax.swing.JButton jb_addcampo;
    private javax.swing.JButton jb_borrarcampo;
    private javax.swing.JButton jb_borrarcampos;
    private javax.swing.JButton jb_cerrar_archivo;
    private javax.swing.JToggleButton jb_crear_archivo;
    private javax.swing.JButton jb_crearcampo;
    private javax.swing.JButton jb_listcampo;
    private javax.swing.JButton jb_modcampos;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_regresarborrarcampos;
    private javax.swing.JButton jb_regresarmenucampos;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JComboBox<String> jcb_itemborrarcampo;
    private javax.swing.JComboBox<String> jcb_moditemcampos;
    private javax.swing.JDialog jd_ModCampos;
    private javax.swing.JDialog jd_deletecampos;
    private javax.swing.JTextField jtf_modnamecampos;
    private javax.swing.JTextField namelog;
    private javax.swing.JRadioButton rb_llaveprimariadelcampo;
    private javax.swing.JRadioButton rb_llavesecundariadelcampo;
    private javax.swing.JRadioButton rb_modllaveprimaria;
    private javax.swing.JRadioButton rb_modllavesecundaria;
    // End of variables declaration//GEN-END:variables
    private Archivo archivo;
    private Admin_Archivos ag = new Admin_Archivos("./Archivos.dkr");
    private Arbol_Binario arbol_actual = null;
    private Campos campact;
    private String Guardar;
    private boolean salvado = false;
    private ArrayList<Campos> nuevoscampos = new ArrayList();
    private boolean crear, mod, dele;
    private String espacios = new String(new char[1024]).replace('\0', ' ');
    private Adminarboles arboles = new Adminarboles("./Arboles.txt");
    private Admin_arbolsecundario arbolessecundarios = new Admin_arbolsecundario("./Arboles_secundarios.txt");
    private Arbol_Binario arbol_secundarioactual;
    private String llaveprimariaTemp, llavesecundariaTemp;
    private ArrayList<Long> SearchCampoBuffer;
    private int CampoSearch = 0;
    private int CampoModify = 0;
    private Archivo File_Cruzar = null;
    private ArrayList<Campos> Campos_Cruzar = new ArrayList();
    private ArrayList<Campos> CrossedCampos = new ArrayList();
    private ArrayList<Long> KeyCache = new ArrayList();
}
