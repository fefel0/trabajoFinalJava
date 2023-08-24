package src.main.interfaces;

import java.util.ArrayList;
import src.main.models.Product;

public interface Listable {
    void listarProductos(ArrayList<Product> productos);

    void listarProductosPorPrecios(ArrayList<Product> productos);

    Product obtenerProductoMasCaro(ArrayList<Product> productos);

    Product obtenerProductoMasBarato(ArrayList<Product> productos);

    void listarProductosOrdenAlfabetico(ArrayList<Product> productos);

    double calcularPrecioPromedioPorCategoria(ArrayList<Product> var1, String var2);
}