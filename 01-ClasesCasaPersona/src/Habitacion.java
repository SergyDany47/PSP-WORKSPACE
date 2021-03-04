public class Habitacion {

	private int superficieCuadrada;
	private String tipoHabitacion;
	private int numeroHabitacion;

	public Habitacion(int superficieCuadrada, String tipoHabitacion, int numeroHabitacion) {
		super();
		this.superficieCuadrada = superficieCuadrada;
		this.tipoHabitacion = tipoHabitacion;
		this.numeroHabitacion = numeroHabitacion;
	}

	public int getSuperficieCuadrada() {
		return superficieCuadrada;
	}

	public void setSuperficieCuadrada(int superficieCuadrada) {
		this.superficieCuadrada = superficieCuadrada;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [superficieCuadrada=" + superficieCuadrada + ", tipoHabitacion=" + tipoHabitacion
				+ ", numeroHabitacion=" + numeroHabitacion + "]";
	}

}
