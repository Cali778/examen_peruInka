package pe.core.peru.inka.service.util;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Producto")
public class Producto {
	
	private String NameProduc;
	private double Precio;
	private String Description;
	private String Atributo;
	private String status;
	private String sucursal;
	private Long id;
	
	public void setId(Long id){
		this.id = id;
	}
	public String getNameProduc(){
		return NameProduc;
	}
	public void setNameProduc(String nameProduc){
		NameProduc = nameProduc;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getAtributo() {
		return Atributo;
	}
	public void setAtributo(String atributo) {
		Atributo = atributo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
