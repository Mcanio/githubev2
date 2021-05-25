package cl.inacap.ZcapModel.dao;

import java.util.List;
import javax.ejb.Local;
import cl.inacap.ZcapModel.dto.Ingreso;
@Local
public interface IngresoDAOLocal {

	void save(Ingreso ingreso);

	List<Ingreso> getAll();

	void delete(Ingreso ingreso);

	List<Ingreso> filterByTipoIngreso(String TipoSolicitud);
	
	List<Ingreso> filterByNombre(String nombre);
}
