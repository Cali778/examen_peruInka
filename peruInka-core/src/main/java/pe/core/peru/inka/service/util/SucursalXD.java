package pe.core.peru.inka.service.util;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SucursalXD")
public class SucursalXD {
	
	private String RazonSoci;
	private String RUC;
	private String Direccion;
	private String Fono;
	public String getRazonSoci() {
		return RazonSoci;
	}
	public void setRazonSoci(String razonSoci) {
		RazonSoci = razonSoci;
	}
	public String getRUC() {
		return RUC;
	}
	public void setRUC(String rUC) {
		RUC = rUC;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getFono() {
		return Fono;
	}
	public void setFono(String fono) {
		Fono = fono;
	}
	
	
	
	

}
