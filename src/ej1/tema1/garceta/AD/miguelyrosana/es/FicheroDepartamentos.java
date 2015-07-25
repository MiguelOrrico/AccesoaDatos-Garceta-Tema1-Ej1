package ej1.tema1.garceta.AD.miguelyrosana.es;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class FicheroDepartamentos {
	private String nombreFichero;
	private File fichero;

	public FicheroDepartamentos(String nombreFichero) {
		this.nombreFichero = nombreFichero;
		this.fichero = new File(nombreFichero);
	}

	public void AnyadirDepartamento(Departamento d) throws IOException {
		DataOutputStream salida = new DataOutputStream(new FileOutputStream(this.fichero, true));

		salida.writeInt(d.getNumeroDepartamento());
		salida.writeUTF(d.getNombre());
		salida.writeUTF(d.getLocalidad());
		salida.close();

	}

	public void AnyadirDepartamento(List<Departamento> l) throws IOException {
		DataOutputStream salida = new DataOutputStream(new FileOutputStream(this.fichero, true));

		for (Departamento d : l) {
			salida.writeInt(d.getNumeroDepartamento());
			salida.writeUTF(d.getNombre());
			salida.writeUTF(d.getLocalidad());
		}
		salida.close();
	}

}
