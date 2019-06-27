package cn.sdut.Pclass;

public class logs {

	private int Log_id;                //编号
	private String Log_type;              //类型
	private String Log_description;       //描述
	private String Log_cul;              //备用
	public logs(int log_id, String log_type, String log_description, String log_cul) {
		super();
		Log_id = log_id;
		Log_type = log_type;
		Log_description = log_description;
		Log_cul = log_cul;
	}
	public logs() {
		super();
	}
	public int getLog_id() {
		return Log_id;
	}
	public void setLog_id(int log_id) {
		Log_id = log_id;
	}
	public String getLog_type() {
		return Log_type;
	}
	public void setLog_type(String log_type) {
		Log_type = log_type;
	}
	public String getLog_description() {
		return Log_description;
	}
	public void setLog_description(String log_description) {
		Log_description = log_description;
	}
	public String getLog_cul() {
		return Log_cul;
	}
	public void setLog_cul(String log_cul) {
		Log_cul = log_cul;
	}
	
	
	
	
	

}
