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
@Table(name="cd_empleado")
public class Empleado  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "EMPLEADO_S") 
   @SequenceGenerator(sequenceName = "cd_empleado_sec",allocationSize = 1, name= "EMPLEADO_S")
   
   @Column(name="EMPLEADO_ID")
   private int empleadoId;
   
   
   private String NOMBRE;
   
   private String APELLIDO;
   
   @Column(name="FECHA_NACIMIENTO")
   @Temporal(TemporalType.TIMESTAMP)
   private Date FECHANACIMIENTO;
   
   private  int CEDULA;
   
   private String CORREO;
   
   private String DIRECCION;
   
   private String PASSWORD;
   
   @Column(name="FECHA_CREACION")
   @Temporal(TemporalType.TIMESTAMP)
   private Date fechaCreacion;
   
   @Column(name="FECHA_ULTIMA_MODIFICACION")
   @Temporal(TemporalType.TIMESTAMP)
   private Date fechaUltimaModificacion;
   
   @Column(name="ROL_ID")
   private int rolId;

public int getEmpleado_id() {
	return empleadoId;
}

public void setEmpleado_id(int empleado_id) {
	this.empleadoId = empleado_id;
}

public String getNombre() {
	return NOMBRE;
}

public void setNombre(String nombre) {
	this.NOMBRE = nombre;
}

public String getApellido() {
	return APELLIDO;
}

public void setApellido(String apellido) {
	this.APELLIDO = apellido;
}

public Date getFechaNaciemto() {
	return FECHANACIMIENTO;
}

public void setFechaNaciemto(Date fechaNaciemto) {
	this.FECHANACIMIENTO = fechaNaciemto;
}

public int getCedula() {
	return CEDULA;
}

public void setCedula(int cedula) {
	this.CEDULA = cedula;
}

public String getCorreo() {
	return CORREO;
}

public void setCorreo(String correo) {
	this.CORREO = correo;
}

public String getDireccion() {
	return DIRECCION;
}

public void setDireccion(String direccion) {
	this.DIRECCION = direccion;
}

public String getPassword() {
	return PASSWORD;
}

public void setPassword(String password) {
	this.PASSWORD = password;
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
