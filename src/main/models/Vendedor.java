package src.main.models;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import src.main.interfaces.Vendible;

public class Vendedor implements Vendible {
    public Vendedor() {
    }

    public void nuevoProducto(ArrayList<Product> productos) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        boolean salir = false;

        while(!salir) {
            System.out.println("Ingrese el nombre del producto");
            String nombre = scanner.next();
            System.out.println("Ingrese el precio del producto");
            int precio = scanner.nextInt();
            System.out.println("Ingrese la categoria del producto");
            String categoria = scanner.next();
            Product nuevoProducto = new Product(nombre, (double)precio, categoria);
            productos.add(nuevoProducto);
            System.out.println("Se agrego el producto: " + nombre + ". Con el precio $" + precio + ". Y la categoria: " + categoria + ".");
            System.out.println("Desea agregar otro producto? Si. No.");
            String continuar = scanner1.next();
            if (continuar.equals("No")) {
                salir = true;
            } else if (continuar.equals("Si")) {
                salir = false;
            } else {
                System.out.println("Opcion incorrecta. Volviendo al menu principal");
                salir = true;
            }
        }

    }

    public void modificarProducto(ArrayList<Product> productos) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto que desea modificar");
        String modificacion = scanner.next();
        boolean salir = false;

        while(!salir) {
            Iterator var9 = productos.iterator();

            while(var9.hasNext()) {
                Product product = (Product)var9.next();
                if (product.getNombre().equals(modificacion)) {
                    System.out.println("Seleccione el dato a modificar");
                    System.out.println("1 - Nombre del producto");
                    System.out.println("2 - Precio del producto");
                    System.out.println("3 - Categoria del producto");
                    System.out.println("4 - Todos los datos del producto");
                    System.out.println("5 - salir sin modificar");
                    int opcion = scanner1.nextInt();
                    String cambioNombre;
                    int cambioPrecio;
                    String cambioCat;
                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese el nuevo nombre del producto:");
                            cambioNombre = scanner.next();
                            product.setNombre(cambioNombre);
                            System.out.println("El nombre del producto ahora es: " + product.getNombre());
                            break;
                        case 2:
                            System.out.println("Ingrese el nuevo precio del producto:");
                            cambioPrecio = scanner2.nextInt();
                            product.setPrecio((double)cambioPrecio);
                            System.out.println("El precio del producto ahora es: $" + product.getPrecio());
                            break;
                        case 3:
                            System.out.println("Ingrese la nueva categoria del producto:");
                            cambioCat = scanner3.next();
                            product.setCategoria(cambioCat);
                            System.out.println("La categoria del producto ahora es: " + product.getCategoria());
                            break;
                        case 4:
                            cambioNombre = scanner.next();
                            cambioPrecio = scanner2.nextInt();
                            cambioCat = scanner3.next();
                            product.setNombre(cambioNombre);
                            product.setPrecio((double)cambioPrecio);
                            product.setCategoria(cambioCat);
                            PrintStream var10000 = System.out;
                            String var10001 = product.getNombre();
                            var10000.println("El producto ahora tiene estas caracteristicas. Nombre: " + var10001 + " Precio: $" + product.getPrecio() + " Y su categoria: " + product.getCategoria());
                    }
                }
            }

            System.out.println("Desea modificar otro producto? Si. No.");
            String continuar = scanner4.next();
            if (continuar.equals("No")) {
                salir = true;
            } else if (continuar.equals("Si")) {
                salir = false;
            } else {
                System.out.println("Opcion incorrecta. Volviendo al menu principal");
                salir = true;
            }
        }

    }

    public void eliminarProducto(ArrayList<Product> productos) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        String eliminar = scanner.next();
        boolean salir = false;

        while(!salir) {
            Iterator var6 = productos.iterator();

            while(var6.hasNext()) {
                Product product = (Product)var6.next();
                if (product.getNombre().equals(eliminar)) {
                    productos.remove(eliminar);
                    System.out.println("El producto se elimino con exito.");
                } else {
                    System.out.println("No se encontraron productos con el nombre: " + eliminar);
                }
            }

            System.out.println("Desea eliminar otro producto? Si. No.");
            String continuar = scanner1.next();
            if (continuar.equals("No")) {
                salir = true;
            } else if (continuar.equals("Si")) {
                salir = false;
            } else {
                System.out.println("Opcion incorrecta. Volviendo al menu principal");
                salir = true;
            }
        }

    }

    public void eliminarPorCat(ArrayList<Product> productos) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la categoria a eliminar");
        String eliminarCat = scanner.next();
        boolean salir = false;

        while(!salir) {
            Iterator var6 = productos.iterator();

            while(var6.hasNext()) {
                Product product = (Product)var6.next();
                if (product.getCategoria().equals(eliminarCat)) {
                    productos.remove(eliminarCat);
                    System.out.println("Se eliminaron los productos con dicha categoria.");
                } else {
                    System.out.println("No se encontraron productos con la categoria: " + eliminarCat);
                }
            }

            System.out.println("Desea eliminar otro producto? Si. No.");
            String continuar = scanner1.next();
            if (continuar.equalsIgnoreCase("no")) {
                salir = true;
            } else if (continuar.equalsIgnoreCase("si")) {
                salir = false;
            }
        }

    }
}
