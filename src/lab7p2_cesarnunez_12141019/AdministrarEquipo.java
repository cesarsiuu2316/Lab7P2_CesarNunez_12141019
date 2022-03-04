package lab7p2_cesarnunez_12141019;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AdministrarEquipo {
    
    ArrayList<Equipo> equipos = new ArrayList();
    File file = null;

    public AdministrarEquipo(String path) {        
        file = new File(path);
    }

    public AdministrarEquipo() {
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    public void setEquipo(Equipo e){
        equipos.add(e);
    }   
    
    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;        
        try{
            fw = new FileWriter(file, false);
            bw = new BufferedWriter(fw);            
            for (Equipo equipo : equipos) {
                bw.write(equipo.getNombre() + ",");
                bw.write(equipo.getpJugados() + ",");
                bw.write(equipo.getpGanados() + ",");
                bw.write(equipo.getpEmpatados() + ",");
                bw.write(equipo.getpPerdidos() + ",");
                bw.write(equipo.getGolesFavor() + ",");
                bw.write(equipo.getGolesContra() + ",");
                bw.write(equipo.getDiferenciaGoles() + ",");
                bw.write(equipo.getPts() + ","); 
                //bw.write(equipo.toString() + "\n");
            }            
            bw.flush();            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, no se pudo escribir al archivo!");
        }        
        fw.close();
        bw.close();
    }
    
    public void cargarArchivo(){
        Scanner sc = null;
        equipos = new ArrayList();
        if(file.exists()){            
            try{
                sc = new Scanner(file);
                sc.useDelimiter(",");
                while(sc.hasNext()){
                    equipos.add(new Equipo(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
                }   
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error, no se pudo cargar el archivo!");
            }
            sc.close();
        }
    }
    
}
