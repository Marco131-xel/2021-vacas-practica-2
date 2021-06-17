package src.peliculas;

public class Pelicula{
	private int id;
	private int anio;
	private String nombre;
	private String categoria;

	public Pelicula(int id, int anio, String nombre, String categoria){
		this.id = id;
		this.anio = anio;
		this.nombre = nombre;
		this.categoria = categoria;
	}

	//get y set
	   public int getId(){
        return id;
    }

    public int getAnio(){
        return anio;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public void setCategoria(String categoria){
    	this.categoria = categoria;
    }

    public String getContar(){
        String prueba = "Id: "+id+" || Categoria: "+categoria+" || Nombre de la pelicula: "+nombre+" // Anio: " +anio;
        return prueba;
    }

}