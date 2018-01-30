package packSupermercado;

import java.time.LocalDate;
import java.util.List;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Obtener la instancia de supermercado
		Supermercado supermercado = Supermercado.getSupermercado();
		
		// Añadir algunos productos
		supermercado.addProducto(new Producto("Producto1", "Sec1", 5.5f, LocalDate.of(2017,12,12)));
		supermercado.addProducto(new Producto("Producto2", "Sec1", 3.1f, LocalDate.of(2018,12,12)));
		supermercado.addProducto(new Producto("Producto3", "Sec2", 11f, LocalDate.of(2018,12,21)));
		
		
		// Mostrar los productos caducados
		List<Producto> caducados = supermercado.getProductosCaducados();
		for (Producto producto : caducados) {
			System.out.println(producto);
		}
		
		// TODO: Implementar el mismo comportamiento con Java 8
		
		// TODO: Obtener el precio del producto más barato por sección
		
		// TODO: Calcular la suma de los precios de todos los productos no caducados
		
		// TODO: Mostrar los productos ordenados por precio. De menor a mayor.

	}

}
