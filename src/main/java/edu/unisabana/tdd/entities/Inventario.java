import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Producto> productos;

    public Inventario() {
        this.productos = new HashMap<>();
    }

    public void agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
    }

    public int numeroDeProductos() {
        return productos.size();
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Producto producto : productos.values()) {
            precioTotal += producto.getPrecio();
        }
        return precioTotal;
    }

    public Producto buscarProductoPorCodigo(String codigo) {
        return productos.get(codigo);
    }
}