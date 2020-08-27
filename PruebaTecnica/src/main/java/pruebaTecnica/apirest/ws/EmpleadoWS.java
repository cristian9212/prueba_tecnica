package pruebaTecnica.apirest.ws;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleado")
public class EmpleadoWS {

	
	
	@PostMapping("/Login")
	private String prueba() {
		return"ok";
	}
}
