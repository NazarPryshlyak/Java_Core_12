package JavaCore12.task_1;

public class Auto {
	
	private int engineHorsePower;
	private int productionYear;
	private Wheel wheel;
	private Engine engine;
	
	public Auto(int engineHorsePower, int productionYear, Wheel wheel, Engine engine) {
		this.engineHorsePower = engineHorsePower;
		this.productionYear = productionYear;
		this.wheel = wheel;
		this.engine = engine;
	}
	public int getEngineHorsePower() {
		return engineHorsePower;
	}
	public void setEngineHorsePower(int engineHorsePower) {
		this.engineHorsePower = engineHorsePower;
	}
	public int getProductionYear() {
		return productionYear;
	}
	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Auto [engineHorsePower=" + engineHorsePower + ", productionYear=" + productionYear + ", wheel=" + wheel
				+ ", engine=" + engine + ", getEngineHorsePower()=" + getEngineHorsePower() + ", getProductionYear()="
				+ getProductionYear() + ", getWheel()=" + getWheel() + ", getEngine()=" + getEngine() + "]";
	}
}