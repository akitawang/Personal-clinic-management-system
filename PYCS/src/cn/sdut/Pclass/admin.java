package cn.sdut.Pclass;

public class admin {

	private String Admin_num;       //����Ա�û���
	private String Admin_password;  //����Ա����
	
	public admin(String admin_num, String admin_password) {
		super();
		Admin_num = admin_num;
		Admin_password = admin_password;
	}

	public admin() {
		super();
	}

	public String getAdmin_num() {
		return Admin_num;
	}

	public void setAdmin_num(String admin_num) {
		Admin_num = admin_num;
	}

	public String getAdmin_password() {
		return Admin_password;
	}

	public void setAdmin_password(String admin_password) {
		Admin_password = admin_password;
	}
}
