package co.grandcircus.donutapi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.donutapi.model.Donut;
import co.grandcircus.donutapi.model.DonutResponse;

@Service
public class DonutApiService {

	RestTemplate rt = new RestTemplate();
	
	public List<Donut> getAllDonuts(){
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		return rt.getForObject(url, DonutResponse.class).getResults();
	}
	
	public Donut getDonutById(Integer id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		return rt.getForObject(url, Donut.class);
	}
}
