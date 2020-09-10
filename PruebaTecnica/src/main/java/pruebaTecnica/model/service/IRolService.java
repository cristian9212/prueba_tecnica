package pruebaTecnica.model.service;

import java.util.List;


import pruebaTecnica.model.entity.Rol;

public interface IRolService {
	
    public Rol finById(int rolId);
	
    public Rol insertar(Rol rol);
   
	public Rol actualizar(Rol rol);

	public List<Rol> listaColaboradores();

	void eliminar(int rol_id);


	
	
	
	

}
