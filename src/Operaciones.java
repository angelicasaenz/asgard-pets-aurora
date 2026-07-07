import java.util.Scanner;

public class Operaciones {

    static int capacidad = 16;
    static String nombres[] = new String[capacidad];
    static double precios[] = new double[capacidad];
    static int cantidad[] = new int[capacidad];
    static String tipo[] = new String[capacidad];

    static boolean hayProducto = false;
    static int productosRegistrados = 0;

    // Validar que no hay producto
    public static boolean noHayProducto(){
        if (!hayProducto){
            System.out.println("Aún no hay producto registrado");
            return true;
        } else {
            return false;
        }
    }
    // 1. Registrar producto
    public static void registrar(Scanner sc){

        if (productosRegistrados < capacidad){
            nombres[productosRegistrados] = Validador.leerTexto(sc, "Ingrese el nombre del producto: ");
            precios[productosRegistrados] = Validador.leerDouble(sc, "Ingrese el precio: ");
            cantidad[productosRegistrados] = Validador.leerEntero(sc, "Ingrese la cantidad: ");
            tipo[productosRegistrados] = Validador.leerTexto(sc, "Para que animal es (perro, gato, ave): ");
            productosRegistrados++;
            hayProducto = true;
            System.out.println();
            System.out.println("Producto registrado exitosamente!!");
            System.out.println();
        } else {
            System.out.println("El inventario está lleno, no es posible agregar más productos");
        }
    }

    // 2. Buscar producto
    public static void buscarProducto(Scanner sc){
        if (noHayProducto()){
            return;
        } else {
            String productoBuscado = Validador.leerTexto(sc, "Ingrese el nombre del producto que desea buscar: ");
            boolean productoEncontrado = false;
            for (int i = 0; i < productosRegistrados; i++){
                if(productoBuscado.equalsIgnoreCase(nombres[i])){
                    System.out.println("Si se encuentra disponible ese producto");
                    productoEncontrado = true;
                    return;
                }
            }
            if (!productoEncontrado){
                System.out.println("El producto no se encuentra disponible");
            }
        }
    }

    // 3. Mostrar inventario
    public static void mostrarInventario(Scanner sc){
        if (noHayProducto()){
            return;
        } else {
            System.out.println("***** INVENTARIO DE ASGARD PETS *****");
            System.out.println();
            for (int i = 0; i < productosRegistrados; i++){
                System.out.println("=================================");
                System.out.println("Producto: " + nombres[i]);
                System.out.println("Precio: " + precios[i]);
                System.out.println("Cantidad: " + cantidad[i]);
                System.out.println("Animal: " + tipo[i]);
                System.out.println("=================================");
                System.out.println();
            }
        }

    }

    // 4. Actualizar cantidad
    public static void actualizarCantidad(Scanner sc){
        if (noHayProducto()){
            return;
        } else{
            String productoActualizar = Validador.leerTexto(sc, "Ingrese el nombre del producto al que le quiere actualizar la cantidad: ");
            boolean productoEncontrado = false;
            int indiceBuscado = 0;
            for (int i = 0; i < productosRegistrados; i++){
                if (productoActualizar.equalsIgnoreCase(nombres[i])){
                    indiceBuscado = i;
                    productoEncontrado = true;
                    break;
                }
            } if (productoEncontrado){
                int nuevaCantidad = Validador.leerEntero(sc, "Ingrese la nueva cantidad: ");
                cantidad[indiceBuscado] = nuevaCantidad;
                System.out.println("Cantidad actualizada con exito");
            } else {
                System.out.println("El producto no fue encontrado");
            }
        }
    }

    // 5. Calcular total de un producto

    public  static void totalProducto(Scanner sc){
        if (noHayProducto()){
            return;
        } else {
            String productoCalcular = Validador.leerTexto(sc, "Ingrese el nombre del producto al que le quiere ver su valor total: ");
            boolean productoEncontrado = false;
            int indiceBuscado = 0;
            String producto = "";
            for (int i = 0; i < productosRegistrados; i++){
                if (productoCalcular.equalsIgnoreCase(nombres[i])){
                        indiceBuscado = i;
                        producto = nombres[i];
                        productoEncontrado = true;
                        break;
                    }
                } if (productoEncontrado){
                double total = precios[indiceBuscado] * cantidad[indiceBuscado];

                System.out.println("El precio total de " + producto + " es: " + total);
            } else {
                System.out.println("El producto no fue encontrado");
            }

        }
    }



}
