package realJSONPojo.Example;

import java.util.List;

public class MainPojoClass {
	
	private String id;
	private String type;
	private String name;
	private double 	ppu;
	private List<Topping> topping;
	private Betters batters;
	


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPpu() {
		return ppu;
	}
	public void setPpu(double ppu) {
		this.ppu = ppu;
	}
	public List<Topping> getTopping() {
		return topping;
	}
	public void setTopping(List<Topping> topping) {
		this.topping = topping;
	}
	public Object getBatters() {
		return batters;
	}
	public void setBatters(Betters batters) {
		this.batters = batters;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", type=" + type + ", name=" + name + ", ppu=" + ppu + ", topping=" + topping
				+ ", batters=" + batters + "]";
	}
	
	
	
	
}
