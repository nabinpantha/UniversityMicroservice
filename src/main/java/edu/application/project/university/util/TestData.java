package edu.application.project.university.util;

import java.util.ArrayList;
import java.util.List;

import edu.application.project.university.universitypojo.Address;
import edu.application.project.university.universitypojo.College;
import edu.application.project.university.universitypojo.University;

public class TestData {
	
	public static List<University> createUniversityList(){
		
		
		List <University> UniversityList = new ArrayList<>();
		List <Address> addressList = new ArrayList<>();
		List <College> collegeList = new ArrayList<>();
		
		University university1 = new University();
		Address address1 = new Address();
		College college1 = new College();
		
		
//		university1 details
		
		university1.setId(1);
		university1.setUniverityName("Mehersi");
		
		address1.setCity("corona");
		address1.setCountry("USA");
		address1.setPostalCode(11368);
		address1.setState("NY");
		address1.setStreet("57 Avenue");
		
		
		college1.setCollegeCity("MO");
		college1.setCollegeId(11);
		college1.setCollegeName("Monroe");
		
		university1.setAddress(address1);
		university1.setCollege(college1);
		UniversityList.add(university1);
		
//		university2 details
		
		University university2 = new University();
		Address address2 = new Address();
		College college2 = new College();
		
		university2.setId(2);
		university2.setUniverityName("pehersi");
		
		address2.setCity("Rona");
		address2.setCountry("Nepal");
		address2.setPostalCode(22268);
		address2.setState("KTM");
		address2.setStreet("Motichour");
		
		
		college2.setCollegeCity("LT");
		college2.setCollegeId(22);
		college2.setCollegeName("ICHM");
		
		university2.setAddress(address2);
		university2.setCollege(college2);
		UniversityList.add(university2);
		
//		university3 details
		
		University university3 = new University();
		Address address3 = new Address();
		College college3 = new College();
		
		university3.setId(3);
		university3.setUniverityName("UC Berkeley");
		
		address3.setCity("queens");
		address3.setCountry("USA");
		address3.setPostalCode(45368);
		address3.setState("PE");
		address3.setStreet("98 Avenue");
		
		
		college3.setCollegeCity("TX");
		college3.setCollegeId(33);
     	college3.setCollegeName("COSMOS");
     	
     	
     	university3.setAddress(address3);
		university3.setCollege(college3);
     	UniversityList.add(university3);
		return UniversityList;
	}
	
	
	
	}
	
	
	
	
	
	


