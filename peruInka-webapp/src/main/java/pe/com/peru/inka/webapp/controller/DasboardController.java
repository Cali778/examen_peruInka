package pe.com.peru.inka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.core.peru.inka.service.services.peruInkaService;

@Controller
public class DasboardController {
	@Autowired
	private peruInkaService PeruInkaService;
	
	@RequestMapping(value="home/dashBoard", method=RequestMethod.GET)
	
	public String electionsdashBoard(Model model,HttpServletRequest request){
		
		
	}

}
