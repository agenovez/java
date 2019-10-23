import java.util.Scanner;

class Foro {
  public static void main(String[] args) {

  	Scanner l = new Scanner(System.in);
	var tema = "Seleccionado:";

    	var semana = 1;
do{
	System.out.print("Ingrese semana: ");
    	semana  = l.nextByte();
    	var cuestionario = "Tema : ";


	switch(semana) {
   	case 1:
    		cuestionario += "Introduccion a la programacion";
		tema = "Seleccionado: Introduccion a la programacion";
		System.out.println(tema);
    	break;
   	case 2:
    		cuestionario += "Secuenciacion y seleccion";
		tema = "Seleccionado: Secuenciacion y seleccion";
		System.out.println(tema);

    	break;
   	case 3:
    		cuestionario += "DO...WHILE";
		tema = "Seleccionado: DO...WHILE";
		System.out.println(tema);

    	break;
   	case 4:
    		cuestionario += "FOR";
		tema  = "Seleccionado: FOR";
		System.out.println(tema);

    	break;
   	case 5:
    		cuestionario += "WHILE";
		tema = "Seleccionado: WHILE";
		System.out.println(tema);

    	break;
   	case 6:
    		cuestionario += "Series numericas";
		tema = "Seleccionado: Series numericas";
		System.out.println(tema);

    	break;
   	case 7 : case 8:
    		cuestionario += "Tarea";
		tema = "Seleccionado: Tarea";
		System.out.println(tema);

    	break;
   	default: cuestionario = "Semana desconocida";
	}
	if ( semana <= 8 && semana >=1)
		{
			System.out.println(cuestionario);
		}else{

			System.out.println("Opcion: " + semana + " Erronea ..saliendo..");
		}
}while( semana <= 8 && semana >=1);

  }

}
