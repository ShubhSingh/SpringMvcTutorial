package tutorial3.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String helloWorld(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		model.addAttribute("formName", name);
		return "hello";
	}
	
	@RequestMapping("/")
	public String homepage() {
		return "index";
	}
}
