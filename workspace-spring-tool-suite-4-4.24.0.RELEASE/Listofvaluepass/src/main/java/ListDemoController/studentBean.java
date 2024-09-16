package ListDemoController;

public class studentBean {
	private String name;
	private String Branch;
	private String address;
	public studentBean(String name, String branch, String address) {
		super();
		this.name = name;
		Branch = branch;
		this.address = address;
	}
	public studentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
