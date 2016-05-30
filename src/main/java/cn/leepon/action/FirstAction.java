package cn.leepon.action;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.leepon.po.LoginUser;


@Controller
public class FirstAction {
	//系统首页
	@RequestMapping("/first")
	public String first(Model model)throws Exception{
		
		//从shiro的session中取loginUser
		Subject subject = SecurityUtils.getSubject();
		//取身份信息
		LoginUser loginUser = (LoginUser) subject.getPrincipal();
		//通过model传到页面
		model.addAttribute("loginUser", loginUser);
		
		return "first";
	}
	
}	
