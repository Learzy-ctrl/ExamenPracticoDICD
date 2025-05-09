package com.mx.Principal;

import com.mx.Entidad.Serie;
import com.mx.Entidad.Videojuego;

public class Principal {

	public static void main(String[] args) {
		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];
		int contadorSeries = 0, contadorVideojuegos = 0;
		
		
		series[0] = new Serie("Umbrella Academy", 5 , "Accion", "Ejemplo");
		series[1] = new Serie("Stranger things", "the creator");
		series[2] = new Serie("Loki", 2 , "Accion", "Marvel");
		series[3] = new Serie("Black mirror", "netflix");
		series[4] = new Serie("Falcon", 1 , "Accion", "Marvel");
		
		videojuegos[0] = new Videojuego("Crash bandicoot", 50, "Plataforma", "Nauhgty dog");
		videojuegos[1] = new Videojuego("Pepsiman", 20);
		videojuegos[2] = new Videojuego("GTA SA", 70, "Mundo abierto", "Rockstar Games");
		videojuegos[3] = new Videojuego("Super Mario bros", 8);
		videojuegos[4] = new Videojuego("The legend of zelda: Tears of the kingdom", 85, "Aventura", "Nintendo");
		
		//Entrega 3 videojuegos y series
		for(int i = 0; i < 5; i++) {
			if(i % 2 == 0) {
				series[i].entregar();
				videojuegos[i].entregar();
			}
		}
		
		//Conteo de series y videojueggos entregados
		for(int i = 0; i < 5; i++) {
			if(series[i].isEntregado()) {
				series[i].devolver();
				contadorSeries++;
			}
			
			if(videojuegos[i].isEntregado()) {
				videojuegos[i].devolver();
				contadorVideojuegos++;
			}
		}
		System.out.println("\nExisten " + contadorSeries + " series que se entregaron y devolvieron");
		System.out.println("Existen " + contadorVideojuegos + " videojuegos que se entregaron y devolvieron\n");
		
		
		
		
		
		//Busca la serie con mas temporadas del arreglo
		
		Serie mayorS = series[0];
		for (int i = 1; i < series.length; i++) {
		    if (series[i].compareTo(mayorS) > 0) {
		        mayorS = series[i];
		    }
		}

		System.out.println("\nLa serie con más temporadas es: " + mayorS);
		
		
		//Busca el videojuego con mas horas del arreglo
		
		Videojuego mayorV = videojuegos[0];
		for (int i = 1; i < videojuegos.length; i++) {
		    if (videojuegos[i].compareTo(mayorV) > 0) {
		        mayorV = videojuegos[i];
		    }
		}
		
		System.out.println("\nEl juego con mas horas es: " + mayorV);
		
		
	}

}
