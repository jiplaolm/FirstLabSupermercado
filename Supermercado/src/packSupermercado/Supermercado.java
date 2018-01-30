package packSupermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private List<Producto> listaProductos;
	private static Supermercado mSupermercado = new Supermercado();

	/**
	 * Constructor privado de la clase
	 */
	private Supermercado() {
		listaProductos = new ArrayList<>();
	}

	/**
	 * getSupermercado.
	 * Método estático que devuelve la instancia única de la clase
	 * @return la instancia única
	 */
	public static Supermercado getSupermercado() {
		return mSupermercado;
	}
	
	/**
	 * addProducto.
	 * Método que añade un nuevo producto a la lista de productos disponibles en el supermercado.
	 * @param pProd
	 */
	public void addProducto(Producto pProd) {
		listaProductos.add(pProd);
	}
	
	/**
	 * getProductosCaducados
	 * @return devuelve una lista que contiene los productos del supermercado que han caducado.
	 */
	public List<Producto> getProductosCaducados() {
		// TODO: Completar la implementación del método	
		
		return null;
	}

}
