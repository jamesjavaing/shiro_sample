package cn.leepon.action;


import javax.servlet.http.HttpServletRequest;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.leepon.exception.MyException;
import cn.leepon.service.SysUserService;

/**   
 * This class is used for ...   
 * @author leepon1990  
 * @version   
 *       1.0, 2016年5月28日 下午2:09:54   
 */

@Controller
public class LoginAction {
	
	@Autowired
	SysUserService sysUserService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request) throws Exception {
		//如果登陆失败从request中获取认证异常信息
		//shiroLoginFailure就是shiro异常类的全限定名
		String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
		//根据shiro返回的异常类路径判断
		if(exceptionClassName!=null){
			if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
				throw new MyException("账号不存在");
			} else if (IncorrectCredentialsException.class.getName().equals(
					exceptionClassName)) {
				throw new MyException("用户名/密码错误");
			}else {
				throw new Exception();//最终在异常处理器生成未知错误
			}
		}
		return "login";

	}
	
	@RequestMapping("/logout")
	public String logout(){
		
		return "login";
	}
	
}
