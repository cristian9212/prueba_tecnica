package pruebaTecnica.model.manager.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pruebaTecnica.model.entity.Rol;
import pruebaTecnica.model.manager.IrolManagerService;
import pruebaTecnica.model.service.IRolService;

@Service
public class RolManagerServiceImpl implements IrolManagerService {
	
	@Autowired
	private IRolService rolService;

	@Override
	public Rol insertar(Rol rol) {
	
		return rolService.insertar(rol);
	}

	@Override

	public Rol actualizar(Rol rol, int rolId) {
		
          Rol role = new Rol();
		
		 role=findById(rolId);
		
		role.setRolId(rol.getRolId());
		role.setNombre_rol(rol.getNombre_rol());
		role.setFechaCreacion(rol.getFechaCreacion());
		role.setFechaUltimaModificacion(rol.getFechaUltimaModificacion());
		
	
		return rolService.actualizar(role, rolId) ;
	}

	@Override
	public List<Rol> listaColaboradores() {
		
		return rolService.listaColaboradores() ;
	}

	@Override
	public void eliminar(int rolId) {
		rolService.eliminar(rolId);
		
	}

	@Override
	public Rol findById(int rolId) {
		
		return rolService.finById(rolId);
	}

}
