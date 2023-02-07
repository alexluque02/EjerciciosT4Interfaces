package ejercicio2;

public class Producto implements IImpuestos{

	public double calculoIva(double precio, int iva) {
		return precio*iva/100;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
