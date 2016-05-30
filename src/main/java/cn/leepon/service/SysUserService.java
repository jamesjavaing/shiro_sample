package cn.leepon.service;

import java.util.List;

import cn.leepon.po.SysPermission;
import cn.leepon.po.SysUser;

/**   
 * This class is used for ...   
 * @author leepon1990  
 * @version   
 *       1.0, 2016年5月27日 下午5:00:04   
 */
public interface SysUserService {

	SysUser findSysUserByUserName(String username);

	List<SysPermission> findMenuListByUserId(String id);

	List<SysPermission> findPermissionListByUserId(String id);   


}
