public class GestorInventario {
    private Inventario inventario;

    public GestorInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public void aumentarStock(String codigo, int cantidad) {
        Producto producto = inventario.buscarProductoPorCodigo(codigo);
        if (producto != null) {
            producto.setCantidad(producto.getCantidad() + cantidad);
        }
    }
}
