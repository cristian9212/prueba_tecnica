package pruebaTecnica.model.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pruebaTecnica.model.dao.IrolDao;
import pruebaTecnica.model.entity.Rol;
import pruebaTecnica.model.service.IRolService;



@Service
public class RolServiceImpl  implements IRolService {
	
	@Autowired
	private IrolDao rolDao;

	@Override
	@Transactional
	public Rol insertar(Rol rol) {
		
		return rolDao.save(rol) ;
	}

	@Override
	public Rol actualizar(Rol rol, int rolId) {
		
		return rolDao.save(rol);
	}

	@Override
	@Transactional
	public List<Rol> listaColaboradores() {
		
		return (List<Rol>) rolDao.findAll();
	}

	@Override
	@Transactional
	public void eliminar(int rolId) {
		
		 rolDao.deleteById(rolId);
		
	}

	@Override
	@Transactional
	public Rol finById(int rolId) {
		
		return rolDao.findById(rolId).orElse(null);
	}
	
}


