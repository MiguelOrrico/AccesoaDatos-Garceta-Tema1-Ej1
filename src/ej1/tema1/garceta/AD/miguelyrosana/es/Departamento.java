package ej1.tema1.garceta.AD.miguelyrosana.es;

public class Departamento {

	private int numeroDepartamento;
	private String Nombre;
	private String Localidad;

	public Departamento(int numeroDepartamento, String nombre, String localidad) {
		super();
		this.numeroDepartamento = numeroDepartamento;
		Nombre = nombre;
		Localidad = localidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Departamento [numeroDepartamento=");
		builder.append(numeroDepartamento);
		builder.append(", Nombre=");
		builder.append(Nombre);
		builder.append(", Localidad=");
		builder.append(Localidad);
		builder.append("]");
		return builder.toString();
	}

	public int getNumeroDepartamento() {
		return numeroDepartamento;
	}

	public void setNumeroDepartamento(int numeroDepartamento) {
		this.numeroDepartamento = numeroDepartamento;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getLocalidad() {
		return Localidad;
	}

	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}

}
