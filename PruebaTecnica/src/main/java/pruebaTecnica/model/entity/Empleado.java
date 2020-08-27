package pruebaTecnica.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cd_empleado")
public class Empleado  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) 
   
   @Column(name="empleado_id")
   private int empleadoId;
   
   private String nombre;
   
   private String apellido;
   
   @Column(name="fecha_nacimento")
   @Temporal(TemporalType.TIMESTAMP)
   private Date fechaNaciemto;
   
   private  int cedula;
   
   private String correo;
   
   private String direccion;
   
   private String password;
   
   @Column(name="fecha_creacion")
   @Temporal(TemporalType.TIMESTAMP)
   private Date fechaCreacion;
   
   @Column(name="fecha_ultima_modificacion")
   @Temporal(TemporalType.TIMESTAMP)
   private Date fechaUltimaModificacion;
   
   @Column(name="rol_id")
   private int rolId;

public int getEmpleado_id() {
	return empleadoId;
}

public void setEmpleado_id(int empleado_id) {
	this.empleadoId = empleado_id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public Date getFechaNaciemto() {
	return fechaNaciemto;
}

public void setFechaNaciemto(Date fechaNaciemto) {
	this.fechaNaciemto = fechaNaciemto;
}

public int getCedula() {
	return cedula;
}

public void setCedula(int cedula) {
	this.cedula = cedula;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
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

public int getRol_id() {
	return rolId;
}

public void setRol_id(int rol_id) {
	this.rolId = rol_id;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
   
   
   

}
