package pruebaTecnica.model.service;

import java.util.List;

import pruebaTecnica.model.entity.Empleado;


public interface IEmpleadoService {
	
	public Empleado findById(int empleadoId);

	public List<Empleado> nuevo();

	public Empleado ingresarRegistro(Empleado empleado);

	public Empleado iniciarSecion(String correo, String password);
}
