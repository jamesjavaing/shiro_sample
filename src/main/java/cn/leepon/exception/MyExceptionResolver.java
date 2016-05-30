package cn.leepon.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * This class is used for ...
 * 
 * @author leepon1990
 * @version 1.0, 2016年5月28日 下午10:29:29
 */
public class MyExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {

		//打印异常信息
		//ex.printStackTrace();
		
		MyException exception = exceptionResolver(ex);

		// 错误页面
		String viewName = "error";

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName(viewName);
		modelAndView.addObject("message", exception.getEx());

		return modelAndView;
	}

	private MyException exceptionResolver(Exception ex) {

		MyException exception = null;
		// 如果是本系统自定义的异常直接获取
		if (ex instanceof MyException) {
			exception = (MyException) ex;
		} else {
			// 如果不是自定义的异常构造一个未知错误异常
			exception = new MyException("未知错误");
		}
		return exception;

	}

}
