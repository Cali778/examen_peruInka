package pe.core.peru.inka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.core.peru.inka.service.util.SucursalXD;

@Service ("peruInkaXDsucursal")
public class peruInkaXDsucursal {

	
public static List<SucursalXD> list = new ArrayList<SucursalXD>();
	
	public void saveSucursalXD(SucursalXD sucursalXD){
		list.add(sucursalXD);
	}
	
	public List<SucursalXD> findAllSucursalXD(){
		return list;
	}
	
	public void updateSucursalXD(SucursalXD sucursalXDUpdate){
		List<SucursalXD> listTemp = new ArrayList<SucursalXD>();
		
		for (SucursalXD sucursalXD : list) {
			if(sucursalXDUpdate.getId().compareTo(sucursalXD.getId())==0){
				listTemp.add(sucursalXDUpdate);
			}else{
				listTemp.add(sucursalXD);
			}
		}
		list = new ArrayList<SucursalXD>();
		list.addAll(listTemp);

	}
	
	public SucursalXD searchSucursalXD(Long id){
		SucursalXD sucursalXDReturn = new SucursalXD();
		for (SucursalXD sucursalXD : list) {
			if(id.compareTo(sucursalXD.getId())==0){
				sucursalXDReturn = sucursalXD;
				continue;
			}
		}
		return sucursalXDReturn;
	}
	
	public void deleteSucursalXD(Long id){
		List<SucursalXD> listTemp = new ArrayList<SucursalXD>();
		
		for (SucursalXD sucursalXD : list) {
			if(id.compareTo(sucursalXD.getId())!=0){
				listTemp.add(sucursalXD);
			}
		}
		list = new ArrayList<SucursalXD>();
		list.addAll(listTemp);
	}
}