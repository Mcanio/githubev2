package cl.inacap.ZcapModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.ZcapModel.dto.Ingreso;

/**
 * Session Bean implementation class IngresoDAO
 */
@Stateless
@LocalBean
public class IngresoDAO implements IngresoDAOLocal {

    private static List<Ingreso> ingresos = new ArrayList<>();
 
	
	public void save(Ingreso ingreso) {
		// TODO Auto-generated method stub
		ingresos.add(ingreso);
		}

	@Override
	public List<Ingreso> getAll() {
		// TODO Auto-generated method stub
		return ingresos;
	}

	@Override
	public void delete(Ingreso ingreso) {
		// TODO Auto-generated method stub
		ingresos.remove(ingreso);
	}

	@Override
	public List<Ingreso> filterByTipoIngreso(String tipoSolicitud) {
		// TODO Auto-generated method stub
		return ingresos.stream().filter(i->i.getTipoSolicitud().contains(tipoSolicitud)).collect(Collectors.toList());
	}

	@Override
	public List<Ingreso> filterByNombre(String nombre) {
		// TODO Auto-generated method stub
		return ingresos.stream().filter(n->n.getTipoSolicitud().contains(nombre)).collect(Collectors.toList());
	}

}
