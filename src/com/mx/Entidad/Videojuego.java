package com.mx.Entidad;

import com.mx.Principal.IEntregable;

public class Videojuego implements IEntregable{
	private String titulo = "";
	private int horasEstimadas = 10;
	private boolean entregado = false;
	private String genero = "";
	private String compania = "";
	
	public Videojuego() {
		
	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}
	

	@Override
	public void entregar() {
		this.entregado = true;
		System.out.println("Videojuego: " + this.titulo + " entregado\n");
	}

	@Override
	public void devolver() {
		this.entregado = false;
		System.out.println("Videojuego: " + this.titulo + " devuelto\n");
	}
	
	@Override
	public boolean isEntregado() {
		return entregado;
	}

	@Override
	public int compareTo(Object a) {
	    Videojuego aux = (Videojuego) a;
	    return Integer.compare(this.horasEstimadas, aux.getHorasEstimadas());
	}
	
	
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]\n";
	}
}
