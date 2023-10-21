package Item1;

public class Carrito {
	
	private int fecha;
	private ItemCarrito items[] = new ItemCarrito[3];
		
		public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public ItemCarrito[] getItems() {
		return items;
	}

	public void setItems(ItemCarrito[] items) {
		this.items = items;
	}

		public static int precio(Descuento desc) {
			return 0;
		}
}
