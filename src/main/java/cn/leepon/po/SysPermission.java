package cn.leepon.po;

import lombok.Data;

@Data
public class SysPermission {
	
	
	private Integer id;

    private String name;

    private String type;

    private String url;

    private String permissioncode;

    private Integer parentid;

    private Integer sort;

    private String available;

}