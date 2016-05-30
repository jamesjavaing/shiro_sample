package cn.leepon.action;

import org.apache.log4j.Logger;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**   
 * This class is used for ...   
 * @author leepon1990  
 * @version   
 *       1.0, 2016年5月30日 上午11:29:23   
 */
@Controller
@RequestMapping("/medicine")
public class MedicineAction {
	
	
	private Logger logger = Logger.getLogger(MedicineAction.class);
	
	@RequestMapping("/menu")
	public String menuView(Model model){
		
		return "medicine";
		
	}
	
	@RequestMapping("/add")
	@RequiresPermissions("medicine:add")
	public String add(Model model){
		logger.info("==========添加药品==========");
		model.addAttribute("operation", "添加药品");
		return "success";
	}
	
	@RequestMapping("/delete")
	@RequiresPermissions("medicine:delete")
	public String delete(Model model){
		logger.info("==========删除药品==========");
		model.addAttribute("operation", "删除药品");
		return "success";
	}

	
	@RequestMapping("/update")
	@RequiresPermissions("medicine:update")
	public String update(Model model){
		logger.info("==========更新药品==========");
		model.addAttribute("operation", "更新药品");
		return "success";
	}

	
	@RequestMapping("/query")
	@RequiresPermissions("medicine:query")
	public String query(Model model){
		logger.info("==========查询药品==========");
		model.addAttribute("operation", "查询药品");
		return "success";
	}


}
