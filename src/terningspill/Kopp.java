package terningspill;

import java.util.ArrayList;
import java.util.List;

public class Kopp {

	private int id;
	private int sum;
	private List<Terning> terninger = new ArrayList<Terning>();

	
	public Kopp(Integer id) {
		this.id = id;

		
		for (int i = 0; i < 2; i++) {
			Terning t = new Terning(id);
			terninger.add(t);
		}
		
	}
			
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getSum() {
		return sum;
	}
	
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
	
	public void trill() {
		sum = 0;  
		for (Terning t : terninger) {
			t.trill();
			sum += t.getVerdi();
		}
	}
	
	
	
}
