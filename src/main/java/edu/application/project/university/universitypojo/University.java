package edu.application.project.university.universitypojo;

public class University {
	
	private String univerityName;
	private int id;
	private Address address;
	private College college;
	public String getUniverityName() {
		return univerityName;
	}
	public void setUniverityName(String univerityName) {
		this.univerityName = univerityName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "University [univerityName=" + univerityName + ", id=" + id + ", address=" + address + ", college="
				+ college + "]";
	}

}
