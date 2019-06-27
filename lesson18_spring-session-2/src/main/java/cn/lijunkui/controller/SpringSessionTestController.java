package cn.lijunkui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SpringSessionTestController {
	@RequestMapping("/add/{name}")
	public String addSession(HttpServletRequest request,@PathVariable("name") String name){
		HttpSession session = request.getSession();
		session.setAttribute("name",name);
		return "sessionId:"+session.getId()+" name:"+name;
	}
}
