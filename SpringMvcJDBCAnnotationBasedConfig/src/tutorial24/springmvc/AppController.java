package tutorial24.springmvc;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tutorial24.springmvc.DAO.AppDAOImpl;
import tutorial24.springmvc.annotationconfig.AppConfig;
import tutorial24.springmvc.model.EmployeeAddress;

@Controller
public class AppController {
	
	@RequestMapping("/")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView("index");
		List<EmployeeAddress> addresses = new ArrayList<>();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
		
		addresses = DAO.listAddresses();
		System.out.println(addresses);
		model.addObject("addresses", addresses);
		context.close();
		return model;
	}
	
	@RequestMapping("/addEmployeeAddress")
	public String addEmployeeAddress(Model model, @Valid EmployeeAddress employeeAddress, BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("employeeAddress", employeeAddress);
			return "addEmployeeAddress";
		}
		else {
			if(employeeAddress.getCityName() != null && employeeAddress.getStreetName() != null 
					&& employeeAddress.getStateName() != null) {
				
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
				AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
				
				DAO.addEmployeeAddress(employeeAddress);
				context.close();
				
				return "forward:/";
			}
			else {
				System.out.println("Loading Form");
				return "addEmployeeAddress";
			}
			
		}
	}
}
