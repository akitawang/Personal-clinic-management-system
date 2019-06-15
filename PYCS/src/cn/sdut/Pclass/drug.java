package cn.sdut.Pclass;

public class drug {

	private int Drug_id;              //药品编号
	private String Drug_name;         //药品名称
	private String Drug_class;        //药品分类
	private String Drug_number;       //批准文号
	private String Drug_factory;      //生产厂家
	private String Drug_type;         //用药类型
	private String Drug_instruction;  //药品说明
	private String Drug_function;     //药品功效
	private int Drug_stock;           //药品库存
	private double Drug_price;        //药品价格
	private String Drug_date;         //生产日期
	private String Drug_expdate;      //失效日期
	
	public drug(int drug_id, String drug_name, String drug_class, String drug_number, String drug_factory,
			String drug_type, String drug_instruction, String drug_function, int drug_stock, double drug_price,
			String drug_date, String drug_expdate) {
		super();
		Drug_id = drug_id;
		Drug_name = drug_name;
		Drug_class = drug_class;
		Drug_number = drug_number;
		Drug_factory = drug_factory;
		Drug_type = drug_type;
		Drug_instruction = drug_instruction;
		Drug_function = drug_function;
		Drug_stock = drug_stock;
		Drug_price = drug_price;
		Drug_date = drug_date;
		Drug_expdate = drug_expdate;
	}
	
	public int getDrug_id() {
		return Drug_id;
	}
	public void setDrug_id(int drug_id) {
		Drug_id = drug_id;
	}
	public String getDrug_name() {
		return Drug_name;
	}
	public void setDrug_name(String drug_name) {
		Drug_name = drug_name;
	}
	public String getDrug_class() {
		return Drug_class;
	}
	public void setDrug_class(String drug_class) {
		Drug_class = drug_class;
	}
	public String getDrug_number() {
		return Drug_number;
	}
	public void setDrug_number(String drug_number) {
		Drug_number = drug_number;
	}
	public String getDrug_factory() {
		return Drug_factory;
	}
	public void setDrug_factory(String drug_factory) {
		Drug_factory = drug_factory;
	}
	public String getDrug_type() {
		return Drug_type;
	}
	public void setDrug_type(String drug_type) {
		Drug_type = drug_type;
	}
	public String getDrug_instruction() {
		return Drug_instruction;
	}
	public void setDrug_instruction(String drug_instruction) {
		Drug_instruction = drug_instruction;
	}
	public String getDrug_function() {
		return Drug_function;
	}
	public void setDrug_function(String drug_function) {
		Drug_function = drug_function;
	}
	public int getDrug_stock() {
		return Drug_stock;
	}
	public void setDrug_stock(int drug_stock) {
		Drug_stock = drug_stock;
	}
	public double getDrug_price() {
		return Drug_price;
	}
	public void setDrug_price(double drug_price) {
		Drug_price = drug_price;
	}
	public String getDrug_date() {
		return Drug_date;
	}
	public void setDrug_date(String drug_date) {
		Drug_date = drug_date;
	}
	public String getDrug_expdate() {
		return Drug_expdate;
	}
	public void setDrug_expdate(String drug_expdate) {
		Drug_expdate = drug_expdate;
	}

}
