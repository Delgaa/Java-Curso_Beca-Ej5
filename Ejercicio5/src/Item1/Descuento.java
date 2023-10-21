package Item1;

import java.time.LocalDateTime;

public class Descuento {
	
	private LocalDateTime comienzo;
	private LocalDateTime fin;
	
	public static int descuento(int base) {
		return 0;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	public LocalDateTime getComienzo() {
		return comienzo;
	}

	public void setComienzo(LocalDateTime comienzo) {
		this.comienzo = comienzo;
	}
}
