package ejercicio2;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int menu, iva;
		double sueldo, precio;
		Trabajador t=new Trabajador();
		Producto p=new Producto();
		
		do {
			System.out.println("1. Calcular Sueldo con IRPF\n"
					+ "2. Calcular Precio con IVA\n"
					+ "0. Salir");
			menu=Leer.datoInt();
			
			switch(menu) {
			case 1:
				System.out.println("diga sueldo");
				sueldo=Leer.datoDouble();
				System.out.printf("Tu sueldo con IRPF es: %.2f€\n", t.calculoIrpf(sueldo));
				break;
			case 2:
				System.out.println("Diga precio");
				precio=Leer.datoDouble();
				System.out.println("Diga IVA");
				iva=Leer.datoInt();
				System.out.printf("El precio con IVA es: %.2f€\n", p.calculoIva(precio, iva));
				break;
			case 0: 
				break;
			default:
				break;
			}
		}while(menu!=0);
	}

}
