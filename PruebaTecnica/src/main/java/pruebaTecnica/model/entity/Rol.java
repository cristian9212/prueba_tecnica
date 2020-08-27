package pruebaTecnica.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="cd_rol")
public class Rol implements Serializable {
		
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

 @Id
 @GeneratedValue( strategy = GenerationType.SEQUENCE,generator ="ROL_S")
 @SequenceGenerator(sequenceName = "cd_rol_sec",allocationSize = 1,name = "ROL_S")
 @Column (name="rol_id")
 private int rolId;
 
 @Column(name="nombre_id")
 private  String nombreRol;
 
 @Column(name="fecha_creacion")
 @Temporal(TemporalType.TIMESTAMP)
 private  Date fechaCreacion; 
 
 @Column(name="fecha_ultima_modificacion")
 @Temporal (TemporalType.TIMESTAMP)
 private Date fechaUltimaModificacion;

public int getRolId() {
	return rolId;
}

public void setRolId(int rolId) {
	this.rolId = rolId;
}

public String getNombre_rol() {
	return nombreRol;
}

public void setNombre_rol(String nombre_rol) {
	this.nombreRol = nombre_rol;
}

public Date getFechaCreacion() {
	return fechaCreacion;
}

public void setFechaCreacion(Date fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
}

public Date getFechaUltimaModificacion() {
	return fechaUltimaModificacion;
}

public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
	this.fechaUltimaModificacion = fechaUltimaModificacion;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

 
}
