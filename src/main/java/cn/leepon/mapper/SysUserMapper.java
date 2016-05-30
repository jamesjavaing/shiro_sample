package cn.leepon.mapper;

import java.util.List;

import cn.leepon.po.SysPermission;
import cn.leepon.po.SysUser;

/**   
 * This class is used for ...   
 * @author leepon1990  
 * @version   
 *       1.0, 2016年5月28日 下午9:28:18   
 */
public interface SysUserMapper {

	List<SysPermission> findMenuListByUserId(String id);

	List<SysPermission> findPermissionListByUserId(String id);

	SysUser findSysUserByUserName(String username);   

}
