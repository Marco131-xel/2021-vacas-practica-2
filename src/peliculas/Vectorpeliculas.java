package src.peliculas;

import src.tienda.*;

public class Vectorpeliculas{
	private Pelicula[] pelicula = new Pelicula[50];
	private int siguientePelicula;

	public Vectorpeliculas(){
		siguientePelicula = 1;

	}

	// agregar peliculas
	public void agregarPelicula(int anio, String nombre, String categoria){
		if(siguientePelicula > 50){
			System.out.println("Limite de peliculas alcanzado");
		}
		else{
			pelicula[(siguientePelicula-1)] = new Pelicula(siguientePelicula, anio, nombre, categoria);
		}
		siguientePelicula++;

	}

	public void agregarPelicula(){
		int anio = IngresoDatos.getEntero("Ingrese el anio: ",false);
		String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula: ");
		String categoria = IngresoDatos.getTexto("Ingrese la categoria de la pelicula: ");
		System.out.println("");
		agregarPelicula(anio, nombre, categoria);
        
	}

    //Mostrar peliculas
	public void mostrarPeliculas(){
		System.out.println("\n\n Peliculas");
		for (int i = 0; i <(siguientePelicula-1); i++){
			System.out.println("-"+i+") "+pelicula[i].getContar());

		}

		System.out.println("\n\n");
	}

}