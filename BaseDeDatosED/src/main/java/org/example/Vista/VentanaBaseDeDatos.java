package org.example.Vista;

import javax.swing.*;
import java.awt.*;
    public class VentanaBaseDeDatos extends JFrame {
        private JPanel Panel1;
        private JPanel PanelSalir;
        private JPanel Panel2;
        private JLabel lblnombre;
        private JLabel lblId;
        private JLabel lblApellido;
        private JLabel lblNombre2;
        private JLabel lblApellido2;
        private JLabel lblId2;
        private JTextField txtNombre;
        private JTextField txtNombre2;
        private JTextField txtApellido;
        private JTextField txtApellido2;
        private JTextField txtId;
        private JTextField txtId2;
        private JButton botonInicio;
        private JButton botonSalir;
        private JButton botonCargar;
        private JButton botonAgregar;
        private JButton botonActualizar;
        private JScrollPane scroll;
        private GridLayout layout;

        public VentanaBaseDeDatos(String title) throws HeadlessException {
            super(title);
            this.setSize(1000,800);
            layout=new GridLayout(2,1);
            this.getContentPane().setLayout(layout);
            //panel1
            Panel1 =new JPanel(new BorderLayout());
            Panel1.setBackground(new Color(239,240,230));
            botonInicio=new JButton("Iniciar programa");
            Panel1.add(botonInicio,BorderLayout.CENTER);

            //Panel2
            Panel2=new JPanel(new BorderLayout());
            Panel2.setBackground(new Color(229, 253, 1));
            botonSalir=new JButton("Salir");
            Panel2.add(botonSalir,BorderLayout.CENTER);

            this.getContentPane().add(Panel1,0);
            this.getContentPane().add(Panel2,1);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);

        }

        public VentanaBaseDeDatos(JPanel panel1, JPanel panelSalir, JPanel panel2, JLabel lblnombre, JLabel lblId, JLabel lblApellido, JLabel lblNombre2, JLabel lblApellido2, JLabel lblId2, JTextField txtNombre, JTextField txtNombre2, JTextField txtApellido, JTextField txtApellido2, JTextField txtId, JTextField txtId2, JButton botonInicio, JButton botonSalir, JButton botonCargar, JButton botonAgregar, JButton botonActualizar, JScrollPane scroll, GridLayout layout) throws HeadlessException {
            Panel1 = panel1;
            PanelSalir = panelSalir;
            Panel2 = panel2;
            this.lblnombre = lblnombre;
            this.lblId = lblId;
            this.lblApellido = lblApellido;
            this.lblNombre2 = lblNombre2;
            this.lblApellido2 = lblApellido2;
            this.lblId2 = lblId2;
            this.txtNombre = txtNombre;
            this.txtNombre2 = txtNombre2;
            this.txtApellido = txtApellido;
            this.txtApellido2 = txtApellido2;
            this.txtId = txtId;
            this.txtId2 = txtId2;
            this.botonInicio = botonInicio;
            this.botonSalir = botonSalir;
            this.botonCargar = botonCargar;
            this.botonAgregar = botonAgregar;
            this.botonActualizar = botonActualizar;
            this.scroll = scroll;
            this.layout = layout;
        }

        public VentanaBaseDeDatos(GraphicsConfiguration gc, JPanel panel1, JPanel panelSalir, JPanel panel2, JLabel lblnombre, JLabel lblId, JLabel lblApellido, JLabel lblNombre2, JLabel lblApellido2, JLabel lblId2, JTextField txtNombre, JTextField txtNombre2, JTextField txtApellido, JTextField txtApellido2, JTextField txtId, JTextField txtId2, JButton botonInicio, JButton botonSalir, JButton botonCargar, JButton botonAgregar, JButton botonActualizar, JScrollPane scroll, GridLayout layout) {
            super(gc);
            Panel1 = panel1;
            PanelSalir = panelSalir;
            Panel2 = panel2;
            this.lblnombre = lblnombre;
            this.lblId = lblId;
            this.lblApellido = lblApellido;
            this.lblNombre2 = lblNombre2;
            this.lblApellido2 = lblApellido2;
            this.lblId2 = lblId2;
            this.txtNombre = txtNombre;
            this.txtNombre2 = txtNombre2;
            this.txtApellido = txtApellido;
            this.txtApellido2 = txtApellido2;
            this.txtId = txtId;
            this.txtId2 = txtId2;
            this.botonInicio = botonInicio;
            this.botonSalir = botonSalir;
            this.botonCargar = botonCargar;
            this.botonAgregar = botonAgregar;
            this.botonActualizar = botonActualizar;
            this.scroll = scroll;
            this.layout = layout;
        }

        public VentanaBaseDeDatos(String title, JPanel panel1, JPanel panelSalir, JPanel panel2, JLabel lblnombre, JLabel lblId, JLabel lblApellido, JLabel lblNombre2, JLabel lblApellido2, JLabel lblId2, JTextField txtNombre, JTextField txtNombre2, JTextField txtApellido, JTextField txtApellido2, JTextField txtId, JTextField txtId2, JButton botonInicio, JButton botonSalir, JButton botonCargar, JButton botonAgregar, JButton botonActualizar, JScrollPane scroll, GridLayout layout) throws HeadlessException {
            super(title);
            Panel1 = panel1;
            PanelSalir = panelSalir;
            Panel2 = panel2;
            this.lblnombre = lblnombre;
            this.lblId = lblId;
            this.lblApellido = lblApellido;
            this.lblNombre2 = lblNombre2;
            this.lblApellido2 = lblApellido2;
            this.lblId2 = lblId2;
            this.txtNombre = txtNombre;
            this.txtNombre2 = txtNombre2;
            this.txtApellido = txtApellido;
            this.txtApellido2 = txtApellido2;
            this.txtId = txtId;
            this.txtId2 = txtId2;
            this.botonInicio = botonInicio;
            this.botonSalir = botonSalir;
            this.botonCargar = botonCargar;
            this.botonAgregar = botonAgregar;
            this.botonActualizar = botonActualizar;
            this.scroll = scroll;
            this.layout = layout;
        }

        public VentanaBaseDeDatos(String title, GraphicsConfiguration gc, JPanel panel1, JPanel panelSalir, JPanel panel2, JLabel lblnombre, JLabel lblId, JLabel lblApellido, JLabel lblNombre2, JLabel lblApellido2, JLabel lblId2, JTextField txtNombre, JTextField txtNombre2, JTextField txtApellido, JTextField txtApellido2, JTextField txtId, JTextField txtId2, JButton botonInicio, JButton botonSalir, JButton botonCargar, JButton botonAgregar, JButton botonActualizar, JScrollPane scroll, GridLayout layout) {
            super(title, gc);
            Panel1 = panel1;
            PanelSalir = panelSalir;
            Panel2 = panel2;
            this.lblnombre = lblnombre;
            this.lblId = lblId;
            this.lblApellido = lblApellido;
            this.lblNombre2 = lblNombre2;
            this.lblApellido2 = lblApellido2;
            this.lblId2 = lblId2;
            this.txtNombre = txtNombre;
            this.txtNombre2 = txtNombre2;
            this.txtApellido = txtApellido;
            this.txtApellido2 = txtApellido2;
            this.txtId = txtId;
            this.txtId2 = txtId2;
            this.botonInicio = botonInicio;
            this.botonSalir = botonSalir;
            this.botonCargar = botonCargar;
            this.botonAgregar = botonAgregar;
            this.botonActualizar = botonActualizar;
            this.scroll = scroll;
            this.layout = layout;
        }

        public JPanel getPanel1() {
            return Panel1;
        }

        public void setPanel1(JPanel panel1) {
            Panel1 = panel1;
        }

        public JPanel getPanelSalir() {
            return PanelSalir;
        }

        public void setPanelSalir(JPanel panelSalir) {
            PanelSalir = panelSalir;
        }

        public JPanel getPanel2() {
            return Panel2;
        }

        public void setPanel2(JPanel panel2) {
            Panel2 = panel2;
        }

        public JLabel getLblnombre() {
            return lblnombre;
        }

        public void setLblnombre(JLabel lblnombre) {
            this.lblnombre = lblnombre;
        }

        public JLabel getLblId() {
            return lblId;
        }

        public void setLblId(JLabel lblId) {
            this.lblId = lblId;
        }

        public JLabel getLblApellido() {
            return lblApellido;
        }

        public void setLblApellido(JLabel lblApellido) {
            this.lblApellido = lblApellido;
        }

        public JLabel getLblNombre2() {
            return lblNombre2;
        }

        public void setLblNombre2(JLabel lblNombre2) {
            this.lblNombre2 = lblNombre2;
        }

        public JLabel getLblApellido2() {
            return lblApellido2;
        }

        public void setLblApellido2(JLabel lblApellido2) {
            this.lblApellido2 = lblApellido2;
        }

        public JLabel getLblId2() {
            return lblId2;
        }

        public void setLblId2(JLabel lblId2) {
            this.lblId2 = lblId2;
        }

        public JTextField getTxtNombre() {
            return txtNombre;
        }

        public void setTxtNombre(JTextField txtNombre) {
            this.txtNombre = txtNombre;
        }

        public JTextField getTxtNombre2() {
            return txtNombre2;
        }

        public void setTxtNombre2(JTextField txtNombre2) {
            this.txtNombre2 = txtNombre2;
        }

        public JTextField getTxtApellido() {
            return txtApellido;
        }

        public void setTxtApellido(JTextField txtApellido) {
            this.txtApellido = txtApellido;
        }

        public JTextField getTxtApellido2() {
            return txtApellido2;
        }

        public void setTxtApellido2(JTextField txtApellido2) {
            this.txtApellido2 = txtApellido2;
        }

        public JTextField getTxtId() {
            return txtId;
        }

        public void setTxtId(JTextField txtId) {
            this.txtId = txtId;
        }

        public JTextField getTxtId2() {
            return txtId2;
        }

        public void setTxtId2(JTextField txtId2) {
            this.txtId2 = txtId2;
        }

        public JButton getBotonInicio() {
            return botonInicio;
        }

        public void setBotonInicio(JButton botonInicio) {
            this.botonInicio = botonInicio;
        }

        public JButton getBotonSalir() {
            return botonSalir;
        }

        public void setBotonSalir(JButton botonSalir) {
            this.botonSalir = botonSalir;
        }

        public JButton getBotonCargar() {
            return botonCargar;
        }

        public void setBotonCargar(JButton botonCargar) {
            this.botonCargar = botonCargar;
        }

        public JButton getBotonAgregar() {
            return botonAgregar;
        }

        public void setBotonAgregar(JButton botonAgregar) {
            this.botonAgregar = botonAgregar;
        }

        public JButton getBotonActualizar() {
            return botonActualizar;
        }

        public void setBotonActualizar(JButton botonActualizar) {
            this.botonActualizar = botonActualizar;
        }

        public JScrollPane getScroll() {
            return scroll;
        }

        public void setScroll(JScrollPane scroll) {
            this.scroll = scroll;
        }

        @Override
        public GridLayout getLayout() {
            return layout;
        }

        public void setLayout(GridLayout layout) {
            this.layout = layout;
        }

        @Override
        public String toString() {
            return "VentanaBaseDeDatos{" +
                    "Panel1=" + Panel1 +
                    ", PanelSalir=" + PanelSalir +
                    ", Panel2=" + Panel2 +
                    ", lblnombre=" + lblnombre +
                    ", lblId=" + lblId +
                    ", lblApellido=" + lblApellido +
                    ", lblNombre2=" + lblNombre2 +
                    ", lblApellido2=" + lblApellido2 +
                    ", lblId2=" + lblId2 +
                    ", txtNombre=" + txtNombre +
                    ", txtNombre2=" + txtNombre2 +
                    ", txtApellido=" + txtApellido +
                    ", txtApellido2=" + txtApellido2 +
                    ", txtId=" + txtId +
                    ", txtId2=" + txtId2 +
                    ", botonInicio=" + botonInicio +
                    ", botonSalir=" + botonSalir +
                    ", botonCargar=" + botonCargar +
                    ", botonAgregar=" + botonAgregar +
                    ", botonActualizar=" + botonActualizar +
                    ", scroll=" + scroll +
                    ", layout=" + layout +
                    '}';
        }
    }

