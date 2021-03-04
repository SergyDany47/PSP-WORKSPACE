import java.util.ArrayList;

public class Casa {
	private Direccion direccion;
	private ArrayList<Habitacion> habitaciones;
	private Persona propietario;
	private Persona inquilino;

	public int getSuperficieCuadrada(ArrayList<Habitacion> habitaciones) {
		int superficieTotal = 0;
		for (int i = 0; i < habitaciones.size(); i++) {
			superficieTotal += habitaciones.get(i).getSuperficieCuadrada();
		}

		return superficieTotal;
	}

	public Casa(Direccion direccion, ArrayList<Habitacion> habitaciones, Persona propietario, Persona inquilino) {
		super();
		this.direccion = direccion;
		this.habitaciones = habitaciones;
		this.propietario = propietario;
		this.inquilino = inquilino;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public Persona getInquilino() {
		return inquilino;
	}

	public void setInquilino(Persona inquilino) {
		this.inquilino = inquilino;
	}

	@Override
	public String toString() {
		return "Casa [direccion=" + direccion + ", habitaciones=" + habitaciones + ", propietario=" + propietario
				+ ", inquilino=" + inquilino + "]";
	}

}
