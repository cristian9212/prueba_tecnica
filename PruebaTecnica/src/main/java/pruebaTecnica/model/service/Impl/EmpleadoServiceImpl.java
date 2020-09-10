package pruebaTecnica.model.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pruebaTecnica.model.dao.IempleadoDao;
import pruebaTecnica.model.entity.Empleado;
import pruebaTecnica.model.service.IEmpleadoService;



@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	public IempleadoDao empleadoDao;

	@Override
	public Empleado findById(int empleadoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> nuevo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado ingresarRegistro(Empleado empleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado iniciarSecion(String correo, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	
	
