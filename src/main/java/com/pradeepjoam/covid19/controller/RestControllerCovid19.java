package com.pradeepjoam.covid19.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.opencsv.exceptions.CsvException;
import com.pradeepjoam.covid19.entities.AllLocationCovid19;
import com.pradeepjoam.covid19.service.Covid19Services;

@Controller
@RequestMapping("/covid19")
public class RestControllerCovid19 {
	
	
	@Autowired
	private Covid19Services covid19Services;

	 private static Logger LOG = LoggerFactory.getLogger(RestControllerCovid19.class);
	
	@GetMapping("/")
	public ModelAndView covid19HomePage() throws IOException, CsvException
	{
		List<AllLocationCovid19> allCovidData=new ArrayList<AllLocationCovid19>();
		Iterator<AllLocationCovid19> it=covid19Services.getAllCovid19Data();
		
		while (it.hasNext())
		{
			allCovidData.add(it.next());
			
		}
		allCovidData.forEach(System.out::println);
		System.out.println(allCovidData.size());
		Collections.sort(allCovidData);
	
		//List<String> stName=covid19Services.getAllStateName();
		// modelAndView.addAttribute("stateNameList",covid19Services.getAllStateName());
		ModelAndView modelAndView=new ModelAndView("index");
		modelAndView.addObject("allCovid19Data", allCovidData);
		 LOG.info("Retrive Data");
		return modelAndView;
	}

	@GetMapping("/contact")
	public String covid19ContactPage()
	{
		return "contact";
	}

}
