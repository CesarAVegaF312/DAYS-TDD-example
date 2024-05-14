import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import edu.unisabana.tdd.*;

public class GestorInventarioTest {

    @Test
    public void aumentarStock_deberiaIncrementarCantidadProducto() {
        // Arrange
        Inventario inventario = new Inventario();
        Producto producto = new Producto("001", "Camisa", 20.99, 10);
        inventario.agregarProducto(producto);
        GestorInventario gestor = new GestorInventario(inventario);

        // Act
        gestor.aumentarStock("001", 5);

        // Assert
        Producto productoActualizado = inventario.buscarProductoPorCodigo("001");
        assertNotNull(productoActualizado);
        assertEquals(15, productoActualizado.getCantidad());
    }
}
