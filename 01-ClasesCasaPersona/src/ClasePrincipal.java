import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {

		Direccion direccionPropietario1 = new Direccion("Calle", "Carlos II", 23456);
		Direccion direccionInquilino1 = new Direccion("Avenida", "Secarral", 31698);

		Persona propietario1 = new Persona("Sebas", "45456969-S", 6111116, direccionPropietario1);
		Persona inquilino1 = new Persona("Alvaro", "77777777-A", 1111111, direccionInquilino1);

		ArrayList<Habitacion> habitacionesPropietario = new ArrayList<Habitacion>();
		Habitacion cocina = new Habitacion(15, "Cocina", 1);
		Habitacion dormitorio = new Habitacion(20, "Dormitorio", 2);
		Habitacion baño = new Habitacion(10, "Baño", 3);
		Habitacion salon = new Habitacion(50, "Salon", 5);
		habitacionesPropietario.add(cocina);
		habitacionesPropietario.add(dormitorio);
		habitacionesPropietario.add(baño);
		habitacionesPropietario.add(salon);

		ArrayList<Habitacion> habitacionesInquilino = new ArrayList<Habitacion>();
		Habitacion cocina2 = new Habitacion(20, "Cocina", 1);
		Habitacion dormitorio2 = new Habitacion(25, "Dormitorio", 2);
		Habitacion baño2 = new Habitacion(15, "Baño", 3);
		Habitacion salon2 = new Habitacion(55, "Salon", 5);
		habitacionesInquilino.add(cocina2);
		habitacionesInquilino.add(dormitorio2);
		habitacionesInquilino.add(baño2);
		habitacionesInquilino.add(salon2);

		Casa casaPropietario = new Casa(direccionPropietario1, habitacionesPropietario, propietario1, inquilino1);
		int superficieCasaPropietario = casaPropietario.getSuperficieCuadrada(habitacionesPropietario);
		Casa casaInquilino = new Casa(direccionInquilino1, habitacionesInquilino, propietario1, inquilino1);
		int superficieCasaInquilino = casaInquilino.getSuperficieCuadrada(habitacionesInquilino);

		System.out.println("Las caracteristicas de la casa del propietario son: " + casaPropietario
				+ " y tiene una superficie en metros cuadrados de: " + superficieCasaPropietario);

		System.out.println("Las caracteristicas de la casa del inquilino son: " + casaInquilino
				+ " y tiene una superficie en metros cuadrados de: " + superficieCasaInquilino);

	}

}
