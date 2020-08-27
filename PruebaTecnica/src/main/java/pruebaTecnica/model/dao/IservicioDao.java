package pruebaTecnica.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import pruebaTecnica.model.entity.Servicio;

@Repository
public interface IservicioDao extends CrudRepository<Servicio, Integer> {

}
