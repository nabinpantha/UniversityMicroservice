package edu.application.project.university.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.application.project.university.bussiness.logic.UniversityLogic;
import edu.application.project.university.universitypojo.University;
import edu.application.project.university.util.TestData;


@RestController
@RequestMapping("university/")

public class UniversityResource {
	
	@Autowired
	private UniversityLogic universityLogic;

	
	@RequestMapping("firstUniversity")
	public University getFirstUniversity() {
		
		University university = universityLogic.getFirstUniverity();
		
		return university;
	}
	
	@RequestMapping("allUniversity")
	public List <University> getAllUniverrsity(){
		
		List <University> allUniversity = universityLogic.getAllUniversity();
		
		return allUniversity;
		
		
	
	}
	
	@RequestMapping("universityByCity")
	public List<University> getUniversityByCity(@RequestParam("city") String city){
		
		List <University> universityByCity = universityLogic.getUniversityByCity(city);
		
		return universityByCity;
		
	}
	
	@RequestMapping("universityById")
	public University getUniverityById(@RequestParam("id") int id){
		University university = universityLogic.getUniverityById(id);
		
		
		
		return university ;
		
	
	}
	}
	
	

