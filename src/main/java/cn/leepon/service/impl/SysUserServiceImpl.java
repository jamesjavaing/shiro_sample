package cn.leepon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.leepon.mapper.SysUserMapper;
import cn.leepon.po.SysPermission;
import cn.leepon.po.SysUser;
import cn.leepon.service.SysUserService;

/**   
 * This class is used for ...   
 * @author leepon1990  
 * @version   
 *       1.0, 2016年5月27日 下午5:00:33   
 */
@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Autowired
	SysUserMapper sysUserMapper;

	@Override
	public SysUser findSysUserByUserName(String username) {
		return sysUserMapper.findSysUserByUserName(username);
	}

	@Override
	public List<SysPermission> findMenuListByUserId(String id) {
		return sysUserMapper.findMenuListByUserId(id);
	}

	@Override
	public List<SysPermission> findPermissionListByUserId(String id) {
		return sysUserMapper.findPermissionListByUserId(id);
	}

	
}
