package video.video.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String usertypeid;
	private String name;
	private String sex;
	private String password;
	private String phone;
	private String wechat;
	private String qq;
	private String mycontent;
	private String isshow;
	
	public User(){}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsertypeid() {
		return usertypeid;
	}

	public void setUsertypeid(String usertypeid) {
		this.usertypeid = usertypeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMycontent() {
		return mycontent;
	}

	public void setMycontent(String mycontent) {
		this.mycontent = mycontent;
	}

	public String getIsshow() {
		return isshow;
	}

	public void setIsshow(String isshow) {
		this.isshow = isshow;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", usertypeid=" + usertypeid + ", name="
				+ name + ", sex=" + sex + ", password=" + password + ", phone="
				+ phone + ", wechat=" + wechat + ", qq=" + qq + ", mycontent="
				+ mycontent + ", isshow=" + isshow + "]";
	}
	
}