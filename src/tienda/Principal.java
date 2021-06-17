package src.tienda;

import src.clientes.VectorClientes;
import src.peliculas.Vectorpeliculas;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
    private Vectorpeliculas tablaPeliculas = new Vectorpeliculas();

    public Principal(){

        int menu = 0;

        while(menu >= 0){
            System.out.print("");
            System.out.println("\n\n *****Bienvenido a memorabilia****** \n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar Clientes Ascente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("5) Ingresar peliculas");
            System.out.println("6) Mostrar peliculas");
            System.out.println("7) Mostrar peliculas Ordenadas");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1 ){
                //ingreso de datos
                tablaClientes.agregarCliente();
            }
            if (menu == 2){
                //mostrar clientes
                tablaClientes.mostrarClientes();
            }
            if (menu == 3){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(true);
                tablaClientes.mostrarClientes();
            }
            if (menu == 4){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }
            if (menu == 5){
                tablaPeliculas.agregarPelicula();
            }
            if (menu == 6){
                tablaPeliculas.mostrarPeliculas();
            }
            if (menu == 7){
                System.out.println("Ordenado");
                tablaPeliculas.ordenarPeliculas(true);
                tablaPeliculas.mostrarPeliculas();
            }

        }

    }

    
}
