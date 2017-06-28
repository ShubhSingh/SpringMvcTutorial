package tutorial23.springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tutorial23.springmvc.DAO.AppDAOImpl;
import tutorial23.springmvc.model.EmployeeAddress;

@Controller
public class AppController {
	
	@RequestMapping("/")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView("index");
		List<EmployeeAddress> addresses = new ArrayList<>();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/tutorial23/springmvc/DAO/Spring-AppDAOConfig.xml");
		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
		
		addresses = DAO.listAddresses();
		System.out.println(addresses);
		context.close();
		return model;
	}
}
