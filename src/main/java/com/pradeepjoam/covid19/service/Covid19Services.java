package com.pradeepjoam.covid19.service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.pradeepjoam.covid19.entities.AllLocationCovid19;

@Service
public class Covid19Services {
	
	
	private final String LISTSTATES="https://api.covid19india.org/csv/latest/state_wise.csv";
	
	private List<AllLocationCovid19> getUrlRequestStateWise()  throws IOException, CsvException 
	{
		  URL stockURL=new URL(LISTSTATES);
		  List<AllLocationCovid19> locationByCovidList=new ArrayList<AllLocationCovid19>();
		  CSVReader csvReader = new CSVReader(new InputStreamReader(stockURL.openStream()));
	  
		  AllLocationCovid19 covid19= new AllLocationCovid19();
		  String [] values = null;
	      while ((values = csvReader.readNext()) != null) 
	      {
	    	  covid19=new AllLocationCovid19();
	    	  covid19.setState(values[0]);
	    	  covid19.setConfirmed((values[1]));
	    	  covid19.setRecovered((values[2]));
	    	  covid19.setDeaths((values[3]));
	    	  covid19.setActive((values[4]));
	    	  covid19.setLast_Updated_Time(values[5]);
	    	  covid19.setState_code(values[6]);
	    	  covid19.setDelta_Confirmed((values[7]));
	    	  covid19.setDelta_Recovered((values[8]));
	    	  covid19.setDelta_Deaths((values[9]));
	    	  covid19.setState_Notes(values[10]);
	    	  locationByCovidList.add(covid19);
	      }

	    csvReader.close();
	    return locationByCovidList;
	}
	
	public List<String> getAllStateName() throws IOException, CsvException
	{
		List<String> stateName=new ArrayList<String>();
		Iterator<AllLocationCovid19> it=getUrlRequestStateWise().iterator();
		while (it.hasNext()) {
			AllLocationCovid19 allLocationCovid19 = (AllLocationCovid19) it.next();
			stateName.add(allLocationCovid19.getState());
		}
	  return stateName;
	}
	
	
	
	
	public Iterator<AllLocationCovid19> getAllCovid19Data() throws IOException, CsvException 
	
	{
		Iterator<AllLocationCovid19> it=getUrlRequestStateWise().iterator();
		  return it;
		
	}
	
	

}
