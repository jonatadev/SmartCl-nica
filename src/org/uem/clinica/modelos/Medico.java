package org.uem.clinica.modelos;

import java.util.ArrayList;

public class Medico extends Pessoa {
      private String crm; 
      private String especialidade; // cardiologista, neurocirurgião, etc
      public Medico() {}         

      public String getCrm() {
            return crm;
      }

      public void setCrm(String crm) {
            this.crm = crm;
      }

      public String getEspecialidade() {
            return especialidade;
      }

      public void setEspecialidade(String especialidade) {
            this.especialidade = especialidade;
      }
      
      // Dados Adicionais
      // Metódos relacionados as funções do médico
      public void cadastrarDadosAdicionais(DadosAdicionais dadosAdicionais){
         Dao.adicionarDadosAdicionais(dadosAdicionais);
      }
      public ArrayList<DadosAdicionais> atualizarDadosAdicionais(){
            return Dao.pesquisarDbDadosAdicionais();
      }
      
      public void removerDadosAdicionais(int indice){
            Dao.pesquisarDbDadosAdicionais().remove(indice);
      }
      
      
      // Prontuário dos pacientes
      public void cadastrarProntuario(Prontuario prontuario){
            Dao.adicionarProntuario(prontuario);
      }
      
      public ArrayList<Prontuario> atualizarProntuario() {
            return Dao.pesquisarDbProntuario();
      }
      
      public void removerProntuario(int indice){
            Dao.pesquisarDbProntuario().remove(indice);
      }
}
