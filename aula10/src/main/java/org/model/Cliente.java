package org.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.util.*;

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

    public Cliente(String nome, String cpf, String dataNascimento, String sexo, String estadoCivil, String nacionalidade, String passaporte){
        setNome(nome);
        setDataNascimento(dataNascimento);
        setSexo(sexo);
        setEstadoCivil(estadoCivil);
        setNacionalidade(nacionalidade);
        setCpf(cpf);
        setPassaporte(passaporte);
    }

    public void setSexo(String newSexo){
        if(SexoValidator.validaSexo(newSexo))
            this.sexo = newSexo;
    }

    public void setEstadoCivil(String newEstadoCivil){
        if(EstadoCivilValidator.validaEstadoCivil(newEstadoCivil))
            this.estadoCivil = newEstadoCivil;
    }

    public void setNacionalidade(String newNacionalidade){
        if(NacionalidadeValidator.validaNacionalidade(newNacionalidade))
            this.nacionalidade = newNacionalidade;
    }

    public void setCpf(String newCpf){
        if(CpfValidator.isCPF(newCpf))
            this.cpf = newCpf;
    }

    public void setPassaporte(String newPassaporte){
        if(PassaporteValidator.validaPassaporte(newPassaporte))
            this.passaporte = newPassaporte;
    }

    public void setDataNascimento(String newDataNascimento){
        Date dataNascimento = DataUtils.StringToDate(newDataNascimento);
        this.dataNascimento = dataNascimento;
    }


}
