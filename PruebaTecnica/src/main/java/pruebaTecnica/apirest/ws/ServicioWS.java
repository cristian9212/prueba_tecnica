package pruebaTecnica.apirest.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicio")
public class ServicioWS {
	
  @GetMapping("/service")
  public String  validar() {
	  return"ok";
  }

}
