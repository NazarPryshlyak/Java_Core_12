package JavaCore12.task_1;

public class Wheel {

	private int wheelDiameter;
    private String wheelMaterial;
	
    public Wheel(int wheelDiameter, String wheelMaterial) {
		this.wheelDiameter = wheelDiameter;
		this.wheelMaterial = wheelMaterial;
	}
	public int getWheelDiameter() {
		return wheelDiameter;
	}
	public void setWheelDiameter(int wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}
	public String getWheelMaterial() {
		return wheelMaterial;
	}
	public void setWheelMaterial(String wheelMaterial) {
		this.wheelMaterial = wheelMaterial;
	}
	@Override
	public String toString() {
		return "Wheel [wheelDiameter=" + wheelDiameter + ", wheelMaterial=" + wheelMaterial + "]";
	}
}