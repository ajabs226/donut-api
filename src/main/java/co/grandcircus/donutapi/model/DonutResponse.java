package co.grandcircus.donutapi.model;

import java.util.List;

public class DonutResponse {

	private List<Donut> results;
	
	public List<Donut> getResults(){
		return results;
	}
	
	public void setResults(List<Donut> results) {
		this.results = results;
	}
}
