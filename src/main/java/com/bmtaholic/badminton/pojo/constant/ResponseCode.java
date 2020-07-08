package com.bmtaholic.badminton.pojo.constant;

public enum ResponseCode {
	SUCCESS("000000", "成功"), 
	ARG_ERROR("SYS000001", "参数错误"), 
	BIZ_NOREGISTER("BIZ100000", "尚未注册"),
	BIZ_NOJOINGYM("BIZ100001", "尚未加入球馆"),
    BIZ_ADDSITEERR("BIZ100100", "添加球场失败"),
    BIZ_ADDUSERERR("BIZ100101", "添加用户失败"),
    BIZ_ADDBOOKERR("BIZ100411", "添加预定失败"),
    BIZ_LOGINERR("BIZ100102", "登录失败"),
    BIZ_NOINFOERR("BIZ100103", "查询失败"),
    BIZ_REGISTEREDERR("BIZ100104", "注册失败");
    ;
	//错误代码
	private String code;
	//错误内容
	private String desc;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	ResponseCode(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}

