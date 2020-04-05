package edu.application.project.university.universitypojo;

public class College {
	private String collegeName;
	private int collegeId;
	private String collegeCity;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeCity() {
		return collegeCity;
	}
	public void setCollegeCity(String collegeCity) {
		this.collegeCity = collegeCity;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeId=" + collegeId + ", collegeCity=" + collegeCity
				+ "]";
	}
//i love u
}
