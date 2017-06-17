package tutorial4.springmvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(HttpServletRequest request) {
		String name = request.getParameter("name");
		List<String> courses = getList();
		Date date = new Date();
		
		ModelAndView model = new ModelAndView("hello");
		model.addObject("name", name);
		model.addObject("courses", courses);
		model.addObject("date", date);
		return model;
	}
	
	@RequestMapping("/")
	public String homepage() {
		return "index";
	}
	
	private List<String> getList() {
		List<String> list = new ArrayList<>();
		list.add("Spring framework course");
		list.add("JSP, Servlets and JSTL");
		list.add("Java for beginners");
		list.add("Test your java skills");
		list.add("AngularJS");
		
		return list;
		
	}
}
