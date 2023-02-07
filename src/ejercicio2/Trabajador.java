package ejercicio2;

public class Trabajador implements IImpuestos{
	
	public double calculoIrpf(double sueldo) {
		double porcIrpf=15;
		return sueldo*porcIrpf/100;
	}

	@Override
	public double calculoIva(double precio, int iva) {
		// TODO Auto-generated method stub
		return 0;
	}
}
