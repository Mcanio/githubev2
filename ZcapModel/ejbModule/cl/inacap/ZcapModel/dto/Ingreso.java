package cl.inacap.ZcapModel.dto;

import java.util.ArrayList;
import java.util.List;

public class Ingreso {
	private int rut;
	private String nombre;
	private String tipoSolicitud;
	private static List<Ingreso> ingreso = new ArrayList<>();

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoSolicitud() {
		return tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	public static List<Ingreso> getIngreso() {
		return ingreso;
	}

	public static void setIngreso(List<Ingreso> ingreso) {
		Ingreso.ingreso = ingreso;
	}

}
