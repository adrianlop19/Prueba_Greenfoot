

public class Equipo{
    
    private String nombre;
    private int Posicion;
    private int esquinas;
    private int ganados;
    private int perdidos;
    private int tirosAgol;
    private int amarillas;
    private int rojas;
    private int faltas;


    public Equipo(String nombre, int Posicion, int esquinas, int ganados, int perdidos, int tirosAgol, int amarillas, int rojas, int faltas) {
        this.nombre = nombre;
        this.Posicion = Posicion;
        this.esquinas = esquinas;
        this.ganados = ganados;
        this.perdidos = perdidos;
        this.tirosAgol = tirosAgol;
        this.amarillas = amarillas;
        this.rojas = rojas;
        this.faltas = faltas;
    }


    public void setNombre(String _nombre){
        this.nombre = _nombre;}

    public void setPosicion(int _Posicion){
        this.Posicion = _Posicion;}
    
    public void setEsquinas(int _Esquinas){
        this.esquinas = _Esquinas;}

    public void setGanados(int _Ganados){
        this.ganados = _Ganados;}
    
    public void setPerdidos(int _Perdidos){
        this.perdidos = _Perdidos;}

    public void setTirosAgol(int _TirosAgol){
        this.tirosAgol = _TirosAgol;}

    public void setRojas(int _Rojas){
        this.rojas = _Rojas;}

    public void setAmarillas(int _Amarillas){
        this.amarillas = _Amarillas;}

    public void setFaltas(int _Faltas){
        this.faltas = _Faltas;}



    public String getNombre() {
        return this.nombre;
    }

    public int getPosicion() {
        return this.Posicion;
    }

    public int getEsquinas() {
        return this.esquinas;
    }

    public int getGanados() {
        return this.ganados;
    }

    public int getPerdidos() {
        return this.perdidos;
    }

    public int getTirosAgol() {
        return this.tirosAgol;
    }

    public int getAmarillas() {
        return this.amarillas;
    }

    public int getRojas() {
        return this.rojas;
    }

    public int getFaltas() {
        return this.faltas;
    }
    

    






    

    

    

    

    




}