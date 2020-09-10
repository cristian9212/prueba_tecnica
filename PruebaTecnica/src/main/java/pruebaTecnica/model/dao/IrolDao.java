package pruebaTecnica.model.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pruebaTecnica.model.entity.Rol;

@Repository
public interface IrolDao extends CrudRepository<Rol, Integer> {


}
