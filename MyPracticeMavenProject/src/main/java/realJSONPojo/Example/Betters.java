package realJSONPojo.Example;

import java.util.List;

public class Betters {
	
	private List<Topping> batter;
	
	
	public List<Topping> getBatter() {
		return batter;
	}
	public void setBatter(List<Topping> batter) {
		this.batter = batter;
	}
	@Override
	public String toString() {
		return "Betters [batter=" + batter + "]";
	}
}
