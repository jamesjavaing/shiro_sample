package cn.leepon.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**   
 * This class is used for ...   
 * @author leepon1990  
 * @version   
 *       1.0, 2016年5月30日 上午11:27:58   
 */

@Controller
@RequestMapping("/system")
public class SystemAction {
	
	@RequestMapping("/menu")
	public String viewMenu(){
		
		return "system";
	}

}
