package com.example.demo.model;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.ManyToOne;

public class Evento {

	private long idEvento;
	private LocalDate data;
	private String titulo;
	private LocalTime horario;
	@ManyToOne
	private Usuario usuario;
	
	
	public long getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public LocalTime getHorario() {
		return horario;
	}
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	} 
	
}
