import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 7){
            Menu.mostrar();
            opcion = Menu.leerOpcion(sc);
            switch (opcion) {
                case 1:
                    Operaciones.registrar(sc);
                    break;
                case 2:
                    Operaciones.buscarProducto(sc);
                    break;
                case 3:
                    Operaciones.mostrarInventario(sc);
                    break;
                case 4:
                    Operaciones.actualizarCantidad(sc);
                    break;
                case 5:
                    Operaciones.totalProducto(sc);
                    break;
                case 6:
                    Operaciones.eliminarProducto(sc);
                    break;
                case 7:
                    System.out.println("Gracias por utilizar el gestor de inventario de Asgard Pets, hasta pronto!");
                    break;
                default:
                    System.out.println("Por favor ingrese una opción valida");
            }
        }


    }
}