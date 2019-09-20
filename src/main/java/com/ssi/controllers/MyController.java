package com.ssi.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.entities.Student;

@Controller
public class MyController {
	
	@RequestMapping("savestudent")
	public ModelAndView saveData(@ModelAttribute("student") Student student){
		
		//save the student using service class
		ModelAndView mv=new ModelAndView("success");
		return mv;
		
	}
	
	
	@RequestMapping("newstudent")
	public ModelAndView showDataEntry(){
		
		ModelAndView mv=new ModelAndView("dataentry");
		Student student=new Student(); 
		/*student.setRno(111);		student.setName("AAA");
		student.setBranch("CS"); 	student.setSem(4);*/
		mv.addObject("student", student);
		List<String> list=new ArrayList<>();
		list.add("CS"); list.add("IT"); list.add("Mech"); list.add("CIVIL");
		Map<Integer,String> semMap=new HashMap<>();
		semMap.put(5101,"FIRST");
		semMap.put(5102,"SECOND");
		semMap.put(5103,"THIRD");
		/*List<Integer> semlist=new ArrayList<>();
		semlist.add(1); semlist.add(2); semlist.add(3);*/
		
		mv.addObject("branches", list);
		mv.addObject("semesters", semMap);
		
		
		return mv;
	}
	
	
}
