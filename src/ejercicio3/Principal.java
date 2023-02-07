package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		
		double num []=new double [10];
		ArrayReales a=new ArrayReales(num);

		a.rellenarArray();
		System.out.println("El mayor es "+a.calcularMaximo());
		System.out.println("El menor es "+a.calcularMinimo());
		System.out.println("La suma es "+a.calcularSumatorio());
	}

}
