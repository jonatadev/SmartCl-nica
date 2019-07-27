package org.uem.clinica.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.uem.clinica.dao.Dao;

@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer id;
      
      private String nome;
      private String cpf;
      private String rg;
      private String sexo;
      private String dataNascimento;
      
      private String endereco;
      private String numeroResidencia;
      private String Bairro;
      private String cep;
      private String Cidade;
      private String Estado;
      private String telefone;
      private String email;
      private String tipConvenio;

      public Paciente() {}

      public Integer getId() {
            return id;
      }

      public void setId(Integer id) {
            this.id = id;
      }

      public String getNome() {
            return nome;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }

      public String getCpf() {
            return cpf;
      }

      public void setCpf(String cpf) {
            this.cpf = cpf;
      }

      public String getRg() {
            return rg;
      }

      public void setRg(String rg) {
            this.rg = rg;
      }

      public String getSexo() {
            return sexo;
      }

      public void setSexo(String sexo) {
            this.sexo = sexo;
      }

      public String getDataNascimento() {
            return dataNascimento;
      }

      public void setDataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
      }

      public String getEndereco() {
            return endereco;
      }

      public void setEndereco(String endereco) {
            this.endereco = endereco;
      }

      public String getNumeroResidencia() {
            return numeroResidencia;
      }

      public void setNumeroResidencia(String numeroResidencia) {
            this.numeroResidencia = numeroResidencia;
      }

      public String getBairro() {
            return Bairro;
      }

      public void setBairro(String Bairro) {
            this.Bairro = Bairro;
      }

      public String getCep() {
            return cep;
      }

      public void setCep(String cep) {
            this.cep = cep;
      }

      public String getCidade() {
            return Cidade;
      }

      public void setCidade(String Cidade) {
            this.Cidade = Cidade;
      }

      public String getEstado() {
            return Estado;
      }

      public void setEstado(String Estado) {
            this.Estado = Estado;
      }

      public String getTelefone() {
            return telefone;
      }

      public void setTelefone(String telefone) {
            this.telefone = telefone;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getTipConvenio() {
            return tipConvenio;
      }

      public void setTipConvenio(String tipConvenio) {
            this.tipConvenio = tipConvenio;
      }
      
      public void cadastrarPaciente(Paciente novoPaciente) {
            // regras de negocio aqui
           Dao.Inserir(novoPaciente);
      }
}
