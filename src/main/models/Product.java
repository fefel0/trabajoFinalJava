package src.main.models;

public class Product {
    private String nombre;
    private double precio;
    private long stock;
    private String categoria;

    public Product(String nombre, int precio, long stock, String categoria) {
        this.nombre = nombre;
        this.precio = (double)precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public Product(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public long getStock() {
        return this.stock;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
