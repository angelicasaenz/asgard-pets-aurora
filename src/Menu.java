import java.util.Scanner;

public class Menu {

    public static void mostrar(){

        System.out.println("""
                ================ BIENVENIDO AL GESTOR DE INVENTARIO DE ASGARD PETS ================
                
                1. Registrar un producto.
                2. Buscar un producto.
                3. Mostrar inventario.
                4. Actualizar cantidad de un producto.
                5. Calcular total de un producto.
                6. Eliminar un producto del inventario.
                7. Mostrar productos agotados.
                8. Salir del gestor.
                """);
    }

    public static int leerOpcion(Scanner sc){
        return Validador.leerEntero(sc, "Ingrese una opción: ");
    }

}
