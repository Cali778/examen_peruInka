package pe.core.peru.inka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.core.peru.inka.service.util.Producto;

@Service("peruInkaProduc")
public class peruInkaProduc {
public static List<Producto> list = new ArrayList<Producto>();
	
	public void saveProducto(Producto producto){
		list.add(producto);
	}
	
	
	
	public void updateProducto(Producto productoUpdate){
		List<Producto> listTemp = new ArrayList<Producto>();
		
		for (Producto producto : list) {
			if(productoUpdate.getId().compareTo(producto.getId())==0){
				listTemp.add(productoUpdate);
			}else{
				listTemp.add(producto);
			}
		}
		list = new ArrayList<Producto>();
		list.addAll(listTemp);

	}
	
	public Producto searchProducto(Long id){
		Producto productoReturn = new Producto();
		for (Producto producto : list) {
			if(id.compareTo(producto.getId())==0){
				productoReturn = producto;
				continue;
			}
		}
		return productoReturn;
	}
	
	public void deleteProducto(Long id){
		List<Producto> listTemp = new ArrayList<Producto>();
		
		for (Producto producto : list) {
			if(id.compareTo(producto.getId())!=0){
				listTemp.add(producto);
			}
		}
		list = new ArrayList<Producto>();
		list.addAll(listTemp);
	}

	public Object findAllProducto() {
		// TODO Auto-generated method stub
		return list;
	}

}
