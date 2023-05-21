package org.test.alunos.gabriel_cardoso2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @NoArgsConstructor
public class Cliente {
    private String nome;
    private Date dataNascimento;
    private String sexo;
    private String estadoCivil;
    private String nacionalidade;
    private String cpf;
    private String passaporte;
    
    
	public Cliente(String nome, Date dataNascimento, Boolean sexo, String estadoCivil, String cpf, String nacionalidade, String passaporte) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.setSexo(sexo);
		this.estadoCivil = estadoCivil;
		this.nacionalidade = nacionalidade;
		this.cpf = cpf;
		this.passaporte = passaporte;
	}

/*
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
*/

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public void setSexo(Boolean validaSexo) {
		// TODO Auto-generated method stub
		
	}


	public void setPassaporte(Boolean validaPassaporte) {
		// TODO Auto-generated method stub
		
	}


	public void setNacionalidade(boolean validaNacionalidade) {
		// TODO Auto-generated method stub
		
	}


	public void setEstadoCivil(Boolean validaEstadoCivil) {
		// TODO Auto-generated method stub
		
	}


	public void setCpf(boolean cpf) {
		// TODO Auto-generated method stub
		
	}


	public String getPassaporte() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getCpf() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getNacionalidade() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getEstadoCivil() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getSexo() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setEstadoCivil(String string) {
		// TODO Auto-generated method stub
		
	}


	public void setSexo(String string) {
		// TODO Auto-generated method stub
		
	}


	public void setCpf(String string) {
		// TODO Auto-generated method stub
		
	}


	public void setNacionalidade(String string) {
		// TODO Auto-generated method stub
		
	}


}
