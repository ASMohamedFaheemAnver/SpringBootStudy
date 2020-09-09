package org.freedom;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "hello";
	}
	
	// @RequestMapping("display-name")
	@RequestMapping(value="/display-name")
	public String displayName(HttpServletRequest request) {
		String firstName = request.getParameter("first_name");
		request.setAttribute("first_name", firstName);
		return "display-name";
	}
}