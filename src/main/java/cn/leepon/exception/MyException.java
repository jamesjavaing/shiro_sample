package cn.leepon.exception;
/**   
 * This class is used for ...   
 * @author leepon1990  
 * @version   
 *       1.0, 2016年5月28日 下午10:22:44   
 */
public class MyException extends Exception {

	/** 
	 * @Fields serialVersionUID : TODO 
	 */ 
	
	private static final long serialVersionUID = 5616733098757682437L;
	
	private String ex;
	
	public MyException(){}
	
	public MyException(String ex){
		this.ex = ex;
	}

	public String getEx() {
		return ex;
	}

	public void setEx(String ex) {
		this.ex = ex;
	}
	
	
	
}
