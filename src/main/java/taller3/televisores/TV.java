package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV=0;
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		TV.numTV++;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	public int getPrecio() {
		return this.precio;
	} 
	public Marca getMarca() {
		return this.marca;
	} 
	public Control getControl() {
		return this.control;
	}
	public int getCanal() {
		return this.canal;
	}
	public void setVolumen(int volumen) {
		if(volumen >=0 && volumen <=7 && this.estado) {
			this.volumen = volumen;
		}
	}
	public void setCanal(int canal) {
		if(canal >=0 && canal <=7 && this.estado) {
			this.canal = canal;
		}
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	} 
	public void setMarca(Marca marca) {
		this.marca = marca;
	} 
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void turnOn() {
		this.estado= true;
	}
	
	public void canalUp() {
		if(this.canal<120 && this.estado) {
			this.canal++;
		}
	}
	public void canalDown() {
		if(this.canal>1 && this.estado) {
			this.canal--;
		}
	}
	public void volumenUp() {
		if(this.volumen<7 && this.estado) {
			this.volumen++;
		}
	}
	public void volumenDown() {
		if(this.volumen>0 && this.estado) {
			this.volumen--;
		}
	}
	
	public void turnOff() {
		this.estado= false;
	}
	
	public boolean getEstado() {
		 return this.estado;
	}

	public static int getNumTV() {
		return TV.numTV;
	}

	public static void setNumTV(int numTv) {
		TV.numTV = numTv;
	}

	
}
