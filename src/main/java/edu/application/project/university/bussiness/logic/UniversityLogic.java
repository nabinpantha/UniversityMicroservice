package edu.application.project.university.bussiness.logic;

import java.util.List;

import edu.application.project.university.universitypojo.University;

public interface UniversityLogic {
	
	University getFirstUniverity();
	
	University getUniverityById();
	
	List<University> getAllUniversity();
	
	List<University> getUniversityByCity(String city);
	
	University getUniversityByCollege();

	University getUniverityById(int id);
	}

