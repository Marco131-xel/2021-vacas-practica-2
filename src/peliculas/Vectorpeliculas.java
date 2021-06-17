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
		System.out.println("\n\n *****Ingresar Peliculas******");
		System.out.println("");
		int anio = IngresoDatos.getEntero("Ingrese el anio: ",false);
		String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula: ");
		String categoria = IngresoDatos.getTexto("Ingrese la categoria de la pelicula: ");
		System.out.println("");
		agregarPelicula(anio, nombre, categoria);
        
	}

    //Mostrar peliculas
	public void mostrarPeliculas(){
		System.out.println("\n\n *****Peliculas******");
		System.out.println("");
		for (int i = 0; i <(siguientePelicula-1); i++){
			System.out.println("-"+i+") "+pelicula[i].getContar());

		}

		System.out.println("\n\n");
	}

	public void ordenarPeliculas(boolean ascendente){
		boolean cambio = true;

		for (int i =1; i <(siguientePelicula-1); i++){
			for(int j = 0; j < (siguientePelicula-1-i); j++){

				if (ascendente){
					cambio= (pelicula[j].getNombre().compareTo(pelicula[j+1].getNombre())>0);

				}
				else{
					cambio= (pelicula[j].getNombre().compareTo(pelicula[j+1].getNombre())<0);
				}

				if(cambio){
					Pelicula aux = pelicula[j];
					pelicula[j] = pelicula[j+1];
					pelicula[j+1]=aux;
				}
			}
		}
	}

	//fin 
}