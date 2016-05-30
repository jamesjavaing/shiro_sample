package cn.leepon.po;

import java.util.List;

public class LoginUser {
	
	private String id;
	
	private String username;// 用户名称

	private List<SysPermission> menus;// 菜单
	
	private List<SysPermission> permissions;// 权限

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<SysPermission> getMenus() {
		return menus;
	}

	public void setMenus(List<SysPermission> menus) {
		this.menus = menus;
	}

	public List<SysPermission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<SysPermission> permissions) {
		this.permissions = permissions;
	}

	
}
