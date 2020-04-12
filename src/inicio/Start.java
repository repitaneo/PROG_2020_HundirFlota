package inicio;

import juego.Contrincante;
import juego.Juego;
import juego.Tirada;

public class Start {

	public static void main(String[] args) {


		Juego juego = new Juego();
		
		juego.setBarco(2,2,Juego.ORIENTACION_HORIZONTAL,Juego.BARCOS_PORTAVIONES);
		
		juego.setBarco(0,0,Juego.ORIENTACION_HORIZONTAL,Juego.BARCOS_ACORAZADO);
		
		juego.setBarco(5,4,Juego.ORIENTACION_VERTICAL,Juego.BARCOS_SUBMARINO);
		
		
		juego.setBarco(4,6,Juego.ORIENTACION_VERTICAL,Juego.BARCOS_DESTRUCTOR);
		juego.setBarco(2,0,Juego.ORIENTACION_VERTICAL,Juego.BARCOS_DESTRUCTOR);
		
		juego.setBarco(6,1,0,Juego.BARCOS_LANCHA);
		juego.setBarco(0,5,0,Juego.BARCOS_LANCHA);
		
		Contrincante enemigo = new Contrincante();

		int veces = 0;
		
		int resultadoDisparo = Juego.DISPARO_AGUA;
		while(resultadoDisparo==Juego.DISPARO_AGUA) {
		
			Tirada tirada = enemigo.nuevoIntento();
			resultadoDisparo = juego.disparo(tirada);
			veces++;
		}
		
		juego.pintarPanel();
		System.out.println(veces);


		


	}

}
