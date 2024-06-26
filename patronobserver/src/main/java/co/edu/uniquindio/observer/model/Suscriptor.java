package co.edu.uniquindio.observer.model;

public class Suscriptor implements Observer{

    private String nombre;
    private CanalYouTube canalYouTube;
    private String titulo;


    public Suscriptor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public CanalYouTube getCanalYouTube() {
        return canalYouTube;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void actualizar(String titulo){
        this.titulo = titulo;
    }
    
    @Override
    public String toString(){
        return nombre + ". " + canalYouTube.getNombre()
        + " ha publicado un nuevo video"+ titulo; 
    }

}