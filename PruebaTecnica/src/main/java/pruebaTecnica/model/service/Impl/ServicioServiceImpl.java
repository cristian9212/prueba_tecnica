package pruebaTecnica.model.service.Impl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pruebaTecnica.model.dao.IservicioDao;
import pruebaTecnica.model.entity.Servicio;
import pruebaTecnica.model.service.IservicioService;



@Service
public class ServicioServiceImpl implements IservicioService  {
	 
	@Autowired
	private IservicioDao servicioDao;

	@Override
	public Servicio findById(int servicioId) {
		
		return servicioDao.findById(servicioId).orElse(null);
	}
	

}
