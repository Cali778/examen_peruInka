package pe.com.peru.inka.webapp.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.core.peru.inka.service.services.peruInkaXDsucursal;
import pe.core.peru.inka.service.util.SucursalXD;

@Controller
public class sucursalXDcontroller {
	@Autowired
	private peruInkaXDsucursal peruInkaXDsucursal;
	
		@RequestMapping(value = "home/dashboardSucursal", method = RequestMethod.GET)
		public String dashboardDashboard(Model model, HttpServletRequest request) {
			model.addAttribute("listSucursalXD", peruInkaXDsucursal.findAllSucursalXD());
			return "home/dashboardSucursal";
		}

		@RequestMapping(value = "home/frmSucursal", method = RequestMethod.GET)
		public String frmSucursalXD(Model model, HttpServletRequest request) {
			model.addAttribute("sucursalXD", new SucursalXD());
			model.addAttribute("opc", "new");
			return "home/frmSucursal";
		}
		
		
		
		@RequestMapping(value = "home/saveSucursalXD", method = RequestMethod.POST)
		public String saveSucursalXD(Model model, HttpServletRequest request,@ModelAttribute("sucursalXD") SucursalXD sucursalXD) {
//			String id = request.getParameter("id");
//			String name = request.getParameter("name");
//			String lastNameP = request.getParameter("lastNameP");
			String opc = request.getParameter("opc");
			if(opc.equals("new")){
				peruInkaXDsucursal.saveSucursalXD(sucursalXD);
			}else{
				peruInkaXDsucursal.updateSucursalXD(sucursalXD);
			}
			
			return "redirect:dashboardSucursal";
		}
		
		@RequestMapping(value = "home/deleteSucursalXD", method = RequestMethod.GET)
		public String deleteSucursalXD(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
			peruInkaXDsucursal.deleteSucursalXD(id);
			return "redirect:dashboardSucursal";
		}
		
		@RequestMapping(value = "home/editSucursalXD", method = RequestMethod.GET)
		public String editSucursalXD(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
			model.addAttribute("sucursalXD", peruInkaXDsucursal.searchSucursalXD(id));
			model.addAttribute("opc", "update");
			return "home/frmSucursal";
		}
		

	}