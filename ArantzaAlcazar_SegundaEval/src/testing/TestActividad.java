package testing;

import javabean.Familia;
import javabean.Producto;
import javabean.Proveedor;
import negocio.CatalogoProductosImpl;


public class TestActividad {
	
	private static CatalogoProductosImpl cprod; 
	
	static {
		cprod = new CatalogoProductosImpl();
	}
	

	public static void main(String[] args) {	
		buscarPorUno();
		buscarTodos();
		productosPorFamilia();
		productosPorPrecioMayorQue();
		productosPorDescripcionLarga();
		productosPorProveedor();	
		
		System.out.println("\nFIN DE PROGRAMA");
	}
	
	public static void buscarPorUno() {
		System.out.println("\nBUSCAR POR UNO");
		System.out.println("Me espero el producto 1 : " + cprod.buscarUno(1));
		System.out.println("No existe el producto 11 (obtengo null): " + cprod.buscarUno(11));
		}
		/*ESTO LO PUSE EN EL EXAMEN
		 * for (Producto producto:cprod.buscarUno(5)) {
			System.out.println(producto);
		}*/

	
	public static void buscarTodos() {
		System.out.println("\nBUSCAR TODOS");
		for (Producto producto: cprod.buscarTodos()) {
			System.out.println(producto);
		}
		
		System.out.println("\nBUSCAR TODOS (con foreach)");
		cprod.buscarTodos().forEach(System.out::println);
	}
	
	public static void productosPorFamilia() {
		System.out.println("\nBUSCAR POR FAMILIA (la 4 no existe)");
		int cont = 0;
		for (Producto producto: cprod.productosPorFamilia(4)) {
			System.out.println(producto);
			cont ++;
		}
		if (cont == 0)
			System.out.println("No hay productos de esta familia o la familia no existe");
	}
	
		public static void productosPorPrecioMayorQue() {
		System.out.println("\nLISTADO POR PRECIO MAYOR (> 55)");
		for (Producto producto: cprod.productosPorPrecioMayorQue(55.00)) {
			System.out.println(producto);
		} 
	}
	
	public static void productosPorDescripcionLarga() {
		System.out.println("\nLISTADO  POR DESCRIPTCION (mujer)");
		for (Producto producto: cprod.productosPorDescripcionLarga("mujer")) {
			System.out.println(producto);
		}
	}
		
	public static void productosPorProveedor() {
		System.out.println("\nLISTADO POR PROVEEDOR (102)");
		int cont = 0;
		for (Producto producto: cprod.productosPorProveedor("102")) {
			System.out.println(producto);
			cont ++;
		}
		if (cont == 0)
			System.out.println("No hay productos de este proveedor o este proveedor no existe");	
	}
}

