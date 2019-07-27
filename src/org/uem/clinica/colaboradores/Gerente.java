package org.uem.clinica.colaboradores;

import java.util.ArrayList;
import org.uem.clinica.modelos.Dao;
import org.uem.clinica.modelos.Medico;
import org.uem.clinica.modelos.Pessoa;

public class Gerente extends Pessoa{
      public Gerente() {}

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
      
      // O gerente é o responsavel por cadastrar os medicos que
      // trabalham na clinica
      
      // Recebe um objeto do tipo Medico e o insere no
      // ArrayList<Medico>
      public void cadastrarMedico(Medico medico) {
            Dao.adicionarMedico(medico);
      }
      
      // Retorna o arrayList com todos os medicos cadastrados
      public ArrayList<Medico> atualizarMedico() {
            return Dao.pesquisarDbMedicos();
      }
      
      // Remove um Paciente do ArrayList<Medico>
      public void removerMedico(int indice) {
            Dao.pesquisarDbMedicos().remove(indice);
      }
}
