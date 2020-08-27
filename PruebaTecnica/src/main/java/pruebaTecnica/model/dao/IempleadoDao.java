package pruebaTecnica.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import pruebaTecnica.model.entity.Empleado;

@Repository
public interface IempleadoDao extends CrudRepository<Empleado, Integer> {

}
