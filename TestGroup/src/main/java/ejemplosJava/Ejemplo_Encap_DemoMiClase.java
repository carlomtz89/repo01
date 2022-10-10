package ejemplosJava;

public class Ejemplo_Encap_DemoMiClase {

	public static void main(String[] args) {

		Ejemplo_Encap_MiClase mc = new Ejemplo_Encap_MiClase();
		
		mc.setTipo(10);
		
		System.out.println("El tipo es: " + mc.getTipo());
	}

}
