
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe
 */
public class gradeUpGUI extends javax.swing.JFrame {
    
    private asignatura[] asignaturas;
    private DefaultListModel modeloNotas0;
    private DefaultListModel modeloNotas1;
    private DefaultListModel modeloNotas2;
    private DefaultListModel modeloNotas3;
    private DefaultListModel modeloNotas4;
    private DefaultListModel modeloNotas5;
    private DefaultListModel modeloNotas6;
    private boolean[] posiciones;
    private int horasAsistidas0;
    private int horasAsistidas1;
    private int horasAsistidas2;
    private int horasAsistidas3;
    private int horasAsistidas4;
    private int horasAsistidas5;
    private int horasAsistidas6;
    private int cantAsg;
    /**
     * Creates new form gradeUpGUI
     */
    public gradeUpGUI() throws IOException {
        this.asignaturas = new asignatura[7];
        this.modeloNotas0 = new DefaultListModel();
        this.modeloNotas1 = new DefaultListModel();
        this.modeloNotas2 = new DefaultListModel();
        this.modeloNotas3 = new DefaultListModel();
        this.modeloNotas4 = new DefaultListModel();
        this.modeloNotas5 = new DefaultListModel();
        this.modeloNotas6 = new DefaultListModel();
        this.posiciones = new boolean[7];
        for (int i = 0; i < 7; i++) {
            posiciones[i] = false;
        }
        this.horasAsistidas0 = 0;
        this.horasAsistidas1 = 0;
        this.horasAsistidas2 = 0;
        this.horasAsistidas3 = 0;
        this.horasAsistidas4 = 0;
        this.horasAsistidas5 = 0;
        this.horasAsistidas6 = 0;
        this.cantAsg = 0;
        initComponents();
        noAsignatura0();
        noAsignatura1();
        noAsignatura2();
        noAsignatura3();
        noAsignatura4();
        noAsignatura5();
        noAsignatura6();
        try{
        cargarDatos();
        }catch(FileNotFoundException e){
        }
    }
    
    private void guardarDatos() throws IOException{
        if(posiciones[0] == true){
            File Txt = new File("C:\\Users\\Marcos\\Desktop\\asignatura0.txt");
            PrintWriter pWriter = new PrintWriter(new FileWriter(Txt));
            Txt.createNewFile();
            pWriter.println(asignaturas[0].getNombreAsignatura() + "|" + asignaturas[0].getHoras() + "|" 
                        + asignaturas[0].getPorcentajeasis());
            for(int i = 0; i < asignaturas[0].getNotas().size(); i++){
                pWriter.print("" + asignaturas[0].getNotas().get(i).getNota() + "|");
                pWriter.print("" + asignaturas[0].getNotas().get(i).getPorcentaje() + "|");
                pWriter.println("" + asignaturas[0].getNotas().get(i).getDescripcion());
            }
            pWriter.close();
        }
        if(posiciones[1] == true){
            File Txt = new File("C:\\Users\\Marcos\\Desktop\\asignatura1.txt");
            PrintWriter pWriter = new PrintWriter(new FileWriter(Txt));
            Txt.createNewFile();
            pWriter.println(asignaturas[1].getNombreAsignatura() + "|" + asignaturas[1].getHoras() + "|" 
                        + asignaturas[1].getPorcentajeasis());
            for(int i = 0; i < asignaturas[1].getNotas().size(); i++){
                pWriter.print("" + asignaturas[1].getNotas().get(i).getNota() + "|");
                pWriter.print("" + asignaturas[1].getNotas().get(i).getPorcentaje() + "|");
                pWriter.println("" + asignaturas[1].getNotas().get(i).getDescripcion());
            }
            pWriter.close();
        }
        if(posiciones[2] == true){
            File Txt = new File("C:\\Users\\Marcos\\Desktop\\asignatura2.txt");
            PrintWriter pWriter = new PrintWriter(new FileWriter(Txt));
            Txt.createNewFile();
            pWriter.println(asignaturas[2].getNombreAsignatura() + "|" + asignaturas[2].getHoras() + "|" 
                        + asignaturas[2].getPorcentajeasis());
            for(int i = 0; i < asignaturas[2].getNotas().size(); i++){
                pWriter.print("" + asignaturas[2].getNotas().get(i).getNota() + "|");
                pWriter.print("" + asignaturas[2].getNotas().get(i).getPorcentaje() + "|");
                pWriter.println("" + asignaturas[2].getNotas().get(i).getDescripcion());
            }
            pWriter.close();
        }
        if(posiciones[3] == true){
            File Txt = new File("C:\\Users\\Marcos\\Desktop\\asignatura3.txt");
            PrintWriter pWriter = new PrintWriter(new FileWriter(Txt));
            Txt.createNewFile();
            pWriter.println(asignaturas[3].getNombreAsignatura() + "|" + asignaturas[2].getHoras() + "|" 
                        + asignaturas[3].getPorcentajeasis());
            for(int i = 0; i < asignaturas[3].getNotas().size(); i++){
                pWriter.print("" + asignaturas[3].getNotas().get(i).getNota() + "|");
                pWriter.print("" + asignaturas[3].getNotas().get(i).getPorcentaje() + "|");
                pWriter.println("" + asignaturas[3].getNotas().get(i).getDescripcion());
            }
            pWriter.close();
        }
        if(posiciones[4] == true){
            File Txt = new File("C:\\Users\\Marcos\\Desktop\\asignatura4.txt");
            PrintWriter pWriter = new PrintWriter(new FileWriter(Txt));
            Txt.createNewFile();
            pWriter.println(asignaturas[4].getNombreAsignatura() + "|" + asignaturas[4].getHoras() + "|" 
                        + asignaturas[4].getPorcentajeasis());
            for(int i = 0; i < asignaturas[4].getNotas().size(); i++){
                pWriter.print("" + asignaturas[4].getNotas().get(i).getNota() + "|");
                pWriter.print("" + asignaturas[4].getNotas().get(i).getPorcentaje() + "|");
                pWriter.println("" + asignaturas[4].getNotas().get(i).getDescripcion());
            }
            pWriter.close();
        }
        if(posiciones[5] == true){
            File Txt = new File("C:\\Users\\Marcos\\Desktop\\asignatura5.txt");
            PrintWriter pWriter = new PrintWriter(new FileWriter(Txt));
            Txt.createNewFile();
            pWriter.println(asignaturas[5].getNombreAsignatura() + "|" + asignaturas[5].getHoras() + "|" 
                        + asignaturas[5].getPorcentajeasis());
            for(int i = 0; i < asignaturas[5].getNotas().size(); i++){
                pWriter.print("" + asignaturas[5].getNotas().get(i).getNota() + "|");
                pWriter.print("" + asignaturas[5].getNotas().get(i).getPorcentaje() + "|");
                pWriter.println("" + asignaturas[5].getNotas().get(i).getDescripcion());
            }
            pWriter.close();
        }
        if(posiciones[6] == true){
            File Txt = new File("C:\\Users\\Marcos\\Desktop\\asignatura6.txt");
            PrintWriter pWriter = new PrintWriter(new FileWriter(Txt));
            Txt.createNewFile();
            pWriter.println(asignaturas[6].getNombreAsignatura() + "|" + asignaturas[6].getHoras() + "|" 
                        + asignaturas[6].getPorcentajeasis());
            for(int i = 0; i < asignaturas[6].getNotas().size(); i++){
                pWriter.print("" + asignaturas[6].getNotas().get(i).getNota() + "|");
                pWriter.print("" + asignaturas[6].getNotas().get(i).getPorcentaje() + "|");
                pWriter.println("" + asignaturas[6].getNotas().get(i).getDescripcion());
            }
            pWriter.close();
        }
    }
    
    private void cargarDatos() throws IOException{
        FileReader fReader0 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura0.txt");
        BufferedReader cReader0 = new BufferedReader(fReader0);
        int lineas = 0;
        while(cReader0.readLine() != null){
            lineas++;
        }
        cReader0.close();
        System.out.println(lineas);
        FileReader gReader0 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura0.txt");
        BufferedReader bReader0 = new BufferedReader(gReader0);
        String data = "";
        data = bReader0.readLine();
        System.out.println(data);
        String[] dataSplit0 = data.split("\\|");
        if(lineas > 0){
            //INICIAR ASIGNATURA
            asignatura asignaturaNueva = new asignatura(dataSplit0[0], Integer.parseInt(dataSplit0[1]), Double.parseDouble(dataSplit0[2]));
            asignaturas[0] = asignaturaNueva;
            this.cantAsg += 1;
            posiciones[0] = true;
            bAgregarNota0.setVisible(true);
            bBorrarNota0.setVisible(true);
            bCambiarNota0.setVisible(true);
            bPromediar0.setVisible(true);
            bBorrarAs0.setVisible(true);
            bRestarHora0.setVisible(true);
            lNombre0.setText(asignaturas[0].getNombreAsignatura().toUpperCase());
            lHoras0.setText("Horas: " + asignaturas[0].getHoras());
            lHorasPara0.setText("Horas necesarias para aprobar: " + asignaturas[0].calcularAprobacion());
            tNota0.setText("0.0");
            tPorc0.setText("0.0");
            tDesc0.setText("Primera prueba");
            lPromedio0.setText("Promedio");     
            //
        }
        if(lineas > 1){
            String nota0 = "";
            String[] notaSplit0 = new String[3];
            //INICIAR NOTAS
            for(int i = 0; i < (lineas - 1); i++){
                nota0 = bReader0.readLine();
                System.out.println(nota0);
                notaSplit0 = nota0.split("\\|");
                nota nuevaNota = new nota(Double.parseDouble(notaSplit0[0]), Double.parseDouble(notaSplit0[1]), notaSplit0[2]);
                asignaturas[0].getNotas().add(nuevaNota);
                modeloNotas0.addElement(notaSplit0[0] + "       " + notaSplit0[1] + "%      " + notaSplit0[2]);
                listaNotasAs0.setModel(modeloNotas0);
            }
            //
        }
        
        FileReader fReader1 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura1.txt");
        BufferedReader cReader1 = new BufferedReader(fReader1);
        lineas = 0;
        while(cReader1.readLine() != null){
            lineas++;
        }
        cReader1.close();
        System.out.println(lineas);
        FileReader gReader1 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura1.txt");
        BufferedReader bReader1 = new BufferedReader(gReader1);
        data = "";
        data = bReader1.readLine();
        System.out.println(data);
        String[] dataSplit1 = data.split("\\|");
        if(lineas > 0){
            //INICIAR ASIGNATURA
            asignatura asignaturaNueva = new asignatura(dataSplit1[0], Integer.parseInt(dataSplit1[1]), Double.parseDouble(dataSplit1[2]));
            asignaturas[1] = asignaturaNueva;
            this.cantAsg += 1;
            posiciones[1] = true;
            bAgregarNota1.setVisible(true);
            bBorrarNota1.setVisible(true);
            bCambiarNota1.setVisible(true);
            bPromediar1.setVisible(true);
            bBorrarAs1.setVisible(true);
            bRestarHora1.setVisible(true);
            lNombre1.setText(asignaturas[1].getNombreAsignatura().toUpperCase());
            lHoras1.setText("Horas: " + asignaturas[1].getHoras());
            lHorasPara1.setText("Horas necesarias para aprobar: " + asignaturas[1].calcularAprobacion());
            tNota1.setText("0.0");
            tPorc1.setText("0.0");
            tDesc1.setText("Primera prueba");
            lPromedio1.setText("Promedio");     
            //
        }
        if(lineas > 1){
            String nota1 = "";
            String[] notaSplit1 = new String[3];
            //INICIAR NOTAS
            for(int i = 0; i < (lineas - 1); i++){
                nota1 = bReader1.readLine();
                System.out.println(nota1);
                notaSplit1 = nota1.split("\\|");
                nota nuevaNota = new nota(Double.parseDouble(notaSplit1[0]), Double.parseDouble(notaSplit1[1]), notaSplit1[2]);
                asignaturas[1].getNotas().add(nuevaNota);
                modeloNotas1.addElement(notaSplit1[0] + "       " + notaSplit1[1] + "%      " + notaSplit1[2]);
                listaNotasAs1.setModel(modeloNotas1);
            }
            //
        }
        
        FileReader fReader2 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura2.txt");
        BufferedReader cReader2 = new BufferedReader(fReader2);
        lineas = 0;
        while(cReader2.readLine() != null){
            lineas++;
        }
        cReader2.close();
        System.out.println(lineas);
        FileReader gReader2 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura2.txt");
        BufferedReader bReader2 = new BufferedReader(gReader2);
        data = "";
        data = bReader2.readLine();
        System.out.println(data);
        String[] dataSplit2 = data.split("\\|");
        if(lineas > 0){
            //INICIAR ASIGNATURA
            asignatura asignaturaNueva = new asignatura(dataSplit2[0], Integer.parseInt(dataSplit2[1]), Double.parseDouble(dataSplit2[2]));
            asignaturas[2] = asignaturaNueva;
            this.cantAsg += 1;
            posiciones[2] = true;
            bAgregarNota2.setVisible(true);
            bBorrarNota2.setVisible(true);
            bCambiarNota2.setVisible(true);
            bPromediar2.setVisible(true);
            bBorrarAs2.setVisible(true);
            bRestarHora2.setVisible(true);
            lNombre2.setText(asignaturas[2].getNombreAsignatura().toUpperCase());
            lHoras2.setText("Horas: " + asignaturas[2].getHoras());
            lHorasPara2.setText("Horas necesarias para aprobar: " + asignaturas[2].calcularAprobacion());
            tNota2.setText("0.0");
            tPorc2.setText("0.0");
            tDesc2.setText("Primera prueba");
            lPromedio2.setText("Promedio");     
            //
        }
        if(lineas > 1){
            String nota2 = "";
            String[] notaSplit2 = new String[3];
            //INICIAR NOTAS
            for(int i = 0; i < (lineas - 1); i++){
                nota2 = bReader2.readLine();
                System.out.println(nota2);
                notaSplit2 = nota2.split("\\|");
                nota nuevaNota = new nota(Double.parseDouble(notaSplit2[0]), Double.parseDouble(notaSplit2[1]), notaSplit2[2]);
                asignaturas[2].getNotas().add(nuevaNota);
                modeloNotas2.addElement(notaSplit2[0] + "       " + notaSplit2[1] + "%      " + notaSplit2[2]);
                listaNotasAs2.setModel(modeloNotas2);
            }
            //
        }
        
        FileReader fReader3 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura3.txt");
        BufferedReader cReader3 = new BufferedReader(fReader3);
        lineas = 0;
        while(cReader3.readLine() != null){
            lineas++;
        }
        cReader3.close();
        System.out.println(lineas);
        FileReader gReader3 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura3.txt");
        BufferedReader bReader3 = new BufferedReader(gReader3);
        data = "";
        data = bReader3.readLine();
        System.out.println(data);
        String[] dataSplit3 = data.split("\\|");
        if(lineas > 0){
            //INICIAR ASIGNATURA
            asignatura asignaturaNueva = new asignatura(dataSplit3[0], Integer.parseInt(dataSplit3[1]), Double.parseDouble(dataSplit3[2]));
            asignaturas[3] = asignaturaNueva;
            this.cantAsg += 1;
            posiciones[3] = true;
            bAgregarNota3.setVisible(true);
            bBorrarNota3.setVisible(true);
            bCambiarNota3.setVisible(true);
            bPromediar3.setVisible(true);
            bBorrarAs3.setVisible(true);
            bRestarHora3.setVisible(true);
            lNombre3.setText(asignaturas[3].getNombreAsignatura().toUpperCase());
            lHoras3.setText("Horas: " + asignaturas[3].getHoras());
            lHorasPara3.setText("Horas necesarias para aprobar: " + asignaturas[3].calcularAprobacion());
            tNota3.setText("0.0");
            tPorc3.setText("0.0");
            tDesc3.setText("Primera prueba");
            lPromedio3.setText("Promedio");     
            //
        }
        if(lineas > 1){
            String nota3 = "";
            String[] notaSplit3 = new String[3];
            //INICIAR NOTAS
            for(int i = 0; i < (lineas - 1); i++){
                nota3 = bReader3.readLine();
                System.out.println(nota3);
                notaSplit3 = nota3.split("\\|");
                nota nuevaNota = new nota(Double.parseDouble(notaSplit3[0]), Double.parseDouble(notaSplit3[1]), notaSplit3[2]);
                asignaturas[3].getNotas().add(nuevaNota);
                modeloNotas3.addElement(notaSplit3[0] + "       " + notaSplit3[1] + "%      " + notaSplit3[2]);
                listaNotasAs3.setModel(modeloNotas3);
            }
            //
        }
        
        FileReader fReader4 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura4.txt");
        BufferedReader cReader4 = new BufferedReader(fReader4);
        lineas = 0;
        while(cReader4.readLine() != null){
            lineas++;
        }
        cReader4.close();
        System.out.println(lineas);
        FileReader gReader4 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura4.txt");
        BufferedReader bReader4 = new BufferedReader(gReader4);
        data = "";
        data = bReader4.readLine();
        System.out.println(data);
        String[] dataSplit4 = data.split("\\|");
        if(lineas > 0){
            //INICIAR ASIGNATURA
            asignatura asignaturaNueva = new asignatura(dataSplit4[0], Integer.parseInt(dataSplit4[1]), Double.parseDouble(dataSplit4[2]));
            asignaturas[4] = asignaturaNueva;
            this.cantAsg += 1;
            posiciones[4] = true;
            bAgregarNota4.setVisible(true);
            bBorrarNota4.setVisible(true);
            bCambiarNota4.setVisible(true);
            bPromediar4.setVisible(true);
            bBorrarAs4.setVisible(true);
            bRestarHora4.setVisible(true);
            lNombre4.setText(asignaturas[4].getNombreAsignatura().toUpperCase());
            lHoras4.setText("Horas: " + asignaturas[4].getHoras());
            lHorasPara4.setText("Horas necesarias para aprobar: " + asignaturas[4].calcularAprobacion());
            tNota4.setText("0.0");
            tPorc4.setText("0.0");
            tDesc4.setText("Primera prueba");
            lPromedio4.setText("Promedio");     
            //
        }
        if(lineas > 1){
            String nota4 = "";
            String[] notaSplit4 = new String[3];
            //INICIAR NOTAS
            for(int i = 0; i < (lineas - 1); i++){
                nota4 = bReader4.readLine();
                System.out.println(nota4);
                notaSplit4 = nota4.split("\\|");
                nota nuevaNota = new nota(Double.parseDouble(notaSplit4[0]), Double.parseDouble(notaSplit4[1]), notaSplit4[2]);
                asignaturas[4].getNotas().add(nuevaNota);
                modeloNotas4.addElement(notaSplit4[0] + "       " + notaSplit4[1] + "%      " + notaSplit4[2]);
                listaNotasAs4.setModel(modeloNotas4);
            }
            //
        }
        
        FileReader fReader5 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura5.txt");
        BufferedReader cReader5 = new BufferedReader(fReader5);
        lineas = 0;
        while(cReader5.readLine() != null){
            lineas++;
        }
        cReader5.close();
        System.out.println(lineas);
        FileReader gReader5 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura5.txt");
        BufferedReader bReader5 = new BufferedReader(gReader5);
        data = "";
        data = bReader5.readLine();
        System.out.println(data);
        String[] dataSplit5 = data.split("\\|");
        if(lineas > 0){
            //INICIAR ASIGNATURA
            asignatura asignaturaNueva = new asignatura(dataSplit5[0], Integer.parseInt(dataSplit5[1]), Double.parseDouble(dataSplit5[2]));
            asignaturas[5] = asignaturaNueva;
            this.cantAsg += 1;
            posiciones[5] = true;
            bAgregarNota5.setVisible(true);
            bBorrarNota5.setVisible(true);
            bCambiarNota5.setVisible(true);
            bPromediar5.setVisible(true);
            bBorrarAs5.setVisible(true);
            bRestarHora5.setVisible(true);
            lNombre5.setText(asignaturas[5].getNombreAsignatura().toUpperCase());
            lHoras5.setText("Horas: " + asignaturas[5].getHoras());
            lHorasPara5.setText("Horas necesarias para aprobar: " + asignaturas[5].calcularAprobacion());
            tNota5.setText("0.0");
            tPorc5.setText("0.0");
            tDesc5.setText("Primera prueba");
            lPromedio5.setText("Promedio");     
            //
        }
        if(lineas > 1){
            String nota5 = "";
            String[] notaSplit5 = new String[3];
            //INICIAR NOTAS
            for(int i = 0; i < (lineas - 1); i++){
                nota5 = bReader5.readLine();
                System.out.println(nota5);
                notaSplit5 = nota5.split("\\|");
                nota nuevaNota = new nota(Double.parseDouble(notaSplit5[0]), Double.parseDouble(notaSplit5[1]), notaSplit5[2]);
                asignaturas[5].getNotas().add(nuevaNota);
                modeloNotas5.addElement(notaSplit5[0] + "       " + notaSplit5[1] + "%      " + notaSplit5[2]);
                listaNotasAs5.setModel(modeloNotas5);
            }
            //
        }
        
        FileReader fReader6 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura6.txt");
        BufferedReader cReader6 = new BufferedReader(fReader6);
        lineas = 0;
        while(cReader6.readLine() != null){
            lineas++;
        }
        cReader6.close();
        System.out.println(lineas);
        FileReader gReader6 = new FileReader("C:\\Users\\Marcos\\Desktop\\asignatura6.txt");
        BufferedReader bReader6 = new BufferedReader(gReader5);
        data = "";
        data = bReader5.readLine();
        System.out.println(data);
        String[] dataSplit6 = data.split("\\|");
        if(lineas > 0){
            //INICIAR ASIGNATURA
            asignatura asignaturaNueva = new asignatura(dataSplit6[0], Integer.parseInt(dataSplit6[1]), Double.parseDouble(dataSplit6[2]));
            asignaturas[6] = asignaturaNueva;
            this.cantAsg += 1;
            posiciones[6] = true;
            bAgregarNota6.setVisible(true);
            bBorrarNota6.setVisible(true);
            bCambiarNota6.setVisible(true);
            bPromediar6.setVisible(true);
            bBorrarAs6.setVisible(true);
            bRestarHora6.setVisible(true);
            lNombre6.setText(asignaturas[6].getNombreAsignatura().toUpperCase());
            lHoras6.setText("Horas: " + asignaturas[6].getHoras());
            lHorasPara6.setText("Horas necesarias para aprobar: " + asignaturas[6].calcularAprobacion());
            tNota6.setText("0.0");
            tPorc6.setText("0.0");
            tDesc6.setText("Primera prueba");
            lPromedio6.setText("Promedio");     
            //
        }
        if(lineas > 1){
            String nota6 = "";
            String[] notaSplit6 = new String[3];
            //INICIAR NOTAS
            for(int i = 0; i < (lineas - 1); i++){
                nota6 = bReader6.readLine();
                System.out.println(nota6);
                notaSplit6 = nota6.split("\\|");
                nota nuevaNota = new nota(Double.parseDouble(notaSplit6[0]), Double.parseDouble(notaSplit6[1]), notaSplit6[2]);
                asignaturas[6].getNotas().add(nuevaNota);
                modeloNotas6.addElement(notaSplit6[0] + "       " + notaSplit6[1] + "%      " + notaSplit6[2]);
                listaNotasAs6.setModel(modeloNotas6);
            }
            //
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

        jPanel1 = new javax.swing.JPanel();
        tabAsignatura = new javax.swing.JTabbedPane();
        panel1 = new javax.swing.JPanel();
        bPromediar0 = new javax.swing.JButton();
        lPromedio0 = new javax.swing.JLabel();
        lNotas0 = new javax.swing.JLabel();
        lPorcentaje0 = new javax.swing.JLabel();
        lDescripción0 = new javax.swing.JLabel();
        lNombre0 = new javax.swing.JLabel();
        tNota0 = new javax.swing.JTextField();
        tPorc0 = new javax.swing.JTextField();
        tDesc0 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaNotasAs0 = new javax.swing.JList();
        bAgregarNota0 = new javax.swing.JButton();
        bBorrarNota0 = new javax.swing.JButton();
        bCambiarNota0 = new javax.swing.JButton();
        bBorrarAs0 = new javax.swing.JButton();
        lHoras0 = new javax.swing.JLabel();
        lHorasPara0 = new javax.swing.JLabel();
        bRestarHora0 = new javax.swing.JButton();
        lAsis1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        lNombre1 = new javax.swing.JLabel();
        lHoras1 = new javax.swing.JLabel();
        lHorasPara1 = new javax.swing.JLabel();
        bRestarHora1 = new javax.swing.JButton();
        lDescripción1 = new javax.swing.JLabel();
        lPorcentaje1 = new javax.swing.JLabel();
        lNotas1 = new javax.swing.JLabel();
        tNota1 = new javax.swing.JTextField();
        tPorc1 = new javax.swing.JTextField();
        tDesc1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaNotasAs1 = new javax.swing.JList();
        bAgregarNota1 = new javax.swing.JButton();
        bCambiarNota1 = new javax.swing.JButton();
        bBorrarNota1 = new javax.swing.JButton();
        bPromediar1 = new javax.swing.JButton();
        lPromedio1 = new javax.swing.JLabel();
        bBorrarAs1 = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        panel4 = new javax.swing.JPanel();
        lNombre2 = new javax.swing.JLabel();
        lHoras2 = new javax.swing.JLabel();
        lHorasPara2 = new javax.swing.JLabel();
        bRestarHora2 = new javax.swing.JButton();
        lDescripción2 = new javax.swing.JLabel();
        lPorcentaje2 = new javax.swing.JLabel();
        lNotas2 = new javax.swing.JLabel();
        tNota2 = new javax.swing.JTextField();
        tPorc2 = new javax.swing.JTextField();
        tDesc2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaNotasAs2 = new javax.swing.JList();
        bAgregarNota2 = new javax.swing.JButton();
        bCambiarNota2 = new javax.swing.JButton();
        bBorrarNota2 = new javax.swing.JButton();
        bPromediar2 = new javax.swing.JButton();
        lPromedio2 = new javax.swing.JLabel();
        bBorrarAs2 = new javax.swing.JButton();
        panel5 = new javax.swing.JPanel();
        lNombre3 = new javax.swing.JLabel();
        lHoras3 = new javax.swing.JLabel();
        lHorasPara3 = new javax.swing.JLabel();
        bRestarHora3 = new javax.swing.JButton();
        lDescripción3 = new javax.swing.JLabel();
        lPorcentaje3 = new javax.swing.JLabel();
        lNotas3 = new javax.swing.JLabel();
        tNota3 = new javax.swing.JTextField();
        tPorc3 = new javax.swing.JTextField();
        tDesc3 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaNotasAs3 = new javax.swing.JList();
        bAgregarNota3 = new javax.swing.JButton();
        bCambiarNota3 = new javax.swing.JButton();
        bBorrarNota3 = new javax.swing.JButton();
        bPromediar3 = new javax.swing.JButton();
        lPromedio3 = new javax.swing.JLabel();
        bBorrarAs3 = new javax.swing.JButton();
        panel6 = new javax.swing.JPanel();
        lNombre4 = new javax.swing.JLabel();
        lHoras4 = new javax.swing.JLabel();
        lHorasPara4 = new javax.swing.JLabel();
        bRestarHora4 = new javax.swing.JButton();
        lDescripción4 = new javax.swing.JLabel();
        lPorcentaje4 = new javax.swing.JLabel();
        lNotas4 = new javax.swing.JLabel();
        tNota4 = new javax.swing.JTextField();
        tPorc4 = new javax.swing.JTextField();
        tDesc4 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaNotasAs4 = new javax.swing.JList();
        bAgregarNota4 = new javax.swing.JButton();
        bCambiarNota4 = new javax.swing.JButton();
        bBorrarNota4 = new javax.swing.JButton();
        bPromediar4 = new javax.swing.JButton();
        lPromedio4 = new javax.swing.JLabel();
        bBorrarAs4 = new javax.swing.JButton();
        panel7 = new javax.swing.JPanel();
        lNombre5 = new javax.swing.JLabel();
        lHoras5 = new javax.swing.JLabel();
        lHorasPara5 = new javax.swing.JLabel();
        bRestarHora5 = new javax.swing.JButton();
        lDescripción5 = new javax.swing.JLabel();
        lPorcentaje5 = new javax.swing.JLabel();
        lNotas5 = new javax.swing.JLabel();
        tNota5 = new javax.swing.JTextField();
        tPorc5 = new javax.swing.JTextField();
        tDesc5 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaNotasAs5 = new javax.swing.JList();
        bAgregarNota5 = new javax.swing.JButton();
        bCambiarNota5 = new javax.swing.JButton();
        bBorrarNota5 = new javax.swing.JButton();
        bPromediar5 = new javax.swing.JButton();
        lPromedio5 = new javax.swing.JLabel();
        bBorrarAs5 = new javax.swing.JButton();
        panel8 = new javax.swing.JPanel();
        lNombre6 = new javax.swing.JLabel();
        lHoras6 = new javax.swing.JLabel();
        lHorasPara6 = new javax.swing.JLabel();
        bRestarHora6 = new javax.swing.JButton();
        lDescripción6 = new javax.swing.JLabel();
        lPorcentaje6 = new javax.swing.JLabel();
        lNotas6 = new javax.swing.JLabel();
        tNota6 = new javax.swing.JTextField();
        tPorc6 = new javax.swing.JTextField();
        tDesc6 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaNotasAs6 = new javax.swing.JList();
        bAgregarNota6 = new javax.swing.JButton();
        bCambiarNota6 = new javax.swing.JButton();
        bBorrarNota6 = new javax.swing.JButton();
        bPromediar6 = new javax.swing.JButton();
        lPromedio6 = new javax.swing.JLabel();
        bBorrarAs6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bAgregarAsignatura = new javax.swing.JButton();
        tNombreAsig = new javax.swing.JTextField();
        tHorasAsig = new javax.swing.JTextField();
        bSalir = new javax.swing.JButton();
        tAsisAsig = new javax.swing.JTextField();
        bGuardar = new javax.swing.JButton();
        lNombre = new javax.swing.JLabel();
        lHoras = new javax.swing.JLabel();
        lAsis = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        tabAsignatura.setBackground(new java.awt.Color(255, 255, 0));
        tabAsignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panel1.setBackground(new java.awt.Color(255, 204, 102));

        bPromediar0.setText("Promediar");
        bPromediar0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPromediar0ActionPerformed(evt);
            }
        });

        lPromedio0.setText("--");

        lNotas0.setBackground(new java.awt.Color(255, 255, 102));
        lNotas0.setText("Notas");

        lPorcentaje0.setText("Porcentaje");

        lDescripción0.setText("Descripción");

        lNombre0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNombre0.setText("--");

        tNota0.setText("--");

        tPorc0.setText("--");

        tDesc0.setText("--");

        jScrollPane1.setViewportView(listaNotasAs0);

        bAgregarNota0.setText("Agregar nota");
        bAgregarNota0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarNota0ActionPerformed(evt);
            }
        });

        bBorrarNota0.setText("Borrar nota");
        bBorrarNota0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarNota0ActionPerformed(evt);
            }
        });

        bCambiarNota0.setText("Cambiar nota");
        bCambiarNota0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCambiarNota0ActionPerformed(evt);
            }
        });

        bBorrarAs0.setText("Borrar asignatura");
        bBorrarAs0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarAs0ActionPerformed(evt);
            }
        });

        lHoras0.setText("--");

        lHorasPara0.setText("--");

        bRestarHora0.setText("Restar 1 hora");
        bRestarHora0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestarHora0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(lNombre0)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tNota0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lNotas0))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(tPorc0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(42, 42, 42)
                                            .addComponent(tDesc0, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(lPorcentaje0, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lDescripción0, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lHoras0)
                                        .addComponent(lHorasPara0))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(bPromediar0)
                                .addGap(42, 42, 42)
                                .addComponent(lPromedio0)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bAgregarNota0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bBorrarNota0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(bCambiarNota0)
                            .addComponent(bBorrarAs0)
                            .addComponent(bRestarHora0)
                            .addComponent(lAsis1))
                        .addGap(31, 31, 31))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNombre0)
                .addGap(9, 9, 9)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lHoras0)
                    .addComponent(bRestarHora0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lHorasPara0)
                    .addComponent(lAsis1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNotas0)
                    .addComponent(lPorcentaje0)
                    .addComponent(lDescripción0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNota0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tPorc0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tDesc0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAgregarNota0))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(bCambiarNota0)
                        .addGap(16, 16, 16)
                        .addComponent(bBorrarNota0)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPromediar0)
                    .addComponent(lPromedio0)
                    .addComponent(bBorrarAs0))
                .addGap(25, 25, 25))
        );

        tabAsignatura.addTab("Asignatura 1", panel1);

        panel2.setBackground(new java.awt.Color(255, 204, 102));

        lNombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNombre1.setText("--");

        lHoras1.setText("--");

        lHorasPara1.setText("--");

        bRestarHora1.setText("Restar 1 hora");
        bRestarHora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestarHora1ActionPerformed(evt);
            }
        });

        lDescripción1.setText("Descripción");

        lPorcentaje1.setText("Porcentaje");

        lNotas1.setBackground(new java.awt.Color(255, 255, 102));
        lNotas1.setText("Notas");

        tNota1.setText("--");

        tPorc1.setText("--");

        tDesc1.setText("--");

        jScrollPane2.setViewportView(listaNotasAs1);

        bAgregarNota1.setText("Agregar nota");
        bAgregarNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarNota1ActionPerformed(evt);
            }
        });

        bCambiarNota1.setText("Cambiar nota");
        bCambiarNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCambiarNota1ActionPerformed(evt);
            }
        });

        bBorrarNota1.setText("Borrar nota");
        bBorrarNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarNota1ActionPerformed(evt);
            }
        });

        bPromediar1.setText("Promediar");
        bPromediar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPromediar1ActionPerformed(evt);
            }
        });

        lPromedio1.setText("--");

        bBorrarAs1.setText("Borrar asignatura");
        bBorrarAs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarAs1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addComponent(lNombre1)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lNotas1))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(tPorc1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(tDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(lPorcentaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lDescripción1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lHoras1)
                                            .addComponent(lHorasPara1))))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(bPromediar1)
                                    .addGap(42, 42, 42)
                                    .addComponent(lPromedio1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bAgregarNota1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bBorrarNota1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(bCambiarNota1)
                                .addComponent(bBorrarAs1)
                                .addComponent(bRestarHora1))
                            .addGap(32, 32, 32)))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(lNombre1)
                    .addGap(9, 9, 9)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lHoras1)
                        .addComponent(bRestarHora1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lHorasPara1)
                    .addGap(16, 16, 16)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNotas1)
                        .addComponent(lPorcentaje1)
                        .addComponent(lDescripción1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tPorc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bAgregarNota1))
                    .addGap(18, 18, 18)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addComponent(bCambiarNota1)
                            .addGap(16, 16, 16)
                            .addComponent(bBorrarNota1)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bPromediar1)
                        .addComponent(lPromedio1)
                        .addComponent(bBorrarAs1))
                    .addGap(28, 28, 28)))
        );

        tabAsignatura.addTab("Asignatura 2", panel2);

        panel3.setBackground(new java.awt.Color(255, 204, 102));

        panel4.setBackground(new java.awt.Color(255, 204, 102));

        lNombre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNombre2.setText("--");

        lHoras2.setText("--");

        lHorasPara2.setText("--");

        bRestarHora2.setText("Restar 1 hora");
        bRestarHora2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestarHora2ActionPerformed(evt);
            }
        });

        lDescripción2.setText("Descripción");

        lPorcentaje2.setText("Porcentaje");

        lNotas2.setBackground(new java.awt.Color(255, 255, 102));
        lNotas2.setText("Notas");

        tNota2.setText("--");

        tPorc2.setText("--");

        tDesc2.setText("--");

        jScrollPane3.setViewportView(listaNotasAs2);

        bAgregarNota2.setText("Agregar nota");
        bAgregarNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarNota2ActionPerformed(evt);
            }
        });

        bCambiarNota2.setText("Cambiar nota");
        bCambiarNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCambiarNota2ActionPerformed(evt);
            }
        });

        bBorrarNota2.setText("Borrar nota");
        bBorrarNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarNota2ActionPerformed(evt);
            }
        });

        bPromediar2.setText("Promediar");
        bPromediar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPromediar2ActionPerformed(evt);
            }
        });

        lPromedio2.setText("--");

        bBorrarAs2.setText("Borrar asignatura");
        bBorrarAs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarAs2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(bPromediar2)
                .addGap(42, 42, 42)
                .addComponent(lPromedio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(bBorrarAs2)
                .addGap(31, 31, 31))
            .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel4Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addComponent(lNombre2)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lNotas2))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panel4Layout.createSequentialGroup()
                                            .addComponent(tPorc2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(42, 42, 42)
                                            .addComponent(tDesc2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel4Layout.createSequentialGroup()
                                            .addComponent(lPorcentaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lDescripción2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lHoras2)
                                        .addComponent(lHorasPara2))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bAgregarNota2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bBorrarNota2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(bCambiarNota2)
                                .addComponent(bRestarHora2))
                            .addGap(50, 50, 50)))))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPromediar2)
                    .addComponent(lPromedio2)
                    .addComponent(bBorrarAs2))
                .addGap(39, 39, 39))
            .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel4Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(lNombre2)
                    .addGap(9, 9, 9)
                    .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lHoras2)
                        .addComponent(bRestarHora2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lHorasPara2)
                    .addGap(16, 16, 16)
                    .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNotas2)
                        .addComponent(lPorcentaje2)
                        .addComponent(lDescripción2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tPorc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tDesc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bAgregarNota2))
                    .addGap(18, 18, 18)
                    .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addComponent(bCambiarNota2)
                            .addGap(16, 16, 16)
                            .addComponent(bBorrarNota2)))
                    .addContainerGap(74, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabAsignatura.addTab("Asignatura 3", panel3);

        panel5.setBackground(new java.awt.Color(255, 204, 102));

        lNombre3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNombre3.setText("--");

        lHoras3.setText("--");

        lHorasPara3.setText("--");

        bRestarHora3.setText("Restar 1 hora");
        bRestarHora3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestarHora3ActionPerformed(evt);
            }
        });

        lDescripción3.setText("Descripción");

        lPorcentaje3.setText("Porcentaje");

        lNotas3.setBackground(new java.awt.Color(255, 255, 102));
        lNotas3.setText("Notas");

        tNota3.setText("--");

        tPorc3.setText("--");

        tDesc3.setText("--");

        jScrollPane4.setViewportView(listaNotasAs3);

        bAgregarNota3.setText("Agregar nota");
        bAgregarNota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarNota3ActionPerformed(evt);
            }
        });

        bCambiarNota3.setText("Cambiar nota");
        bCambiarNota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCambiarNota3ActionPerformed(evt);
            }
        });

        bBorrarNota3.setText("Borrar nota");
        bBorrarNota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarNota3ActionPerformed(evt);
            }
        });

        bPromediar3.setText("Promediar");
        bPromediar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPromediar3ActionPerformed(evt);
            }
        });

        lPromedio3.setText("--");

        bBorrarAs3.setText("Borrar asignatura");
        bBorrarAs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarAs3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
            .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel5Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel5Layout.createSequentialGroup()
                            .addComponent(lNombre3)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel5Layout.createSequentialGroup()
                            .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel5Layout.createSequentialGroup()
                                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lNotas3))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(tPorc3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(tDesc3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel5Layout.createSequentialGroup()
                                                .addComponent(lPorcentaje3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lDescripción3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(panel5Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lHoras3)
                                            .addComponent(lHorasPara3))))
                                .addGroup(panel5Layout.createSequentialGroup()
                                    .addComponent(bPromediar3)
                                    .addGap(42, 42, 42)
                                    .addComponent(lPromedio3)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bAgregarNota3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bBorrarNota3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(bCambiarNota3)
                                .addComponent(bBorrarAs3)
                                .addComponent(bRestarHora3))
                            .addGap(32, 32, 32)))))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
            .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel5Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(lNombre3)
                    .addGap(9, 9, 9)
                    .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lHoras3)
                        .addComponent(bRestarHora3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lHorasPara3)
                    .addGap(16, 16, 16)
                    .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNotas3)
                        .addComponent(lPorcentaje3)
                        .addComponent(lDescripción3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tPorc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tDesc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bAgregarNota3))
                    .addGap(18, 18, 18)
                    .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel5Layout.createSequentialGroup()
                            .addComponent(bCambiarNota3)
                            .addGap(16, 16, 16)
                            .addComponent(bBorrarNota3)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                    .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bPromediar3)
                        .addComponent(lPromedio3)
                        .addComponent(bBorrarAs3))
                    .addGap(28, 28, 28)))
        );

        tabAsignatura.addTab("Asignatura 4", panel5);

        panel6.setBackground(new java.awt.Color(255, 204, 102));

        lNombre4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNombre4.setText("--");

        lHoras4.setText("--");

        lHorasPara4.setText("--");

        bRestarHora4.setText("Restar 1 hora");
        bRestarHora4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestarHora4ActionPerformed(evt);
            }
        });

        lDescripción4.setText("Descripción");

        lPorcentaje4.setText("Porcentaje");

        lNotas4.setBackground(new java.awt.Color(255, 255, 102));
        lNotas4.setText("Notas");

        tNota4.setText("--");

        tPorc4.setText("--");

        tDesc4.setText("--");

        jScrollPane5.setViewportView(listaNotasAs4);

        bAgregarNota4.setText("Agregar nota");
        bAgregarNota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarNota4ActionPerformed(evt);
            }
        });

        bCambiarNota4.setText("Cambiar nota");
        bCambiarNota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCambiarNota4ActionPerformed(evt);
            }
        });

        bBorrarNota4.setText("Borrar nota");
        bBorrarNota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarNota4ActionPerformed(evt);
            }
        });

        bPromediar4.setText("Promediar");
        bPromediar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPromediar4ActionPerformed(evt);
            }
        });

        lPromedio4.setText("--");

        bBorrarAs4.setText("Borrar asignatura");
        bBorrarAs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarAs4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
            .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel6Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel6Layout.createSequentialGroup()
                            .addComponent(lNombre4)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel6Layout.createSequentialGroup()
                            .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel6Layout.createSequentialGroup()
                                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lNotas4))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panel6Layout.createSequentialGroup()
                                                .addComponent(tPorc4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(tDesc4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel6Layout.createSequentialGroup()
                                                .addComponent(lPorcentaje4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lDescripción4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(panel6Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lHoras4)
                                            .addComponent(lHorasPara4))))
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addComponent(bPromediar4)
                                    .addGap(42, 42, 42)
                                    .addComponent(lPromedio4)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bAgregarNota4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bBorrarNota4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(bCambiarNota4)
                                .addComponent(bBorrarAs4)
                                .addComponent(bRestarHora4))
                            .addGap(32, 32, 32)))))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
            .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel6Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(lNombre4)
                    .addGap(9, 9, 9)
                    .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lHoras4)
                        .addComponent(bRestarHora4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lHorasPara4)
                    .addGap(16, 16, 16)
                    .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNotas4)
                        .addComponent(lPorcentaje4)
                        .addComponent(lDescripción4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tPorc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tDesc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bAgregarNota4))
                    .addGap(18, 18, 18)
                    .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel6Layout.createSequentialGroup()
                            .addComponent(bCambiarNota4)
                            .addGap(16, 16, 16)
                            .addComponent(bBorrarNota4)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                    .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bPromediar4)
                        .addComponent(lPromedio4)
                        .addComponent(bBorrarAs4))
                    .addGap(28, 28, 28)))
        );

        tabAsignatura.addTab("Asignatura 5", panel6);

        panel7.setBackground(new java.awt.Color(255, 204, 102));

        lNombre5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNombre5.setText("--");

        lHoras5.setText("--");

        lHorasPara5.setText("--");

        bRestarHora5.setText("Restar 1 hora");
        bRestarHora5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestarHora5ActionPerformed(evt);
            }
        });

        lDescripción5.setText("Descripción");

        lPorcentaje5.setText("Porcentaje");

        lNotas5.setBackground(new java.awt.Color(255, 255, 102));
        lNotas5.setText("Notas");

        tNota5.setText("--");

        tPorc5.setText("--");

        tDesc5.setText("--");

        jScrollPane6.setViewportView(listaNotasAs5);

        bAgregarNota5.setText("Agregar nota");
        bAgregarNota5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarNota5ActionPerformed(evt);
            }
        });

        bCambiarNota5.setText("Cambiar nota");
        bCambiarNota5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCambiarNota5ActionPerformed(evt);
            }
        });

        bBorrarNota5.setText("Borrar nota");
        bBorrarNota5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarNota5ActionPerformed(evt);
            }
        });

        bPromediar5.setText("Promediar");
        bPromediar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPromediar5ActionPerformed(evt);
            }
        });

        lPromedio5.setText("--");

        bBorrarAs5.setText("Borrar asignatura");
        bBorrarAs5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarAs5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
            .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel7Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel7Layout.createSequentialGroup()
                            .addComponent(lNombre5)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel7Layout.createSequentialGroup()
                            .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel7Layout.createSequentialGroup()
                                        .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lNotas5))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panel7Layout.createSequentialGroup()
                                                .addComponent(tPorc5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(tDesc5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel7Layout.createSequentialGroup()
                                                .addComponent(lPorcentaje5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lDescripción5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(panel7Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lHoras5)
                                            .addComponent(lHorasPara5))))
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addComponent(bPromediar5)
                                    .addGap(42, 42, 42)
                                    .addComponent(lPromedio5)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bAgregarNota5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bBorrarNota5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(bCambiarNota5)
                                .addComponent(bBorrarAs5)
                                .addComponent(bRestarHora5))
                            .addGap(32, 32, 32)))))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
            .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel7Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(lNombre5)
                    .addGap(9, 9, 9)
                    .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lHoras5)
                        .addComponent(bRestarHora5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lHorasPara5)
                    .addGap(16, 16, 16)
                    .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNotas5)
                        .addComponent(lPorcentaje5)
                        .addComponent(lDescripción5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tPorc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tDesc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bAgregarNota5))
                    .addGap(18, 18, 18)
                    .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel7Layout.createSequentialGroup()
                            .addComponent(bCambiarNota5)
                            .addGap(16, 16, 16)
                            .addComponent(bBorrarNota5)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                    .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bPromediar5)
                        .addComponent(lPromedio5)
                        .addComponent(bBorrarAs5))
                    .addGap(28, 28, 28)))
        );

        tabAsignatura.addTab("Asignatura 6", panel7);

        panel8.setBackground(new java.awt.Color(255, 204, 102));

        lNombre6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNombre6.setText("--");

        lHoras6.setText("--");

        lHorasPara6.setText("--");

        bRestarHora6.setText("Restar 1 hora");
        bRestarHora6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestarHora6ActionPerformed(evt);
            }
        });

        lDescripción6.setText("Descripción");

        lPorcentaje6.setText("Porcentaje");

        lNotas6.setBackground(new java.awt.Color(255, 255, 102));
        lNotas6.setText("Notas");

        tNota6.setText("--");

        tPorc6.setText("--");

        tDesc6.setText("--");

        jScrollPane7.setViewportView(listaNotasAs6);

        bAgregarNota6.setText("Agregar nota");
        bAgregarNota6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarNota6ActionPerformed(evt);
            }
        });

        bCambiarNota6.setText("Cambiar nota");
        bCambiarNota6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCambiarNota6ActionPerformed(evt);
            }
        });

        bBorrarNota6.setText("Borrar nota");
        bBorrarNota6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarNota6ActionPerformed(evt);
            }
        });

        bPromediar6.setText("Promediar");
        bPromediar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPromediar6ActionPerformed(evt);
            }
        });

        lPromedio6.setText("--");

        bBorrarAs6.setText("Borrar asignatura");
        bBorrarAs6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarAs6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
            .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel8Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel8Layout.createSequentialGroup()
                            .addComponent(lNombre6)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel8Layout.createSequentialGroup()
                            .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel8Layout.createSequentialGroup()
                                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tNota6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lNotas6))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panel8Layout.createSequentialGroup()
                                                .addComponent(tPorc6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(tDesc6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel8Layout.createSequentialGroup()
                                                .addComponent(lPorcentaje6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lDescripción6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(panel8Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lHoras6)
                                            .addComponent(lHorasPara6))))
                                .addGroup(panel8Layout.createSequentialGroup()
                                    .addComponent(bPromediar6)
                                    .addGap(42, 42, 42)
                                    .addComponent(lPromedio6)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bAgregarNota6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bBorrarNota6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(bCambiarNota6)
                                .addComponent(bBorrarAs6)
                                .addComponent(bRestarHora6))
                            .addGap(32, 32, 32)))))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
            .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel8Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(lNombre6)
                    .addGap(9, 9, 9)
                    .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lHoras6)
                        .addComponent(bRestarHora6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lHorasPara6)
                    .addGap(16, 16, 16)
                    .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNotas6)
                        .addComponent(lPorcentaje6)
                        .addComponent(lDescripción6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tNota6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tPorc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tDesc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bAgregarNota6))
                    .addGap(18, 18, 18)
                    .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel8Layout.createSequentialGroup()
                            .addComponent(bCambiarNota6)
                            .addGap(16, 16, 16)
                            .addComponent(bBorrarNota6)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                    .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bPromediar6)
                        .addComponent(lPromedio6)
                        .addComponent(bBorrarAs6))
                    .addGap(28, 28, 28)))
        );

        tabAsignatura.addTab("Asignatura 7", panel8);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade-Up 100x100.png"))); // NOI18N

        bAgregarAsignatura.setText("Agregar asignatura");
        bAgregarAsignatura.setToolTipText("");
        bAgregarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarAsignaturaActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        bGuardar.setText("Guardar datos");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        lNombre.setText("Nombre");

        lHoras.setText("Horas semestrales");

        lAsis.setText("Porcentaje de asistencia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lHoras)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tHorasAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tNombreAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(lNombre))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(bSalir))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lAsis))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(tAsisAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bGuardar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bAgregarAsignatura, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tabAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAgregarAsignatura)
                        .addGap(20, 20, 20)
                        .addComponent(lNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNombreAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lHoras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tHorasAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(lAsis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tAsisAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(bGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(bSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabAsignatura.getAccessibleContext().setAccessibleName("Asignaturas");
        tabAsignatura.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Grade-Up");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarNotas(String nota){
        if(nota.matches("[0-6]{1,1}(\\.{1,1}[0-9]{1,}){0,1}") || nota.matches("7(\\.[0]){0,1}")){
            return true;
        }else return false;
    }
    
    private boolean validarPorcentajes(String porcentaje){
        if(porcentaje.matches("[0-9]{1,2}(\\.[0-9]{1,3}){0,1}") || porcentaje.matches("100(\\.[0]{1,3}){0,1}")){
            return true;
        }else return false;
    }
    
    private boolean validarHoras(String horas){
        if(horas.matches("[0-9]{1,10}")){
            return true;
        }else return false;
    }
    
    private void bAgregarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarAsignaturaActionPerformed
        if((tNombreAsig.getText().length() <= 40) & validarHoras(tHorasAsig.getText()) && validarPorcentajes(tAsisAsig.getText())){
            if(this.cantAsg >= 7){
                getToolkit().beep();
                JOptionPane.showMessageDialog(rootPane, "No quedan asignaturas disponibles\nDebe borrar una de las existentes");
            }else{
                for (int i = 0; i < 7; i++) {
                    if (posiciones[i] == false){
                        asignatura asignaturaNueva = new asignatura(tNombreAsig.getText(), Integer.parseInt(tHorasAsig.getText()), Double.parseDouble(tAsisAsig.getText()));
                        asignaturas[i] = asignaturaNueva;
                        this.cantAsg += 1;
                        posiciones[i] = true;
                        switch (i){
                            case 0:
                                bAgregarNota0.setVisible(true);
                                bBorrarNota0.setVisible(true);
                                bCambiarNota0.setVisible(true);
                                bPromediar0.setVisible(true);
                                bBorrarAs0.setVisible(true);
                                bRestarHora0.setVisible(true);
                                lNombre0.setText(asignaturas[0].getNombreAsignatura().toUpperCase());
                                lHoras0.setText("Horas: " + asignaturas[0].getHoras());
                                lHorasPara0.setText("Horas necesarias para aprobar: " + asignaturas[0].calcularAprobacion());
                                tNota0.setText("0.0");
                                tPorc0.setText("0.0");
                                tDesc0.setText("Primera prueba");
                                lPromedio0.setText("Promedio");
                                break;

                            case 1:
                                bAgregarNota1.setVisible(true);
                                bBorrarNota1.setVisible(true);
                                bCambiarNota1.setVisible(true);
                                bPromediar1.setVisible(true);
                                bBorrarAs1.setVisible(true);
                                bRestarHora1.setVisible(true);
                                lNombre1.setText(asignaturas[1].getNombreAsignatura().toUpperCase());
                                lHoras1.setText("Horas: " + asignaturas[1].getHoras());
                                lHorasPara1.setText("Horas necesarias para aprobar: " + asignaturas[1].calcularAprobacion());
                                tNota1.setText("0.0");
                                tPorc1.setText("0.0");
                                tDesc1.setText("Primera prueba");
                                lPromedio1.setText("Promedio");
                                break;
                            case 2:
                                bAgregarNota2.setVisible(true);
                                bBorrarNota2.setVisible(true);
                                bCambiarNota2.setVisible(true);
                                bPromediar2.setVisible(true);
                                bBorrarAs2.setVisible(true);
                                bRestarHora2.setVisible(true);
                                lNombre2.setText(asignaturas[2].getNombreAsignatura().toUpperCase());
                                lHoras2.setText("Horas: " + asignaturas[2].getHoras());
                                lHorasPara2.setText("Horas necesarias para aprobar: " + asignaturas[2].calcularAprobacion());
                                tNota2.setText("0.0");
                                tPorc2.setText("0.0");
                                tDesc2.setText("Primera prueba");
                                lPromedio2.setText("Promedio");
                                break;

                            case 3:
                                bAgregarNota3.setVisible(true);
                                bBorrarNota3.setVisible(true);
                                bCambiarNota3.setVisible(true);
                                bPromediar3.setVisible(true);
                                bBorrarAs3.setVisible(true);
                                bRestarHora3.setVisible(true);
                                lNombre3.setText(asignaturas[3].getNombreAsignatura().toUpperCase());
                                lHoras3.setText("Horas: " + asignaturas[3].getHoras());
                                lHorasPara3.setText("Horas necesarias para aprobar: " + asignaturas[3].calcularAprobacion());
                                tNota3.setText("0.0");
                                tPorc3.setText("0.0");
                                tDesc3.setText("Primera prueba");
                                lPromedio3.setText("Promedio");
                                break;

                            case 4:
                                bAgregarNota4.setVisible(true);
                                bBorrarNota4.setVisible(true);
                                bCambiarNota4.setVisible(true);
                                bPromediar4.setVisible(true);
                                bBorrarAs4.setVisible(true);
                                bRestarHora4.setVisible(true);
                                lNombre4.setText(asignaturas[4].getNombreAsignatura().toUpperCase());
                                lHoras4.setText("Horas: " + asignaturas[4].getHoras());
                                lHorasPara4.setText("Horas necesarias para aprobar: " + asignaturas[4].calcularAprobacion());
                                tNota4.setText("0.0");
                                tPorc4.setText("0.0");
                                tDesc4.setText("Primera prueba");
                                lPromedio4.setText("Promedio");
                                break;

                            case 5:
                                bAgregarNota5.setVisible(true);
                                bBorrarNota5.setVisible(true);
                                bCambiarNota5.setVisible(true);
                                bPromediar5.setVisible(true);
                                bBorrarAs5.setVisible(true);
                                bRestarHora5.setVisible(true);
                                lNombre5.setText(asignaturas[5].getNombreAsignatura().toUpperCase());
                                lHoras5.setText("Horas: " + asignaturas[5].getHoras());
                                lHorasPara5.setText("Horas necesarias para aprobar: " + asignaturas[5].calcularAprobacion());
                                tNota5.setText("0.0");
                                tPorc5.setText("0.0");
                                tDesc5.setText("Primera prueba");
                                lPromedio5.setText("Promedio");
                                break;   

                            case 6:
                                bAgregarNota6.setVisible(true);
                                bBorrarNota6.setVisible(true);
                                bCambiarNota6.setVisible(true);
                                bPromediar6.setVisible(true);
                                bBorrarAs6.setVisible(true);
                                bRestarHora6.setVisible(true);
                                lNombre6.setText(asignaturas[6].getNombreAsignatura().toUpperCase());
                                lHoras6.setText("Horas: " + asignaturas[6].getHoras());
                                lHorasPara6.setText("Horas necesarias para aprobar: " + asignaturas[6].calcularAprobacion());
                                tNota6.setText("0.0");
                                tPorc6.setText("0.0");
                                tDesc6.setText("Primera prueba");
                                lPromedio6.setText("Promedio");
                                break;

                            default:
                                break;

                        }
                        break;
                    }
                }
            }
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
       
    }//GEN-LAST:event_bAgregarAsignaturaActionPerformed
     
    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        //GENERAR TXT
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void bRestarHora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestarHora1ActionPerformed
        if (this.horasAsistidas1 < asignaturas[1].calcularAprobacion()) {
            this.horasAsistidas1 += 1;
            lHorasPara1.setText("Horas necesarias para aprobar: " + (asignaturas[1].calcularAprobacion() - this.horasAsistidas1));
        } else {
             lHorasPara1.setText("Horas necesarias para aprobar: 0");
        } 
    }//GEN-LAST:event_bRestarHora1ActionPerformed

    private void bAgregarNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarNota1ActionPerformed
        if(validarNotas(tNota1.getText()) && validarPorcentajes(tPorc1.getText())){
            double agregarNota = Double.parseDouble(tNota1.getText());
            double agregarPorcentaje = Double.parseDouble(tPorc1.getText());
            String agregarDescripción = tDesc1.getText();
            nota nuevaNota = new nota(agregarNota, agregarPorcentaje, agregarDescripción);
            asignaturas[1].getNotas().add(nuevaNota);
            modeloNotas1.addElement(agregarNota + "        " + agregarPorcentaje + "%       " + agregarDescripción);
            listaNotasAs1.setModel(modeloNotas1);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bAgregarNota1ActionPerformed

    private void bCambiarNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCambiarNota1ActionPerformed
        if(validarNotas(tNota1.getText()) && validarPorcentajes(tPorc1.getText())){
            double cambiarNota = Double.parseDouble(tNota1.getText());
            double cambiarPorcentaje = Double.parseDouble(tPorc1.getText());
            String cambiarDescripción = tDesc1.getText();
            int index = listaNotasAs1.getSelectedIndex();
            asignaturas[1].getNotas().get(index).setNota(cambiarNota);
            asignaturas[1].getNotas().get(index).setPorcentaje(cambiarPorcentaje);
            asignaturas[1].getNotas().get(index).setDescripcion(cambiarDescripción);
            String cambio = cambiarNota + "        " + cambiarPorcentaje + "%       " + cambiarDescripción;
            modeloNotas1.setElementAt(cambio, index);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bCambiarNota1ActionPerformed

    private void bBorrarNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarNota1ActionPerformed
        int index = listaNotasAs1.getSelectedIndex();
        modeloNotas1.remove(index);
        asignaturas[1].getNotas().remove(index);
    }//GEN-LAST:event_bBorrarNota1ActionPerformed

    private void bPromediar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPromediar1ActionPerformed
        double prom = asignaturas[1].calcularPromedio();
        if(prom != -1){
            String prome = "" + prom + " ";
            lPromedio1.setText(prome.substring(0, 4));
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La suma de los porcentajes es incorrecta\nDebe ser menor o igual a 100");  
        }
    }//GEN-LAST:event_bPromediar1ActionPerformed

    private void bBorrarAs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarAs1ActionPerformed
        this.cantAsg -= 1;
        for (int i = 0; i < asignaturas[1].getNotas().size(); i++) {
            modeloNotas1.remove(0);
        }
        listaNotasAs1.setModel(modeloNotas1);
        asignaturas[1] = null;
        posiciones[1] = false;
        noAsignatura1();
        lNombre1.setText("--");
        lHoras1.setText("--");
        lHorasPara1.setText("--");
        lPromedio1.setText("--");
        tNota1.setText("--");
        tPorc1.setText("--");
        tDesc1.setText("--");
    }//GEN-LAST:event_bBorrarAs1ActionPerformed

    private void bRestarHora3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestarHora3ActionPerformed
        if (this.horasAsistidas3 < asignaturas[3].calcularAprobacion()) {
            this.horasAsistidas3 += 1;
            lHorasPara3.setText("Horas necesarias para aprobar: " + (asignaturas[3].calcularAprobacion() - this.horasAsistidas3));
        } else {
             lHorasPara3.setText("Horas necesarias para aprobar: 0");
        }
    }//GEN-LAST:event_bRestarHora3ActionPerformed

    private void bAgregarNota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarNota3ActionPerformed
        if(validarNotas(tNota3.getText()) && validarPorcentajes(tPorc3.getText())){
            double agregarNota = Double.parseDouble(tNota3.getText());
            double agregarPorcentaje = Double.parseDouble(tPorc3.getText());
            String agregarDescripción = tDesc3.getText();
            nota nuevaNota = new nota(agregarNota, agregarPorcentaje, agregarDescripción);
            asignaturas[3].getNotas().add(nuevaNota);
            modeloNotas3.addElement(agregarNota + "        " + agregarPorcentaje + "%       " + agregarDescripción);
            listaNotasAs3.setModel(modeloNotas3);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bAgregarNota3ActionPerformed

    private void bCambiarNota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCambiarNota3ActionPerformed
        if(validarNotas(tNota3.getText()) && validarPorcentajes(tPorc3.getText())){
            double cambiarNota = Double.parseDouble(tNota3.getText());
            double cambiarPorcentaje = Double.parseDouble(tPorc3.getText());
            String cambiarDescripción = tDesc3.getText();
            int index = listaNotasAs3.getSelectedIndex();
            asignaturas[3].getNotas().get(index).setNota(cambiarNota);
            asignaturas[3].getNotas().get(index).setPorcentaje(cambiarPorcentaje);
            asignaturas[3].getNotas().get(index).setDescripcion(cambiarDescripción);
            String cambio = cambiarNota + "        " + cambiarPorcentaje + "%       " + cambiarDescripción;
            modeloNotas3.setElementAt(cambio, index);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bCambiarNota3ActionPerformed

    private void bBorrarNota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarNota3ActionPerformed
        int index = listaNotasAs3.getSelectedIndex();
        modeloNotas3.remove(index);
        asignaturas[3].getNotas().remove(index);
    }//GEN-LAST:event_bBorrarNota3ActionPerformed

    private void bPromediar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPromediar3ActionPerformed
        double prom = asignaturas[3].calcularPromedio();
        if(prom != -1){
            String prome = "" + prom + " ";
            lPromedio3.setText(prome.substring(0, 4));
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La suma de los porcentajes es incorrecta\nDebe ser menor o igual a 100");  
        }
    }//GEN-LAST:event_bPromediar3ActionPerformed

    private void bBorrarAs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarAs3ActionPerformed
        this.cantAsg -= 1;
        for (int i = 0; i < asignaturas[3].getNotas().size(); i++) {
            modeloNotas3.remove(0);
        }
        listaNotasAs3.setModel(modeloNotas3);
        asignaturas[3] = null;
        noAsignatura3();
        lNombre3.setText("--");
        lHoras3.setText("--");
        lHorasPara3.setText("--");
        lPromedio3.setText("--");
        tNota3.setText("--");
        tPorc3.setText("--");
        tDesc3.setText("--");
        posiciones[3] = false;
    }//GEN-LAST:event_bBorrarAs3ActionPerformed

    private void bRestarHora4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestarHora4ActionPerformed
        if (this.horasAsistidas4 < asignaturas[4].calcularAprobacion()) {
            this.horasAsistidas4 += 1;
            lHorasPara4.setText("Horas necesarias para aprobar: " + (asignaturas[4].calcularAprobacion() - this.horasAsistidas4));
        } else {
             lHorasPara4.setText("Horas necesarias para aprobar: 0");
        }
    }//GEN-LAST:event_bRestarHora4ActionPerformed

    private void bAgregarNota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarNota4ActionPerformed
        if(validarNotas(tNota4.getText()) && validarPorcentajes(tPorc4.getText())){
            double agregarNota = Double.parseDouble(tNota4.getText());
            double agregarPorcentaje = Double.parseDouble(tPorc4.getText());
            String agregarDescripción = tDesc4.getText();
            nota nuevaNota = new nota(agregarNota, agregarPorcentaje, agregarDescripción);
            asignaturas[4].getNotas().add(nuevaNota);
            modeloNotas4.addElement(agregarNota + "        " + agregarPorcentaje + "%       " + agregarDescripción);
            listaNotasAs4.setModel(modeloNotas4);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bAgregarNota4ActionPerformed

    private void bCambiarNota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCambiarNota4ActionPerformed
        if(validarNotas(tNota4.getText()) && validarPorcentajes(tPorc4.getText())){
            double cambiarNota = Double.parseDouble(tNota4.getText());
            double cambiarPorcentaje = Double.parseDouble(tPorc4.getText());
            String cambiarDescripción = tDesc4.getText();
            int index = listaNotasAs4.getSelectedIndex();
            asignaturas[4].getNotas().get(index).setNota(cambiarNota);
            asignaturas[4].getNotas().get(index).setPorcentaje(cambiarPorcentaje);
            asignaturas[4].getNotas().get(index).setDescripcion(cambiarDescripción);
            String cambio = cambiarNota + "        " + cambiarPorcentaje + "%       " + cambiarDescripción;
            modeloNotas4.setElementAt(cambio, index);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bCambiarNota4ActionPerformed

    private void bBorrarNota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarNota4ActionPerformed
        int index = listaNotasAs4.getSelectedIndex();
        modeloNotas4.remove(index);
        asignaturas[4].getNotas().remove(index);
    }//GEN-LAST:event_bBorrarNota4ActionPerformed

    private void bPromediar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPromediar4ActionPerformed
        double prom = asignaturas[4].calcularPromedio();
        if(prom != -1){
            String prome = "" + prom + " ";
            lPromedio4.setText(prome.substring(0, 4));
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La suma de los porcentajes es incorrecta\nDebe ser menor o igual a 100");  
        }
    }//GEN-LAST:event_bPromediar4ActionPerformed

    private void bBorrarAs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarAs4ActionPerformed
        this.cantAsg -= 1;
        for (int i = 0; i < asignaturas[4].getNotas().size(); i++) {
            modeloNotas4.remove(0);
        }
        listaNotasAs4.setModel(modeloNotas4);
        asignaturas[4] = null;
        noAsignatura4();
        lNombre4.setText("--");
        lHoras4.setText("--");
        lHorasPara4.setText("--");
        lPromedio4.setText("--");
        tNota4.setText("--");
        tPorc4.setText("--");
        tDesc4.setText("--");
        posiciones[4] = false;
    }//GEN-LAST:event_bBorrarAs4ActionPerformed

    private void bRestarHora5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestarHora5ActionPerformed
        if (this.horasAsistidas5 < asignaturas[5].calcularAprobacion()) {
            this.horasAsistidas5 += 1;
            lHorasPara5.setText("Horas necesarias para aprobar: " + (asignaturas[5].calcularAprobacion() - this.horasAsistidas5));
        } else {
             lHorasPara5.setText("Horas necesarias para aprobar: 0");
        }
    }//GEN-LAST:event_bRestarHora5ActionPerformed

    private void bAgregarNota5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarNota5ActionPerformed
        if(validarNotas(tNota5.getText()) && validarPorcentajes(tPorc5.getText())){
            double agregarNota = Double.parseDouble(tNota5.getText());
            double agregarPorcentaje = Double.parseDouble(tPorc5.getText());
            String agregarDescripción = tDesc5.getText();
            nota nuevaNota = new nota(agregarNota, agregarPorcentaje, agregarDescripción);
            asignaturas[5].getNotas().add(nuevaNota);
            modeloNotas5.addElement(agregarNota + "        " + agregarPorcentaje + "%       " + agregarDescripción);
            listaNotasAs5.setModel(modeloNotas5);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bAgregarNota5ActionPerformed

    private void bCambiarNota5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCambiarNota5ActionPerformed
        if(validarNotas(tNota5.getText()) && validarPorcentajes(tPorc5.getText())){
            double cambiarNota = Double.parseDouble(tNota5.getText());
            double cambiarPorcentaje = Double.parseDouble(tPorc5.getText());
            String cambiarDescripción = tDesc5.getText();
            int index = listaNotasAs5.getSelectedIndex();
            asignaturas[5].getNotas().get(index).setNota(cambiarNota);
            asignaturas[5].getNotas().get(index).setPorcentaje(cambiarPorcentaje);
            asignaturas[5].getNotas().get(index).setDescripcion(cambiarDescripción);
            String cambio = cambiarNota + "        " + cambiarPorcentaje + "%       " + cambiarDescripción;
            modeloNotas5.setElementAt(cambio, index);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bCambiarNota5ActionPerformed

    private void bBorrarNota5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarNota5ActionPerformed
        int index = listaNotasAs5.getSelectedIndex();
        modeloNotas5.remove(index);
        asignaturas[5].getNotas().remove(index);
    }//GEN-LAST:event_bBorrarNota5ActionPerformed

    private void bPromediar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPromediar5ActionPerformed
        double prom = asignaturas[5].calcularPromedio();
        if(prom != -1){
            String prome = "" + prom + " ";
            lPromedio5.setText(prome.substring(0, 4));
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La suma de los porcentajes es incorrecta\nDebe ser menor o igual a 100");  
        }
    }//GEN-LAST:event_bPromediar5ActionPerformed

    private void bBorrarAs5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarAs5ActionPerformed
        this.cantAsg -= 1;
        for (int i = 0; i < asignaturas[5].getNotas().size(); i++) {
            modeloNotas5.remove(0);
        }
        listaNotasAs5.setModel(modeloNotas5);
        asignaturas[5] = null;
        noAsignatura5();
        lNombre5.setText("--");
        lHoras5.setText("--");
        lHorasPara5.setText("--");
        lPromedio5.setText("--");
        tNota5.setText("--");
        tPorc5.setText("--");
        tDesc5.setText("--");
        posiciones[5] = false;
    }//GEN-LAST:event_bBorrarAs5ActionPerformed

    private void bRestarHora6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestarHora6ActionPerformed
        if (this.horasAsistidas6 < asignaturas[6].calcularAprobacion()) {
            this.horasAsistidas6 += 1;
            lHorasPara6.setText("Horas necesarias para aprobar: " + (asignaturas[6].calcularAprobacion() - this.horasAsistidas6));
        } else {
             lHorasPara6.setText("Horas necesarias para aprobar: 0");
        }
    }//GEN-LAST:event_bRestarHora6ActionPerformed

    private void bAgregarNota6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarNota6ActionPerformed
        if(validarNotas(tNota6.getText()) && validarPorcentajes(tPorc6.getText())){
            double agregarNota = Double.parseDouble(tNota6.getText());
            double agregarPorcentaje = Double.parseDouble(tPorc6.getText());
            String agregarDescripción = tDesc6.getText();
            nota nuevaNota = new nota(agregarNota, agregarPorcentaje, agregarDescripción);
            asignaturas[6].getNotas().add(nuevaNota);
            modeloNotas6.addElement(agregarNota + "        " + agregarPorcentaje + "%       " + agregarDescripción);
            listaNotasAs6.setModel(modeloNotas6);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bAgregarNota6ActionPerformed

    private void bCambiarNota6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCambiarNota6ActionPerformed
        if(validarNotas(tNota6.getText()) && validarPorcentajes(tPorc6.getText())){
            double cambiarNota = Double.parseDouble(tNota6.getText());
            double cambiarPorcentaje = Double.parseDouble(tPorc6.getText());
            String cambiarDescripción = tDesc6.getText();
            int index = listaNotasAs6.getSelectedIndex();
            asignaturas[6].getNotas().get(index).setNota(cambiarNota);
            asignaturas[6].getNotas().get(index).setPorcentaje(cambiarPorcentaje);
            asignaturas[6].getNotas().get(index).setDescripcion(cambiarDescripción);
            String cambio = cambiarNota + "        " + cambiarPorcentaje + "%       " + cambiarDescripción;
            modeloNotas6.setElementAt(cambio, index);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bCambiarNota6ActionPerformed

    private void bBorrarNota6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarNota6ActionPerformed
        int index = listaNotasAs6.getSelectedIndex();
        modeloNotas6.remove(index);
        asignaturas[6].getNotas().remove(index);
    }//GEN-LAST:event_bBorrarNota6ActionPerformed

    private void bPromediar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPromediar6ActionPerformed
        double prom = asignaturas[6].calcularPromedio();
        if(prom != -1){
            String prome = "" + prom + " ";
            lPromedio6.setText(prome.substring(0, 4));
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La suma de los porcentajes es incorrecta\nDebe ser menor o igual a 100");  
        }
    }//GEN-LAST:event_bPromediar6ActionPerformed

    private void bBorrarAs6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarAs6ActionPerformed
        this.cantAsg -= 1;
        for (int i = 0; i < asignaturas[6].getNotas().size(); i++) {
            modeloNotas6.remove(0);
        }
        listaNotasAs6.setModel(modeloNotas6);
        asignaturas[6] = null;
        noAsignatura6();
        lNombre6.setText("--");
        lHoras6.setText("--");
        lHorasPara6.setText("--");
        lPromedio6.setText("--");
        tNota6.setText("--");
        tPorc6.setText("--");
        tDesc6.setText("--");
        posiciones[6] = false;
    }//GEN-LAST:event_bBorrarAs6ActionPerformed

    private void bRestarHora0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestarHora0ActionPerformed
        if (this.horasAsistidas0 < asignaturas[0].calcularAprobacion()) {
            this.horasAsistidas0 += 1;
            lHorasPara0.setText("Horas necesarias para aprobar: " + (asignaturas[0].calcularAprobacion() - this.horasAsistidas0));
        } else {
            lHorasPara0.setText("Horas necesarias para aprobar: 0");
        }
    }//GEN-LAST:event_bRestarHora0ActionPerformed

    private void bBorrarAs0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarAs0ActionPerformed
        this.cantAsg -= 1;
        for(int i = 0; i < asignaturas[0].getNotas().size(); i++){
            modeloNotas0.remove(0);
        }
        listaNotasAs0.setModel(modeloNotas0);
        asignaturas[0] = null;
        noAsignatura0();
        lNombre0.setText("--");
        lHoras0.setText("--");
        lHorasPara0.setText("--");
        lPromedio0.setText("--");
        tNota0.setText("--");
        tPorc0.setText("--");
        tDesc0.setText("--");
        posiciones[0] = false;
    }//GEN-LAST:event_bBorrarAs0ActionPerformed

    private void bCambiarNota0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCambiarNota0ActionPerformed
        if(validarNotas(tNota0.getText()) && validarPorcentajes(tPorc0.getText())){
            double cambiarNota = Double.parseDouble(tNota0.getText());
            double cambiarPorcentaje = Double.parseDouble(tPorc0.getText());
            String cambiarDescripción = tDesc0.getText();
            int index = listaNotasAs0.getSelectedIndex();
            asignaturas[0].getNotas().get(index).setNota(cambiarNota);
            asignaturas[0].getNotas().get(index).setPorcentaje(cambiarPorcentaje);
            asignaturas[0].getNotas().get(index).setDescripcion(cambiarDescripción);
            String cambio = cambiarNota + "        " + cambiarPorcentaje + "%       " + cambiarDescripción;
            modeloNotas0.setElementAt(cambio, index);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bCambiarNota0ActionPerformed

    private void bBorrarNota0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarNota0ActionPerformed
        int index = listaNotasAs0.getSelectedIndex();
        modeloNotas0.remove(index);
        asignaturas[0].getNotas().remove(index);
    }//GEN-LAST:event_bBorrarNota0ActionPerformed

    private void bAgregarNota0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarNota0ActionPerformed
        if(validarNotas(tNota0.getText()) && validarPorcentajes(tPorc0.getText())){
            double agregarNota = Double.parseDouble(tNota0.getText());
            double agregarPorcentaje = Double.parseDouble(tPorc0.getText());
            String agregarDescripción = tDesc0.getText();
            nota nuevaNota = new nota(agregarNota, agregarPorcentaje, agregarDescripción);
            asignaturas[0].getNotas().add(nuevaNota);
            modeloNotas0.addElement(agregarNota + "        " + agregarPorcentaje + "%       " + agregarDescripción);
            listaNotasAs0.setModel(modeloNotas0);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bAgregarNota0ActionPerformed

    private void bPromediar0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPromediar0ActionPerformed
        double prom = asignaturas[0].calcularPromedio();
        if(prom != -1){
            String prome = "" + prom + " ";
            lPromedio0.setText(prome.substring(0, 4));
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La suma de los porcentajes es incorrecta\nDebe ser menor o igual a 100");  
        }
    }//GEN-LAST:event_bPromediar0ActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        try {
            guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(gradeUpGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bBorrarAs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarAs2ActionPerformed
        this.cantAsg -= 1;
        for (int i = 0; i < asignaturas[2].getNotas().size(); i++) {
            modeloNotas2.remove(0);
        }
        listaNotasAs2.setModel(modeloNotas2);
        asignaturas[2] = null;
        noAsignatura2();
        lNombre2.setText("--");
        lHoras2.setText("--");
        lHorasPara2.setText("--");
        lPromedio2.setText("--");
        tNota2.setText("--");
        tPorc2.setText("--");
        tDesc2.setText("--");
        posiciones[2] = false;
    }//GEN-LAST:event_bBorrarAs2ActionPerformed

    private void bPromediar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPromediar2ActionPerformed
        double prom = asignaturas[2].calcularPromedio();
        if(prom != -1){
            String prome = "" + prom + " ";
            lPromedio2.setText(prome.substring(0, 4));
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La suma de los porcentajes es incorrecta\nDebe ser menor o igual a 100");
        }
    }//GEN-LAST:event_bPromediar2ActionPerformed

    private void bBorrarNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarNota2ActionPerformed
        int index = listaNotasAs2.getSelectedIndex();
        modeloNotas2.remove(index);
        asignaturas[2].getNotas().remove(index);
    }//GEN-LAST:event_bBorrarNota2ActionPerformed

    private void bCambiarNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCambiarNota2ActionPerformed
        if(validarNotas(tNota2.getText()) && validarPorcentajes(tPorc2.getText())){
            double cambiarNota = Double.parseDouble(tNota2.getText());
            double cambiarPorcentaje = Double.parseDouble(tPorc2.getText());
            String cambiarDescripción = tDesc2.getText();
            int index = listaNotasAs2.getSelectedIndex();
            asignaturas[2].getNotas().get(index).setNota(cambiarNota);
            asignaturas[2].getNotas().get(index).setPorcentaje(cambiarPorcentaje);
            asignaturas[2].getNotas().get(index).setDescripcion(cambiarDescripción);
            String cambio = cambiarNota + "        " + cambiarPorcentaje + "%       " + cambiarDescripción;
            modeloNotas2.setElementAt(cambio, index);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bCambiarNota2ActionPerformed

    private void bAgregarNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarNota2ActionPerformed
        if(validarNotas(tNota2.getText()) && validarPorcentajes(tPorc2.getText())){
            double agregarNota = Double.parseDouble(tNota2.getText());
            double agregarPorcentaje = Double.parseDouble(tPorc2.getText());
            String agregarDescripción = tDesc2.getText();
            nota nuevaNota = new nota(agregarNota, agregarPorcentaje, agregarDescripción);
            asignaturas[2].getNotas().add(nuevaNota);
            modeloNotas2.addElement(agregarNota + "        " + agregarPorcentaje + "%       " + agregarDescripción);
            listaNotasAs2.setModel(modeloNotas2);
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Uno de los campos fue mal ingresado\nIntente de nuevo");
        }
    }//GEN-LAST:event_bAgregarNota2ActionPerformed

    private void bRestarHora2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestarHora2ActionPerformed
        if (this.horasAsistidas2 < asignaturas[2].calcularAprobacion()) {
            this.horasAsistidas2 += 1;
            lHorasPara2.setText("Horas necesarias para aprobar: " + (asignaturas[2].calcularAprobacion() - this.horasAsistidas2));
        } else {
            lHorasPara2.setText("Horas necesarias para aprobar: 0");
        }
    }//GEN-LAST:event_bRestarHora2ActionPerformed
    
    private void noAsignatura0(){
        bAgregarNota0.setVisible(false);
        bBorrarNota0.setVisible(false);
        bCambiarNota0.setVisible(false);
        bPromediar0.setVisible(false);
        bBorrarAs0.setVisible(false);
        bRestarHora0.setVisible(false);
    }
    
    private void noAsignatura1(){
        bAgregarNota1.setVisible(false);
        bBorrarNota1.setVisible(false);
        bCambiarNota1.setVisible(false);
        bPromediar1.setVisible(false);
        bBorrarAs1.setVisible(false);
        bRestarHora1.setVisible(false);
    }
    
    private void noAsignatura2(){
        bAgregarNota2.setVisible(false);
        bBorrarNota2.setVisible(false);
        bCambiarNota2.setVisible(false);
        bPromediar2.setVisible(false);
        bBorrarAs2.setVisible(false);
        bRestarHora2.setVisible(false);
    }
    
    private void noAsignatura3(){
        bAgregarNota3.setVisible(false);
        bBorrarNota3.setVisible(false);
        bCambiarNota3.setVisible(false);
        bPromediar3.setVisible(false);
        bBorrarAs3.setVisible(false);
        bRestarHora3.setVisible(false);
    }
    
    private void noAsignatura4(){
        bAgregarNota4.setVisible(false);
        bBorrarNota4.setVisible(false);
        bCambiarNota4.setVisible(false);
        bPromediar4.setVisible(false);
        bBorrarAs4.setVisible(false);
        bRestarHora4.setVisible(false);
    }
    
    private void noAsignatura5(){
        bAgregarNota5.setVisible(false);
        bBorrarNota5.setVisible(false);
        bCambiarNota5.setVisible(false);
        bPromediar5.setVisible(false);
        bBorrarAs5.setVisible(false);
        bRestarHora5.setVisible(false);
    }
    
    private void noAsignatura6(){
        bAgregarNota6.setVisible(false);
        bBorrarNota6.setVisible(false);
        bCambiarNota6.setVisible(false);
        bPromediar6.setVisible(false);
        bBorrarAs6.setVisible(false);
        bRestarHora6.setVisible(false);
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregarAsignatura;
    private javax.swing.JButton bAgregarNota0;
    private javax.swing.JButton bAgregarNota1;
    private javax.swing.JButton bAgregarNota2;
    private javax.swing.JButton bAgregarNota3;
    private javax.swing.JButton bAgregarNota4;
    private javax.swing.JButton bAgregarNota5;
    private javax.swing.JButton bAgregarNota6;
    private javax.swing.JButton bBorrarAs0;
    private javax.swing.JButton bBorrarAs1;
    private javax.swing.JButton bBorrarAs2;
    private javax.swing.JButton bBorrarAs3;
    private javax.swing.JButton bBorrarAs4;
    private javax.swing.JButton bBorrarAs5;
    private javax.swing.JButton bBorrarAs6;
    private javax.swing.JButton bBorrarNota0;
    private javax.swing.JButton bBorrarNota1;
    private javax.swing.JButton bBorrarNota2;
    private javax.swing.JButton bBorrarNota3;
    private javax.swing.JButton bBorrarNota4;
    private javax.swing.JButton bBorrarNota5;
    private javax.swing.JButton bBorrarNota6;
    private javax.swing.JButton bCambiarNota0;
    private javax.swing.JButton bCambiarNota1;
    private javax.swing.JButton bCambiarNota2;
    private javax.swing.JButton bCambiarNota3;
    private javax.swing.JButton bCambiarNota4;
    private javax.swing.JButton bCambiarNota5;
    private javax.swing.JButton bCambiarNota6;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bPromediar0;
    private javax.swing.JButton bPromediar1;
    private javax.swing.JButton bPromediar2;
    private javax.swing.JButton bPromediar3;
    private javax.swing.JButton bPromediar4;
    private javax.swing.JButton bPromediar5;
    private javax.swing.JButton bPromediar6;
    private javax.swing.JButton bRestarHora0;
    private javax.swing.JButton bRestarHora1;
    private javax.swing.JButton bRestarHora2;
    private javax.swing.JButton bRestarHora3;
    private javax.swing.JButton bRestarHora4;
    private javax.swing.JButton bRestarHora5;
    private javax.swing.JButton bRestarHora6;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lAsis;
    private javax.swing.JLabel lAsis1;
    private javax.swing.JLabel lDescripción0;
    private javax.swing.JLabel lDescripción1;
    private javax.swing.JLabel lDescripción2;
    private javax.swing.JLabel lDescripción3;
    private javax.swing.JLabel lDescripción4;
    private javax.swing.JLabel lDescripción5;
    private javax.swing.JLabel lDescripción6;
    private javax.swing.JLabel lHoras;
    private javax.swing.JLabel lHoras0;
    private javax.swing.JLabel lHoras1;
    private javax.swing.JLabel lHoras2;
    private javax.swing.JLabel lHoras3;
    private javax.swing.JLabel lHoras4;
    private javax.swing.JLabel lHoras5;
    private javax.swing.JLabel lHoras6;
    private javax.swing.JLabel lHorasPara0;
    private javax.swing.JLabel lHorasPara1;
    private javax.swing.JLabel lHorasPara2;
    private javax.swing.JLabel lHorasPara3;
    private javax.swing.JLabel lHorasPara4;
    private javax.swing.JLabel lHorasPara5;
    private javax.swing.JLabel lHorasPara6;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lNombre0;
    private javax.swing.JLabel lNombre1;
    private javax.swing.JLabel lNombre2;
    private javax.swing.JLabel lNombre3;
    private javax.swing.JLabel lNombre4;
    private javax.swing.JLabel lNombre5;
    private javax.swing.JLabel lNombre6;
    private javax.swing.JLabel lNotas0;
    private javax.swing.JLabel lNotas1;
    private javax.swing.JLabel lNotas2;
    private javax.swing.JLabel lNotas3;
    private javax.swing.JLabel lNotas4;
    private javax.swing.JLabel lNotas5;
    private javax.swing.JLabel lNotas6;
    private javax.swing.JLabel lPorcentaje0;
    private javax.swing.JLabel lPorcentaje1;
    private javax.swing.JLabel lPorcentaje2;
    private javax.swing.JLabel lPorcentaje3;
    private javax.swing.JLabel lPorcentaje4;
    private javax.swing.JLabel lPorcentaje5;
    private javax.swing.JLabel lPorcentaje6;
    private javax.swing.JLabel lPromedio0;
    private javax.swing.JLabel lPromedio1;
    private javax.swing.JLabel lPromedio2;
    private javax.swing.JLabel lPromedio3;
    private javax.swing.JLabel lPromedio4;
    private javax.swing.JLabel lPromedio5;
    private javax.swing.JLabel lPromedio6;
    private javax.swing.JList listaNotasAs0;
    private javax.swing.JList listaNotasAs1;
    private javax.swing.JList listaNotasAs2;
    private javax.swing.JList listaNotasAs3;
    private javax.swing.JList listaNotasAs4;
    private javax.swing.JList listaNotasAs5;
    private javax.swing.JList listaNotasAs6;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panel8;
    private javax.swing.JTextField tAsisAsig;
    private javax.swing.JTextField tDesc0;
    private javax.swing.JTextField tDesc1;
    private javax.swing.JTextField tDesc2;
    private javax.swing.JTextField tDesc3;
    private javax.swing.JTextField tDesc4;
    private javax.swing.JTextField tDesc5;
    private javax.swing.JTextField tDesc6;
    private javax.swing.JTextField tHorasAsig;
    private javax.swing.JTextField tNombreAsig;
    private javax.swing.JTextField tNota0;
    private javax.swing.JTextField tNota1;
    private javax.swing.JTextField tNota2;
    private javax.swing.JTextField tNota3;
    private javax.swing.JTextField tNota4;
    private javax.swing.JTextField tNota5;
    private javax.swing.JTextField tNota6;
    private javax.swing.JTextField tPorc0;
    private javax.swing.JTextField tPorc1;
    private javax.swing.JTextField tPorc2;
    private javax.swing.JTextField tPorc3;
    private javax.swing.JTextField tPorc4;
    private javax.swing.JTextField tPorc5;
    private javax.swing.JTextField tPorc6;
    private javax.swing.JTabbedPane tabAsignatura;
    // End of variables declaration//GEN-END:variables
}
