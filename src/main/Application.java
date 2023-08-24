package src.main;

import java.util.ArrayList;
import java.util.Scanner;
import src.main.models.Cliente;
import src.main.models.Product;
import src.main.models.Vendedor;

public class Application {

    public static void main(String[] args) {
        ArrayList<Product> productos = new ArrayList();
        productos.add(new Product("coca", 1200.0, "gaseosas"));
        productos.add(new Product("sprite", 1100.0, "gaseosas"));
        productos.add(new Product("doritos", 1000.0, "snacks"));
        productos.add(new Product("pan", 500.0, "panaderia"));
        Vendedor vendedor = new Vendedor();
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Bienvenid@! Eres vendedor o cliente?");
            System.out.println("1 - Vendedor");
            System.out.println("2 - Cliente");
            System.out.println("3 - salir del programa");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Usted Selecciono Menu Vendedor");
                    System.out.println("Que accion deseas realizar");
                    System.out.println("1 - Agregar un nuevo producto");
                    System.out.println("2 - Modificar un producto existente");
                    System.out.println("3 - Eliminar un producto");
                    System.out.println("4 - Eliminar productos de una categoria");
                    System.out.println("5 - No realizar acciones");
                    int opcionMenuVendedor = scanner1.nextInt();
                    switch (opcionMenuVendedor) {
                        case 1:
                            System.out.println("Usted Selecciono Agregar un nuevo producto");
                            vendedor.nuevoProducto(productos);
                            continue;
                        case 2:
                            System.out.println("Usted Selecciono Modificar un producto existente");
                            vendedor.modificarProducto(productos);
                            continue;
                        case 3:
                            System.out.println("Usted Selecciono eliminar un producto");
                            vendedor.eliminarProducto(productos);
                            continue;
                        case 4:
                            System.out.println("Usted Selecciono eliminar productos de una categoria");
                            vendedor.eliminarPorCat(productos);
                        default:
                            continue;
                    }
                case 2:
                    System.out.println("Usted Selecciono Menu Cliente");
                    System.out.println("Que accion deseas realizar");
                    System.out.println("1 - Listar los productos por precios");
                    System.out.println("2 - Obtener el producto mas caro");
                    System.out.println("3 - Obtener el producto mas barato");
                    System.out.println("4 - Listar los productos por orden alfabetico");
                    System.out.println("5 - Calcular el precio promedio de una categoria");
                    int opcionMenuCliente = scanner2.nextInt();
                    switch (opcionMenuCliente) {
                        case 1:
                            System.out.println("Usted selecciono listar los productos por precios");
                            cliente.listarProductosPorPrecios(productos);
                            continue;
                        case 2:
                            System.out.println("Usted selecciono obtener el producto mas caro");
                            cliente.obtenerProductoMasCaro(productos);
                            continue;
                        case 3:
                            System.out.println("Usted selecciono obtener el producto mas barato");
                            cliente.obtenerProductoMasBarato(productos);
                            continue;
                        case 4:
                            System.out.println("Usted selecciono listar los productos por orden alfabetico");
                            cliente.listarProductosOrdenAlfabetico(productos);
                            continue;
                        case 5:
                            System.out.println("Usted selecciono calcular el precio promedio de una categoria");
                            System.out.println("Ingrese el nombre de la categoria: ");
                            String cat = scanner3.next();
                            cliente.calcularPrecioPromedioPorCategoria(productos, cat);
                        default:
                            continue;
                    }
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }
}
