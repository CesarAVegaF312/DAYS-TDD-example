# Pruebas Unitarias en Java con el Patrón Arrange-Act-Assert

Las pruebas unitarias son una práctica común en el desarrollo de software para verificar que unidades individuales de código (como métodos o funciones) funcionen correctamente de forma aislada. Un enfoque común para escribir pruebas unitarias es el patrón Arrange-Act-Assert (AAA), que consta de tres pasos:

1. **Arrange (Preparar)**: Configurar el entorno de prueba, incluida la creación de objetos y la configuración de datos de prueba.
2. **Act (Actuar)**: Realizar la acción que se va a probar, como llamar a un método o función.
3. **Assert (Afirmar)**: Verificar que el resultado de la acción sea el esperado, generalmente utilizando afirmaciones o aserciones.

## Ejemplos

### GestorInventario

El archivo `GestorInventario.java` contiene una clase que gestiona las operaciones de inventario, como aumentar el stock de un producto.

El archivo `GestorInventarioTest.java` contiene pruebas unitarias para la clase `GestorInventario` utilizando el patrón AAA.

### Inventario

El archivo `Inventario.java` contiene una clase que representa un inventario que contiene una lista de productos.

El archivo `InventarioTest.java` contiene pruebas unitarias para la clase `Inventario` utilizando el patrón AAA.

## Ejecución de las Pruebas

Para ejecutar las pruebas unitarias, asegúrate de tener configurado Maven en tu sistema y sigue estos pasos:

1. Clona el repositorio:

```bash
mvn test
