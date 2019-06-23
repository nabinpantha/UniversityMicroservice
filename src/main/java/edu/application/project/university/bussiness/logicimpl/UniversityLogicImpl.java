package edu.application.project.university.bussiness.logicimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.application.project.university.bussiness.logic.UniversityLogic;
import edu.application.project.university.universitypojo.University;
import edu.application.project.university.util.TestData;

@Service
public class UniversityLogicImpl implements UniversityLogic {

	@Override
	public University getFirstUniverity() {
		
		List <University> myUniversityList = new ArrayList<>();
		
		myUniversityList = TestData.createUniversityList();				
		
		return myUniversityList.get(0);
	}

	@Override
	public University getUniverityById(int id) {
		
		  List <University> myUniversityList = new ArrayList<>(); 
		  myUniversityList = TestData.createUniversityList();
		  
		  
		  for (University university : myUniversityList) {
			  if(university.getId() == id) {
				  return university;
			  }
			  
		  }
		return null;
		
	}

	@Override
	public List <University> getAllUniversity() {

List <University> myUniversityList = new ArrayList<>();
		
		myUniversityList = TestData.createUniversityList();	
		return  myUniversityList;
	}

	@Override
	public List <University> getUniversityByCity(String city) {
		List <University> myUniversityList = new ArrayList<>();
		
		myUniversityList = TestData.createUniversityList();	
		
		List<University> universityWithinGivenCity = new ArrayList<>();
		
		for( University university : myUniversityList) {
		
			if (university.getAddress().getCity().equalsIgnoreCase(city)) {
				
				universityWithinGivenCity.add(university);
				
			}
		}
		// TODO Auto-generated method stub
		return universityWithinGivenCity;
	}

	@Override
	public University getUniversityByCollege() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public University getUniverityById() {
		// TODO Auto-generated method stub
		return null;
	}

}
