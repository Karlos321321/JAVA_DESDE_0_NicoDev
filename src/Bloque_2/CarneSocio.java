package Bloque_2;

public class CarneSocio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroSocio = 12;
		String nombreCompleto = "Carlos Javier Moreno Otero";
		String DNI = "22980944B";
		String fechaNacimiento = "28/11/1968";
		String ciudad = "Guardmar del Segura";
		char tipoSocio = 'O';
		double cuotaAnual = 1234.55;
		boolean cuotaPagada = true;
		
		System.out.println("+---------------------------+");
		System.out.println("|      CLUB DEL LIBRO       |");
		System.out.println("|                           |");
		System.out.println("|      CARNET DE SOCIO      |");
		System.out.println("|---------------------------+---------------------|");
		System.out.println("|Nº Socio: " + numeroSocio + "                                     |" );
		System.out.println("|Nombre y Apellidpos: " + nombreCompleto+ "  |" );
		System.out.println("|DNI: " + DNI+ "                                   |" );
		System.out.println("|Fecha de Nacimiento: " + fechaNacimiento+ "                  |" );
		System.out.println("|Ciudad: " + ciudad+ "                      |" );
		
		System.out.print("|Categoria: ");
		System.out.println(tipoSocio == 'O' ? "Clase ORO                             |" : "Clase Plata                           |");
		System.out.println("|Cuota Anual: " + cuotaAnual + "€" + "                            |");
		
		System.out.print("|Cuota Pagada ?: ");
		System.out.println(cuotaPagada == true ? "Cuota Pagada                     |" : "Cuota Impagada                   |");
		System.out.println("+-------------------------------------------------+");		
		
		
	}
}