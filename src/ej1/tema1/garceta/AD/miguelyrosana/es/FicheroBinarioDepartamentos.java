package ej1.tema1.garceta.AD.miguelyrosana.es;

import java.io.IOException;
import java.util.ArrayList;

public class FicheroBinarioDepartamentos {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Departamento d = new Departamento(1, "Contabilidad", "Murcia");
		System.out.println(d);
		FicheroDepartamentos f = new FicheroDepartamentos("dep.data");
		try {
			f.AnyadirDepartamento(d);
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<Departamento> listaDepartamentos = new ArrayList<Departamento>();

		listaDepartamentos.add(d);
		listaDepartamentos.add(d);
		listaDepartamentos.add(d);
		listaDepartamentos.add(d);
		listaDepartamentos.add(d);
		listaDepartamentos.add(d);
		FicheroDepartamentos f2 = new FicheroDepartamentos("deplista.data");
		try {
			f2.AnyadirDepartamento(listaDepartamentos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
