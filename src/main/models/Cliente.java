package src.main.models;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import src.main.interfaces.Listable;

public class Cliente implements Listable {
    public Cliente() {
    }

    public void listarProductos(ArrayList<Product> productos) {
        System.out.println("Listado de Productos");
        Iterator var2 = productos.iterator();

        while(var2.hasNext()) {
            Product product = (Product)var2.next();
            System.out.println("Nombre: " + product.getNombre());
            System.out.println("Precio: $" + product.getPrecio());
            System.out.println("Categoria: " + product.getCategoria());
            System.out.println(" ");
        }

    }

    public void listarProductosPorPrecios(ArrayList<Product> productos) {
        Collections.sort(productos, Comparator.comparingDouble((p) -> {
            return -p.getPrecio();
        }));
        System.out.println("Listado de productos por precio (de mayor a menor):");
        Iterator var2 = productos.iterator();

        while(var2.hasNext()) {
            Product producto = (Product)var2.next();
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Categoría: " + producto.getCategoria());
            System.out.println(" ");
        }

    }

    public Product obtenerProductoMasCaro(ArrayList<Product> productos) {
        Product productoMasCaro = null;
        double precioMasCaro = Double.MIN_VALUE;
        Iterator var5 = productos.iterator();

        while(var5.hasNext()) {
            Product producto = (Product)var5.next();
            if (producto.getPrecio() > precioMasCaro) {
                precioMasCaro = producto.getPrecio();
                productoMasCaro = producto;
            }
        }

        PrintStream var10000 = System.out;
        String var10001 = productoMasCaro.getNombre();
        var10000.println("El precio del producto mas caro es :" + var10001 + " y su precio es: $" + productoMasCaro.getPrecio());
        return productoMasCaro;
    }

    public Product obtenerProductoMasBarato(ArrayList<Product> productos) {
        Product productoMasBarato = null;
        double precioMasBajo = Double.MAX_VALUE;
        Iterator var5 = productos.iterator();

        while(var5.hasNext()) {
            Product producto = (Product)var5.next();
            if (producto.getPrecio() < precioMasBajo) {
                precioMasBajo = producto.getPrecio();
                productoMasBarato = producto;
            }
        }

        PrintStream var10000 = System.out;
        String var10001 = productoMasBarato.getNombre();
        var10000.println("El precio del producto mas barato es :" + var10001 + " y su precio es: $" + productoMasBarato.getPrecio());
        return productoMasBarato;
    }

    public void listarProductosOrdenAlfabetico(ArrayList<Product> productos) {
        Collections.sort(productos, Comparator.comparing((p) -> {
            return p.getNombre();
        }));
        System.out.println("Listado de productos en orden alfabético:");
        Iterator var2 = productos.iterator();

        while(var2.hasNext()) {
            Product producto = (Product)var2.next();
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Categoría: " + producto.getCategoria());
            System.out.println(" ");
        }

    }

    public double calcularPrecioPromedioPorCategoria(ArrayList<Product> productos, String categoria) {
        double totalPrecio = 0.0;
        int cantidadProductos = 0;
        Iterator var6 = productos.iterator();

        while(var6.hasNext()) {
            Product producto = (Product)var6.next();
            if (producto.getCategoria().equalsIgnoreCase(categoria)) {
                totalPrecio += producto.getPrecio();
                ++cantidadProductos;
            }
        }

        if (cantidadProductos > 0) {
            System.out.println("El precio total es de: $" + totalPrecio + " y la cantidad de productos es de: " + cantidadProductos);
            return totalPrecio / (double)cantidadProductos;
        } else {
            return 0.0;
        }
    }
}

