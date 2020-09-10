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
 @Column (name="ROL_ID")
 private int rolId;
 
 @Column(name="NOMBRE_ROL")
 private  String nombreRol;
 
 @Column(name="FECHA_CREACION")
 @Temporal(TemporalType.TIMESTAMP)
 private  Date fechaCreacion; 
 
 @Column(name="FECHA_ULTIMA_MODIFICACION")
 @Temporal (TemporalType.TIMESTAMP)
 private Date fechaUltimaModificacion;

public int getRolId() {
	return rolId;
}

public void setRolId(int rolId) {
	this.rolId = rolId;
}

public String getNombreRol() {
	return nombreRol;
}

public void setNombreRol(String nombreRol) {
	this.nombreRol = nombreRol;
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
 
 

 
}
