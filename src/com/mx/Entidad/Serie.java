package com.mx.Entidad;

import com.mx.Principal.IEntregable;

public class Serie implements IEntregable{
	private String titulo = "";
	private int numTemporadas = 3;
	private boolean entregado = false;
	private String genero = "";
	private String creador = "";
	
	public Serie() {
		
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
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

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}


	@Override
	public void entregar() {
		this.entregado = true;
		System.out.println("Serie: " + this.titulo + " entregado\n");
	}

	@Override
	public void devolver() {
		this.entregado = false;
		System.out.println("Serie: " + this.titulo + " devuelto\n");
	}
	
	@Override
	public boolean isEntregado() {
		return entregado;
	}

	@Override
	public int compareTo(Object a) {
	    Serie aux = (Serie) a;
	    return Integer.compare(this.numTemporadas, aux.getNumTemporadas());
	}


	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]\n";
	}
	
}
