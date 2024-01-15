package com.example.demo.model;

import java.util.List;

import jakarta.persistence.OneToMany;

public class Usuario {

		private long idUsuario;
		private String login;
		private String senha;
		@OneToMany(mappedBy = "usuario")
		private List<Evento> eventos;
		
		
		
		
		public long getIdUsuario() {
			return idUsuario;
		}
		public void setIdUsuario(long idUsuario) {
			this.idUsuario = idUsuario;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public List<Evento> getEventos() {
			return eventos;
		}
		public void setEventos(List<Evento> eventos) {
			this.eventos = eventos;
		}

		
}
