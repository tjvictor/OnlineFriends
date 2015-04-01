package RequestEntry;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxRequest {
	@RequestMapping("/news/open.do")
	// @ResponseBody
	public String testLogin1(HttpServletRequest request) {
		return "NewsTemplate";
	}

	@RequestMapping("/news/menu.do")
	// @ResponseBody
	public String menuRequest(HttpServletRequest request) throws UnsupportedEncodingException {
		String index = request.getParameter("index");
		request.setCharacterEncoding("UTF-8");
		String pageName = "Exception";
		switch (index) {
		case "1":
			pageName="Main";
			break;
		case "2":
			pageName="Register";
			break;
		case "3":
			
			break;
		case "4":
			break;
		}
		return pageName;
	}
}
