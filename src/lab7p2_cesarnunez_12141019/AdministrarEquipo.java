package lab7p2_cesarnunez_12141019;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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
            }
        }catch(Exception e){
            
        }
        
        fw.close();
        bw.close();
    }
    
    public void cargarArchivo(){
        
    }
    
}
