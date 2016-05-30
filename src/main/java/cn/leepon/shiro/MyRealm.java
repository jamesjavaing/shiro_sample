package cn.leepon.shiro;

import java.util.ArrayList;
import java.util.List;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import cn.leepon.po.LoginUser;
import cn.leepon.po.SysPermission;
import cn.leepon.po.SysUser;
import cn.leepon.service.SysUserService;


/**   
 * This class is used for ...   
 * @author leepon1990  
 * @version   
 *       1.0, 2016年5月27日 下午4:09:44   
 */
public class MyRealm extends AuthorizingRealm {  
	
	@Override
	public void setName(String name) {
		super.setName("myRealm");
	}

	@Autowired
	SysUserService sysUserService;
	
	 /** 
     * 验证当前登录的Subject 
     */  
    @Override  
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
    	//token为用户输入的用户名和密码
    	String username = (String)token.getPrincipal();
    	
    	//根据用户输入的username从数据库查询
		SysUser sysUser =null; 
		try {
			sysUser = sysUserService.findSysUserByUserName(username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		// 如果查询不到返回null
		if(sysUser==null){//
			return null;
		}
		String password = sysUser.getPassword();
		//盐
		//String salt = sysUser.getSalt();

		LoginUser loginUser = new LoginUser();
		
		loginUser.setId(sysUser.getId());
		loginUser.setUsername(sysUser.getUsername());
		
		//根据用户id取出菜单
		List<SysPermission> menus  = sysUserService.findMenuListByUserId(sysUser.getId());
		//设置用户菜单
		loginUser.setMenus(menus);

		//将loginUser设置simpleAuthenticationInfo
		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(loginUser, password, this.getName());
		
		return simpleAuthenticationInfo;  
        
    }  

    
    
    /** 
     * 为当前登录的Subject授予角色和权限 
     */  
    @Override  
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals){
    	
    	//从 principals获取主身份信息
		//将getPrimaryPrincipal方法返回值转为真实身份类型
		LoginUser loginUser =  (LoginUser) principals.getPrimaryPrincipal();
		
		//根据身份信息获取权限信息
		//从数据库获取到权限数据
		List<SysPermission> permissionList = null;
		try {
			permissionList = sysUserService.findPermissionListByUserId(loginUser.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//单独定一个集合对象 
		List<String> permissions = new ArrayList<String>();
		if(permissionList!=null){
			for(SysPermission sysPermission:permissionList){
				permissions.add(sysPermission.getPermissioncode());
			}
		}
		
		//查到权限数据并返回授权信息
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		
		simpleAuthorizationInfo.addStringPermissions(permissions);

		return simpleAuthorizationInfo;
 
    }  
}