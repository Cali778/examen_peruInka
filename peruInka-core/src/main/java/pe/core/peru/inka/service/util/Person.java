package pe.core.peru.inka.service.util;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Person")
public class Person {
	
	private String name;
	private String ApPaterno;
	private String ApMaterno;
	private String telefono;
	private String status;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApPaterno() {
		return ApPaterno;
	}
	public void setApPaterno(String apPaterno) {
		ApPaterno = apPaterno;
	}
	public String getApMaterno() {
		return ApMaterno;
	}
	public void setApMaterno(String apMaterno) {
		ApMaterno = apMaterno;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
