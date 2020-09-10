package pruebaTecnica.apirest.ws;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pruebaTecnica.model.entity.Rol;
import pruebaTecnica.model.manager.IrolManagerService;


@RestController
@RequestMapping("/rol")
public class RolWS {
	
	@Autowired
	private IrolManagerService rolManagerService;
	
	/**
	 * Insertar rol
	 */
	
  @PostMapping("/agregar")
  public String  agregarRol(@RequestBody Rol rol) {
	  return rolManagerService.insertar(rol);
  }
  /**
   * consultar
   */
  
  @GetMapping("/consultar/{id}")
  public Rol consultarRol(@PathVariable int id ) {
	  return rolManagerService.findById(id);
  }
  
  /**
   * Actualizar 
   */
  
  @PutMapping("/actualizar/{id}")
  public Rol actulizarRol(@RequestBody Rol rol, @PathVariable int id) {
	  return rolManagerService.actualizar(rol);
  }
  /**
   * Lista colaboradores 
   */
  
  @GetMapping("/Listar")
  public List<Rol> lista(){
	  return rolManagerService.listaColaboradores();
  }
  
  
 /**
  * Eliminacion 
  */
  @DeleteMapping("/eliminar/{id}")
  public String eliminarRol(@PathVariable int id) {
	      rolManagerService.eliminar(id);
	  return "Rol eliminado";
  }
}
