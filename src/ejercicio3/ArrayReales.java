package ejercicio3;

import java.util.Arrays;
import java.util.Random;

public class ArrayReales implements Estadisticas{

	private double [] num;

	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}

	public double[] getNum() {
		return num;
	}

	public void setNum(double[] num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "ArrayReales [num=" + Arrays.toString(num) + "]";
	}

	public double [] rellenarArray() {
		Random aleatorio=new Random (System.nanoTime());
		double desde=0, hasta=99;
		for (int i = 0; i < num.length; i++) {
			num[i]=aleatorio.nextDouble((hasta-desde+1)+desde);
		}
		return num;
	}

	
	@Override
	public double calcularMinimo() {
		double menor = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]<menor) {
				menor=num[i];
			}
		}
		return menor;
	}

	@Override
	public double calcularMaximo() {
		double mayor = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]>mayor) {
				mayor=num[i];
			}
		}
		return mayor;
	}

	@Override
	public double calcularSumatorio() {
		double suma=0;
		for (int i = 0; i < num.length; i++) {
			suma+=num[i];
		}
		return suma;
	}
	
	
}
