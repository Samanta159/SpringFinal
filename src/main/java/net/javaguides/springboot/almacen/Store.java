package net.javaguides.springboot.almacen;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stores")
public class Store {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "sucursal")
	private String sucursal;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "encargado")
	private String encargado;
	
	public Store() {
		
	}
	
	public Store(String sucursal, String direccion, String encargado) {
		super();
		this.encargado = sucursal;
		this.direccion = direccion;
		this.encargado = encargado;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getencargado() {
		return encargado;
	}
	public void setencargado(String encargado) {
		this.encargado = encargado;
	}
	public String getsucursal() {
		return sucursal;
	}
	public void setsucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getdireccion() {
		return direccion;
	}
	public void setdireccion(String direccion) {
		this.direccion = direccion;
	}
}
