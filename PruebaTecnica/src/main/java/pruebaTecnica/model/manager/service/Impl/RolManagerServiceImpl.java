package pruebaTecnica.model.manager.service.Impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pruebaTecnica.model.entity.Rol;
import pruebaTecnica.model.manager.IrolManagerService;
import pruebaTecnica.model.service.IRolService;


@Service
public class RolManagerServiceImpl implements IrolManagerService {
	
	@Autowired
	private IRolService rolService ;
	
	@Override
	public String insertar(Rol rol) {
		
		Date fechaActual= new Date(); 
		rol.setFechaCreacion(fechaActual);	
		String mensaje;
	    Rol validarRol = rolService.insertar(rol);
	    
	   if(validarRol.getNombreRol()==rol.getNombreRol()){
		  mensaje="Ya exite el nombre Rol";
	   }else {
		   mensaje = "Se inserto un resgistro";
	   }
	
	    return mensaje;     
	}
	
	@Override
	public Rol actualizar(Rol rol) {
		
         Rol role = new Rol();
        Date modificacionFecha = new Date();		
		role.setRolId(rol.getRolId());
		role.setNombreRol(rol.getNombreRol());
	    role.setFechaCreacion(rol.getFechaCreacion());
	    role.setFechaUltimaModificacion(modificacionFecha);
		
		return rolService.actualizar(role) ;
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
	public Rol findById(int id) {
		
		return rolService.finById(id);
	}

}
