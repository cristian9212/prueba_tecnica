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
@Table(name="cd_servicio")
public class Servicio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name="servicio_id")
  private int servicioId;
   
   @Column(name="nombre_cliente")
  private String  nombreCliente;
  
  private String direcion;
  
  @Column(name="fecha")
  @Temporal(TemporalType.TIMESTAMP)
  private  Date Fecha;
  
  @Column(name="horas") 
  private int hora;
  
  private String descripcion;
  
  @Column(name="fecha_creacion")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaCreacion;
  
  private String estado;
  
  @Column(name="empleado_id")
  private int empleadoId;

public int getServicio_id() {
	return servicioId;
}

public void setServicio_id(int servicio_id) {
	this.servicioId = servicio_id;
}

public String getNombre_cliente() {
	return nombreCliente;
}

public void setNombre_cliente(String nombre_cliente) {
	this.nombreCliente = nombre_cliente;
}

public String getDirecion() {
	return direcion;
}

public void setDirecion(String direcion) {
	this.direcion = direcion;
}

public Date getFecha() {
	return Fecha;
}

public void setFecha(Date fecha) {
	Fecha = fecha;
}

public int getHoras() {
	return hora;
}

public void setHoras(int horas) {
	hora = horas;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public Date getFechaCreacion() {
	return fechaCreacion;
}

public void setFechaCreacion(Date fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

public int getEmpleado_id() {
	return empleadoId;
}

public void setEmpleado_id(int empleado_id) {
	this.empleadoId = empleado_id;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
  
  
}
