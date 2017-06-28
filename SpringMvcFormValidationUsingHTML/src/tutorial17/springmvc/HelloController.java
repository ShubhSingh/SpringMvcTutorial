package tutorial17.springmvc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(Information userInfo) {
		
		ModelAndView model = new ModelAndView("hello");
		model.addObject("firstName", userInfo.getFirstName());
		model.addObject("lastName", userInfo.getLastName());
		model.addObject("gender", userInfo.getGender());
		model.addObject("country", userInfo.getCountry());
		model.addObject("message", userInfo.getMessage());
		model.addObject("visitedCountry", userInfo.getVisitedCountry());
		
		return model;
	}
	
	@RequestMapping("/")
	public ModelAndView homepage() {
		
		ModelAndView model = new ModelAndView("index", "info", new Information());
		Map<String, String> gender = new HashMap<>();
		gender.put("Male", "Male");
		gender.put("Female", "Female");
		model.addObject("gender", gender);
		
		Map<String, String> country = new LinkedHashMap<>();
		country.put("India", "India");
		country.put("USA", "USA");
		country.put("China", "China");
		model.addObject("countries", country);
		
		Map<String, String> visitedCountry = new LinkedHashMap<>();
		visitedCountry.put("China", "China");
		visitedCountry.put("Thailand", "Thailand");
		visitedCountry.put("Sweden", "Sweden");
		visitedCountry.put("Japan", "Japan");
		model.addObject("visitedCountry", visitedCountry);
		
		return model;
	}
}
