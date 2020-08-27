package pruebaTecnica.model.manager;

import java.util.List;

import pruebaTecnica.model.entity.Rol;

public interface IrolManagerService {
	
	public Rol findById (int rolId);

	public Rol insertar(Rol rol);

	 public Rol actualizar(Rol rol, int rolId);

	public List<Rol> listaColaboradores();

	void eliminar(int rol_id);
	
	
  
}
