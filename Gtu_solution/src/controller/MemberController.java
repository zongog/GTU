package controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.Member;
import service.Member_Service;

@Controller
public class MemberController {

	@Autowired
	private Member_Service service;

	@RequestMapping("/")
	public String showlogin() {
		return "login.jsp";
	}

	@RequestMapping("/main")
	public String showmain(HttpServletRequest req) {
		HttpSession session = req.getSession();

		if (session == null || session.getAttribute("loginedUser") == null) {
			return new String("redirect:login.do");
		}
		return "main.jsp";
	}

	@RequestMapping("/login.do")
	public String showlogin2() {
		return "login.jsp";
	}

	@RequestMapping("/joincpa.do")
	public String showJoincpa() {
		return "joincpa.jsp";
	}

	@RequestMapping(value = "/joincpa.do", method = RequestMethod.POST)
	public String join(Member member) { // 같은 이름으로 매핑 다른이름일 경우 데이터만 안들어가고 에러는 안난다.

		boolean registered = service.register(member);

		if (!registered) {
			return "redirect:joincpa.do";
		}

		return "login.jsp";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(Member member, HttpServletRequest req) {

		Member loginedUser = service.login(member);

		if (loginedUser != null) {
			HttpSession session = req.getSession();
			session.setAttribute("loginedUser", loginedUser);
		} else {
			HttpSession session = req.getSession();
			session.invalidate();
			return "login.jsp";
		}

		return "redirect:main";
	}
	
	@RequestMapping("/logout.do")
	public String showlogout(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.invalidate();
		return "redirect:login.do";
	}
	
	@RequestMapping("/findid.do")
	public String showfindid(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.invalidate();
		return "findid.jsp";
	}


	@RequestMapping("/joinea.do")
	public String showJoinea() {
		return "joinea.jsp";
	}

	@RequestMapping("/joinveteran.do")
	public String showJoinveteran() {
		return "joinveteran.jsp";
	}

	@RequestMapping("/join.do")
	public String showJoin() {
		return "join.jsp";
	}

}
