package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import domain.Notice;
import service.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("/noticewrite.do")
	   public ModelAndView noticewrite(Notice notice) {
		noticeService.RegistNotice(notice);
		ModelAndView modelAndView = new ModelAndView("main.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/noticAll.do")
	   public ModelAndView noticView() {
		List<Notice> list = noticeService.searchAll();
		ModelAndView modelAndView = new ModelAndView("main.jsp");
		modelAndView.addObject("list", list);
		
		return modelAndView;
	}
	
	@RequestMapping("/noticedetail.do")
	   public ModelAndView noticedetailView(int id) {
		
		Notice notice = noticeService.searchById(id);
		
		
		ModelAndView modelAndView = new ModelAndView("noticedetail.jsp");
		modelAndView.addObject("notice", notice);
		
		return modelAndView;
	}
	
}
