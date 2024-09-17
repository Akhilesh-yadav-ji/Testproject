package akhilesh;

public class studentBean {
	private int id;
	private String name;
	private int mobno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "studentBean [id=" + id + ", name=" + name + ", mobno=" + mobno + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getMobno()=" + getMobno() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
