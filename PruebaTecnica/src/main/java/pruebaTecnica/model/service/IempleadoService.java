package pruebaTecnica.model.service;

import java.util.List;

import pruebaTecnica.model.entity.Empleado;


public interface IempleadoService {
	
	public Empleado findById(int empleadoId);

	public List<Empleado> nuevo();
}
