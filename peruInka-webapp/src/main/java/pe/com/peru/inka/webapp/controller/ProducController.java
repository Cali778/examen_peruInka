package pe.com.peru.inka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.core.peru.inka.service.services.peruInkaProduc;
import pe.core.peru.inka.service.util.Producto;

@Controller
public class ProducController {
	@Autowired
	private peruInkaProduc peruInkaProduc;
	
		@RequestMapping(value = "home/dashboard", method = RequestMethod.GET)
		public String dashboardDashboard(Model model, HttpServletRequest request) {
			model.addAttribute("listProducto", peruInkaProduc.findAllProducto());
			return "home/dashboard";
		}

		@RequestMapping(value = "home/frmProduc", method = RequestMethod.GET)
		public String frmProducto(Model model, HttpServletRequest request) {
			model.addAttribute("producto", new Producto());
			model.addAttribute("opc", "new");
			return "home/frmProducto";
		}
		
		
		
		@RequestMapping(value = "home/saveProducto", method = RequestMethod.POST)
		public String saveProducto(Model model, HttpServletRequest request,@ModelAttribute("producto") Producto producto) {
//			String id = request.getParameter("id");
//			String name = request.getParameter("name");
//			String lastNameP = request.getParameter("lastNameP");
			String opc = request.getParameter("opc");
			if(opc.equals("new")){
				peruInkaProduc.saveProducto(producto);
			}else{
				peruInkaProduc.updateProducto(producto);
			}
			
			return "redirect:dashboard";
		}
		
		@RequestMapping(value = "home/deleteProducto", method = RequestMethod.GET)
		public String deleteProducto(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
			peruInkaProduc.deleteProducto(id);
			return "redirect:dashboard";
		}
		
		@RequestMapping(value = "home/editProducto", method = RequestMethod.GET)
		public String editProducto(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
			model.addAttribute("Producto", peruInkaProduc.searchProducto(id));
			model.addAttribute("opc", "update");
			return "home/frmProducto";
		}
	}


