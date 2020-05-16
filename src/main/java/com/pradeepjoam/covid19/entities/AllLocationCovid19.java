package com.pradeepjoam.covid19.entities;

import java.io.Serializable;




public class AllLocationCovid19  implements Serializable,Comparable<AllLocationCovid19>{

	private static final long serialVersionUID = -7295885964832063210L;
	
	
	private int dataList;
	private String State;
	private String Confirmed;
	private String Recovered;
	private String  Deaths; 
	private String  Active; 
	private String  Last_Updated_Time; 
	private String  State_code;
	private String Delta_Confirmed;
	private String Delta_Recovered;
	private String Delta_Deaths;
	private String State_Notes;
	
	public AllLocationCovid19() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public String getState() {
		return State;
	}





	public void setState(String state) {
		State = state;
	}





	public String getConfirmed() {
		return Confirmed;
	}





	public void setConfirmed(String confirmed) {
		Confirmed = confirmed;
	}





	public String getRecovered() {
		return Recovered;
	}





	public void setRecovered(String recovered) {
		Recovered = recovered;
	}





	public String getDeaths() {
		return Deaths;
	}





	public void setDeaths(String deaths) {
		Deaths = deaths;
	}





	public String getActive() {
		return Active;
	}





	public void setActive(String active) {
		Active = active;
	}





	public String getLast_Updated_Time() {
		return Last_Updated_Time;
	}





	public void setLast_Updated_Time(String last_Updated_Time) {
		Last_Updated_Time = last_Updated_Time;
	}





	public String getState_code() {
		return State_code;
	}





	public void setState_code(String state_code) {
		State_code = state_code;
	}





	public String getDelta_Confirmed() {
		return Delta_Confirmed;
	}





	public void setDelta_Confirmed(String delta_Confirmed) {
		Delta_Confirmed = delta_Confirmed;
	}





	public String getDelta_Recovered() {
		return Delta_Recovered;
	}





	public void setDelta_Recovered(String delta_Recovered) {
		Delta_Recovered = delta_Recovered;
	}





	public String getDelta_Deaths() {
		return Delta_Deaths;
	}





	public void setDelta_Deaths(String delta_Deaths) {
		Delta_Deaths = delta_Deaths;
	}





	public String getState_Notes() {
		return State_Notes;
	}





	public void setState_Notes(String state_Notes) {
		State_Notes = state_Notes;
	}





	public int getDataList() {
		return dataList;
	}





	public void setDataList(int dataList) {
		this.dataList = dataList;
	}







	@Override
	public String toString() {
		return "AllLocationCovid19 [State=" + State + ", Confirmed=" + Confirmed + ", Recovered=" + Recovered
				+ ", Deaths=" + Deaths + ", Active=" + Active + ", Last_Updated_Time=" + Last_Updated_Time
				+ ", State_code=" + State_code + ", Delta_Confirmed=" + Delta_Confirmed + ", Delta_Recovered="
				+ Delta_Recovered + ", Delta_Deaths=" + Delta_Deaths + ", State_Notes=" + State_Notes + "]";
	}





	@Override
	public int compareTo(AllLocationCovid19 o) {
		
		return o.getConfirmed().length()-this.Confirmed.length();
	}
	
	

}
