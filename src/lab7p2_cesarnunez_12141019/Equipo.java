package lab7p2_cesarnunez_12141019;

public class Equipo {
    
    private String nombre;
    private int pGanados = 0, pEmpatados = 0, pPerdidos = 0, golesFavor = 0, golesContra = 0, diferenciaGoles = 0;
    private int pts = 0;
    private int pJugados = 0;

    public Equipo(String nombre, int pJugados, int pGanados, int pEmpatados, int pPerdidos, int golesFavor, int golesContra, int diferenciaGoles, int pts) {
        this.nombre = nombre;
        this.pJugados = pJugados;
        this.pGanados = pGanados;
        this.pEmpatados = pEmpatados;
        this.pPerdidos = pPerdidos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.diferenciaGoles = diferenciaGoles;
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getpGanados() {
        return pGanados;
    }

    public void setpGanados(int pGanados) {
        this.pGanados = pGanados;
    }

    public int getpEmpatados() {
        return pEmpatados;
    }

    public void setpEmpatados(int pEmpatados) {
        this.pEmpatados = pEmpatados;
    }

    public int getpPerdidos() {
        return pPerdidos;
    }

    public void setpPerdidos(int pPerdidos) {
        this.pPerdidos = pPerdidos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getDiferenciaGoles() {
        return diferenciaGoles;
    }

    public void setDiferenciaGoles(int diferenciaGoles) {
        this.diferenciaGoles = diferenciaGoles;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    public int getpJugados() {
        return pJugados;
    }

    public void setpJugados(int pJugados) {
        this.pJugados = pJugados;
    }

    @Override
    public String toString() {
        return nombre;
    }


    
}
