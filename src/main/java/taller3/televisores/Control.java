package taller3.televisores;

public class Control {
	private TV tv;

	public TV getTv() {
		return this.tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
	}

	public void setCanal(int i) {
		this.tv.setCanal(i);
	}

	public void turnOn() {
		this.tv.turnOn();
	}
	public void turnOff() {
		this.tv.turnOff();
	}

	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}

	public void volumenUp() {
		this.tv.volumenUp();
	}
	public void volumenDown() {
		this.tv.volumenUp();
	}
}
