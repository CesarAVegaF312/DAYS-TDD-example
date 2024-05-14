import static org.junit.Assert.*;
import org.junit.Test;

public class InventarioTest {
    
    @Test
    public void testAgregarProducto() {
        // Arrange
        Inventario inventario = new Inventario();
        Producto producto = new Producto("001", "Camisa", 20.99, 1);

        // Act
        inventario.agregarProducto(producto);

        // Assert
        assertEquals(1, inventario.numeroDeProductos());
    }
    
    @Test
    public void testCalcularPrecioTotal() {
        // Arrange
        Inventario inventario = new Inventario();

        // Act
        inventario.agregarProducto(new Producto("001", "Camisa", 20.99, 1));
        inventario.agregarProducto(new Producto("002", "Pantalón", 29.99, 1));

        // Assert
        assertEquals(50.98, inventario.calcularPrecioTotal(), 0.01);
    }
    
    @Test
    public void testBuscarProductoPorCodigo() {
        // Arrange
        Inventario inventario = new Inventario();
        Producto camisa = new Producto("001", "Camisa", 20.99, 1);

        // Act
        inventario.agregarProducto(camisa);
        
        // Assert
        assertEquals(camisa, inventario.buscarProductoPorCodigo("001"));
    }
}
