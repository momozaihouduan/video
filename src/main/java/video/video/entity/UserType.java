package video.video.entity;

import java.io.Serializable;

public class UserType implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String typename;
	private String content;
	
	public UserType(){}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "UserType [id=" + id + ", typename=" + typename + ", content="
				+ content + "]";
	}

}
