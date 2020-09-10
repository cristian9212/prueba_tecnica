package pruebaTecnica.apirest.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pruebaTecnica.model.entity.Empleado;
import pruebaTecnica.model.service.IEmpleadoService;

@RestController
@RequestMapping("/empleado/")
public class EmpleadoWS {

	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@PostMapping("/registro")
	private String ingresarRegistro(@RequestBody Empleado empleado) {
		
		String mensaje;
		Empleado  perfilEmpleado = empleadoService.ingresarRegistro(empleado);
		
		if(perfilEmpleado.getFechaNaciemto()== empleado.getFechaCreacion()) {
			mensaje="Edad correcta";
		}
		else {
	    mensaje="Edad incorrecta";
	
		}
		return mensaje;
      }
	
	@PostMapping("/ingresar")
	private String iniciarSecion(@RequestBody  String correo, String password) {
		
		String mensaje;
		Empleado empleado = empleadoService.iniciarSecion(correo,password);
			
			if(empleado.getCorreo()== correo && empleado.getPassword()==password) {
			mensaje="Su registro fue exitoso";
			
		}else {
			mensaje="Su usuario o contraseña no coinciden";
		}
	      return mensaje;	
	}
}
