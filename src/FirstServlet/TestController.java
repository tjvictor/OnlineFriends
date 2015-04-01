package FirstServlet;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class TestController {
	@RequestMapping("/test/login2.do")
	public ModelAndView testLogin2(HttpServletRequest request){
		
		return new ModelAndView(new RedirectView("../View/index.jsp"));  // �����ض���ʽ��תҳ��
	}
	
	@RequestMapping("/test/login1.do")
	//@ResponseBody
	public String testLogin1(HttpServletRequest request){
		
		//return "salkdfksd";  // �����ض���ʽ��תҳ��
		return "lookView";
	}
}
