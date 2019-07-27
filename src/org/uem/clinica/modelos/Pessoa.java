package org.uem.clinica.modelos;

public class Pessoa {
      protected String nome;      
      protected String cpf;
      protected String rg;
      protected String sexo;
      protected String email;
      protected String telefone;

      public Pessoa() {
      }

      public Pessoa(String nome, String cpf, String rg, String sexo, String email, String telefone) {
            this.nome = nome;
            this.cpf = cpf;
            this.rg = rg;
            this.sexo = sexo;
            this.email = email;
            this.telefone = telefone;
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

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getTelefone() {
            return telefone;
      }

      public void setTelefone(String telefone) {
            this.telefone = telefone;
      }
}
