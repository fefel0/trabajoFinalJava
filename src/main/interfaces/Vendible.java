package src.main.interfaces;

import java.util.ArrayList;
import src.main.models.Product;

public interface Vendible {
    void nuevoProducto(ArrayList<Product> productos);

    void modificarProducto(ArrayList<Product> productos);

    void eliminarProducto(ArrayList<Product> productos);

    void eliminarPorCat(ArrayList<Product> productos);
}
