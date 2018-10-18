package co.grandcircus.tasklist.tasklist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaskListController {
	
	@Autowired
	TaskDao taskDao;
	
	@Autowired
	UserDao userDao; 

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/submit")
	public ModelAndView submit(User user) {
		ModelAndView mav = new ModelAndView("submitView");
		
		mav.addObject("task",taskDao.findAll());
		userDao.create(user);
		return mav;
	}
	
}
