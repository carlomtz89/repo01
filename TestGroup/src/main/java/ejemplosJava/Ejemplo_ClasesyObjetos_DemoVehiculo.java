package ejemplosJava;

public class Ejemplo_ClasesyObjetos_DemoVehiculo {

	public static void main(String[] args) {
		
		int rango;

		Ejemplo_ClasesyObjetos_Vehiculo minivan = new Ejemplo_ClasesyObjetos_Vehiculo();
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de:" + rango);
		
		Ejemplo_ClasesyObjetos_Vehiculo carro = new Ejemplo_ClasesyObjetos_Vehiculo();
		carro.pasajeros = 5;
		System.out.println("El numero de pasajeros es " + carro.pasajeros);
	}

}
