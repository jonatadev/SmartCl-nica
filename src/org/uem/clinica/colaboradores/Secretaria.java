package org.uem.clinica.colaboradores;

import java.util.ArrayList;
import org.uem.clinica.modelos.Paciente;
import org.uem.clinica.modelos.Consulta;
import org.uem.clinica.modelos.Dao;
import org.uem.clinica.modelos.Pessoa;

public class Secretaria extends Pessoa {
      
      public Secretaria() {}
      
      
      // Recebe um objeto do tipo Paciente e o insere no
      // ArrayList<Paciente>
      public void cadastrarPaciente(Paciente paciente) {
            Dao.adicionarPaciente(paciente);
      }
      
      // Retornar o arrayList com todos os pacientes cadastrados
      public ArrayList<Paciente> recuperarPaciente() {
            return Dao.pesquisarDbPaciente();
      }
      
      // Remove um Paciente do ArrayList<Paciente>
      public void removerPaciente(int indice) {
            Dao.pesquisarDbPaciente().remove(indice);
      }
      
      // Cadastra os dados de uma consulta e insere nela
      // um paciente ja cadastrado do ArrayList de Paciente
      public void cadastrarConsulta(Consulta consulta) {
            Dao.adicionarConsulta(consulta);
      }
      // Retorna o ArrayList com todas as consultas cadastradas.
      public ArrayList<Consulta> atualizarConsulta() {
            return Dao.pesquisarDbConsulta();
      }
      
      // Remove uma consulta cadastrada.
      public void removerConsulta(int indice) {
            Dao.pesquisarDbConsulta().remove(indice);
      }
}
